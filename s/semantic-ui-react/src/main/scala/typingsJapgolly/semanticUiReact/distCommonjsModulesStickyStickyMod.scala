package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesStickyStickyMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sticky/Sticky", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[StickyProps, js.Object, Any] {
    def this(props: StickyProps) = this()
    def this(props: StickyProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sticky/Sticky", JSImport.Default)
  @js.native
  val default: ComponentClassP[StickyProps & js.Object] = js.native
  
  trait StickyProps
    extends StObject
       with StrictStickyProps
       with /* key */ StringDictionary[Any]
  object StickyProps {
    
    inline def apply(): StickyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StickyProps]
    }
  }
  
  trait StrictStickyProps extends StObject {
    
    /** A Sticky can be active. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Offset in pixels from the bottom of the screen when fixing element to viewport. */
    var bottomOffset: js.UndefOr[Double] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Context which sticky element should stick to. */
    var context: js.UndefOr[Document | Window | HTMLElement | Ref[HTMLElement]] = js.undefined
    
    /** Offset in pixels from the top of the screen when fixing element to viewport. */
    var offset: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback when element is bound to bottom of parent container.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onBottom: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps, Unit]
      ] = js.undefined
    
    /**
      * Callback when element is fixed to page.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onStick: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps, Unit]
      ] = js.undefined
    
    /**
      * Callback when element is bound to top of parent container.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onTop: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps, Unit]
      ] = js.undefined
    
    /**
      * Callback when element is unfixed from page.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onUnstick: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps, Unit]
      ] = js.undefined
    
    /** Whether element should be "pushed" by the viewport, attaching to the bottom of the screen when scrolling up. */
    var pushing: js.UndefOr[Boolean] = js.undefined
    
    /** Context which sticky should attach onscroll events. */
    var scrollContext: js.UndefOr[Document | Window | HTMLElement | Ref[HTMLElement]] = js.undefined
    
    /** Custom style for sticky element. */
    var styleElement: js.UndefOr[CSSProperties] = js.undefined
  }
  object StrictStickyProps {
    
    inline def apply(): StrictStickyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictStickyProps]
    }
    
    extension [Self <: StrictStickyProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBottomOffset(value: Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
      
      inline def setBottomOffsetUndefined: Self = StObject.set(x, "bottomOffset", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContext(value: Document | Window | HTMLElement | Ref[HTMLElement]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "context", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
      
      inline def setContextNull: Self = StObject.set(x, "context", null)
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnBottom(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps) => Callback): Self = StObject.set(x, "onBottom", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ StickyProps) => (value(t0, t1)).runNow()))
      
      inline def setOnBottomUndefined: Self = StObject.set(x, "onBottom", js.undefined)
      
      inline def setOnStick(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps) => Callback): Self = StObject.set(x, "onStick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ StickyProps) => (value(t0, t1)).runNow()))
      
      inline def setOnStickUndefined: Self = StObject.set(x, "onStick", js.undefined)
      
      inline def setOnTop(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps) => Callback): Self = StObject.set(x, "onTop", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ StickyProps) => (value(t0, t1)).runNow()))
      
      inline def setOnTopUndefined: Self = StObject.set(x, "onTop", js.undefined)
      
      inline def setOnUnstick(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps) => Callback): Self = StObject.set(x, "onUnstick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ StickyProps) => (value(t0, t1)).runNow()))
      
      inline def setOnUnstickUndefined: Self = StObject.set(x, "onUnstick", js.undefined)
      
      inline def setPushing(value: Boolean): Self = StObject.set(x, "pushing", value.asInstanceOf[js.Any])
      
      inline def setPushingUndefined: Self = StObject.set(x, "pushing", js.undefined)
      
      inline def setScrollContext(value: Document | Window | HTMLElement | Ref[HTMLElement]): Self = StObject.set(x, "scrollContext", value.asInstanceOf[js.Any])
      
      inline def setScrollContextFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "scrollContext", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
      
      inline def setScrollContextNull: Self = StObject.set(x, "scrollContext", null)
      
      inline def setScrollContextUndefined: Self = StObject.set(x, "scrollContext", js.undefined)
      
      inline def setStyleElement(value: CSSProperties): Self = StObject.set(x, "styleElement", value.asInstanceOf[js.Any])
      
      inline def setStyleElementUndefined: Self = StObject.set(x, "styleElement", js.undefined)
    }
  }
  
  type _To = ComponentClassP[StickyProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesStickyStickyMod.foo` */
  override def _to: ComponentClassP[StickyProps & js.Object] = default
}
