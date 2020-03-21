package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn extends js.Object {
  var column: IColumn
  var index: Double
  def onMeasureDone(measuredWidth: Double): Unit
}

object AnonColumn {
  @scala.inline
  def apply(column: IColumn, index: Double, onMeasureDone: Double => Callback): AnonColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("onMeasureDone")(js.Any.fromFunction1((t0: scala.Double) => onMeasureDone(t0).runNow()))
    __obj.asInstanceOf[AnonColumn]
  }
}

