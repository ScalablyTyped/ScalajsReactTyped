package typingsJapgolly.maximMazurokGapiClientCalendar.gapi.client.calendar

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.AltAlwaysIncludeEmail
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.AlwaysIncludeEmail
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.ConferenceDataVersion
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.Destination
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.EventId
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.ICalUID
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.MaxAttendees
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.OrderBy
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.OriginalStart
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.SendNotifications
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.SendUpdates
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.SupportsAttachments
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsResource extends StObject {
  
  /** Deletes an event. */
  def delete(): Request[Unit] = js.native
  def delete(request: EventId): Request[Unit] = js.native
  
  /** Returns an event based on its Google Calendar ID. To retrieve an event using its iCalendar ID, call the events.list method using the iCalUID parameter. */
  def get(): Request[Event] = js.native
  def get(request: AlwaysIncludeEmail): Request[Event] = js.native
  
  /** Imports an event. This operation is used to add a private copy of an existing event to a calendar. */
  def `import`(request: ConferenceDataVersion): Request[Event] = js.native
  def `import`(request: SupportsAttachments, body: Event): Request[Event] = js.native
  
  /** Creates an event. */
  def insert(request: MaxAttendees): Request[Event] = js.native
  def insert(request: SendNotifications, body: Event): Request[Event] = js.native
  
  /** Returns instances of the specified recurring event. */
  def instances(): Request[Events] = js.native
  def instances(request: OriginalStart): Request[Events] = js.native
  
  /** Returns events on the specified calendar. */
  def list(): Request[Events] = js.native
  def list(request: ICalUID): Request[Events] = js.native
  
  /** Moves an event to another calendar, i.e. changes an event's organizer. */
  def move(): Request[Event] = js.native
  def move(request: Destination): Request[Event] = js.native
  
  def patch(request: AltAlwaysIncludeEmail, body: Event): Request[Event] = js.native
  /** Updates an event. This method supports patch semantics. */
  def patch(request: SendUpdates): Request[Event] = js.native
  
  /** Creates an event based on a simple text string. */
  def quickAdd(): Request[Event] = js.native
  def quickAdd(request: Text): Request[Event] = js.native
  
  def update(request: AltAlwaysIncludeEmail, body: Event): Request[Event] = js.native
  /** Updates an event. */
  def update(request: SendUpdates): Request[Event] = js.native
  
  def watch(request: ICalUID, body: Channel): Request[Channel] = js.native
  /** Watch for changes to Events resources. */
  def watch(request: OrderBy): Request[Channel] = js.native
}
