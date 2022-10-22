package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityHistoryItem
  extends StObject
     with Entity {
  
  /**
    * Optional. The duration of active user engagement. if not supplied, this is calculated from the startedDateTime and
    * lastActiveDateTime.
    */
  var activeDurationSeconds: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Optional. NavigationProperty/Containment; navigation property to the associated activity.
  var activity: js.UndefOr[UserActivity] = js.undefined
  
  // Set by the server. DateTime in UTC when the object was created on the server.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Optional. UTC DateTime when the historyItem will undergo hard-delete. Can be set by the client.
  var expirationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Optional. UTC DateTime when the historyItem (activity session) was last understood as active or finished - if null,
    * historyItem status should be Ongoing.
    */
  var lastActiveDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Set by the server. DateTime in UTC when the object was modified on the server.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Required. UTC DateTime when the historyItem (activity session) was started. Required for timeline history.
  var startedDateTime: js.UndefOr[String] = js.undefined
  
  // Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
  var status: js.UndefOr[NullableOption[Status]] = js.undefined
  
  /**
    * Optional. The timezone in which the user's device used to generate the activity was located at activity creation time.
    * Values supplied as Olson IDs in order to support cross-platform representation.
    */
  var userTimezone: js.UndefOr[NullableOption[String]] = js.undefined
}
object ActivityHistoryItem {
  
  inline def apply(): ActivityHistoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityHistoryItem]
  }
  
  extension [Self <: ActivityHistoryItem](x: Self) {
    
    inline def setActiveDurationSeconds(value: NullableOption[Double]): Self = StObject.set(x, "activeDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setActiveDurationSecondsNull: Self = StObject.set(x, "activeDurationSeconds", null)
    
    inline def setActiveDurationSecondsUndefined: Self = StObject.set(x, "activeDurationSeconds", js.undefined)
    
    inline def setActivity(value: UserActivity): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateTimeNull: Self = StObject.set(x, "expirationDateTime", null)
    
    inline def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    inline def setLastActiveDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastActiveDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastActiveDateTimeNull: Self = StObject.set(x, "lastActiveDateTime", null)
    
    inline def setLastActiveDateTimeUndefined: Self = StObject.set(x, "lastActiveDateTime", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setStartedDateTime(value: String): Self = StObject.set(x, "startedDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartedDateTimeUndefined: Self = StObject.set(x, "startedDateTime", js.undefined)
    
    inline def setStatus(value: NullableOption[Status]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUserTimezone(value: NullableOption[String]): Self = StObject.set(x, "userTimezone", value.asInstanceOf[js.Any])
    
    inline def setUserTimezoneNull: Self = StObject.set(x, "userTimezone", null)
    
    inline def setUserTimezoneUndefined: Self = StObject.set(x, "userTimezone", js.undefined)
  }
}
