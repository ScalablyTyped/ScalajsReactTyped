package typingsJapgolly.popmotion

import typingsJapgolly.styleValueTypes.libTypesMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMixColorMod {
  
  @JSImport("popmotion/lib/utils/mix-color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mixColor(from: String, to: String): js.Function1[/* v */ Double, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, Any]]
  inline def mixColor(from: String, to: Color): js.Function1[/* v */ Double, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, Any]]
  inline def mixColor(from: Color, to: String): js.Function1[/* v */ Double, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, Any]]
  inline def mixColor(from: Color, to: Color): js.Function1[/* v */ Double, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, Any]]
  
  inline def mixLinearColor(from: Double, to: Double, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mixLinearColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
}
