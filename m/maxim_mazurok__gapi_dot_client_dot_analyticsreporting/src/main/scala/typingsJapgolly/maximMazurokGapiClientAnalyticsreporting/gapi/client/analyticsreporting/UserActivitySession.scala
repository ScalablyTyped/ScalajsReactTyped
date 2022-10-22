package typingsJapgolly.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserActivitySession extends StObject {
  
  /** Represents a detailed view into each of the activity in this session. */
  var activities: js.UndefOr[js.Array[Activity]] = js.undefined
  
  /**
    * The data source of a hit. By default, hits sent from analytics.js are reported as "web" and hits sent from the mobile SDKs are reported as "app". These values can be overridden in
    * the Measurement Protocol.
    */
  var dataSource: js.UndefOr[String] = js.undefined
  
  /** The type of device used: "mobile", "tablet" etc. */
  var deviceCategory: js.UndefOr[String] = js.undefined
  
  /** Platform on which the activity happened: "android", "ios" etc. */
  var platform: js.UndefOr[String] = js.undefined
  
  /** Date of this session in ISO-8601 format. */
  var sessionDate: js.UndefOr[String] = js.undefined
  
  /** Unique ID of the session. */
  var sessionId: js.UndefOr[String] = js.undefined
}
object UserActivitySession {
  
  inline def apply(): UserActivitySession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserActivitySession]
  }
  
  extension [Self <: UserActivitySession](x: Self) {
    
    inline def setActivities(value: js.Array[Activity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    inline def setActivitiesVarargs(value: Activity*): Self = StObject.set(x, "activities", js.Array(value*))
    
    inline def setDataSource(value: String): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDeviceCategory(value: String): Self = StObject.set(x, "deviceCategory", value.asInstanceOf[js.Any])
    
    inline def setDeviceCategoryUndefined: Self = StObject.set(x, "deviceCategory", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setSessionDate(value: String): Self = StObject.set(x, "sessionDate", value.asInstanceOf[js.Any])
    
    inline def setSessionDateUndefined: Self = StObject.set(x, "sessionDate", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
