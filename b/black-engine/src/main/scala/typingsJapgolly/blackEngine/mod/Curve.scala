package typingsJapgolly.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Curve")
@js.native
open class Curve ()
  extends typingsJapgolly.blackEngine.geomCurveMod.Curve
/* static members */
object Curve {
  
  @JSImport("black-engine", "Curve")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("black-engine", "Curve.__cache")
  @js.native
  val cache: typingsJapgolly.blackEngine.geomCurveMod.Curve = js.native
  
  inline def getLength(points: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLength")(points.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
  
  inline def lerp(
    t: Double,
    startX: Double,
    startY: Double,
    cpStartX: Double,
    cpStartY: Double,
    cpEndX: Double,
    cpEndY: Double,
    endX: Double,
    endY: Double
  ): typingsJapgolly.blackEngine.geomVectorMod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(t.asInstanceOf[js.Any], startX.asInstanceOf[js.Any], startY.asInstanceOf[js.Any], cpStartX.asInstanceOf[js.Any], cpStartY.asInstanceOf[js.Any], cpEndX.asInstanceOf[js.Any], cpEndY.asInstanceOf[js.Any], endX.asInstanceOf[js.Any], endY.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.geomVectorMod.Vector]
  inline def lerp(
    t: Double,
    startX: Double,
    startY: Double,
    cpStartX: Double,
    cpStartY: Double,
    cpEndX: Double,
    cpEndY: Double,
    endX: Double,
    endY: Double,
    outVector: typingsJapgolly.blackEngine.geomVectorMod.Vector
  ): typingsJapgolly.blackEngine.geomVectorMod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(t.asInstanceOf[js.Any], startX.asInstanceOf[js.Any], startY.asInstanceOf[js.Any], cpStartX.asInstanceOf[js.Any], cpStartY.asInstanceOf[js.Any], cpEndX.asInstanceOf[js.Any], cpEndY.asInstanceOf[js.Any], endX.asInstanceOf[js.Any], endY.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.geomVectorMod.Vector]
}
