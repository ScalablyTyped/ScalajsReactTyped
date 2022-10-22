package typingsJapgolly.smoothScrollbar

import org.scalajs.dom.TouchEvent
import typingsJapgolly.smoothScrollbar.anon.X
import typingsJapgolly.smoothScrollbar.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsOverscrollGlowMod {
  
  @JSImport("smooth-scrollbar/plugins/overscroll/glow", "Glow")
  @js.native
  open class Glow protected () extends StObject {
    def this(_scrollbar: default) = this()
    
    /* private */ var _canvas: Any = js.native
    
    /* private */ var _ctx: Any = js.native
    
    /* private */ var _getMaxOverscroll: Any = js.native
    
    /* private */ var _renderX: Any = js.native
    
    /* private */ var _renderY: Any = js.native
    
    /* private */ var _scrollbar: Any = js.native
    
    /* private */ var _touchX: Any = js.native
    
    /* private */ var _touchY: Any = js.native
    
    def adjust(): Unit = js.native
    
    def mount(): Unit = js.native
    
    def recordTouch(event: TouchEvent): Unit = js.native
    
    def render(hasXY: X, color: String): Unit = js.native
    
    def unmount(): Unit = js.native
  }
}
