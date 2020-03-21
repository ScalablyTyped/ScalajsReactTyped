package typingsJapgolly.suitescript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLine extends js.Object {
  def isBookSpecific(): Boolean
  def setAccountId(accountId: Double): Unit
  def setBookSpecific(bookSpecific: Boolean): Unit
  def setClassId(classId: Double): Unit
  def setCreditAmount(credit: String): Unit
  def setDebitAmount(debit: String): Unit
  def setDepartmentId(departmentId: Double): Unit
  def setLocationId(locationId: Double): Unit
  def setMemo(memo: String): Unit
}

object CustomLine {
  @scala.inline
  def apply(
    isBookSpecific: CallbackTo[Boolean],
    setAccountId: Double => Callback,
    setBookSpecific: Boolean => Callback,
    setClassId: Double => Callback,
    setCreditAmount: String => Callback,
    setDebitAmount: String => Callback,
    setDepartmentId: Double => Callback,
    setLocationId: Double => Callback,
    setMemo: String => Callback
  ): CustomLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isBookSpecific")(isBookSpecific.toJsFn)
    __obj.updateDynamic("setAccountId")(js.Any.fromFunction1((t0: scala.Double) => setAccountId(t0).runNow()))
    __obj.updateDynamic("setBookSpecific")(js.Any.fromFunction1((t0: scala.Boolean) => setBookSpecific(t0).runNow()))
    __obj.updateDynamic("setClassId")(js.Any.fromFunction1((t0: scala.Double) => setClassId(t0).runNow()))
    __obj.updateDynamic("setCreditAmount")(js.Any.fromFunction1((t0: java.lang.String) => setCreditAmount(t0).runNow()))
    __obj.updateDynamic("setDebitAmount")(js.Any.fromFunction1((t0: java.lang.String) => setDebitAmount(t0).runNow()))
    __obj.updateDynamic("setDepartmentId")(js.Any.fromFunction1((t0: scala.Double) => setDepartmentId(t0).runNow()))
    __obj.updateDynamic("setLocationId")(js.Any.fromFunction1((t0: scala.Double) => setLocationId(t0).runNow()))
    __obj.updateDynamic("setMemo")(js.Any.fromFunction1((t0: java.lang.String) => setMemo(t0).runNow()))
    __obj.asInstanceOf[CustomLine]
  }
}

