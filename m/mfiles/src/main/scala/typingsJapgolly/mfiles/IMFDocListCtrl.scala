package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMFDocListCtrl extends js.Object {
  def AttachToListingWindow(shellListing: js.Any): Unit
}

object IMFDocListCtrl {
  @scala.inline
  def apply(AttachToListingWindow: js.Any => Callback): IMFDocListCtrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AttachToListingWindow")(js.Any.fromFunction1((t0: js.Any) => AttachToListingWindow(t0).runNow()))
    __obj.asInstanceOf[IMFDocListCtrl]
  }
}

