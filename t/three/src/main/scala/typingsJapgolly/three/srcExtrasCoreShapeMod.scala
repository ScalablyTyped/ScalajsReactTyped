package typingsJapgolly.three

import typingsJapgolly.three.srcExtrasCorePathMod.Path
import typingsJapgolly.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry
import typingsJapgolly.three.srcGeometriesShapeGeometryMod.ShapeGeometry
import typingsJapgolly.three.srcMathVector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/core/Shape", JSImport.Namespace)
@js.native
object srcExtrasCoreShapeMod extends js.Object {
  @js.native
  class Shape () extends Path {
    def this(points: js.Array[Vector2]) = this()
    var holes: js.Array[Path] = js.native
    /**
    	 * @deprecated Use {@link Shape#extractPoints .extractPoints()} instead.
    	 */
    def extractAllPoints(divisions: Double): Anon_Holes = js.native
    def extractPoints(divisions: Double): js.Array[Vector2] = js.native
    /**
    	 * @deprecated Use {@link ExtrudeGeometry ExtrudeGeometry()} instead.
    	 */
    def extrude(): ExtrudeGeometry = js.native
    def extrude(options: js.Any): ExtrudeGeometry = js.native
    def getPointsHoles(divisions: Double): js.Array[js.Array[Vector2]] = js.native
    /**
    	 * @deprecated Use {@link ShapeGeometry ShapeGeometry()} instead.
    	 */
    def makeGeometry(): ShapeGeometry = js.native
    def makeGeometry(options: js.Any): ShapeGeometry = js.native
  }
  
}

