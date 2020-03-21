package typingsJapgolly.agGrid.dateComponentMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDate extends js.Object {
  /** Returns the current date represented by this editor */
  def getDate(): js.Date
  /** Sets the date represented by this component */
  def setDate(date: js.Date): Unit
}

object IDate {
  @scala.inline
  def apply(getDate: CallbackTo[js.Date], setDate: js.Date => Callback): IDate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDate")(getDate.toJsFn)
    __obj.updateDynamic("setDate")(js.Any.fromFunction1((t0: js.Date) => setDate(t0).runNow()))
    __obj.asInstanceOf[IDate]
  }
}

