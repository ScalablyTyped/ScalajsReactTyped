package typingsJapgolly.activexInterop

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  def getVarDate(): VarDate
}

object Date {
  @scala.inline
  def apply(getVarDate: CallbackTo[VarDate]): Date = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getVarDate")(getVarDate.toJsFn)
    __obj.asInstanceOf[Date]
  }
}

