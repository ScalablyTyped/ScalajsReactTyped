package typingsJapgolly.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport extends StObject {
  
  // live updates with the latest values
  var frame: Rect
  
  var scroll: ScrollDetails
}
object Viewport {
  
  inline def apply(frame: Rect, scroll: ScrollDetails): Viewport = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  extension [Self <: Viewport](x: Self) {
    
    inline def setFrame(value: Rect): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: ScrollDetails): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
  }
}
