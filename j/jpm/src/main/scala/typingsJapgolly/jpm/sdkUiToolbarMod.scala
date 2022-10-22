package typingsJapgolly.jpm

import japgolly.scalajs.react.Callback
import typingsJapgolly.jpm.anon.Hidden
import typingsJapgolly.jpm.jpmStrings.attach
import typingsJapgolly.jpm.jpmStrings.detach
import typingsJapgolly.jpm.jpmStrings.hide
import typingsJapgolly.jpm.jpmStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Add a toolbar to the Firefox user interface. A toolbar is a horizontal strip of user interface real estate
  */
object sdkUiToolbarMod {
  
  trait Toolbar extends StObject {
    
    def destroy(): Unit
    
    var hidden: Boolean
    
    var items: js.Array[ToolbarItem]
    
    def off(event: show | hide | attach | detach, handler: js.Function): Unit
    
    def on(event: show | hide | attach | detach, handler: js.Function1[/* toolbar */ this.type, Any]): Unit
    
    def once(event: show | hide | attach | detach, handler: js.Function1[/* toolbar */ this.type, Any]): Unit
    
    def removeListener(event: show | hide | attach | detach, handler: js.Function): Unit
    
    var title: String
  }
  object Toolbar {
    
    @JSImport("sdk/ui/toolbar", "Toolbar")
    @js.native
    def apply(options: Hidden): Toolbar = js.native
    
    extension [Self <: Toolbar](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[ToolbarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: ToolbarItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOff(value: (show | hide | attach | detach, js.Function) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: show | hide | attach | detach, t1: js.Function) => (value(t0, t1)).runNow()))
      
      inline def setOn(value: (show | hide | attach | detach, js.Function1[Toolbar, Any]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: show | hide | attach | detach, t1: js.Function1[Toolbar, Any]) => (value(t0, t1)).runNow()))
      
      inline def setOnce(value: (show | hide | attach | detach, js.Function1[Toolbar, Any]) => Callback): Self = StObject.set(x, "once", js.Any.fromFunction2((t0: show | hide | attach | detach, t1: js.Function1[Toolbar, Any]) => (value(t0, t1)).runNow()))
      
      inline def setRemoveListener(value: (show | hide | attach | detach, js.Function) => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction2((t0: show | hide | attach | detach, t1: js.Function) => (value(t0, t1)).runNow()))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jpm.FFAddonSDK.Frame
    - typingsJapgolly.jpm.FFAddonSDK.ActionButton
    - typingsJapgolly.jpm.FFAddonSDK.ToggleButton
  */
  trait ToolbarItem extends StObject
}
