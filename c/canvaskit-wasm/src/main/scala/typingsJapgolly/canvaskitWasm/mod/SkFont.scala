package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkFont extends SkObject[SkFont] {
  def getScaleX(): Double
  def getSize(): Double
  def getSkewX(): Double
  def getTypeface(): SkTypeface
  def getWidths(chars: String): js.Array[Double]
  def measureText(text: String): Double
  def setScaleX(value: Double): Unit
  def setSize(value: Double): Unit
  def setSkewX(value: Double): Unit
  def setTypeface(value: SkTypeface): Unit
}

object SkFont {
  @scala.inline
  def apply(
    delete: Callback,
    deleteAfter: Callback,
    getScaleX: CallbackTo[Double],
    getSize: CallbackTo[Double],
    getSkewX: CallbackTo[Double],
    getTypeface: CallbackTo[SkTypeface],
    getWidths: String => CallbackTo[js.Array[Double]],
    isAliasOf: js.Any => CallbackTo[Boolean],
    isDeleted: CallbackTo[Boolean],
    measureText: String => CallbackTo[Double],
    setScaleX: Double => Callback,
    setSize: Double => Callback,
    setSkewX: Double => Callback,
    setTypeface: SkTypeface => Callback
  ): SkFont = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("deleteAfter")(deleteAfter.toJsFn)
    __obj.updateDynamic("getScaleX")(getScaleX.toJsFn)
    __obj.updateDynamic("getSize")(getSize.toJsFn)
    __obj.updateDynamic("getSkewX")(getSkewX.toJsFn)
    __obj.updateDynamic("getTypeface")(getTypeface.toJsFn)
    __obj.updateDynamic("getWidths")(js.Any.fromFunction1((t0: java.lang.String) => getWidths(t0).runNow()))
    __obj.updateDynamic("isAliasOf")(js.Any.fromFunction1((t0: js.Any) => isAliasOf(t0).runNow()))
    __obj.updateDynamic("isDeleted")(isDeleted.toJsFn)
    __obj.updateDynamic("measureText")(js.Any.fromFunction1((t0: java.lang.String) => measureText(t0).runNow()))
    __obj.updateDynamic("setScaleX")(js.Any.fromFunction1((t0: scala.Double) => setScaleX(t0).runNow()))
    __obj.updateDynamic("setSize")(js.Any.fromFunction1((t0: scala.Double) => setSize(t0).runNow()))
    __obj.updateDynamic("setSkewX")(js.Any.fromFunction1((t0: scala.Double) => setSkewX(t0).runNow()))
    __obj.updateDynamic("setTypeface")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkTypeface) => setTypeface(t0).runNow()))
    __obj.asInstanceOf[SkFont]
  }
}

