package typingsJapgolly.agGrid.gridSerializerMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowSpanningAccumulator extends js.Object {
  def onColumn(header: String, index: Double, span: Double): Unit
}

object RowSpanningAccumulator {
  @scala.inline
  def apply(onColumn: (String, Double, Double) => Callback): RowSpanningAccumulator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onColumn")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => onColumn(t0, t1, t2).runNow()))
    __obj.asInstanceOf[RowSpanningAccumulator]
  }
}

