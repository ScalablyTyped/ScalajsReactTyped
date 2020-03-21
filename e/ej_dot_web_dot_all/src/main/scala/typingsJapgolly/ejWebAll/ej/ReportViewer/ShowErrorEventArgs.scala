package typingsJapgolly.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowErrorEventArgs extends js.Object {
  /** true if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the detailed error information.
    */
  var detail: js.UndefOr[String] = js.undefined
  /** returns the error code.
    */
  var errorCode: js.UndefOr[String] = js.undefined
  /** returns the error message.
    */
  var message: js.UndefOr[String] = js.undefined
}

object ShowErrorEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    detail: String = null,
    errorCode: String = null,
    message: String = null
  ): ShowErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowErrorEventArgs]
  }
}

