package typingsJapgolly.twilioVideo.tsdefTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioCodecSettings extends StObject {
  
  var codec: AudioCodec
}
object AudioCodecSettings {
  
  inline def apply(codec: AudioCodec): AudioCodecSettings = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioCodecSettings]
  }
  
  extension [Self <: AudioCodecSettings](x: Self) {
    
    inline def setCodec(value: AudioCodec): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
  }
}
