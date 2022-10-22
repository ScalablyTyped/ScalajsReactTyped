package typingsJapgolly.reactUseMeasure

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.reactUseMeasure.mod.ResizeObserver
import typingsJapgolly.reactUseMeasure.mod.ResizeObserverCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* cb */ ResizeObserverCallback, ResizeObserver]
  
  trait Resize extends StObject {
    
    var resize: Double
    
    var scroll: Double
  }
  object Resize {
    
    inline def apply(resize: Double, scroll: Double): Resize = {
      val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resize]
    }
    
    extension [Self <: Resize](x: Self) {
      
      inline def setResize(value: Double): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setScroll(value: Double): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    }
  }
}
