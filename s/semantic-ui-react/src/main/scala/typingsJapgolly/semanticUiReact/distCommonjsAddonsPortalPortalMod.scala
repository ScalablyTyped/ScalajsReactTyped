package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsAddonsPortalPortalMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Portal/Portal", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PortalProps, js.Object, Any]
  object default {
    
    /* was `typeof PortalInner` */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Portal/Portal", "default.Inner")
    @js.native
    open class Inner ()
      extends typingsJapgolly.semanticUiReact.distCommonjsAddonsPortalPortalInnerMod.default
  }
  
  object Portal {
    
    /* was `typeof PortalInner` */
    type Inner = typingsJapgolly.semanticUiReact.distCommonjsAddonsPortalPortalInnerMod.default
  }
  type Portal = japgolly.scalajs.react.facade.React.Component[PortalProps & js.Object, js.Object]
  
  trait PortalProps
    extends StObject
       with StrictPortalProps
       with /* key */ StringDictionary[Any]
  object PortalProps {
    
    inline def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
  }
  
  trait StrictPortalProps extends StObject {
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Controls whether or not the portal should close on a click outside. */
    var closeOnDocumentClick: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether or not the portal should close when escape is pressed is displayed. */
    var closeOnEscape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls whether or not the portal should close when mousing out of the portal.
      * NOTE: This will prevent `closeOnTriggerMouseLeave` when mousing over the
      * gap from the trigger to the portal.
      */
    var closeOnPortalMouseLeave: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether or not the portal should close on blur of the trigger. */
    var closeOnTriggerBlur: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether or not the portal should close on click of the trigger. */
    var closeOnTriggerClick: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether or not the portal should close when mousing out of the trigger. */
    var closeOnTriggerMouseLeave: js.UndefOr[Boolean] = js.undefined
    
    /** Initial value of open. */
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    /** Event pool namespace that is used to handle component events. */
    var eventPool: js.UndefOr[String] = js.undefined
    
    /** The node where the portal should mount. */
    var mountNode: js.UndefOr[Any] = js.undefined
    
    /** Milliseconds to wait before opening on mouse over */
    var mouseEnterDelay: js.UndefOr[Double] = js.undefined
    
    /** Milliseconds to wait before closing on mouse leave */
    var mouseLeaveDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Called when a close event happens
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClose: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ PortalProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the portal is mounted on the DOM
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onMount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalProps, Unit]] = js.undefined
    
    /**
      * Called when an open event happens
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onOpen: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ PortalProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the portal is unmounted from the DOM
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onUnmount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalProps, Unit]] = js.undefined
    
    /** Controls whether or not the portal is displayed. */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether or not the portal should open when the trigger is clicked. */
    var openOnTriggerClick: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether or not the portal should open on focus of the trigger. */
    var openOnTriggerFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether or not the portal should open when mousing over the trigger. */
    var openOnTriggerMouseEnter: js.UndefOr[Boolean] = js.undefined
    
    /** Element to be rendered in-place where the portal is defined. */
    var trigger: js.UndefOr[Node] = js.undefined
    
    /** Called with a ref to the trigger node. */
    var triggerRef: js.UndefOr[Ref[Any]] = js.undefined
  }
  object StrictPortalProps {
    
    inline def apply(): StrictPortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPortalProps]
    }
    
    extension [Self <: StrictPortalProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCloseOnDocumentClick(value: Boolean): Self = StObject.set(x, "closeOnDocumentClick", value.asInstanceOf[js.Any])
      
      inline def setCloseOnDocumentClickUndefined: Self = StObject.set(x, "closeOnDocumentClick", js.undefined)
      
      inline def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
      
      inline def setCloseOnPortalMouseLeave(value: Boolean): Self = StObject.set(x, "closeOnPortalMouseLeave", value.asInstanceOf[js.Any])
      
      inline def setCloseOnPortalMouseLeaveUndefined: Self = StObject.set(x, "closeOnPortalMouseLeave", js.undefined)
      
      inline def setCloseOnTriggerBlur(value: Boolean): Self = StObject.set(x, "closeOnTriggerBlur", value.asInstanceOf[js.Any])
      
      inline def setCloseOnTriggerBlurUndefined: Self = StObject.set(x, "closeOnTriggerBlur", js.undefined)
      
      inline def setCloseOnTriggerClick(value: Boolean): Self = StObject.set(x, "closeOnTriggerClick", value.asInstanceOf[js.Any])
      
      inline def setCloseOnTriggerClickUndefined: Self = StObject.set(x, "closeOnTriggerClick", js.undefined)
      
      inline def setCloseOnTriggerMouseLeave(value: Boolean): Self = StObject.set(x, "closeOnTriggerMouseLeave", value.asInstanceOf[js.Any])
      
      inline def setCloseOnTriggerMouseLeaveUndefined: Self = StObject.set(x, "closeOnTriggerMouseLeave", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setEventPool(value: String): Self = StObject.set(x, "eventPool", value.asInstanceOf[js.Any])
      
      inline def setEventPoolUndefined: Self = StObject.set(x, "eventPool", js.undefined)
      
      inline def setMountNode(value: Any): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      inline def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
      
      inline def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
      
      inline def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
      
      inline def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
      
      inline def setOnClose(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ PortalProps) => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ PortalProps) => (value(t0, t1)).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnMount(value: (/* nothing */ Null, /* data */ PortalProps) => Callback): Self = StObject.set(x, "onMount", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ PortalProps) => (value(t0, t1)).runNow()))
      
      inline def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      inline def setOnOpen(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ PortalProps) => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ PortalProps) => (value(t0, t1)).runNow()))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnUnmount(value: (/* nothing */ Null, /* data */ PortalProps) => Callback): Self = StObject.set(x, "onUnmount", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ PortalProps) => (value(t0, t1)).runNow()))
      
      inline def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenOnTriggerClick(value: Boolean): Self = StObject.set(x, "openOnTriggerClick", value.asInstanceOf[js.Any])
      
      inline def setOpenOnTriggerClickUndefined: Self = StObject.set(x, "openOnTriggerClick", js.undefined)
      
      inline def setOpenOnTriggerFocus(value: Boolean): Self = StObject.set(x, "openOnTriggerFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenOnTriggerFocusUndefined: Self = StObject.set(x, "openOnTriggerFocus", js.undefined)
      
      inline def setOpenOnTriggerMouseEnter(value: Boolean): Self = StObject.set(x, "openOnTriggerMouseEnter", value.asInstanceOf[js.Any])
      
      inline def setOpenOnTriggerMouseEnterUndefined: Self = StObject.set(x, "openOnTriggerMouseEnter", js.undefined)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setTrigger(value: VdomNode): Self = StObject.set(x, "trigger", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTriggerNull: Self = StObject.set(x, "trigger", null)
      
      inline def setTriggerRef(value: Ref[Any]): Self = StObject.set(x, "triggerRef", value.asInstanceOf[js.Any])
      
      inline def setTriggerRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "triggerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setTriggerRefNull: Self = StObject.set(x, "triggerRef", null)
      
      inline def setTriggerRefUndefined: Self = StObject.set(x, "triggerRef", js.undefined)
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setTriggerVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "trigger", js.Array(value*))
      
      inline def setTriggerVdomElement(value: VdomElement): Self = StObject.set(x, "trigger", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
