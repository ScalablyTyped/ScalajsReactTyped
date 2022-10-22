package typingsJapgolly.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventNotificationConfig extends StObject {
  
  /** A Cloud Pub/Sub topic name. For example, `projects/myProject/topics/deviceEvents`. */
  var pubsubTopicName: js.UndefOr[String] = js.undefined
  
  /**
    * If the subfolder name matches this string exactly, this configuration will be used. The string must not include the leading '/' character. If empty, all strings are matched. This
    * field is used only for telemetry events; subfolders are not supported for state changes.
    */
  var subfolderMatches: js.UndefOr[String] = js.undefined
}
object EventNotificationConfig {
  
  inline def apply(): EventNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventNotificationConfig]
  }
  
  extension [Self <: EventNotificationConfig](x: Self) {
    
    inline def setPubsubTopicName(value: String): Self = StObject.set(x, "pubsubTopicName", value.asInstanceOf[js.Any])
    
    inline def setPubsubTopicNameUndefined: Self = StObject.set(x, "pubsubTopicName", js.undefined)
    
    inline def setSubfolderMatches(value: String): Self = StObject.set(x, "subfolderMatches", value.asInstanceOf[js.Any])
    
    inline def setSubfolderMatchesUndefined: Self = StObject.set(x, "subfolderMatches", js.undefined)
  }
}
