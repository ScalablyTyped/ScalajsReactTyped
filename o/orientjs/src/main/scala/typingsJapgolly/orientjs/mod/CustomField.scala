package typingsJapgolly.orientjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomField extends js.Object {
  /**
    * Get the value of the given custom field.
    *
    * @param  key The name of the field to get.
    * @return      The field value, or undefined if it doesn't exist.
    */
  def get(key: String): CustomField
  /**
    * Set a custom field.
    *
    * @param   key   The key to set, or map of keys to values.
    * @param          value The value to set, if `key` is not an object.
    * @promise {Object|null}         The new set of custom fields, or null if none are present.
    */
  def set(key: String, value: js.Any): CustomField
  /**
    * Unset the custom field with the given name,
    *
    * @param        key The name of the custom field to remove.
    * @promise {Object|null}     The new set of custom fields, or null if none are present.
    */
  def unset(key: String): CustomField
}

object CustomField {
  @scala.inline
  def apply(
    get: String => CallbackTo[CustomField],
    set: (String, js.Any) => CallbackTo[CustomField],
    unset: String => CallbackTo[CustomField]
  ): CustomField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => set(t0, t1).runNow()))
    __obj.updateDynamic("unset")(js.Any.fromFunction1((t0: java.lang.String) => unset(t0).runNow()))
    __obj.asInstanceOf[CustomField]
  }
}

