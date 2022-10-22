package typingsJapgolly.maximMazurokGapiClientCalendar

import typingsJapgolly.maximMazurokGapiClientCalendar.gapi.client.calendar.AclResource
import typingsJapgolly.maximMazurokGapiClientCalendar.gapi.client.calendar.CalendarListResource
import typingsJapgolly.maximMazurokGapiClientCalendar.gapi.client.calendar.CalendarsResource
import typingsJapgolly.maximMazurokGapiClientCalendar.gapi.client.calendar.ChannelsResource
import typingsJapgolly.maximMazurokGapiClientCalendar.gapi.client.calendar.ColorsResource
import typingsJapgolly.maximMazurokGapiClientCalendar.gapi.client.calendar.EventsResource
import typingsJapgolly.maximMazurokGapiClientCalendar.gapi.client.calendar.FreebusyResource
import typingsJapgolly.maximMazurokGapiClientCalendar.gapi.client.calendar.SettingsResource
import typingsJapgolly.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.calendar
import typingsJapgolly.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.v3
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object calendar {
        
        @JSGlobal("gapi.client.calendar.acl")
        @js.native
        val acl: AclResource = js.native
        
        @JSGlobal("gapi.client.calendar.calendarList")
        @js.native
        val calendarList: CalendarListResource = js.native
        
        @JSGlobal("gapi.client.calendar.calendars")
        @js.native
        val calendars: CalendarsResource = js.native
        
        @JSGlobal("gapi.client.calendar.channels")
        @js.native
        val channels: ChannelsResource = js.native
        
        @JSGlobal("gapi.client.calendar.colors")
        @js.native
        val colors: ColorsResource = js.native
        
        @JSGlobal("gapi.client.calendar.events")
        @js.native
        val events: EventsResource = js.native
        
        @JSGlobal("gapi.client.calendar.freebusy")
        @js.native
        val freebusy: FreebusyResource = js.native
        
        @JSGlobal("gapi.client.calendar.settings")
        @js.native
        val settings: SettingsResource = js.native
      }
      
      /** Load Calendar API v3 */
      inline def load(name: calendar, version: v3): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: calendar, version: v3, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
