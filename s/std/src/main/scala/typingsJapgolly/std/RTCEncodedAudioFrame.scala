package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCEncodedAudioFrame extends StObject {
  
  /* standard dom */
  var data: js.typedarray.ArrayBuffer
  
  /* standard dom */
  def getMetadata(): RTCEncodedAudioFrameMetadata
  
  /* standard dom */
  val timestamp: Double
}
object RTCEncodedAudioFrame {
  
  inline def apply(
    data: js.typedarray.ArrayBuffer,
    getMetadata: CallbackTo[RTCEncodedAudioFrameMetadata],
    timestamp: Double
  ): RTCEncodedAudioFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getMetadata = getMetadata.toJsFn, timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCEncodedAudioFrame]
  }
  
  extension [Self <: RTCEncodedAudioFrame](x: Self) {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGetMetadata(value: CallbackTo[RTCEncodedAudioFrameMetadata]): Self = StObject.set(x, "getMetadata", value.toJsFn)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
