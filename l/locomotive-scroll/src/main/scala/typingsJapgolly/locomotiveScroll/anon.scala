package typingsJapgolly.locomotiveScroll

import org.scalajs.dom.HTMLElement
import typingsJapgolly.locomotiveScroll.locomotiveScrollBooleans.`true`
import typingsJapgolly.locomotiveScroll.mod.Direction
import typingsJapgolly.locomotiveScroll.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined locomotive-scroll.locomotive-scroll.DeviceOptions & {  breakpoint :number} */
  trait DeviceOptionsbreakpointnu extends StObject {
    
    var breakpoint: Double
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var gestureDirection: js.UndefOr[Direction] = js.undefined
    
    var smooth: js.UndefOr[Boolean] = js.undefined
  }
  object DeviceOptionsbreakpointnu {
    
    inline def apply(breakpoint: Double): DeviceOptionsbreakpointnu = {
      val __obj = js.Dynamic.literal(breakpoint = breakpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceOptionsbreakpointnu]
    }
    
    extension [Self <: DeviceOptionsbreakpointnu](x: Self) {
      
      inline def setBreakpoint(value: Double): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setGestureDirection(value: Direction): Self = StObject.set(x, "gestureDirection", value.asInstanceOf[js.Any])
      
      inline def setGestureDirectionUndefined: Self = StObject.set(x, "gestureDirection", js.undefined)
      
      inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    }
  }
  
  trait El extends StObject {
    
    var el: HTMLElement
    
    var id: String
    
    var inView: `true`
    
    var limit: Position
    
    var offset: Position
    
    var persistent: Boolean
  }
  object El {
    
    inline def apply(el: HTMLElement, id: String, limit: Position, offset: Position, persistent: Boolean): El = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inView = true, limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any])
      __obj.asInstanceOf[El]
    }
    
    extension [Self <: El](x: Self) {
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInView(value: `true`): Self = StObject.set(x, "inView", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Position): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Position): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    }
  }
}
