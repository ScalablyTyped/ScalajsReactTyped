package typingsJapgolly.reactstrap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactstrap.reactstrapStrings.lg
import typingsJapgolly.reactstrap.reactstrapStrings.md
import typingsJapgolly.reactstrap.reactstrapStrings.sm
import typingsJapgolly.reactstrap.reactstrapStrings.static
import typingsJapgolly.reactstrap.reactstrapStrings.xl
import typingsJapgolly.reactstrap.typesLibFadeMod.FadeProps
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibModalMod {
  
  @JSImport("reactstrap/types/lib/Modal", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ModalProps, js.Object, Any]
  
  type Modal = japgolly.scalajs.react.facade.React.Component[ModalProps & js.Object, js.Object]
  
  trait ModalProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var backdrop: js.UndefOr[Boolean | static] = js.undefined
    
    var backdropClassName: js.UndefOr[String] = js.undefined
    
    var backdropTransition: js.UndefOr[FadeProps] = js.undefined
    
    var centered: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[String | HTMLElement | RefHandle[HTMLElement]] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var external: js.UndefOr[Node] = js.undefined
    
    var fade: js.UndefOr[Boolean] = js.undefined
    
    var fullscreen: js.UndefOr[Boolean | sm | md | lg | xl] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var labelledBy: js.UndefOr[String] = js.undefined
    
    var modalClassName: js.UndefOr[String] = js.undefined
    
    var modalTransition: js.UndefOr[FadeProps] = js.undefined
    
    var onClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var returnFocusAfterClose: js.UndefOr[Boolean] = js.undefined
    
    var scrollable: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var toggle: js.UndefOr[KeyboardEventHandler[Any] | MouseEventHandler[Any]] = js.undefined
    
    var trapFocus: js.UndefOr[Boolean] = js.undefined
    
    var unmountOnClose: js.UndefOr[Boolean] = js.undefined
    
    var wrapClassName: js.UndefOr[String] = js.undefined
    
    var zIndex: js.UndefOr[Double | String] = js.undefined
  }
  object ModalProps {
    
    inline def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    extension [Self <: ModalProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBackdrop(value: Boolean | static): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setBackdropClassName(value: String): Self = StObject.set(x, "backdropClassName", value.asInstanceOf[js.Any])
      
      inline def setBackdropClassNameUndefined: Self = StObject.set(x, "backdropClassName", js.undefined)
      
      inline def setBackdropTransition(value: FadeProps): Self = StObject.set(x, "backdropTransition", value.asInstanceOf[js.Any])
      
      inline def setBackdropTransitionUndefined: Self = StObject.set(x, "backdropTransition", js.undefined)
      
      inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setContainer(value: String | HTMLElement | RefHandle[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setExternal(value: VdomNode): Self = StObject.set(x, "external", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExternalNull: Self = StObject.set(x, "external", null)
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setExternalVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "external", js.Array(value*))
      
      inline def setExternalVdomElement(value: VdomElement): Self = StObject.set(x, "external", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      inline def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      inline def setFullscreen(value: Boolean | sm | md | lg | xl): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      inline def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setLabelledBy(value: String): Self = StObject.set(x, "labelledBy", value.asInstanceOf[js.Any])
      
      inline def setLabelledByUndefined: Self = StObject.set(x, "labelledBy", js.undefined)
      
      inline def setModalClassName(value: String): Self = StObject.set(x, "modalClassName", value.asInstanceOf[js.Any])
      
      inline def setModalClassNameUndefined: Self = StObject.set(x, "modalClassName", js.undefined)
      
      inline def setModalTransition(value: FadeProps): Self = StObject.set(x, "modalTransition", value.asInstanceOf[js.Any])
      
      inline def setModalTransitionUndefined: Self = StObject.set(x, "modalTransition", js.undefined)
      
      inline def setOnClosed(value: Callback): Self = StObject.set(x, "onClosed", value.toJsFn)
      
      inline def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
      
      inline def setOnEnter(value: Callback): Self = StObject.set(x, "onEnter", value.toJsFn)
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnExit(value: Callback): Self = StObject.set(x, "onExit", value.toJsFn)
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnOpened(value: Callback): Self = StObject.set(x, "onOpened", value.toJsFn)
      
      inline def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      inline def setReturnFocusAfterClose(value: Boolean): Self = StObject.set(x, "returnFocusAfterClose", value.asInstanceOf[js.Any])
      
      inline def setReturnFocusAfterCloseUndefined: Self = StObject.set(x, "returnFocusAfterClose", js.undefined)
      
      inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setToggle(
        value: (ReactKeyboardEventFrom[Any & org.scalajs.dom.Element]) | (ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => Callback
      ): Self = StObject.set(x, "toggle", js.Any.fromFunction1((t0: (ReactKeyboardEventFrom[Any & org.scalajs.dom.Element]) | (ReactMouseEventFrom[Any & org.scalajs.dom.Element])) => value(t0).runNow()))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setTrapFocus(value: Boolean): Self = StObject.set(x, "trapFocus", value.asInstanceOf[js.Any])
      
      inline def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
      
      inline def setUnmountOnClose(value: Boolean): Self = StObject.set(x, "unmountOnClose", value.asInstanceOf[js.Any])
      
      inline def setUnmountOnCloseUndefined: Self = StObject.set(x, "unmountOnClose", js.undefined)
      
      inline def setWrapClassName(value: String): Self = StObject.set(x, "wrapClassName", value.asInstanceOf[js.Any])
      
      inline def setWrapClassNameUndefined: Self = StObject.set(x, "wrapClassName", js.undefined)
      
      inline def setZIndex(value: Double | String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
