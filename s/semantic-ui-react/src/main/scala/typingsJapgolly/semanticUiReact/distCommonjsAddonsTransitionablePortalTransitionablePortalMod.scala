package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsAddonsPortalPortalMod.PortalProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData
import typingsJapgolly.semanticUiReact.distCommonjsModulesTransitionTransitionMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsAddonsTransitionablePortalTransitionablePortalMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/addons/TransitionablePortal/TransitionablePortal", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[TransitionablePortalProps, js.Object, Any] {
    def this(props: TransitionablePortalProps) = this()
    def this(props: TransitionablePortalProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/addons/TransitionablePortal/TransitionablePortal", JSImport.Default)
  @js.native
  val default: ComponentClassP[TransitionablePortalProps & js.Object] = js.native
  
  trait StrictTransitionablePortalProps extends StObject {
    
    /** Primary content. */
    var children: Node
    
    /**
      * Called when a close event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and internal state.
      */
    var onClose: js.UndefOr[
        js.Function2[/* nothing */ Null, /* data */ PortalProps & TransitionablePortalState, Unit]
      ] = js.undefined
    
    /**
      * Callback on each transition that changes visibility to hidden.
      *
      * @param {null}
      * @param {object} data - All props with status.
      */
    var onHide: js.UndefOr[
        js.Function2[/* nothing */ Null, /* data */ TransitionEventData & TransitionablePortalState, Unit]
      ] = js.undefined
    
    /**
      * Called when an open event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and internal state.
      */
    var onOpen: js.UndefOr[
        js.Function2[/* nothing */ Null, /* data */ PortalProps & TransitionablePortalState, Unit]
      ] = js.undefined
    
    /**
      * Callback on animation start.
      *
      * @param {null}
      * @param {object} data - All props with status.
      */
    var onStart: js.UndefOr[
        js.Function2[/* nothing */ Null, /* data */ TransitionEventData & TransitionablePortalState, Unit]
      ] = js.undefined
    
    /** Controls whether or not the portal is displayed. */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /** Transition props. */
    var transition: js.UndefOr[TransitionProps] = js.undefined
  }
  object StrictTransitionablePortalProps {
    
    inline def apply(): StrictTransitionablePortalProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[StrictTransitionablePortalProps]
    }
    
    extension [Self <: StrictTransitionablePortalProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClose(value: (/* nothing */ Null, /* data */ PortalProps & TransitionablePortalState) => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ PortalProps & TransitionablePortalState) => (value(t0, t1)).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnHide(
        value: (/* nothing */ Null, /* data */ TransitionEventData & TransitionablePortalState) => Callback
      ): Self = StObject.set(x, "onHide", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ TransitionEventData & TransitionablePortalState) => (value(t0, t1)).runNow()))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnOpen(value: (/* nothing */ Null, /* data */ PortalProps & TransitionablePortalState) => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ PortalProps & TransitionablePortalState) => (value(t0, t1)).runNow()))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnStart(
        value: (/* nothing */ Null, /* data */ TransitionEventData & TransitionablePortalState) => Callback
      ): Self = StObject.set(x, "onStart", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ TransitionEventData & TransitionablePortalState) => (value(t0, t1)).runNow()))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setTransition(value: TransitionProps): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  trait TransitionablePortalProps
    extends StObject
       with StrictTransitionablePortalProps
       with /* key */ StringDictionary[Any]
  object TransitionablePortalProps {
    
    inline def apply(): TransitionablePortalProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[TransitionablePortalProps]
    }
  }
  
  trait TransitionablePortalState extends StObject {
    
    var portalOpen: Boolean
    
    var transitionVisible: Boolean
  }
  object TransitionablePortalState {
    
    inline def apply(portalOpen: Boolean, transitionVisible: Boolean): TransitionablePortalState = {
      val __obj = js.Dynamic.literal(portalOpen = portalOpen.asInstanceOf[js.Any], transitionVisible = transitionVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionablePortalState]
    }
    
    extension [Self <: TransitionablePortalState](x: Self) {
      
      inline def setPortalOpen(value: Boolean): Self = StObject.set(x, "portalOpen", value.asInstanceOf[js.Any])
      
      inline def setTransitionVisible(value: Boolean): Self = StObject.set(x, "transitionVisible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentClassP[TransitionablePortalProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsAddonsTransitionablePortalTransitionablePortalMod.foo` */
  override def _to: ComponentClassP[TransitionablePortalProps & js.Object] = default
}
