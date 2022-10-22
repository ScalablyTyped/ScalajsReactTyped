package typingsJapgolly.ionicCore

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.distTypesUtilsTransitionMod.TransitionOptions
import typingsJapgolly.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTransitionIosDottransitionMod {
  
  @JSImport("@ionic/core/dist/types/utils/transition/ios.transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iosTransitionAnimation(navEl: HTMLElement, opts: TransitionOptions): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("iosTransitionAnimation")(navEl.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Animation]
  
  inline def shadow[T /* <: Element */](el: T): ShadowRoot | T = ^.asInstanceOf[js.Dynamic].applyDynamic("shadow")(el.asInstanceOf[js.Any]).asInstanceOf[ShadowRoot | T]
}
