package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitMatrix extends js.Object {
  def release(): Unit
  def setValueAt(x: Double, y: Double, value: Boolean): Unit
  def valueAt(x: Double, y: Double): Boolean
}

object IBitMatrix {
  @scala.inline
  def apply(
    release: Callback,
    setValueAt: (Double, Double, Boolean) => Callback,
    valueAt: (Double, Double) => CallbackTo[Boolean]
  ): IBitMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("release")(release.toJsFn)
    __obj.updateDynamic("setValueAt")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Boolean) => setValueAt(t0, t1, t2).runNow()))
    __obj.updateDynamic("valueAt")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => valueAt(t0, t1).runNow()))
    __obj.asInstanceOf[IBitMatrix]
  }
}

