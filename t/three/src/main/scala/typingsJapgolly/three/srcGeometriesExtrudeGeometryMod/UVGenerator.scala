package typingsJapgolly.three.srcGeometriesExtrudeGeometryMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.three.srcMathVector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UVGenerator extends js.Object {
  def generateSideWallUV(
    geometry: ExtrudeBufferGeometry,
    vertices: js.Array[Double],
    indexA: Double,
    indexB: Double,
    indexC: Double,
    indexD: Double
  ): js.Array[Vector2]
  def generateTopUV(
    geometry: ExtrudeBufferGeometry,
    vertices: js.Array[Double],
    indexA: Double,
    indexB: Double,
    indexC: Double
  ): js.Array[Vector2]
}

object UVGenerator {
  @scala.inline
  def apply(
    generateSideWallUV: (ExtrudeBufferGeometry, js.Array[Double], Double, Double, Double, Double) => CallbackTo[js.Array[Vector2]],
    generateTopUV: (ExtrudeBufferGeometry, js.Array[Double], Double, Double, Double) => CallbackTo[js.Array[Vector2]]
  ): UVGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generateSideWallUV")(js.Any.fromFunction6((t0: typingsJapgolly.three.srcGeometriesExtrudeGeometryMod.ExtrudeBufferGeometry, t1: js.Array[scala.Double], t2: scala.Double, t3: scala.Double, t4: scala.Double, t5: scala.Double) => generateSideWallUV(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("generateTopUV")(js.Any.fromFunction5((t0: typingsJapgolly.three.srcGeometriesExtrudeGeometryMod.ExtrudeBufferGeometry, t1: js.Array[scala.Double], t2: scala.Double, t3: scala.Double, t4: scala.Double) => generateTopUV(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[UVGenerator]
  }
}

