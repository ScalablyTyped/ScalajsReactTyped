package typingsJapgolly.noScroll

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("no-scroll", JSImport.Namespace)
  @js.native
  val ^ : NoScroll = js.native
  
  trait NoScroll extends StObject {
    
    def off(): Unit
    
    def on(): Unit
    
    def toggle(): Unit
  }
  object NoScroll {
    
    inline def apply(off: Callback, on: Callback, toggle: Callback): NoScroll = {
      val __obj = js.Dynamic.literal(off = off.toJsFn, on = on.toJsFn, toggle = toggle.toJsFn)
      __obj.asInstanceOf[NoScroll]
    }
    
    extension [Self <: NoScroll](x: Self) {
      
      inline def setOff(value: Callback): Self = StObject.set(x, "off", value.toJsFn)
      
      inline def setOn(value: Callback): Self = StObject.set(x, "on", value.toJsFn)
      
      inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    }
  }
  
  type _To = NoScroll
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NoScroll = ^
}
