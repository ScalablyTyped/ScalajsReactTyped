package typingsJapgolly.codemirror.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Handle used to interact with the autocomplete dialog box.*/
trait Handle extends js.Object {
  var data: js.Any
  var length: Double
  def close(): Unit
  def menuSize(): Double
  def moveFocus(n: Double, avoidWrap: Boolean): Unit
  def pick(): Unit
  def setFocus(n: Double): Unit
}

object Handle {
  @scala.inline
  def apply(
    close: Callback,
    data: js.Any,
    length: Double,
    menuSize: CallbackTo[Double],
    moveFocus: (Double, Boolean) => Callback,
    pick: Callback,
    setFocus: Double => Callback
  ): Handle = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("menuSize")(menuSize.toJsFn)
    __obj.updateDynamic("moveFocus")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => moveFocus(t0, t1).runNow()))
    __obj.updateDynamic("pick")(pick.toJsFn)
    __obj.updateDynamic("setFocus")(js.Any.fromFunction1((t0: scala.Double) => setFocus(t0).runNow()))
    __obj.asInstanceOf[Handle]
  }
}

