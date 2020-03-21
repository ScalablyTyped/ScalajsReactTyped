package typingsJapgolly.activexExcel

import typingsJapgolly.activexExcel.Excel.ProtectedViewWindow
import typingsJapgolly.activexExcel.Excel.XlProtectedViewCloseReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var Cancel: Boolean
  val Pvw: ProtectedViewWindow
  val Reason: XlProtectedViewCloseReason
}

object AnonCancel {
  @scala.inline
  def apply(Cancel: Boolean, Pvw: ProtectedViewWindow, Reason: XlProtectedViewCloseReason): AnonCancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pvw = Pvw.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancel]
  }
}

