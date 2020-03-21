package typingsJapgolly.jupyterlabCoreutils.tokensMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jupyterlabCoreutils.AnonComposite
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IDataConnector
import typingsJapgolly.jupyterlabCoreutils.phaseinPhaseTransform
import typingsJapgolly.jupyterlabCoreutils.settingregistryMod.ISchemaValidator
import typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin
import typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry.ISchema
import typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry.ISettings
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettingRegistry_ extends js.Object {
  /**
    * The data connector used by the setting registry.
    */
  val connector: IDataConnector[IPlugin, String, String]
  /**
    * A signal that emits the name of a plugin when its settings change.
    */
  val pluginChanged: ISignal[this.type, String]
  /**
    * The collection of setting registry plugins.
    */
  val plugins: StringDictionary[IPlugin]
  /**
    * The schema of the setting registry.
    */
  val schema: ISchema
  /**
    * The schema validator used by the setting registry.
    */
  val validator: ISchemaValidator
  /**
    * Get an individual setting.
    *
    * @param plugin - The name of the plugin whose settings are being retrieved.
    *
    * @param key - The name of the setting being retrieved.
    *
    * @returns A promise that resolves when the setting is retrieved.
    */
  def get(plugin: String, key: String): js.Promise[AnonComposite]
  /**
    * Load a plugin's settings into the setting registry.
    *
    * @param plugin - The name of the plugin whose settings are being loaded.
    *
    * @returns A promise that resolves with a plugin settings object or rejects
    * if the plugin is not found.
    */
  def load(plugin: String): js.Promise[ISettings]
  /**
    * Reload a plugin's settings into the registry even if they already exist.
    *
    * @param plugin - The name of the plugin whose settings are being reloaded.
    *
    * @returns A promise that resolves with a plugin settings object or rejects
    * with a list of `ISchemaValidator.IError` objects if it fails.
    */
  def reload(plugin: String): js.Promise[ISettings]
  /**
    * Remove a single setting in the registry.
    *
    * @param plugin - The name of the plugin whose setting is being removed.
    *
    * @param key - The name of the setting being removed.
    *
    * @returns A promise that resolves when the setting is removed.
    */
  def remove(plugin: String, key: String): js.Promise[Unit]
  /**
    * Set a single setting in the registry.
    *
    * @param plugin - The name of the plugin whose setting is being set.
    *
    * @param key - The name of the setting being set.
    *
    * @param value - The value of the setting being set.
    *
    * @returns A promise that resolves when the setting has been saved.
    *
    */
  def set(plugin: String, key: String, value: JSONValue): js.Promise[Unit]
  /**
    * Register a plugin transform function to act on a specific plugin.
    *
    * @param plugin - The name of the plugin whose settings are transformed.
    *
    * @param transforms - The transform functions applied to the plugin.
    *
    * @returns A disposable that removes the transforms from the registry.
    *
    * #### Notes
    * - `compose` transformations: The registry automatically overwrites a
    * plugin's default values with user overrides, but a plugin may instead wish
    * to merge values. This behavior can be accomplished in a `compose`
    * transformation.
    * - `fetch` transformations: The registry uses the plugin data that is
    * fetched from its connector. If a plugin wants to override, e.g. to update
    * its schema with dynamic defaults, a `fetch` transformation can be applied.
    */
  def transform(plugin: String, transforms: phaseinPhaseTransform): IDisposable
  /**
    * Upload a plugin's settings.
    *
    * @param plugin - The name of the plugin whose settings are being set.
    *
    * @param raw - The raw plugin settings being uploaded.
    *
    * @returns A promise that resolves when the settings have been saved.
    */
  def upload(plugin: String, raw: String): js.Promise[Unit]
}

object ISettingRegistry_ {
  @scala.inline
  def apply(
    connector: IDataConnector[IPlugin, String, String],
    get: (String, String) => CallbackTo[js.Promise[AnonComposite]],
    load: String => CallbackTo[js.Promise[ISettings]],
    pluginChanged: ISignal[ISettingRegistry_, String],
    plugins: StringDictionary[IPlugin],
    reload: String => CallbackTo[js.Promise[ISettings]],
    remove: (String, String) => CallbackTo[js.Promise[Unit]],
    schema: ISchema,
    set: (String, String, JSONValue) => CallbackTo[js.Promise[Unit]],
    transform: (String, phaseinPhaseTransform) => CallbackTo[IDisposable],
    upload: (String, String) => CallbackTo[js.Promise[Unit]],
    validator: ISchemaValidator
  ): ISettingRegistry_ = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], pluginChanged = pluginChanged.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("load")(js.Any.fromFunction1((t0: java.lang.String) => load(t0).runNow()))
    __obj.updateDynamic("reload")(js.Any.fromFunction1((t0: java.lang.String) => reload(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove(t0, t1).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue) => set(t0, t1, t2).runNow()))
    __obj.updateDynamic("transform")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.jupyterlabCoreutils.phaseinPhaseTransform) => transform(t0, t1).runNow()))
    __obj.updateDynamic("upload")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => upload(t0, t1).runNow()))
    __obj.asInstanceOf[ISettingRegistry_]
  }
}

