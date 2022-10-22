package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsModalModalInterfaceMod.ModalAnimationOptions
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsModalAnimationsIosDotleaveMod {
  
  @JSImport("@ionic/core/dist/types/components/modal/animations/ios.leave", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iosLeaveAnimation(baseEl: HTMLElement, opts: ModalAnimationOptions): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("iosLeaveAnimation")(baseEl.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Animation]
  inline def iosLeaveAnimation(baseEl: HTMLElement, opts: ModalAnimationOptions, duration: Double): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("iosLeaveAnimation")(baseEl.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Animation]
}
