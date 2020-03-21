package typingsJapgolly.gapiCalendar.gapi.client.calendar

import typingsJapgolly.gapiCalendar.AnonType
import typingsJapgolly.gapiCalendar.gapiCalendarStrings.calendarNumbersignaclRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Acl_ extends js.Object {
  var etag: typingsJapgolly.gapiCalendar.gapi.client.calendar.etag
  var id: String
  var kind: calendarNumbersignaclRule
  var role: AccessRole
  var scope: AnonType
}

object Acl_ {
  @scala.inline
  def apply(etag: etag, id: String, kind: calendarNumbersignaclRule, role: AccessRole, scope: AnonType): Acl_ = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Acl_]
  }
}

