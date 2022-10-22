package typingsJapgolly.gapiCalendar

import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiCalendar.anon.Date
import typingsJapgolly.gapiCalendar.anon.DisplayName
import typingsJapgolly.gapiCalendar.anon.UseDefault
import typingsJapgolly.gapiCalendar.gapi.client.calendar.AclDeleteParameters
import typingsJapgolly.gapiCalendar.gapi.client.calendar.AclGetParameters
import typingsJapgolly.gapiCalendar.gapi.client.calendar.AclInsertParameters
import typingsJapgolly.gapiCalendar.gapi.client.calendar.AclUpdateParameters
import typingsJapgolly.gapiCalendar.gapi.client.calendar.Acl_
import typingsJapgolly.gapiCalendar.gapi.client.calendar.Calendar
import typingsJapgolly.gapiCalendar.gapi.client.calendar.CalendarListEntry
import typingsJapgolly.gapiCalendar.gapi.client.calendar.CalendarListInsertParameters
import typingsJapgolly.gapiCalendar.gapi.client.calendar.CalendarListListParameters
import typingsJapgolly.gapiCalendar.gapi.client.calendar.CalendarList_
import typingsJapgolly.gapiCalendar.gapi.client.calendar.CalendarsDeleteParameters
import typingsJapgolly.gapiCalendar.gapi.client.calendar.CalendarsInsertParameters
import typingsJapgolly.gapiCalendar.gapi.client.calendar.CalendarsUpdateParameters
import typingsJapgolly.gapiCalendar.gapi.client.calendar.EventsDeleteParameters
import typingsJapgolly.gapiCalendar.gapi.client.calendar.EventsGetParameters
import typingsJapgolly.gapiCalendar.gapi.client.calendar.EventsInsertParameters
import typingsJapgolly.gapiCalendar.gapi.client.calendar.EventsListParameters
import typingsJapgolly.gapiCalendar.gapi.client.calendar.EventsUpdateParameters
import typingsJapgolly.gapiCalendar.gapi.client.calendar.Events_
import typingsJapgolly.gapiCalendar.gapi.client.calendar.FreeBusyQueryParameters
import typingsJapgolly.gapiCalendar.gapi.client.calendar.FreeBusy_
import typingsJapgolly.gapiCalendar.gapi.client.calendar.datetime
import typingsJapgolly.gapiCalendar.gapi.client.calendar.integer
import typingsJapgolly.gapiCalendar.gapiCalendarStrings.calendarNumbersignevent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object calendar {
        
        @JSGlobal("gapi.client.calendar.Event")
        @js.native
        open class Event ()
          extends StObject
             with typingsJapgolly.gapiCalendar.gapi.client.calendar.Event {
          
          /* CompleteClass */
          var created: datetime = js.native
          
          // The creator of the event. Read-only.
          /* CompleteClass */
          var creator: DisplayName = js.native
          
          /* CompleteClass */
          var description: String = js.native
          
          // The (exclusive) end time of the event. For a recurring event, this is the end time of the first instance.
          /* CompleteClass */
          var end: Date = js.native
          
          /* CompleteClass */
          var etag: typingsJapgolly.gapiCalendar.gapi.client.calendar.etag = js.native
          
          /* CompleteClass */
          var htmlLink: String = js.native
          
          /* CompleteClass */
          var iCalUID: String = js.native
          
          /* CompleteClass */
          var id: String = js.native
          
          /* CompleteClass */
          var kind: calendarNumbersignevent = js.native
          
          // The organizer of the event.
          /* CompleteClass */
          var organizer: DisplayName = js.native
          
          /* CompleteClass */
          var recurrence: js.Array[String] = js.native
          
          /* CompleteClass */
          var reminders: UseDefault = js.native
          
          /* CompleteClass */
          var sequence: integer = js.native
          
          // The (inclusive) start time of the event. For a recurring event, this is the start time of the first instance.
          /* CompleteClass */
          var start: Date = js.native
          
          /* CompleteClass */
          var summary: String = js.native
          
          /* CompleteClass */
          var updated: datetime = js.native
        }
        
        @JSGlobal("gapi.client.calendar.acl")
        @js.native
        open class acl ()
          extends StObject
             with typingsJapgolly.gapiCalendar.gapi.client.calendar.acl
        /* static members */
        object acl {
          
          @JSGlobal("gapi.client.calendar.acl")
          @js.native
          val ^ : js.Any = js.native
          
          inline def delete(parameters: AclDeleteParameters): HttpRequest[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[Unit]]
          
          inline def get(parameters: AclGetParameters): HttpRequest[Acl_] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[Acl_]]
          
          inline def insert(parameters: AclInsertParameters): HttpRequest[Acl_] = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[Acl_]]
          
          inline def update(parameters: AclUpdateParameters): HttpRequest[Acl_] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[Acl_]]
        }
        
        @JSGlobal("gapi.client.calendar.calendarList")
        @js.native
        open class calendarList ()
          extends StObject
             with typingsJapgolly.gapiCalendar.gapi.client.calendar.calendarList
        /* static members */
        object calendarList {
          
          @JSGlobal("gapi.client.calendar.calendarList")
          @js.native
          val ^ : js.Any = js.native
          
          inline def insert(parameters: CalendarListInsertParameters): HttpRequest[CalendarListEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[CalendarListEntry]]
          
          inline def list(): HttpRequest[CalendarList_] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[HttpRequest[CalendarList_]]
          inline def list(parameters: CalendarListListParameters): HttpRequest[CalendarList_] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[CalendarList_]]
        }
        
        @JSGlobal("gapi.client.calendar.calendars")
        @js.native
        open class calendars ()
          extends StObject
             with typingsJapgolly.gapiCalendar.gapi.client.calendar.calendars
        /* static members */
        object calendars {
          
          @JSGlobal("gapi.client.calendar.calendars")
          @js.native
          val ^ : js.Any = js.native
          
          inline def delete(parameters: CalendarsDeleteParameters): HttpRequest[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[Unit]]
          
          inline def insert(parameters: CalendarsInsertParameters): HttpRequest[Calendar] = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[Calendar]]
          
          inline def update(parameters: CalendarsUpdateParameters): HttpRequest[Calendar] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[Calendar]]
        }
        
        @JSGlobal("gapi.client.calendar.events")
        @js.native
        open class events ()
          extends StObject
             with typingsJapgolly.gapiCalendar.gapi.client.calendar.events
        /* static members */
        object events {
          
          @JSGlobal("gapi.client.calendar.events")
          @js.native
          val ^ : js.Any = js.native
          
          // delete the existing event from calendar
          inline def delete(parameters: EventsDeleteParameters): HttpRequest[typingsJapgolly.gapiCalendar.gapi.client.calendar.Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[typingsJapgolly.gapiCalendar.gapi.client.calendar.Event]]
          
          inline def get(parameters: EventsGetParameters): HttpRequest[typingsJapgolly.gapiCalendar.gapi.client.calendar.Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[typingsJapgolly.gapiCalendar.gapi.client.calendar.Event]]
          
          inline def insert(parameters: EventsInsertParameters): HttpRequest[typingsJapgolly.gapiCalendar.gapi.client.calendar.Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[typingsJapgolly.gapiCalendar.gapi.client.calendar.Event]]
          
          inline def list(parameters: EventsListParameters): HttpRequest[Events_] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[Events_]]
          
          inline def update(parameters: EventsUpdateParameters): HttpRequest[typingsJapgolly.gapiCalendar.gapi.client.calendar.Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[typingsJapgolly.gapiCalendar.gapi.client.calendar.Event]]
        }
        
        @JSGlobal("gapi.client.calendar.freebusy")
        @js.native
        open class freebusy ()
          extends StObject
             with typingsJapgolly.gapiCalendar.gapi.client.calendar.freebusy
        /* static members */
        object freebusy {
          
          @JSGlobal("gapi.client.calendar.freebusy")
          @js.native
          val ^ : js.Any = js.native
          
          inline def query(parameters: FreeBusyQueryParameters): HttpRequest[FreeBusy_] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[FreeBusy_]]
        }
      }
    }
  }
}
