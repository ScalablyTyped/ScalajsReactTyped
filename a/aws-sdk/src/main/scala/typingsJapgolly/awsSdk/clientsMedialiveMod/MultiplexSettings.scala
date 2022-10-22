package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiplexSettings extends StObject {
  
  /**
    * Maximum video buffer delay in milliseconds.
    */
  var MaximumVideoBufferDelayMilliseconds: js.UndefOr[integerMin800Max3000] = js.undefined
  
  /**
    * Transport stream bit rate.
    */
  var TransportStreamBitrate: integerMin1000000Max100000000
  
  /**
    * Transport stream ID.
    */
  var TransportStreamId: integerMin0Max65535
  
  /**
    * Transport stream reserved bit rate.
    */
  var TransportStreamReservedBitrate: js.UndefOr[integerMin0Max100000000] = js.undefined
}
object MultiplexSettings {
  
  inline def apply(TransportStreamBitrate: integerMin1000000Max100000000, TransportStreamId: integerMin0Max65535): MultiplexSettings = {
    val __obj = js.Dynamic.literal(TransportStreamBitrate = TransportStreamBitrate.asInstanceOf[js.Any], TransportStreamId = TransportStreamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexSettings]
  }
  
  extension [Self <: MultiplexSettings](x: Self) {
    
    inline def setMaximumVideoBufferDelayMilliseconds(value: integerMin800Max3000): Self = StObject.set(x, "MaximumVideoBufferDelayMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumVideoBufferDelayMillisecondsUndefined: Self = StObject.set(x, "MaximumVideoBufferDelayMilliseconds", js.undefined)
    
    inline def setTransportStreamBitrate(value: integerMin1000000Max100000000): Self = StObject.set(x, "TransportStreamBitrate", value.asInstanceOf[js.Any])
    
    inline def setTransportStreamId(value: integerMin0Max65535): Self = StObject.set(x, "TransportStreamId", value.asInstanceOf[js.Any])
    
    inline def setTransportStreamReservedBitrate(value: integerMin0Max100000000): Self = StObject.set(x, "TransportStreamReservedBitrate", value.asInstanceOf[js.Any])
    
    inline def setTransportStreamReservedBitrateUndefined: Self = StObject.set(x, "TransportStreamReservedBitrate", js.undefined)
  }
}
