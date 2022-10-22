package typingsJapgolly.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferCodecsData extends StObject {
  
  var audio: js.UndefOr[Track] = js.undefined
  
  var video: js.UndefOr[Track] = js.undefined
}
object BufferCodecsData {
  
  inline def apply(): BufferCodecsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferCodecsData]
  }
  
  extension [Self <: BufferCodecsData](x: Self) {
    
    inline def setAudio(value: Track): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setVideo(value: Track): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
