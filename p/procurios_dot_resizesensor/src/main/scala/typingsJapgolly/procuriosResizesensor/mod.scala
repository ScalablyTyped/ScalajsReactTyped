package typingsJapgolly.procuriosResizesensor

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("procurios.resizesensor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(targetElement: HTMLElement, callback: js.Function1[/* dimensions */ Dimensions, Unit]): ResizeSensor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(targetElement.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ResizeSensor]
  
  trait Dimensions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Dimensions {
    
    inline def apply(height: Double, width: Double): Dimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimensions]
    }
    
    extension [Self <: Dimensions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizeSensor extends StObject {
    
    def destroy(): Unit
  }
  object ResizeSensor {
    
    inline def apply(destroy: Callback): ResizeSensor = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
      __obj.asInstanceOf[ResizeSensor]
    }
    
    extension [Self <: ResizeSensor](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    }
  }
}
