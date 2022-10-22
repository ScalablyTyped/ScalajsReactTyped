package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'auto' | 'scroll' | 'contents' | 'transform', string> */
trait Recordautoscrollcontentst extends StObject {
  
  var auto: String
  
  var contents: String
  
  var scroll: String
  
  var transform: String
}
object Recordautoscrollcontentst {
  
  inline def apply(auto: String, contents: String, scroll: String, transform: String): Recordautoscrollcontentst = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordautoscrollcontentst]
  }
  
  extension [Self <: Recordautoscrollcontentst](x: Self) {
    
    inline def setAuto(value: String): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: String): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
