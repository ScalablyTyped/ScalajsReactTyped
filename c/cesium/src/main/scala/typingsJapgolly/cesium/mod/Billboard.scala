package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.mod.Billboard.CreateImageCallback
import typingsJapgolly.std.HTMLCanvasElement
import typingsJapgolly.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Billboard")
@js.native
class Billboard () extends js.Object {
  var alignedAxis: Cartesian3 = js.native
  var color: Color = js.native
  var disableDepthTestDistance: Double = js.native
  var distanceDisplayCondition: DistanceDisplayCondition = js.native
  var eyeOffset: Cartesian3 = js.native
  var height: Double = js.native
  var heightReference: HeightReference = js.native
  var horizontalOrigin: HorizontalOrigin = js.native
  var id: js.Any = js.native
  var image: String = js.native
  var pixelOffset: Cartesian2 = js.native
  var pixelOffsetScaleByDistance: NearFarScalar = js.native
  var position: Cartesian3 = js.native
  val ready: Boolean = js.native
  var rotation: Double = js.native
  var scale: Double = js.native
  var scaleByDistance: NearFarScalar = js.native
  var show: Boolean = js.native
  var sizeInMeters: Boolean = js.native
  var translucencyByDistance: NearFarScalar = js.native
  var verticalOrigin: VerticalOrigin = js.native
  var width: Double = js.native
  def computeScreenSpacePosition(scene: Scene): Cartesian2 = js.native
  def computeScreenSpacePosition(scene: Scene, result: Cartesian2): Cartesian2 = js.native
  def equals(other: Billboard): Boolean = js.native
  def setImage(id: String, image: String): Unit = js.native
  def setImage(id: String, image: CreateImageCallback): Unit = js.native
  def setImage(id: String, image: HTMLCanvasElement): Unit = js.native
  def setImage(id: String, image: HTMLImageElement): Unit = js.native
  def setImageSubRegion(id: String, subRegion: BoundingRectangle): Unit = js.native
}

@JSImport("cesium", "Billboard")
@js.native
object Billboard extends js.Object {
  type CreateImageCallback = js.Function1[
    /* id */ String, 
    org.scalajs.dom.raw.HTMLImageElement | org.scalajs.dom.raw.HTMLCanvasElement | (js.Promise[org.scalajs.dom.raw.HTMLImageElement | org.scalajs.dom.raw.HTMLCanvasElement])
  ]
}

