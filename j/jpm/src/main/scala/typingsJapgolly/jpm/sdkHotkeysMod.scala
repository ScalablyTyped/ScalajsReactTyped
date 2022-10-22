package typingsJapgolly.jpm

import japgolly.scalajs.react.Callback
import typingsJapgolly.jpm.anon.Combo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkHotkeysMod {
  
  trait Hotkey extends StObject {
    
    def destroy(): Unit
  }
  object Hotkey {
    
    @JSImport("sdk/hotkeys", "Hotkey")
    @js.native
    def apply(options: Combo): Hotkey = js.native
    
    extension [Self <: Hotkey](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    }
  }
}
