package typingsJapgolly.popmotion

import typingsJapgolly.popmotion.anon.X
import typingsJapgolly.popmotion.libTypesMod.Point3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsDistanceMod {
  
  @JSImport("popmotion/lib/utils/distance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def distance(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def distance(a: Point3D, b: Point3D): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def distance[P /* <: X */](a: P, b: P): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
