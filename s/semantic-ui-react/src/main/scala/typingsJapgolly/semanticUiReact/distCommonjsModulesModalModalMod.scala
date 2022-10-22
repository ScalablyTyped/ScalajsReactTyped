package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsAddonsPortalPortalMod.StrictPortalProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsModulesModalModalActionsMod.ModalActionsProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesModalModalContentMod.ModalContentProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesModalModalDescriptionMod.ModalDescriptionProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesModalModalDimmerMod.ModalDimmerProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesModalModalHeaderMod.ModalHeaderProps
import typingsJapgolly.semanticUiReact.semanticUiReactBooleans.`true`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.blurring
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.fullscreen
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.inverted
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesModalModalMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/Modal", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[ModalProps, js.Object, Any] {
    def this(props: ModalProps) = this()
    def this(props: ModalProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/Modal", JSImport.Default)
    @js.native
    val ^ : ModalComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/Modal", "default.Actions")
    @js.native
    open class Actions protected ()
      extends Component[ModalActionsProps, js.Object, Any] {
      def this(props: ModalActionsProps) = this()
      def this(props: ModalActionsProps, context: Any) = this()
    }
    
    type _To = ModalComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ModalComponent = ^
  }
  
  @js.native
  trait ModalComponent
    extends StObject
       with ComponentClass[ModalProps, js.Object] {
    
    var Actions: ComponentClassP[ModalActionsProps & js.Object] = js.native
    
    var Content: FC[ModalContentProps] = js.native
    
    var Description: FC[ModalDescriptionProps] = js.native
    
    var Dimmer: FC[ModalDimmerProps] = js.native
    
    var Header: FC[ModalHeaderProps] = js.native
  }
  
  trait ModalProps
    extends StObject
       with StrictModalProps
       with /* key */ StringDictionary[Any]
  object ModalProps {
    
    inline def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
  }
  
  trait StrictModalProps
    extends StObject
       with StrictPortalProps {
    
    /** Shorthand for Modal.Actions. Typically an array of button shorthand. */
    var actions: js.UndefOr[SemanticShorthandItem[ModalActionsProps]] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** A Modal can reduce its complexity */
    var basic: js.UndefOr[Boolean] = js.undefined
    
    /** A modal can be vertically centered in the viewport. */
    var centered: js.UndefOr[Boolean] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Icon. */
    var closeIcon: js.UndefOr[Any] = js.undefined
    
    /** Whether or not the Modal should close when the dimmer is clicked. */
    var closeOnDimmerClick: js.UndefOr[Boolean] = js.undefined
    
    /** A Modal can be passed content via shorthand. */
    var content: js.UndefOr[SemanticShorthandItem[ModalContentProps]] = js.undefined
    
    /** A modal can appear in a dimmer. */
    var dimmer: js.UndefOr[`true` | blurring | inverted | SemanticShorthandItem[ModalDimmerProps]] = js.undefined
    
    /** A Modal can be passed header via shorthand. */
    var header: js.UndefOr[SemanticShorthandItem[ModalHeaderProps]] = js.undefined
    
    /**
      * Action onClick handler when using shorthand `actions`.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onActionClick: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ ModalProps, Unit]
      ] = js.undefined
    
    /**
      * Called when a close event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    @JSName("onClose")
    var onClose_StrictModalProps: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ ModalProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the portal is mounted on the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    @JSName("onMount")
    var onMount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ ModalProps, Unit]] = js.undefined
    
    /**
      * Called when an open event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    @JSName("onOpen")
    var onOpen_StrictModalProps: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ ModalProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the portal is unmounted from the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    @JSName("onUnmount")
    var onUnmount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ ModalProps, Unit]] = js.undefined
    
    /** A modal can vary in size. */
    var size: js.UndefOr[mini | tiny | small | large | fullscreen] = js.undefined
    
    /** Custom styles. */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object StrictModalProps {
    
    inline def apply(): StrictModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictModalProps]
    }
    
    extension [Self <: StrictModalProps](x: Self) {
      
      inline def setActions(value: SemanticShorthandItem[ModalActionsProps]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsFunction3(
        value: (/* component */ ElementType, ModalActionsProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "actions", js.Any.fromFunction3(value))
      
      inline def setActionsNull: Self = StObject.set(x, "actions", null)
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setActionsVdomElement(value: VdomElement): Self = StObject.set(x, "actions", value.rawElement.asInstanceOf[js.Any])
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseIcon(value: Any): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setCloseOnDimmerClick(value: Boolean): Self = StObject.set(x, "closeOnDimmerClick", value.asInstanceOf[js.Any])
      
      inline def setCloseOnDimmerClickUndefined: Self = StObject.set(x, "closeOnDimmerClick", js.undefined)
      
      inline def setContent(value: SemanticShorthandItem[ModalContentProps]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction3(
        value: (/* component */ ElementType, ModalContentProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "content", js.Any.fromFunction3(value))
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDimmer(value: `true` | blurring | inverted | SemanticShorthandItem[ModalDimmerProps]): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
      
      inline def setDimmerFunction3(
        value: (/* component */ ElementType, ModalDimmerProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "dimmer", js.Any.fromFunction3(value))
      
      inline def setDimmerNull: Self = StObject.set(x, "dimmer", null)
      
      inline def setDimmerUndefined: Self = StObject.set(x, "dimmer", js.undefined)
      
      inline def setDimmerVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "dimmer", js.Array(value*))
      
      inline def setDimmerVdomElement(value: VdomElement): Self = StObject.set(x, "dimmer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeader(value: SemanticShorthandItem[ModalHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFunction3(
        value: (/* component */ ElementType, ModalHeaderProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "header", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnActionClick(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ ModalProps) => Callback): Self = StObject.set(x, "onActionClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ ModalProps) => (value(t0, t1)).runNow()))
      
      inline def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
      
      inline def setOnClose(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ ModalProps) => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ ModalProps) => (value(t0, t1)).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnMount(value: (/* nothing */ Null, /* data */ ModalProps) => Callback): Self = StObject.set(x, "onMount", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ ModalProps) => (value(t0, t1)).runNow()))
      
      inline def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      inline def setOnOpen(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ ModalProps) => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ ModalProps) => (value(t0, t1)).runNow()))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnUnmount(value: (/* nothing */ Null, /* data */ ModalProps) => Callback): Self = StObject.set(x, "onUnmount", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ ModalProps) => (value(t0, t1)).runNow()))
      
      inline def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
      
      inline def setSize(value: mini | tiny | small | large | fullscreen): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
