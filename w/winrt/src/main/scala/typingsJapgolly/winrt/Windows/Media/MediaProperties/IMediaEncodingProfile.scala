package typingsJapgolly.winrt.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMediaEncodingProfile extends StObject {
  
  var audio: AudioEncodingProperties
  
  var container: ContainerEncodingProperties
  
  var video: VideoEncodingProperties
}
object IMediaEncodingProfile {
  
  inline def apply(
    audio: AudioEncodingProperties,
    container: ContainerEncodingProperties,
    video: VideoEncodingProperties
  ): IMediaEncodingProfile = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaEncodingProfile]
  }
  
  extension [Self <: IMediaEncodingProfile](x: Self) {
    
    inline def setAudio(value: AudioEncodingProperties): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: ContainerEncodingProperties): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: VideoEncodingProperties): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
