package typingsJapgolly.node.zlibMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZlibParams extends js.Object {
  def params(level: Double, strategy: Double, callback: js.Function0[Unit]): Unit
}

object ZlibParams {
  @scala.inline
  def apply(params: (Double, Double, js.Function0[Unit]) => Callback): ZlibParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("params")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: js.Function0[scala.Unit]) => params(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ZlibParams]
  }
}

