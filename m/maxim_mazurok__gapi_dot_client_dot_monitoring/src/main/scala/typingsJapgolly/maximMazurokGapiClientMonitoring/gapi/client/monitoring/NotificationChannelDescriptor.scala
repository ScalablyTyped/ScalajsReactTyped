package typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationChannelDescriptor extends StObject {
  
  /** A human-readable description of the notification channel type. The description may include a description of the properties of the channel and pointers to external documentation. */
  var description: js.UndefOr[String] = js.undefined
  
  /** A human-readable name for the notification channel type. This form of the name is suitable for a user interface. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The set of labels that must be defined to identify a particular channel of the corresponding type. Each label includes a description for how that field should be populated. */
  var labels: js.UndefOr[js.Array[LabelDescriptor]] = js.undefined
  
  /** The product launch stage for channels of this type. */
  var launchStage: js.UndefOr[String] = js.undefined
  
  /**
    * The full REST resource name for this descriptor. The format is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannelDescriptors/[TYPE] In the above, [TYPE] is the value of the type
    * field.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The tiers that support this notification channel; the project service tier must be one of the supported_tiers. */
  var supportedTiers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The type of notification channel, such as "email" and "sms". To view the full list of channels, see Channel descriptors
    * (https://cloud.google.com/monitoring/alerts/using-channels-api#ncd). Notification channel types are globally unique.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object NotificationChannelDescriptor {
  
  inline def apply(): NotificationChannelDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationChannelDescriptor]
  }
  
  extension [Self <: NotificationChannelDescriptor](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabels(value: js.Array[LabelDescriptor]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: LabelDescriptor*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLaunchStage(value: String): Self = StObject.set(x, "launchStage", value.asInstanceOf[js.Any])
    
    inline def setLaunchStageUndefined: Self = StObject.set(x, "launchStage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSupportedTiers(value: js.Array[String]): Self = StObject.set(x, "supportedTiers", value.asInstanceOf[js.Any])
    
    inline def setSupportedTiersUndefined: Self = StObject.set(x, "supportedTiers", js.undefined)
    
    inline def setSupportedTiersVarargs(value: String*): Self = StObject.set(x, "supportedTiers", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
