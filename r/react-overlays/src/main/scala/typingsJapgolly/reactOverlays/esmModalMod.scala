package typingsJapgolly.reactOverlays

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefFn
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactOverlays.anon.HandleContainerOverflow
import typingsJapgolly.reactOverlays.anon.PartialModalPropsRefAttri
import typingsJapgolly.reactOverlays.anon.PreventScroll
import typingsJapgolly.reactOverlays.anon.WeakValidationMapModalPro
import typingsJapgolly.reactOverlays.anon.inbooleanappearbooleanund
import typingsJapgolly.reactOverlays.esmModalManagerMod.default
import typingsJapgolly.reactOverlays.esmTypesMod.TransitionCallbacks
import typingsJapgolly.reactOverlays.esmUseWaitForDOMRefMod.DOMContainer
import typingsJapgolly.reactOverlays.reactOverlaysBooleans.`false`
import typingsJapgolly.reactOverlays.reactOverlaysBooleans.`true`
import typingsJapgolly.reactOverlays.reactOverlaysStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmModalMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<react-overlays.react-overlays/esm/Modal.ModalProps & react.react.RefAttributes<react-overlays.react-overlays/esm/Modal.ModalHandle>> & {  Manager :new (hasHideSiblingNodesHandleContainerOverflow : {  hideSiblingNodes :boolean | undefined,   handleContainerOverflow :boolean | undefined} | undefined): react-overlays.react-overlays/esm/ModalManager.default} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: ModalProps & RefAttributes[ModalHandle]): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("react-overlays/esm/Modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-overlays/esm/Modal", "default.Manager")
    @js.native
    open class Manager ()
      extends typingsJapgolly.reactOverlays.esmModalManagerMod.default {
      def this(hasHideSiblingNodesHandleContainerOverflow: HandleContainerOverflow) = this()
    }
    @JSImport("react-overlays/esm/Modal", "default.Manager")
    @js.native
    def Manager: Instantiable1[
        /* hasHideSiblingNodesHandleContainerOverflow */ js.UndefOr[HandleContainerOverflow], 
        typingsJapgolly.reactOverlays.esmModalManagerMod.default
      ] = js.native
    inline def Manager_=(
      x: Instantiable1[
          /* hasHideSiblingNodesHandleContainerOverflow */ js.UndefOr[HandleContainerOverflow], 
          typingsJapgolly.reactOverlays.esmModalManagerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Manager")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm/Modal", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialModalPropsRefAttri] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialModalPropsRefAttri]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm/Modal", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm/Modal", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapModalPro] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapModalPro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm/Modal", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
  
  trait BaseModalProps
    extends StObject
       with TransitionCallbacks {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var backdrop: js.UndefOr[`true` | `false` | static] = js.undefined
    
    var backdropTransition: js.UndefOr[ModalTransitionComponent] = js.undefined
    
    var children: js.UndefOr[Element] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var container: js.UndefOr[DOMContainer[HTMLElement]] = js.undefined
    
    var containerClassName: js.UndefOr[String] = js.undefined
    
    var enforceFocus: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var manager: js.UndefOr[default] = js.undefined
    
    var onBackdropClick: js.UndefOr[js.Function1[/* e */ ReactEventFrom[org.scalajs.dom.Element], Unit]] = js.undefined
    
    var onEscapeKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var renderBackdrop: js.UndefOr[js.Function1[/* props */ RenderModalBackdropProps, Node]] = js.undefined
    
    var renderDialog: js.UndefOr[js.Function1[/* props */ RenderModalDialogProps, Node]] = js.undefined
    
    var restoreFocus: js.UndefOr[Boolean] = js.undefined
    
    var restoreFocusOptions: js.UndefOr[PreventScroll] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var transition: js.UndefOr[ModalTransitionComponent] = js.undefined
  }
  object BaseModalProps {
    
    inline def apply(): BaseModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModalProps]
    }
    
    extension [Self <: BaseModalProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBackdrop(value: `true` | `false` | static): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setBackdropTransition(value: ModalTransitionComponent): Self = StObject.set(x, "backdropTransition", value.asInstanceOf[js.Any])
      
      inline def setBackdropTransitionUndefined: Self = StObject.set(x, "backdropTransition", js.undefined)
      
      inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainer(value: DOMContainer[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerCallbackTo(value: CallbackTo[HTMLElement | RefHandle[HTMLElement] | Null]): Self = StObject.set(x, "container", value.toJsFn)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
      
      inline def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setManager(value: default): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      inline def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
      
      inline def setOnBackdropClick(value: /* e */ ReactEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBackdropClick", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBackdropClickUndefined: Self = StObject.set(x, "onBackdropClick", js.undefined)
      
      inline def setOnEscapeKeyDown(value: /* e */ KeyboardEvent => Callback): Self = StObject.set(x, "onEscapeKeyDown", js.Any.fromFunction1((t0: /* e */ KeyboardEvent) => value(t0).runNow()))
      
      inline def setOnEscapeKeyDownUndefined: Self = StObject.set(x, "onEscapeKeyDown", js.undefined)
      
      inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setRenderBackdrop(value: /* props */ RenderModalBackdropProps => Node): Self = StObject.set(x, "renderBackdrop", js.Any.fromFunction1(value))
      
      inline def setRenderBackdropUndefined: Self = StObject.set(x, "renderBackdrop", js.undefined)
      
      inline def setRenderDialog(value: /* props */ RenderModalDialogProps => Node): Self = StObject.set(x, "renderDialog", js.Any.fromFunction1(value))
      
      inline def setRenderDialogUndefined: Self = StObject.set(x, "renderDialog", js.undefined)
      
      inline def setRestoreFocus(value: Boolean): Self = StObject.set(x, "restoreFocus", value.asInstanceOf[js.Any])
      
      inline def setRestoreFocusOptions(value: PreventScroll): Self = StObject.set(x, "restoreFocusOptions", value.asInstanceOf[js.Any])
      
      inline def setRestoreFocusOptionsUndefined: Self = StObject.set(x, "restoreFocusOptions", js.undefined)
      
      inline def setRestoreFocusUndefined: Self = StObject.set(x, "restoreFocus", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransition(value: ModalTransitionComponent): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  trait ModalHandle extends StObject {
    
    var backdrop: HTMLElement | Null
    
    var dialog: HTMLElement | Null
  }
  object ModalHandle {
    
    inline def apply(): ModalHandle = {
      val __obj = js.Dynamic.literal(backdrop = null, dialog = null)
      __obj.asInstanceOf[ModalHandle]
    }
    
    extension [Self <: ModalHandle](x: Self) {
      
      inline def setBackdrop(value: HTMLElement): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setBackdropNull: Self = StObject.set(x, "backdrop", null)
      
      inline def setDialog(value: HTMLElement): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setDialogNull: Self = StObject.set(x, "dialog", null)
    }
  }
  
  trait ModalProps
    extends StObject
       with BaseModalProps
       with /* other */ StringDictionary[Any]
  object ModalProps {
    
    inline def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
  }
  
  type ModalTransitionComponent = ComponentType[inbooleanappearbooleanund]
  
  trait RenderModalBackdropProps extends StObject {
    
    def onClick(event: ReactEventFrom[org.scalajs.dom.Element]): Unit
    
    var ref: RefFn[org.scalajs.dom.Element]
  }
  object RenderModalBackdropProps {
    
    inline def apply(
      onClick: ReactEventFrom[org.scalajs.dom.Element] => Callback,
      ref: org.scalajs.dom.Element | Null => Callback
    ): RenderModalBackdropProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => onClick(t0).runNow()), ref = js.Any.fromFunction1((t0: org.scalajs.dom.Element | Null) => ref(t0).runNow()))
      __obj.asInstanceOf[RenderModalBackdropProps]
    }
    
    extension [Self <: RenderModalBackdropProps](x: Self) {
      
      inline def setOnClick(value: ReactEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setRef(value: org.scalajs.dom.Element | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: org.scalajs.dom.Element | Null) => value(t0).runNow()))
    }
  }
  
  trait RenderModalDialogProps extends StObject {
    
    var `aria-modal`: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var ref: RefFn[org.scalajs.dom.Element]
    
    var role: String
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: Double
  }
  object RenderModalDialogProps {
    
    inline def apply(ref: org.scalajs.dom.Element | Null => Callback, role: String, tabIndex: Double): RenderModalDialogProps = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1((t0: org.scalajs.dom.Element | Null) => ref(t0).runNow()), role = role.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderModalDialogProps]
    }
    
    extension [Self <: RenderModalDialogProps](x: Self) {
      
      inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setRef(value: org.scalajs.dom.Element | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: org.scalajs.dom.Element | Null) => value(t0).runNow()))
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    }
  }
}
