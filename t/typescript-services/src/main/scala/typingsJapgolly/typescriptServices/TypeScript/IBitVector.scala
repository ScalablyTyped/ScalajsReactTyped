package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitVector extends js.Object {
  def release(): Unit
  def setValueAt(index: Double, value: Boolean): Unit
  def valueAt(index: Double): Boolean
}

object IBitVector {
  @scala.inline
  def apply(
    release: Callback,
    setValueAt: (Double, Boolean) => Callback,
    valueAt: Double => CallbackTo[Boolean]
  ): IBitVector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("release")(release.toJsFn)
    __obj.updateDynamic("setValueAt")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => setValueAt(t0, t1).runNow()))
    __obj.updateDynamic("valueAt")(js.Any.fromFunction1((t0: scala.Double) => valueAt(t0).runNow()))
    __obj.asInstanceOf[IBitVector]
  }
}

