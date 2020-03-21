package typingsJapgolly.winrt.Windows.Data.Json

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonValue extends js.Object {
  var valueType: JsonValueType
  def getArray(): JsonArray
  def getBoolean(): Boolean
  def getNumber(): Double
  def getObject(): JsonObject
  def getString(): String
  def stringify(): String
}

object IJsonValue {
  @scala.inline
  def apply(
    getArray: CallbackTo[JsonArray],
    getBoolean: CallbackTo[Boolean],
    getNumber: CallbackTo[Double],
    getObject: CallbackTo[JsonObject],
    getString: CallbackTo[String],
    stringify: CallbackTo[String],
    valueType: JsonValueType
  ): IJsonValue = {
    val __obj = js.Dynamic.literal(valueType = valueType.asInstanceOf[js.Any])
    __obj.updateDynamic("getArray")(getArray.toJsFn)
    __obj.updateDynamic("getBoolean")(getBoolean.toJsFn)
    __obj.updateDynamic("getNumber")(getNumber.toJsFn)
    __obj.updateDynamic("getObject")(getObject.toJsFn)
    __obj.updateDynamic("getString")(getString.toJsFn)
    __obj.updateDynamic("stringify")(stringify.toJsFn)
    __obj.asInstanceOf[IJsonValue]
  }
}

