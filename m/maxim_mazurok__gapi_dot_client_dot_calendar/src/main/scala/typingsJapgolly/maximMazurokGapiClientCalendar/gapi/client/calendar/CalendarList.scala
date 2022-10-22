package typingsJapgolly.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarList extends StObject {
  
  /** ETag of the collection. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Calendars that are present on the user's calendar list. */
  var items: js.UndefOr[js.Array[CalendarListEntry]] = js.undefined
  
  /** Type of the collection ("calendar#calendarList"). */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Token used to access the next page of this result. Omitted if no further results are available, in which case nextSyncToken is provided. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Token used at a later point in time to retrieve only the entries that have changed since this result was returned. Omitted if further results are available, in which case
    * nextPageToken is provided.
    */
  var nextSyncToken: js.UndefOr[String] = js.undefined
}
object CalendarList {
  
  inline def apply(): CalendarList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarList]
  }
  
  extension [Self <: CalendarList](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[CalendarListEntry]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: CalendarListEntry*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
  }
}
