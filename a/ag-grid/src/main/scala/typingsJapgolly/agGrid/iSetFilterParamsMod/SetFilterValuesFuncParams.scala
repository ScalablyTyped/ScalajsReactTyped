package typingsJapgolly.agGrid.iSetFilterParamsMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.agGrid.colDefMod.ColDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetFilterValuesFuncParams extends js.Object {
  var colDef: ColDef
  def success(values: js.Array[String]): Unit
}

object SetFilterValuesFuncParams {
  @scala.inline
  def apply(colDef: ColDef, success: js.Array[String] => Callback): SetFilterValuesFuncParams = {
    val __obj = js.Dynamic.literal(colDef = colDef.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => success(t0).runNow()))
    __obj.asInstanceOf[SetFilterValuesFuncParams]
  }
}

