package typingsJapgolly.winrt.Windows.Data.Json

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonObject extends IJsonValue {
  def getNamedArray(name: String): JsonArray
  def getNamedBoolean(name: String): Boolean
  def getNamedNumber(name: String): Double
  def getNamedObject(name: String): JsonObject
  def getNamedString(name: String): String
  def getNamedValue(name: String): JsonValue
  def setNamedValue(name: String, value: IJsonValue): Unit
}

object IJsonObject {
  @scala.inline
  def apply(
    getArray: CallbackTo[JsonArray],
    getBoolean: CallbackTo[Boolean],
    getNamedArray: String => CallbackTo[JsonArray],
    getNamedBoolean: String => CallbackTo[Boolean],
    getNamedNumber: String => CallbackTo[Double],
    getNamedObject: String => CallbackTo[JsonObject],
    getNamedString: String => CallbackTo[String],
    getNamedValue: String => CallbackTo[JsonValue],
    getNumber: CallbackTo[Double],
    getObject: CallbackTo[JsonObject],
    getString: CallbackTo[String],
    setNamedValue: (String, IJsonValue) => Callback,
    stringify: CallbackTo[String],
    valueType: JsonValueType
  ): IJsonObject = {
    val __obj = js.Dynamic.literal(valueType = valueType.asInstanceOf[js.Any])
    __obj.updateDynamic("getArray")(getArray.toJsFn)
    __obj.updateDynamic("getBoolean")(getBoolean.toJsFn)
    __obj.updateDynamic("getNamedArray")(js.Any.fromFunction1((t0: java.lang.String) => getNamedArray(t0).runNow()))
    __obj.updateDynamic("getNamedBoolean")(js.Any.fromFunction1((t0: java.lang.String) => getNamedBoolean(t0).runNow()))
    __obj.updateDynamic("getNamedNumber")(js.Any.fromFunction1((t0: java.lang.String) => getNamedNumber(t0).runNow()))
    __obj.updateDynamic("getNamedObject")(js.Any.fromFunction1((t0: java.lang.String) => getNamedObject(t0).runNow()))
    __obj.updateDynamic("getNamedString")(js.Any.fromFunction1((t0: java.lang.String) => getNamedString(t0).runNow()))
    __obj.updateDynamic("getNamedValue")(js.Any.fromFunction1((t0: java.lang.String) => getNamedValue(t0).runNow()))
    __obj.updateDynamic("getNumber")(getNumber.toJsFn)
    __obj.updateDynamic("getObject")(getObject.toJsFn)
    __obj.updateDynamic("getString")(getString.toJsFn)
    __obj.updateDynamic("setNamedValue")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.winrt.Windows.Data.Json.IJsonValue) => setNamedValue(t0, t1).runNow()))
    __obj.updateDynamic("stringify")(stringify.toJsFn)
    __obj.asInstanceOf[IJsonObject]
  }
}

