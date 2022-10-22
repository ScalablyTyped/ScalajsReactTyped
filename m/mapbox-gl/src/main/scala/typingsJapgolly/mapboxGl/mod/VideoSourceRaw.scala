package typingsJapgolly.mapboxGl.mod

import typingsJapgolly.mapboxGl.mapboxGlStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoSourceRaw
  extends StObject
     with Source
     with VideoSourceOptions
     with _AnySourceData {
  
  @JSName("type")
  var type_VideoSourceRaw: video
}
object VideoSourceRaw {
  
  inline def apply(): VideoSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[VideoSourceRaw]
  }
  
  extension [Self <: VideoSourceRaw](x: Self) {
    
    inline def setType(value: video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
