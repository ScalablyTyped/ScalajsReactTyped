package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrixData extends js.Object {
  def onMatrixRowChanged(row: MatrixRowModel): Unit
}

object IMatrixData {
  @scala.inline
  def apply(onMatrixRowChanged: MatrixRowModel => Callback): IMatrixData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMatrixRowChanged")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.MatrixRowModel) => onMatrixRowChanged(t0).runNow()))
    __obj.asInstanceOf[IMatrixData]
  }
}

