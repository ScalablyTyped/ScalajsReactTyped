package typingsJapgolly.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDestinationDefinition extends StObject {
  
  /**
    * An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
    */
  var CloudWatchDestination: js.UndefOr[typingsJapgolly.awsSdk.clientsSesv2Mod.CloudWatchDestination] = js.undefined
  
  /**
    * If true, the event destination is enabled. When the event destination is enabled, the specified event types are sent to the destinations in this EventDestinationDefinition. If false, the event destination is disabled. When the event destination is disabled, events aren't sent to the specified destinations.
    */
  var Enabled: js.UndefOr[typingsJapgolly.awsSdk.clientsSesv2Mod.Enabled] = js.undefined
  
  /**
    * An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
    */
  var KinesisFirehoseDestination: js.UndefOr[typingsJapgolly.awsSdk.clientsSesv2Mod.KinesisFirehoseDestination] = js.undefined
  
  /**
    * An array that specifies which events the Amazon SES API v2 should send to the destinations in this EventDestinationDefinition.
    */
  var MatchingEventTypes: js.UndefOr[EventTypes] = js.undefined
  
  /**
    * An object that defines an Amazon Pinpoint project destination for email events. You can send email event data to a Amazon Pinpoint project to view metrics using the Transactional Messaging dashboards that are built in to Amazon Pinpoint. For more information, see Transactional Messaging Charts in the Amazon Pinpoint User Guide.
    */
  var PinpointDestination: js.UndefOr[typingsJapgolly.awsSdk.clientsSesv2Mod.PinpointDestination] = js.undefined
  
  /**
    * An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification when certain email events occur.
    */
  var SnsDestination: js.UndefOr[typingsJapgolly.awsSdk.clientsSesv2Mod.SnsDestination] = js.undefined
}
object EventDestinationDefinition {
  
  inline def apply(): EventDestinationDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDestinationDefinition]
  }
  
  extension [Self <: EventDestinationDefinition](x: Self) {
    
    inline def setCloudWatchDestination(value: CloudWatchDestination): Self = StObject.set(x, "CloudWatchDestination", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchDestinationUndefined: Self = StObject.set(x, "CloudWatchDestination", js.undefined)
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setKinesisFirehoseDestination(value: KinesisFirehoseDestination): Self = StObject.set(x, "KinesisFirehoseDestination", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseDestinationUndefined: Self = StObject.set(x, "KinesisFirehoseDestination", js.undefined)
    
    inline def setMatchingEventTypes(value: EventTypes): Self = StObject.set(x, "MatchingEventTypes", value.asInstanceOf[js.Any])
    
    inline def setMatchingEventTypesUndefined: Self = StObject.set(x, "MatchingEventTypes", js.undefined)
    
    inline def setMatchingEventTypesVarargs(value: EventType*): Self = StObject.set(x, "MatchingEventTypes", js.Array(value*))
    
    inline def setPinpointDestination(value: PinpointDestination): Self = StObject.set(x, "PinpointDestination", value.asInstanceOf[js.Any])
    
    inline def setPinpointDestinationUndefined: Self = StObject.set(x, "PinpointDestination", js.undefined)
    
    inline def setSnsDestination(value: SnsDestination): Self = StObject.set(x, "SnsDestination", value.asInstanceOf[js.Any])
    
    inline def setSnsDestinationUndefined: Self = StObject.set(x, "SnsDestination", js.undefined)
  }
}
