package typingsJapgolly.reactNativeModal

import typingsJapgolly.reactNativeModal.anon.AnimationOut
import typingsJapgolly.reactNativeModal.anon.From
import typingsJapgolly.reactNativeModal.distTypesMod.Animations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("react-native-modal/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildAnimations(hasAnimationInAnimationOut: AnimationOut): Animations = ^.asInstanceOf[js.Dynamic].applyDynamic("buildAnimations")(hasAnimationInAnimationOut.asInstanceOf[js.Any]).asInstanceOf[Animations]
  
  inline def initializeAnimations(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeAnimations")().asInstanceOf[Unit]
  
  inline def makeSlideTranslation(translationType: String, fromValue: Double, toValue: Double): From = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSlideTranslation")(translationType.asInstanceOf[js.Any], fromValue.asInstanceOf[js.Any], toValue.asInstanceOf[js.Any])).asInstanceOf[From]
  
  inline def reversePercentage(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("reversePercentage")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
}
