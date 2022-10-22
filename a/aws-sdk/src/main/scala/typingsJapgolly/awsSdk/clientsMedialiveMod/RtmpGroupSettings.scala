package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RtmpGroupSettings extends StObject {
  
  /**
    * Choose the ad marker type for this output group. MediaLive will create a message based on the content of each SCTE-35 message, format it for that marker type, and insert it in the datastream.
    */
  var AdMarkers: js.UndefOr[listOfRtmpAdMarkers] = js.undefined
  
  /**
    * Authentication scheme to use when connecting with CDN
    */
  var AuthenticationScheme: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.AuthenticationScheme] = js.undefined
  
  /**
    * Controls behavior when content cache fills up. If remote origin server stalls the RTMP connection and does not accept content fast enough the 'Media Cache' will fill up. When the cache reaches the duration specified by cacheLength the cache will stop accepting new content. If set to disconnectImmediately, the RTMP output will force a disconnect. Clear the media cache, and reconnect after restartDelay seconds. If set to waitForServer, the RTMP output will wait up to 5 minutes to allow the origin server to begin accepting data again.
    */
  var CacheFullBehavior: js.UndefOr[RtmpCacheFullBehavior] = js.undefined
  
  /**
    * Cache length, in seconds, is used to calculate buffer size.
    */
  var CacheLength: js.UndefOr[integerMin30] = js.undefined
  
  /**
    * Controls the types of data that passes to onCaptionInfo outputs.  If set to 'all' then 608 and 708 carried DTVCC data will be passed.  If set to 'field1AndField2608' then DTVCC data will be stripped out, but 608 data from both fields will be passed. If set to 'field1608' then only the data carried in 608 from field 1 video will be passed.
    */
  var CaptionData: js.UndefOr[RtmpCaptionData] = js.undefined
  
  /**
    * Controls the behavior of this RTMP group if input becomes unavailable.
  - emitOutput: Emit a slate until input returns.
  - pauseOutput: Stop transmitting data until input returns. This does not close the underlying RTMP connection.
    */
  var InputLossAction: js.UndefOr[InputLossActionForRtmpOut] = js.undefined
  
  /**
    * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
    */
  var RestartDelay: js.UndefOr[integerMin0] = js.undefined
}
object RtmpGroupSettings {
  
  inline def apply(): RtmpGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RtmpGroupSettings]
  }
  
  extension [Self <: RtmpGroupSettings](x: Self) {
    
    inline def setAdMarkers(value: listOfRtmpAdMarkers): Self = StObject.set(x, "AdMarkers", value.asInstanceOf[js.Any])
    
    inline def setAdMarkersUndefined: Self = StObject.set(x, "AdMarkers", js.undefined)
    
    inline def setAdMarkersVarargs(value: RtmpAdMarkers*): Self = StObject.set(x, "AdMarkers", js.Array(value*))
    
    inline def setAuthenticationScheme(value: AuthenticationScheme): Self = StObject.set(x, "AuthenticationScheme", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationSchemeUndefined: Self = StObject.set(x, "AuthenticationScheme", js.undefined)
    
    inline def setCacheFullBehavior(value: RtmpCacheFullBehavior): Self = StObject.set(x, "CacheFullBehavior", value.asInstanceOf[js.Any])
    
    inline def setCacheFullBehaviorUndefined: Self = StObject.set(x, "CacheFullBehavior", js.undefined)
    
    inline def setCacheLength(value: integerMin30): Self = StObject.set(x, "CacheLength", value.asInstanceOf[js.Any])
    
    inline def setCacheLengthUndefined: Self = StObject.set(x, "CacheLength", js.undefined)
    
    inline def setCaptionData(value: RtmpCaptionData): Self = StObject.set(x, "CaptionData", value.asInstanceOf[js.Any])
    
    inline def setCaptionDataUndefined: Self = StObject.set(x, "CaptionData", js.undefined)
    
    inline def setInputLossAction(value: InputLossActionForRtmpOut): Self = StObject.set(x, "InputLossAction", value.asInstanceOf[js.Any])
    
    inline def setInputLossActionUndefined: Self = StObject.set(x, "InputLossAction", js.undefined)
    
    inline def setRestartDelay(value: integerMin0): Self = StObject.set(x, "RestartDelay", value.asInstanceOf[js.Any])
    
    inline def setRestartDelayUndefined: Self = StObject.set(x, "RestartDelay", js.undefined)
  }
}
