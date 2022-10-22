package typingsJapgolly.popmotion

import typingsJapgolly.popmotion.libEasingTypesMod.Easing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEasingCubicBezierMod {
  
  @JSImport("popmotion/lib/easing/cubic-bezier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cubicBezier(mX1: Double, mY1: Double, mX2: Double, mY2: Double): Easing = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicBezier")(mX1.asInstanceOf[js.Any], mY1.asInstanceOf[js.Any], mX2.asInstanceOf[js.Any], mY2.asInstanceOf[js.Any])).asInstanceOf[Easing]
}
