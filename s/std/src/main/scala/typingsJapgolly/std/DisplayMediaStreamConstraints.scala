package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayMediaStreamConstraints extends StObject {
  
  /* standard dom */
  var audio: js.UndefOr[scala.Boolean | org.scalajs.dom.MediaTrackConstraints] = js.undefined
  
  /* standard dom */
  var video: js.UndefOr[scala.Boolean | org.scalajs.dom.MediaTrackConstraints] = js.undefined
}
object DisplayMediaStreamConstraints {
  
  inline def apply(): DisplayMediaStreamConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayMediaStreamConstraints]
  }
  
  extension [Self <: DisplayMediaStreamConstraints](x: Self) {
    
    inline def setAudio(value: scala.Boolean | org.scalajs.dom.MediaTrackConstraints): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setVideo(value: scala.Boolean | org.scalajs.dom.MediaTrackConstraints): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
