package typingsJapgolly.detectHover

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("detect-hover", JSImport.Default)
  @js.native
  val default: typingsJapgolly.detectHover.mod.detectHover = js.native
  
  type _To = typingsJapgolly.detectHover.mod.detectHover
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typingsJapgolly.detectHover.mod.detectHover = default
  
  trait detectHover extends StObject {
    
    var anyHover: Boolean
    
    var anyNone: Boolean
    
    var hover: Boolean
    
    var none: Boolean
    
    def update(): Unit
  }
  object detectHover {
    
    inline def apply(anyHover: Boolean, anyNone: Boolean, hover: Boolean, none: Boolean, update: Callback): typingsJapgolly.detectHover.mod.detectHover = {
      val __obj = js.Dynamic.literal(anyHover = anyHover.asInstanceOf[js.Any], anyNone = anyNone.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], update = update.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.detectHover.mod.detectHover]
    }
    
    extension [Self <: typingsJapgolly.detectHover.mod.detectHover](x: Self) {
      
      inline def setAnyHover(value: Boolean): Self = StObject.set(x, "anyHover", value.asInstanceOf[js.Any])
      
      inline def setAnyNone(value: Boolean): Self = StObject.set(x, "anyNone", value.asInstanceOf[js.Any])
      
      inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setNone(value: Boolean): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    }
  }
}
