package typingsJapgolly.winrt.Windows.Data.Json

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonArray extends IJsonValue {
  def getArrayAt(index: Double): JsonArray
  def getBooleanAt(index: Double): Boolean
  def getNumberAt(index: Double): Double
  def getObjectAt(index: Double): JsonObject
  def getStringAt(index: Double): String
}

object IJsonArray {
  @scala.inline
  def apply(
    getArray: CallbackTo[JsonArray],
    getArrayAt: Double => CallbackTo[JsonArray],
    getBoolean: CallbackTo[Boolean],
    getBooleanAt: Double => CallbackTo[Boolean],
    getNumber: CallbackTo[Double],
    getNumberAt: Double => CallbackTo[Double],
    getObject: CallbackTo[JsonObject],
    getObjectAt: Double => CallbackTo[JsonObject],
    getString: CallbackTo[String],
    getStringAt: Double => CallbackTo[String],
    stringify: CallbackTo[String],
    valueType: JsonValueType
  ): IJsonArray = {
    val __obj = js.Dynamic.literal(valueType = valueType.asInstanceOf[js.Any])
    __obj.updateDynamic("getArray")(getArray.toJsFn)
    __obj.updateDynamic("getArrayAt")(js.Any.fromFunction1((t0: scala.Double) => getArrayAt(t0).runNow()))
    __obj.updateDynamic("getBoolean")(getBoolean.toJsFn)
    __obj.updateDynamic("getBooleanAt")(js.Any.fromFunction1((t0: scala.Double) => getBooleanAt(t0).runNow()))
    __obj.updateDynamic("getNumber")(getNumber.toJsFn)
    __obj.updateDynamic("getNumberAt")(js.Any.fromFunction1((t0: scala.Double) => getNumberAt(t0).runNow()))
    __obj.updateDynamic("getObject")(getObject.toJsFn)
    __obj.updateDynamic("getObjectAt")(js.Any.fromFunction1((t0: scala.Double) => getObjectAt(t0).runNow()))
    __obj.updateDynamic("getString")(getString.toJsFn)
    __obj.updateDynamic("getStringAt")(js.Any.fromFunction1((t0: scala.Double) => getStringAt(t0).runNow()))
    __obj.updateDynamic("stringify")(stringify.toJsFn)
    __obj.asInstanceOf[IJsonArray]
  }
}

