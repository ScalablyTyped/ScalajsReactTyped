package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonModalElement
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsModalGesturesUtilsMod {
  
  @JSImport("@ionic/core/dist/types/components/modal/gestures/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateSpringStep(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateSpringStep")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def handleCanDismiss(el: HTMLIonModalElement, animation: Animation): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleCanDismiss")(el.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
