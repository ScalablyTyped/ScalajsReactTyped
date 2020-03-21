package typingsJapgolly.durandal.serializerMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializerOptions extends js.Object {
  /**
    * Gets the constructor based on the type id.
    * @param {string} typeId The type id.
    * @returns {Function} The constructor.
    */
  def getConstructor(typeId: String): js.Function0[_]
  /**
    * Gets the type id for an object instance, using the configured `typeAttribute`.
    * @param {object} object The object to serialize.
    * @returns {string} The type.
    */
  def getTypeId(`object`: js.Any): String
  /**
    * The default reviver function used during deserialization. By default is detects type properties on objects and uses them to re-construct the correct object using the provided constructor mapping.
    * @param {string} key The attribute key.
    * @param {object} value The object value associated with the key.
    * @returns {object} The value.
    */
  def reviver(key: String, value: js.Any): js.Any
}

object DeserializerOptions {
  @scala.inline
  def apply(
    getConstructor: String => CallbackTo[js.Function0[js.Any]],
    getTypeId: js.Any => CallbackTo[String],
    reviver: (String, js.Any) => CallbackTo[js.Any]
  ): DeserializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getConstructor")(js.Any.fromFunction1((t0: java.lang.String) => getConstructor(t0).runNow()))
    __obj.updateDynamic("getTypeId")(js.Any.fromFunction1((t0: js.Any) => getTypeId(t0).runNow()))
    __obj.updateDynamic("reviver")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => reviver(t0, t1).runNow()))
    __obj.asInstanceOf[DeserializerOptions]
  }
}

