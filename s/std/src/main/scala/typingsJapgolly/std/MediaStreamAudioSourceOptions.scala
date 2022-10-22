package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamAudioSourceOptions extends StObject {
  
  /* standard dom */
  var mediaStream: org.scalajs.dom.MediaStream
}
object MediaStreamAudioSourceOptions {
  
  inline def apply(mediaStream: org.scalajs.dom.MediaStream): MediaStreamAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaStream = mediaStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamAudioSourceOptions]
  }
  
  extension [Self <: MediaStreamAudioSourceOptions](x: Self) {
    
    inline def setMediaStream(value: org.scalajs.dom.MediaStream): Self = StObject.set(x, "mediaStream", value.asInstanceOf[js.Any])
  }
}
