package typingsJapgolly.three

import typingsJapgolly.three.srcCoreGeometryMod.Geometry
import typingsJapgolly.three.srcExtrasCoreCurveMod.Curve
import typingsJapgolly.three.srcMathVector2Mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/core/CurvePath", JSImport.Namespace)
@js.native
object srcExtrasCoreCurvePathMod extends js.Object {
  @js.native
  class CurvePath[T /* <: Vector */] () extends Curve[T] {
    var autoClose: Boolean = js.native
    var curves: js.Array[Curve[T]] = js.native
    def add(curve: Curve[T]): Unit = js.native
    def checkConnection(): Boolean = js.native
    def closePath(): Unit = js.native
    /**
    	 * @deprecated Use {@link Geometry#setFromPoints new THREE.Geometry().setFromPoints( points )} instead.
    	 */
    def createGeometry(points: js.Array[T]): Geometry = js.native
    /**
    	 * @deprecated Use {@link Geometry#setFromPoints new THREE.Geometry().setFromPoints( points )} instead.
    	 */
    def createPointsGeometry(divisions: Double): Geometry = js.native
    /**
    	 * @deprecated Use {@link Geometry#setFromPoints new THREE.Geometry().setFromPoints( points )} instead.
    	 */
    def createSpacedPointsGeometry(divisions: Double): Geometry = js.native
    def getCurveLengths(): js.Array[Double] = js.native
  }
  
}

