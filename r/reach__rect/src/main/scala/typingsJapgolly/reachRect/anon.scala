package typingsJapgolly.reachRect

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.reachRect.mod.PRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Rect extends StObject {
    
    var rect: PRect | Null
    
    var ref: RefHandle[Any]
  }
  object Rect {
    
    inline def apply(ref: RefHandle[Any]): Rect = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], rect = null)
      __obj.asInstanceOf[Rect]
    }
    
    extension [Self <: Rect](x: Self) {
      
      inline def setRect(value: PRect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setRectNull: Self = StObject.set(x, "rect", null)
      
      inline def setRef(value: RefHandle[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
}
