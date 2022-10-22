package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.React.RefFn
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.anon.ArrowProps
import typingsJapgolly.orbitUiReactComponents.anon.ArrowRef
import typingsJapgolly.orbitUiReactComponents.anon.ClassNameString
import typingsJapgolly.orbitUiReactComponents.anon.OnClick
import typingsJapgolly.orbitUiReactComponents.anon.OnKeyDownUndefined
import typingsJapgolly.orbitUiReactComponents.anon.OnKeyUp
import typingsJapgolly.orbitUiReactComponents.anon.OnMouseEnter
import typingsJapgolly.orbitUiReactComponents.anon.`1`
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcOverlayArrowMod.InnerOverlayArrowProps
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcOverlayMod.InnerOverlayProps
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUnderlayMod.InnerUnderlayProps
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUseOverlayFocusRingMod.UseOverlayFocusRingProps
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUseOverlayLightDismissMod.UseOverlayLightDismissOptions
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUseOverlayPositionMod.UseOverlayPositionOptions
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUseOverlayTriggerMod.UseOverlayTriggerOptions
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUsePopupMod.UsePopupOptions
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUseRestoreFocusMod.UseRestoreFocusOptions
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUseTriggerWidthMod.UseTriggerWidthOptions
import typingsJapgolly.orbitUiReactComponents.distSharedMod.DomScope
import typingsJapgolly.orbitUiReactComponents.distSharedMod.FocusManager
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.dialog
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.listbox
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.menu
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOverlaySrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerOverlay(hasShowBorderOffsetContainerElementZIndexAsChildrenForwardedRefRest: InnerOverlayProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerOverlay")(hasShowBorderOffsetContainerElementZIndexAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerOverlayArrow(hasAsForwardedRefRest: InnerOverlayArrowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerOverlayArrow")(hasAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerUnderlay(hasZIndexAsForwardedRefRest: InnerUnderlayProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerUnderlay")(hasZIndexAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src", "Overlay")
  @js.native
  val Overlay: OrbitComponent[HTMLElement, InnerOverlayProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src", "OverlayArrow")
  @js.native
  val OverlayArrow: OrbitComponent[HTMLElement, InnerOverlayArrowProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src", "Underlay")
  @js.native
  val Underlay: OrbitComponent[HTMLElement, InnerUnderlayProps] = js.native
  
  inline def isDevToolsBlurEvent(rootRef: RefHandle[HTMLElement]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDevToolsBlurEvent")(rootRef.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTargetParent(target: EventTarget, parentRef: RefHandle[HTMLElement]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTargetParent")(target.asInstanceOf[js.Any], parentRef.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useOverlayFocusRing(): ClassNameString = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayFocusRing")().asInstanceOf[ClassNameString]
  inline def useOverlayFocusRing(hasFocus: UseOverlayFocusRingProps): ClassNameString = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayFocusRing")(hasFocus.asInstanceOf[js.Any]).asInstanceOf[ClassNameString]
  
  inline def useOverlayLightDismiss(overlayRef: RefHandle[HTMLElement]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayLightDismiss")(overlayRef.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def useOverlayLightDismiss(
    overlayRef: RefHandle[HTMLElement],
    hasTriggerOnHideHideOnEscapeHideOnLeaveHideOnOutsideClick: UseOverlayLightDismissOptions
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayLightDismiss")(overlayRef.asInstanceOf[js.Any], hasTriggerOnHideHideOnEscapeHideOnLeaveHideOnOutsideClick.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def useOverlayPosition(): ArrowRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayPosition")().asInstanceOf[ArrowRef]
  inline def useOverlayPosition(hasPositionOffsetAllowFlipAllowPreventOverflowBoundaryElementHasArrow: UseOverlayPositionOptions): ArrowRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayPosition")(hasPositionOffsetAllowFlipAllowPreventOverflowBoundaryElementHasArrow.asInstanceOf[js.Any]).asInstanceOf[ArrowRef]
  
  inline def useOverlayTrigger(isOpen: Boolean): OnClick | OnKeyUp | OnMouseEnter = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayTrigger")(isOpen.asInstanceOf[js.Any]).asInstanceOf[OnClick | OnKeyUp | OnMouseEnter]
  inline def useOverlayTrigger(isOpen: Boolean, hasHideOnLeaveTriggerOnShowOnHideIsDisabled: UseOverlayTriggerOptions): OnClick | OnKeyUp | OnMouseEnter = (^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayTrigger")(isOpen.asInstanceOf[js.Any], hasHideOnLeaveTriggerOnShowOnHideIsDisabled.asInstanceOf[js.Any])).asInstanceOf[OnClick | OnKeyUp | OnMouseEnter]
  
  inline def usePopup(`type`: menu | listbox | dialog): ArrowProps = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopup")(`type`.asInstanceOf[js.Any]).asInstanceOf[ArrowProps]
  inline def usePopup(
    `type`: menu | listbox | dialog,
    hasIdOpenDefaultOpenOnOpenChangeHideOnEscapeHideOnLeaveHideOnOutsideClickRestoreFocusTriggerHasArrowPositionOffsetDisabledAllowFlipAllowPreventOverflowBoundaryElementKeyProp: UsePopupOptions
  ): ArrowProps = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopup")(`type`.asInstanceOf[js.Any], hasIdOpenDefaultOpenOnOpenChangeHideOnEscapeHideOnLeaveHideOnOutsideClickRestoreFocusTriggerHasArrowPositionOffsetDisabledAllowFlipAllowPreventOverflowBoundaryElementKeyProp.asInstanceOf[js.Any])).asInstanceOf[ArrowProps]
  
  inline def useRestoreFocus(scope: DomScope): OnKeyDownUndefined | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("useRestoreFocus")(scope.asInstanceOf[js.Any]).asInstanceOf[OnKeyDownUndefined | `1`]
  inline def useRestoreFocus(scope: DomScope, hasIsDisabled: UseRestoreFocusOptions): OnKeyDownUndefined | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("useRestoreFocus")(scope.asInstanceOf[js.Any], hasIsDisabled.asInstanceOf[js.Any])).asInstanceOf[OnKeyDownUndefined | `1`]
  
  inline def useTrapFocus(focusManager: FocusManager): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useTrapFocus")(focusManager.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useTriggerWidth(): js.Tuple2[RefFn[HTMLElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTriggerWidth")().asInstanceOf[js.Tuple2[RefFn[HTMLElement], String]]
  inline def useTriggerWidth(hasIsDisabled: UseTriggerWidthOptions): js.Tuple2[RefFn[HTMLElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTriggerWidth")(hasIsDisabled.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[RefFn[HTMLElement], String]]
}
