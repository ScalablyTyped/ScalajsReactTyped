package typingsJapgolly.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyRequestItem extends js.Object {
  /** The identifier of a calendar or a group. */
  var id: js.UndefOr[String] = js.undefined
}

object FreeBusyRequestItem {
  @scala.inline
  def apply(id: String = null): FreeBusyRequestItem = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusyRequestItem]
  }
}

