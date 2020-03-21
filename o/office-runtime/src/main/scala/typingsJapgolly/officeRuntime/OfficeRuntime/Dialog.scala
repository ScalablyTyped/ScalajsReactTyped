package typingsJapgolly.officeRuntime.OfficeRuntime

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object representing the dialog box. */
trait Dialog extends js.Object {
  /**
    * Method to close a dialog box. Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  def close(): js.Promise[Unit]
}

object Dialog {
  @scala.inline
  def apply(close: CallbackTo[js.Promise[Unit]]): Dialog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[Dialog]
  }
}

