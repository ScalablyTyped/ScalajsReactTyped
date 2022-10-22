package typingsJapgolly.blueprintjsCore.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typingsJapgolly.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/hotkeys/hotkeysDialog.IHotkeysDialogProps> */
trait PartialIHotkeysDialogProp extends StObject {
  
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var backdropClassName: js.UndefOr[String] = js.undefined
  
  var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.undefined
  
  var canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined
  
  var canOutsideClickClose: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var containerRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  
  var enforceFocus: js.UndefOr[Boolean] = js.undefined
  
  var globalHotkeysGroup: js.UndefOr[String] = js.undefined
  
  var hasBackdrop: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[BlueprintIcons16Id | MaybeElement] = js.undefined
  
  var isCloseButtonShown: js.UndefOr[Boolean] = js.undefined
  
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  
  var onClose: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  
  var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  
  var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  
  var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  
  var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  
  var portalClassName: js.UndefOr[String] = js.undefined
  
  var portalContainer: js.UndefOr[HTMLElement] = js.undefined
  
  var shouldReturnFocusOnClose: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var title: js.UndefOr[Node] = js.undefined
  
  var transitionDuration: js.UndefOr[Double] = js.undefined
  
  var transitionName: js.UndefOr[String] = js.undefined
  
  var usePortal: js.UndefOr[Boolean] = js.undefined
}
object PartialIHotkeysDialogProp {
  
  inline def apply(): PartialIHotkeysDialogProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIHotkeysDialogProp]
  }
  
  extension [Self <: PartialIHotkeysDialogProp](x: Self) {
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
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
    
    inline def setContainerRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
    
    inline def setContainerRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "containerRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def setContainerRefNull: Self = StObject.set(x, "containerRef", null)
    
    inline def setContainerRefUndefined: Self = StObject.set(x, "containerRef", js.undefined)
    
    inline def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
    
    inline def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
    
    inline def setGlobalHotkeysGroup(value: String): Self = StObject.set(x, "globalHotkeysGroup", value.asInstanceOf[js.Any])
    
    inline def setGlobalHotkeysGroupUndefined: Self = StObject.set(x, "globalHotkeysGroup", js.undefined)
    
    inline def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
    
    inline def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
    
    inline def setIcon(value: BlueprintIcons16Id | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIsCloseButtonShown(value: Boolean): Self = StObject.set(x, "isCloseButtonShown", value.asInstanceOf[js.Any])
    
    inline def setIsCloseButtonShownUndefined: Self = StObject.set(x, "isCloseButtonShown", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
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
    
    inline def setShouldReturnFocusOnClose(value: Boolean): Self = StObject.set(x, "shouldReturnFocusOnClose", value.asInstanceOf[js.Any])
    
    inline def setShouldReturnFocusOnCloseUndefined: Self = StObject.set(x, "shouldReturnFocusOnClose", js.undefined)
    
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
