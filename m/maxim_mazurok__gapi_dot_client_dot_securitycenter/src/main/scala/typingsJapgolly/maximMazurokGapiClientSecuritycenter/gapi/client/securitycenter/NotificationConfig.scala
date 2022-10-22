package typingsJapgolly.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationConfig extends StObject {
  
  /** The description of the notification config (max of 1024 characters). */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The relative resource name of this notification config. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
    * "organizations/{organization_id}/notificationConfigs/notify_public_bucket".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The Pub/Sub topic to send notifications to. Its format is "projects/[project_id]/topics/[topic]". */
  var pubsubTopic: js.UndefOr[String] = js.undefined
  
  /** Output only. The service account that needs "pubsub.topics.publish" permission to publish to the Pub/Sub topic. */
  var serviceAccount: js.UndefOr[String] = js.undefined
  
  /** The config for triggering streaming-based notifications. */
  var streamingConfig: js.UndefOr[StreamingConfig] = js.undefined
}
object NotificationConfig {
  
  inline def apply(): NotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfig]
  }
  
  extension [Self <: NotificationConfig](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPubsubTopic(value: String): Self = StObject.set(x, "pubsubTopic", value.asInstanceOf[js.Any])
    
    inline def setPubsubTopicUndefined: Self = StObject.set(x, "pubsubTopic", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setStreamingConfig(value: StreamingConfig): Self = StObject.set(x, "streamingConfig", value.asInstanceOf[js.Any])
    
    inline def setStreamingConfigUndefined: Self = StObject.set(x, "streamingConfig", js.undefined)
  }
}
