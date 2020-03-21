package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofDebugger extends js.Object {
  def dbg_pv_dump(): Double
  def dbg_pv_dump_ex(mask: Double, level: Double): Double
}

object TypeofDebugger {
  @scala.inline
  def apply(dbg_pv_dump: CallbackTo[Double], dbg_pv_dump_ex: (Double, Double) => CallbackTo[Double]): TypeofDebugger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dbg_pv_dump")(dbg_pv_dump.toJsFn)
    __obj.updateDynamic("dbg_pv_dump_ex")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => dbg_pv_dump_ex(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofDebugger]
  }
}

