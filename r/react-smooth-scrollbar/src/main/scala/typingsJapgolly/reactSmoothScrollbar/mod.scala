package typingsJapgolly.reactSmoothScrollbar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.EventTarget
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.smoothScrollbar.interfacesScrollbarMod.ScrollStatus
import typingsJapgolly.smoothScrollbar.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-smooth-scrollbar", JSImport.Namespace)
  @js.native
  open class ^ () extends Scrollbar
  
  @js.native
  trait Scrollbar
    extends Component[ScrollbarProps, js.Object, Any] {
    
    /**
      * Scrollbar instance
      */
    val scrollbar: default = js.native
  }
  
  /* Inlined parent std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollbarOptions> */
  trait ScrollbarProps extends StObject {
    
    /**
      * Keep scrollbar tracks visible whether it's scrolling or not
      * @default false
      */
    var alwaysShowTracks: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Optional class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    var continuousScrolling: js.UndefOr[Boolean] = js.undefined
    
    var damping: js.UndefOr[Double] = js.undefined
    
    var delegateTo: js.UndefOr[EventTarget | Null] = js.undefined
    
    /**
      * Pipe to scrollbar.addListener()
      */
    var onScroll: js.UndefOr[js.Function2[/* status */ ScrollStatus, /* scrollbarInstance */ default, Unit]] = js.undefined
    
    var plugins: js.UndefOr[Any] = js.undefined
    
    var renderByPixels: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional style
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var thumbMinSize: js.UndefOr[Double] = js.undefined
    
    var wheelEventTarget: js.UndefOr[EventTarget | Null] = js.undefined
  }
  object ScrollbarProps {
    
    inline def apply(): ScrollbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollbarProps]
    }
    
    extension [Self <: ScrollbarProps](x: Self) {
      
      inline def setAlwaysShowTracks(value: Boolean): Self = StObject.set(x, "alwaysShowTracks", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowTracksUndefined: Self = StObject.set(x, "alwaysShowTracks", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContinuousScrolling(value: Boolean): Self = StObject.set(x, "continuousScrolling", value.asInstanceOf[js.Any])
      
      inline def setContinuousScrollingUndefined: Self = StObject.set(x, "continuousScrolling", js.undefined)
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      inline def setDelegateTo(value: EventTarget): Self = StObject.set(x, "delegateTo", value.asInstanceOf[js.Any])
      
      inline def setDelegateToNull: Self = StObject.set(x, "delegateTo", null)
      
      inline def setDelegateToUndefined: Self = StObject.set(x, "delegateTo", js.undefined)
      
      inline def setOnScroll(value: (/* status */ ScrollStatus, /* scrollbarInstance */ default) => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction2((t0: /* status */ ScrollStatus, t1: /* scrollbarInstance */ default) => (value(t0, t1)).runNow()))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setPlugins(value: Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setRenderByPixels(value: Boolean): Self = StObject.set(x, "renderByPixels", value.asInstanceOf[js.Any])
      
      inline def setRenderByPixelsUndefined: Self = StObject.set(x, "renderByPixels", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setThumbMinSize(value: Double): Self = StObject.set(x, "thumbMinSize", value.asInstanceOf[js.Any])
      
      inline def setThumbMinSizeUndefined: Self = StObject.set(x, "thumbMinSize", js.undefined)
      
      inline def setWheelEventTarget(value: EventTarget): Self = StObject.set(x, "wheelEventTarget", value.asInstanceOf[js.Any])
      
      inline def setWheelEventTargetNull: Self = StObject.set(x, "wheelEventTarget", null)
      
      inline def setWheelEventTargetUndefined: Self = StObject.set(x, "wheelEventTarget", js.undefined)
    }
  }
}
