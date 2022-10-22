package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsModalModalInterfaceMod.ModalAnimationOptions
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsModalAnimationsMdDotleaveMod {
  
  @JSImport("@ionic/core/dist/types/components/modal/animations/md.leave", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdLeaveAnimation(baseEl: HTMLElement, opts: ModalAnimationOptions): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("mdLeaveAnimation")(baseEl.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Animation]
}
