package typingsJapgolly.amapJsApiMap3d.AMap.Object3D

import typingsJapgolly.amapJsApi.AMap.LngLat
import typingsJapgolly.amapJsApi.AMap.Pixel
import typingsJapgolly.amapJsApiMap3d.AMap.Object3D.MeshLine.Options
import typingsJapgolly.amapJsApiMap3d.AnonColor
import typingsJapgolly.amapJsApiMap3d.AnonPath
import typingsJapgolly.amapJsApiMap3d.AnonUnit
import typingsJapgolly.amapJsApiMap3d.Geometry3DreadonlyvertexI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// inherit from WideLine
@JSGlobal("AMap.Object3D.MeshLine")
@js.native
class MeshLine protected ()
  extends typingsJapgolly.amapJsApiMap3d.AMap.Object3D {
  def this(options: Options) = this()
  @JSName("geometry")
  val geometry_MeshLine: Geometry3DreadonlyvertexI = js.native
  var width: Double = js.native
  def setColor(color: String): Unit = js.native
  def setHeight(height: js.Array[Double]): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  def setPath(path: js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]): Unit = js.native
  def setWidth(width: Double): Unit = js.native
}

@JSGlobal("AMap.Object3D.MeshLine")
@js.native
object MeshLine extends js.Object {
  type Options = AnonColor with (AnonPath | AnonUnit)
}

