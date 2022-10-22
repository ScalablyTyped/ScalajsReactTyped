package typingsJapgolly.smoothScrollbar

import japgolly.scalajs.react.Callback
import typingsJapgolly.smoothScrollbar.interfacesData2dMod.Data2d
import typingsJapgolly.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesPluginMod {
  
  trait ScrollbarPlugin extends StObject {
    
    val name: String
    
    def onDestroy(): Unit
    
    def onInit(): Unit
    
    def onRender(remainMomentum: Data2d): Unit
    
    def onUpdate(): Unit
    
    val options: Any
    
    val scrollbar: Scrollbar
    
    def transformDelta(delta: Data2d, fromEvent: Any): Data2d
  }
  object ScrollbarPlugin {
    
    inline def apply(
      name: String,
      onDestroy: Callback,
      onInit: Callback,
      onRender: Data2d => Callback,
      onUpdate: Callback,
      options: Any,
      scrollbar: Scrollbar,
      transformDelta: (Data2d, Any) => Data2d
    ): ScrollbarPlugin = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onDestroy = onDestroy.toJsFn, onInit = onInit.toJsFn, onRender = js.Any.fromFunction1((t0: Data2d) => onRender(t0).runNow()), onUpdate = onUpdate.toJsFn, options = options.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], transformDelta = js.Any.fromFunction2(transformDelta))
      __obj.asInstanceOf[ScrollbarPlugin]
    }
    
    extension [Self <: ScrollbarPlugin](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnDestroy(value: Callback): Self = StObject.set(x, "onDestroy", value.toJsFn)
      
      inline def setOnInit(value: Callback): Self = StObject.set(x, "onInit", value.toJsFn)
      
      inline def setOnRender(value: Data2d => Callback): Self = StObject.set(x, "onRender", js.Any.fromFunction1((t0: Data2d) => value(t0).runNow()))
      
      inline def setOnUpdate(value: Callback): Self = StObject.set(x, "onUpdate", value.toJsFn)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setScrollbar(value: Scrollbar): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      inline def setTransformDelta(value: (Data2d, Any) => Data2d): Self = StObject.set(x, "transformDelta", js.Any.fromFunction2(value))
    }
  }
}
