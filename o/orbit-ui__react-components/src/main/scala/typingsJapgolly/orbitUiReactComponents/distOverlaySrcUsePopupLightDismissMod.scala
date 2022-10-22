package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.anon.`1`
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUseOverlayLightDismissMod.UseOverlayLightDismissOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOverlaySrcUsePopupLightDismissMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/usePopupLightDismiss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePopupLightDismiss(triggerRef: RefHandle[HTMLElement], overlayRef: RefHandle[HTMLElement]): `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopupLightDismiss")(triggerRef.asInstanceOf[js.Any], overlayRef.asInstanceOf[js.Any])).asInstanceOf[`1`]
  inline def usePopupLightDismiss(
    triggerRef: RefHandle[HTMLElement],
    overlayRef: RefHandle[HTMLElement],
    hasTriggerOnHideHideOnEscapeHideOnLeaveHideOnOutsideClick: UseOverlayLightDismissOptions
  ): `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopupLightDismiss")(triggerRef.asInstanceOf[js.Any], overlayRef.asInstanceOf[js.Any], hasTriggerOnHideHideOnEscapeHideOnLeaveHideOnOutsideClick.asInstanceOf[js.Any])).asInstanceOf[`1`]
}
