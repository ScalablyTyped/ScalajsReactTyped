package typingsJapgolly.agoraRtcSdk.anon

import typingsJapgolly.agoraRtcSdk.agoraRtcSdkStrings.H264
import typingsJapgolly.agoraRtcSdk.agoraRtcSdkStrings.OPUS
import typingsJapgolly.agoraRtcSdk.agoraRtcSdkStrings.VP8
import typingsJapgolly.agoraRtcSdk.agoraRtcSdkStrings.VP9
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Audio extends StObject {
  
  var audio: js.Array[OPUS]
  
  var video: js.Array[VP8 | VP9 | H264]
}
object Audio {
  
  inline def apply(audio: js.Array[OPUS], video: js.Array[VP8 | VP9 | H264]): Audio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
  
  extension [Self <: Audio](x: Self) {
    
    inline def setAudio(value: js.Array[OPUS]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioVarargs(value: OPUS*): Self = StObject.set(x, "audio", js.Array(value*))
    
    inline def setVideo(value: js.Array[VP8 | VP9 | H264]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoVarargs(value: (VP8 | VP9 | H264)*): Self = StObject.set(x, "video", js.Array(value*))
  }
}
