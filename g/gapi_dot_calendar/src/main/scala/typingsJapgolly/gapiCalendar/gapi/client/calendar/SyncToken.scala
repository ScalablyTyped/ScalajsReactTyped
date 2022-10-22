package typingsJapgolly.gapiCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Token obtained from the nextSyncToken field returned on the last page of results from the previous list request.
// It makes the result of this list request contain only entries that have changed since then.
// All events deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False.
// There are several query parameters that cannot be specified together with nextSyncToken to ensure consistency of the client state.
// These are:
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.iCalUID
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.orderBy
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.privateExtendedProperty
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.q
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.sharedExtendedProperty
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.timeMin
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.timeMax
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.updatedMin
*/
trait SyncToken extends StObject
object SyncToken {
  
  inline def iCalUID: typingsJapgolly.gapiCalendar.gapiCalendarStrings.iCalUID = "iCalUID".asInstanceOf[typingsJapgolly.gapiCalendar.gapiCalendarStrings.iCalUID]
  
  inline def orderBy: typingsJapgolly.gapiCalendar.gapiCalendarStrings.orderBy = "orderBy".asInstanceOf[typingsJapgolly.gapiCalendar.gapiCalendarStrings.orderBy]
  
  inline def privateExtendedProperty: typingsJapgolly.gapiCalendar.gapiCalendarStrings.privateExtendedProperty = "privateExtendedProperty".asInstanceOf[typingsJapgolly.gapiCalendar.gapiCalendarStrings.privateExtendedProperty]
  
  inline def q: typingsJapgolly.gapiCalendar.gapiCalendarStrings.q = "q".asInstanceOf[typingsJapgolly.gapiCalendar.gapiCalendarStrings.q]
  
  inline def sharedExtendedProperty: typingsJapgolly.gapiCalendar.gapiCalendarStrings.sharedExtendedProperty = "sharedExtendedProperty".asInstanceOf[typingsJapgolly.gapiCalendar.gapiCalendarStrings.sharedExtendedProperty]
  
  inline def timeMax: typingsJapgolly.gapiCalendar.gapiCalendarStrings.timeMax = "timeMax".asInstanceOf[typingsJapgolly.gapiCalendar.gapiCalendarStrings.timeMax]
  
  inline def timeMin: typingsJapgolly.gapiCalendar.gapiCalendarStrings.timeMin = "timeMin".asInstanceOf[typingsJapgolly.gapiCalendar.gapiCalendarStrings.timeMin]
  
  inline def updatedMin: typingsJapgolly.gapiCalendar.gapiCalendarStrings.updatedMin = "updatedMin".asInstanceOf[typingsJapgolly.gapiCalendar.gapiCalendarStrings.updatedMin]
}
