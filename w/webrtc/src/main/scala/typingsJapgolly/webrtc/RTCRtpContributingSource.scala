package typingsJapgolly.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#dom-rtcrtpcontributingsource
trait RTCRtpContributingSource extends StObject {
  
  //readonly timestamp: number;
  var source: Double
  
  //readonly audioLevel: number | null;
  val voiceActivityFlag: js.UndefOr[Boolean] = js.undefined
}
object RTCRtpContributingSource {
  
  inline def apply(source: Double): RTCRtpContributingSource = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpContributingSource]
  }
  
  extension [Self <: RTCRtpContributingSource](x: Self) {
    
    inline def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setVoiceActivityFlag(value: Boolean): Self = StObject.set(x, "voiceActivityFlag", value.asInstanceOf[js.Any])
    
    inline def setVoiceActivityFlagUndefined: Self = StObject.set(x, "voiceActivityFlag", js.undefined)
  }
}
