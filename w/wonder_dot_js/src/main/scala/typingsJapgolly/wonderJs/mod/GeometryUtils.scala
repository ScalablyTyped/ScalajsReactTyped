package typingsJapgolly.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "GeometryUtils")
@js.native
class GeometryUtils ()
  extends typingsJapgolly.wonderJs.geometryUtilsMod.GeometryUtils

/* static members */
@JSImport("wonder.js/dist/es2015", "GeometryUtils")
@js.native
object GeometryUtils extends js.Object {
  def convertToFaces(indices: js.Array[Double]): js.Array[typingsJapgolly.wonderJs.face3Mod.Face3] = js.native
  def convertToFaces(indices: js.Array[Double], normals: js.Array[Double]): js.Array[typingsJapgolly.wonderJs.face3Mod.Face3] = js.native
  def getThreeComponent(sourceData: js.Array[Double], index: Double): typingsJapgolly.wonderJs.vector3Mod.Vector3 = js.native
  def hasData(data: js.Any): Boolean = js.native
  def iterateThreeComponent(
    dataArr: js.Array[Double],
    iterator: js.Function1[/* v */ typingsJapgolly.wonderJs.vector3Mod.Vector3, Unit]
  ): Unit = js.native
  def setThreeComponent(targetData: js.Array[Double], sourceData: js.Array[Double], index: Double): js.Any = js.native
  def setThreeComponent(
    targetData: js.Array[Double],
    sourceData: typingsJapgolly.wonderJs.vector3Mod.Vector3,
    index: Double
  ): js.Any = js.native
}

