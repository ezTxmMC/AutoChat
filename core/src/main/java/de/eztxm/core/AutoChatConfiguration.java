package de.eztxm.core;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.annotation.Exclude;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import java.util.HashMap;
import java.util.Map;

@ConfigName("settings")
public class AutoChatConfiguration extends AddonConfig {

  @SwitchSetting
  private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);
  @TextFieldSetting
  private final ConfigProperty<String> server = new ConfigProperty<>("");
  @TextFieldSetting
  private final ConfigProperty<String> input = new ConfigProperty<>("");
  @Exclude
  private Map<String, String> serverAndInput = new HashMap<>();

  @Override
  public ConfigProperty<Boolean> enabled() {
    return this.enabled;
  }

  public ConfigProperty<String> server() {
    return this.server;
  }

  public ConfigProperty<String> input() {
    return this.input;
  }

  public Map<String, String> serverAndInput() {
    return this.serverAndInput;
  }
}
