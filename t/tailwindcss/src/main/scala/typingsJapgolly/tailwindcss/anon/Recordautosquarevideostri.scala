package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'auto' | 'square' | 'video', string> */
trait Recordautosquarevideostri extends StObject {
  
  var auto: String
  
  var square: String
  
  var video: String
}
object Recordautosquarevideostri {
  
  inline def apply(auto: String, square: String, video: String): Recordautosquarevideostri = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], square = square.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordautosquarevideostri]
  }
  
  extension [Self <: Recordautosquarevideostri](x: Self) {
    
    inline def setAuto(value: String): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setSquare(value: String): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: String): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
