package typingsJapgolly.awsSdk.clientsPinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDestination extends StObject {
  
  var CloudWatchLogsDestination: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointsmsvoiceMod.CloudWatchLogsDestination] = js.undefined
  
  /**
    * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon Pinpoint sends response data to the specified event destination.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  var KinesisFirehoseDestination: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointsmsvoiceMod.KinesisFirehoseDestination] = js.undefined
  
  var MatchingEventTypes: js.UndefOr[EventTypes] = js.undefined
  
  /**
    * A name that identifies the event destination configuration.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  var SnsDestination: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointsmsvoiceMod.SnsDestination] = js.undefined
}
object EventDestination {
  
  inline def apply(): EventDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDestination]
  }
  
  extension [Self <: EventDestination](x: Self) {
    
    inline def setCloudWatchLogsDestination(value: CloudWatchLogsDestination): Self = StObject.set(x, "CloudWatchLogsDestination", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsDestinationUndefined: Self = StObject.set(x, "CloudWatchLogsDestination", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setKinesisFirehoseDestination(value: KinesisFirehoseDestination): Self = StObject.set(x, "KinesisFirehoseDestination", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseDestinationUndefined: Self = StObject.set(x, "KinesisFirehoseDestination", js.undefined)
    
    inline def setMatchingEventTypes(value: EventTypes): Self = StObject.set(x, "MatchingEventTypes", value.asInstanceOf[js.Any])
    
    inline def setMatchingEventTypesUndefined: Self = StObject.set(x, "MatchingEventTypes", js.undefined)
    
    inline def setMatchingEventTypesVarargs(value: EventType*): Self = StObject.set(x, "MatchingEventTypes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSnsDestination(value: SnsDestination): Self = StObject.set(x, "SnsDestination", value.asInstanceOf[js.Any])
    
    inline def setSnsDestinationUndefined: Self = StObject.set(x, "SnsDestination", js.undefined)
  }
}
