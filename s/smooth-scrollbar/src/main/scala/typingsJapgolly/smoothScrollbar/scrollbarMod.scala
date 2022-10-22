package typingsJapgolly.smoothScrollbar

import org.scalajs.dom.HTMLElement
import typingsJapgolly.smoothScrollbar.anon.PartialScrollbarOptions
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollbarMod {
  
  @JSImport("smooth-scrollbar/scrollbar", "Scrollbar")
  @js.native
  open class Scrollbar protected ()
    extends StObject
       with typingsJapgolly.smoothScrollbar.interfacesScrollbarMod.Scrollbar {
    def this(containerEl: HTMLElement) = this()
    def this(containerEl: HTMLElement, options: PartialScrollbarOptions) = this()
    
    /* private */ var _init: Any = js.native
    
    /* private */ var _listeners: Any = js.native
    
    /* private */ var _momentum: Any = js.native
    
    /* private */ var _nextTick: Any = js.native
    
    /* private */ var _observer: Any = js.native
    
    /* private */ var _plugins: Any = js.native
    
    /* private */ var _render: Any = js.native
    
    /* private */ var _renderID: Any = js.native
    
    /* private */ var _shouldPropagateMomentum: Any = js.native
    
    /* private */ var _updateDebounced: Any = js.native
  }
  
  @JSImport("smooth-scrollbar/scrollbar", "scrollbarMap")
  @js.native
  val scrollbarMap: Map[HTMLElement, Scrollbar] = js.native
}
