package typingsJapgolly.blueprintjsCore.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typingsJapgolly.blueprintjsCore.libEsmComponentsDialogDialogStepButtonMod.DialogStepButtonProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsDialogDialogStepMod.DialogStepId
import typingsJapgolly.blueprintjsCore.libEsmComponentsDialogMultistepDialogMod.MultistepDialogNavPosition
import typingsJapgolly.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/dialog/multistepDialog.MultistepDialogProps> */
trait PartialMultistepDialogPro extends StObject {
  
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var backButtonProps: js.UndefOr[DialogStepButtonProps] = js.undefined
  
  var backdropClassName: js.UndefOr[String] = js.undefined
  
  var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.undefined
  
  var canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined
  
  var canOutsideClickClose: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var closeButtonProps: js.UndefOr[DialogStepButtonProps] = js.undefined
  
  var containerRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  
  var enforceFocus: js.UndefOr[Boolean] = js.undefined
  
  var finalButtonProps: js.UndefOr[DialogStepButtonProps] = js.undefined
  
  var hasBackdrop: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[BlueprintIcons16Id | MaybeElement] = js.undefined
  
  var initialStepIndex: js.UndefOr[Double] = js.undefined
  
  var isCloseButtonShown: js.UndefOr[Boolean] = js.undefined
  
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  
  var navigationPosition: js.UndefOr[MultistepDialogNavPosition] = js.undefined
  
  var nextButtonProps: js.UndefOr[DialogStepButtonProps] = js.undefined
  
  var onChange: js.UndefOr[
    js.Function3[
      /* newDialogStepId */ DialogStepId, 
      /* prevDialogStepId */ js.UndefOr[DialogStepId], 
      /* event */ ReactMouseEventFrom[HTMLElement], 
      Unit
    ]
  ] = js.undefined
  
  var onClose: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  
  var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  
  var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  
  var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  
  var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  
  var portalClassName: js.UndefOr[String] = js.undefined
  
  var portalContainer: js.UndefOr[HTMLElement] = js.undefined
  
  var resetOnClose: js.UndefOr[Boolean] = js.undefined
  
  var shouldReturnFocusOnClose: js.UndefOr[Boolean] = js.undefined
  
  var showCloseButtonInFooter: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var title: js.UndefOr[Node] = js.undefined
  
  var transitionDuration: js.UndefOr[Double] = js.undefined
  
  var transitionName: js.UndefOr[String] = js.undefined
  
  var usePortal: js.UndefOr[Boolean] = js.undefined
}
object PartialMultistepDialogPro {
  
  inline def apply(): PartialMultistepDialogPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMultistepDialogPro]
  }
  
  extension [Self <: PartialMultistepDialogPro](x: Self) {
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setBackButtonProps(value: DialogStepButtonProps): Self = StObject.set(x, "backButtonProps", value.asInstanceOf[js.Any])
    
    inline def setBackButtonPropsUndefined: Self = StObject.set(x, "backButtonProps", js.undefined)
    
    inline def setBackdropClassName(value: String): Self = StObject.set(x, "backdropClassName", value.asInstanceOf[js.Any])
    
    inline def setBackdropClassNameUndefined: Self = StObject.set(x, "backdropClassName", js.undefined)
    
    inline def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "backdropProps", value.asInstanceOf[js.Any])
    
    inline def setBackdropPropsUndefined: Self = StObject.set(x, "backdropProps", js.undefined)
    
    inline def setCanEscapeKeyClose(value: Boolean): Self = StObject.set(x, "canEscapeKeyClose", value.asInstanceOf[js.Any])
    
    inline def setCanEscapeKeyCloseUndefined: Self = StObject.set(x, "canEscapeKeyClose", js.undefined)
    
    inline def setCanOutsideClickClose(value: Boolean): Self = StObject.set(x, "canOutsideClickClose", value.asInstanceOf[js.Any])
    
    inline def setCanOutsideClickCloseUndefined: Self = StObject.set(x, "canOutsideClickClose", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCloseButtonProps(value: DialogStepButtonProps): Self = StObject.set(x, "closeButtonProps", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonPropsUndefined: Self = StObject.set(x, "closeButtonProps", js.undefined)
    
    inline def setContainerRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
    
    inline def setContainerRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "containerRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def setContainerRefNull: Self = StObject.set(x, "containerRef", null)
    
    inline def setContainerRefUndefined: Self = StObject.set(x, "containerRef", js.undefined)
    
    inline def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
    
    inline def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
    
    inline def setFinalButtonProps(value: DialogStepButtonProps): Self = StObject.set(x, "finalButtonProps", value.asInstanceOf[js.Any])
    
    inline def setFinalButtonPropsUndefined: Self = StObject.set(x, "finalButtonProps", js.undefined)
    
    inline def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
    
    inline def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
    
    inline def setIcon(value: BlueprintIcons16Id | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setInitialStepIndex(value: Double): Self = StObject.set(x, "initialStepIndex", value.asInstanceOf[js.Any])
    
    inline def setInitialStepIndexUndefined: Self = StObject.set(x, "initialStepIndex", js.undefined)
    
    inline def setIsCloseButtonShown(value: Boolean): Self = StObject.set(x, "isCloseButtonShown", value.asInstanceOf[js.Any])
    
    inline def setIsCloseButtonShownUndefined: Self = StObject.set(x, "isCloseButtonShown", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    inline def setNavigationPosition(value: MultistepDialogNavPosition): Self = StObject.set(x, "navigationPosition", value.asInstanceOf[js.Any])
    
    inline def setNavigationPositionUndefined: Self = StObject.set(x, "navigationPosition", js.undefined)
    
    inline def setNextButtonProps(value: DialogStepButtonProps): Self = StObject.set(x, "nextButtonProps", value.asInstanceOf[js.Any])
    
    inline def setNextButtonPropsUndefined: Self = StObject.set(x, "nextButtonProps", js.undefined)
    
    inline def setOnChange(
      value: (/* newDialogStepId */ DialogStepId, /* prevDialogStepId */ js.UndefOr[DialogStepId], /* event */ ReactMouseEventFrom[HTMLElement]) => Callback
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction3((t0: /* newDialogStepId */ DialogStepId, t1: /* prevDialogStepId */ js.UndefOr[DialogStepId], t2: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClose(value: /* event */ ReactEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnClosed(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onClosed", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
    
    inline def setOnClosing(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onClosing", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def setOnClosingUndefined: Self = StObject.set(x, "onClosing", js.undefined)
    
    inline def setOnOpened(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onOpened", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
    
    inline def setOnOpening(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onOpening", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def setOnOpeningUndefined: Self = StObject.set(x, "onOpening", js.undefined)
    
    inline def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
    
    inline def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
    
    inline def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
    
    inline def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
    
    inline def setResetOnClose(value: Boolean): Self = StObject.set(x, "resetOnClose", value.asInstanceOf[js.Any])
    
    inline def setResetOnCloseUndefined: Self = StObject.set(x, "resetOnClose", js.undefined)
    
    inline def setShouldReturnFocusOnClose(value: Boolean): Self = StObject.set(x, "shouldReturnFocusOnClose", value.asInstanceOf[js.Any])
    
    inline def setShouldReturnFocusOnCloseUndefined: Self = StObject.set(x, "shouldReturnFocusOnClose", js.undefined)
    
    inline def setShowCloseButtonInFooter(value: Boolean): Self = StObject.set(x, "showCloseButtonInFooter", value.asInstanceOf[js.Any])
    
    inline def setShowCloseButtonInFooterUndefined: Self = StObject.set(x, "showCloseButtonInFooter", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
    
    inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    
    inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
    
    inline def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
  }
}
