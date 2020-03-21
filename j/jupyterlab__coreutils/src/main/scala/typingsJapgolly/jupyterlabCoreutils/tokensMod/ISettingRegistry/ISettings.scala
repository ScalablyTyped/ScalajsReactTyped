package typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCoreutils.AnonUser
import typingsJapgolly.jupyterlabCoreutils.settingregistryMod.ISchemaValidator.IError
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue
import typingsJapgolly.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for manipulating the settings of a specific plugin.
  */
trait ISettings extends IDisposable {
  /**
    * A signal that emits when the plugin's settings have changed.
    */
  val changed: ISignal[this.type, Unit]
  /**
    * The composite of user settings and extension defaults.
    */
  val composite: ReadonlyJSONObject
  /**
    * The plugin's ID.
    */
  val id: String
  val plugin: IPlugin
  /**
    * The plugin settings raw text value.
    */
  val raw: String
  /**
    * The plugin's schema.
    */
  val schema: ISchema
  /**
    * The user settings.
    */
  val user: ReadonlyJSONObject
  /**
    * The published version of the NPM package containing these settings.
    */
  val version: String
  /**
    * Return the defaults in a commented JSON format.
    */
  def annotatedDefaults(): String
  /**
    * Calculate the default value of a setting by iterating through the schema.
    *
    * @param key - The name of the setting whose default value is calculated.
    *
    * @returns A calculated default JSON value for a specific setting.
    */
  def default(key: String): js.UndefOr[JSONValue]
  /**
    * Get an individual setting.
    *
    * @param key - The name of the setting being retrieved.
    *
    * @returns The setting value.
    */
  def get(key: String): AnonUser
  /**
    * Remove a single setting.
    *
    * @param key - The name of the setting being removed.
    *
    * @returns A promise that resolves when the setting is removed.
    *
    * #### Notes
    * This function is asynchronous because it writes to the setting registry.
    */
  def remove(key: String): js.Promise[Unit]
  /**
    * Save all of the plugin's user settings at once.
    */
  def save(raw: String): js.Promise[Unit]
  /**
    * Set a single setting.
    *
    * @param key - The name of the setting being set.
    *
    * @param value - The value of the setting.
    *
    * @returns A promise that resolves when the setting has been saved.
    *
    * #### Notes
    * This function is asynchronous because it writes to the setting registry.
    */
  def set(key: String, value: JSONValue): js.Promise[Unit]
  /**
    * Validates raw settings with comments.
    *
    * @param raw - The JSON with comments string being validated.
    *
    * @returns A list of errors or `null` if valid.
    */
  def validate(raw: String): js.Array[IError] | Null
}

object ISettings {
  @scala.inline
  def apply(
    annotatedDefaults: CallbackTo[String],
    changed: ISignal[ISettings, Unit],
    composite: ReadonlyJSONObject,
    default: String => CallbackTo[js.UndefOr[JSONValue]],
    dispose: Callback,
    get: String => CallbackTo[AnonUser],
    id: String,
    isDisposed: Boolean,
    plugin: IPlugin,
    raw: String,
    remove: String => CallbackTo[js.Promise[Unit]],
    save: String => CallbackTo[js.Promise[Unit]],
    schema: ISchema,
    set: (String, JSONValue) => CallbackTo[js.Promise[Unit]],
    user: ReadonlyJSONObject,
    validate: String => CallbackTo[js.Array[IError] | Null],
    version: String
  ): ISettings = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], composite = composite.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("annotatedDefaults")(annotatedDefaults.toJsFn)
    __obj.updateDynamic("default")(js.Any.fromFunction1((t0: java.lang.String) => default(t0).runNow()))
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.updateDynamic("save")(js.Any.fromFunction1((t0: java.lang.String) => save(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue) => set(t0, t1).runNow()))
    __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: java.lang.String) => validate(t0).runNow()))
    __obj.asInstanceOf[ISettings]
  }
}

