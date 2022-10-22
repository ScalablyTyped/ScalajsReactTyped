package typingsJapgolly.maximMazurokGapiClientCalendar.gapi.client.calendar

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.AltCalendarId
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.ColorRgbFormat
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.MinAccessRole
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.PageToken
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.Resource
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.UserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarListResource extends StObject {
  
  /** Removes a calendar from the user's calendar list. */
  def delete(): Request[Unit] = js.native
  def delete(request: QuotaUser): Request[Unit] = js.native
  
  /** Returns a calendar from the user's calendar list. */
  def get(): Request[CalendarListEntry] = js.native
  def get(request: QuotaUser): Request[CalendarListEntry] = js.native
  
  /** Inserts an existing calendar into the user's calendar list. */
  def insert(request: ColorRgbFormat): Request[CalendarListEntry] = js.native
  def insert(request: UserIp, body: CalendarListEntry): Request[CalendarListEntry] = js.native
  
  /** Returns the calendars on the user's calendar list. */
  def list(): Request[CalendarList] = js.native
  def list(request: MinAccessRole): Request[CalendarList] = js.native
  
  def patch(request: AltCalendarId, body: CalendarListEntry): Request[CalendarListEntry] = js.native
  /** Updates an existing calendar on the user's calendar list. This method supports patch semantics. */
  def patch(request: Resource): Request[CalendarListEntry] = js.native
  
  def update(request: AltCalendarId, body: CalendarListEntry): Request[CalendarListEntry] = js.native
  /** Updates an existing calendar on the user's calendar list. */
  def update(request: Resource): Request[CalendarListEntry] = js.native
  
  def watch(request: MinAccessRole, body: Channel): Request[Channel] = js.native
  /** Watch for changes to CalendarList resources. */
  def watch(request: PageToken): Request[Channel] = js.native
}
