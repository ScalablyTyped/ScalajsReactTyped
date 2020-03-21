package typingsJapgolly.cesium.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ImageryProvider")
@js.native
abstract class ImageryProvider () extends js.Object {
  var credit: Credit = js.native
  var defaultAlpha: Double = js.native
  var defaultBrightness: Double = js.native
  var defaultContrast: Double = js.native
  var defaultGamma: Double = js.native
  var defaultHue: Double = js.native
  var defaultMagnificationFilter: js.Any = js.native
  var defaultMinificationFilter: js.Any = js.native
  var defaultSaturation: Double = js.native
  val errorEvent: Event[js.Array[_]] = js.native
  val hasAlphaChannel: Boolean = js.native
  val maximumLevel: Double = js.native
  val minimumLevel: Double = js.native
  val proxy: Proxy = js.native
  val ready: Boolean = js.native
  val readyPromise: js.Promise[Boolean] = js.native
  val rectangle: Rectangle = js.native
  val tileDiscardPolicy: TileDiscardPolicy = js.native
  val tileHeight: Double = js.native
  val tileWidth: Double = js.native
  val tilingScheme: TilingScheme = js.native
  def getTileCredits(x: Double, y: Double, level: Double): js.Array[Credit] = js.native
  def pickFeatures(x: Double, y: Double, level: Double, longitude: Double, latitude: Double): js.Promise[js.Array[ImageryLayerFeatureInfo]] = js.native
  def requestImage(x: Double, y: Double, level: Double): js.Promise[HTMLImageElement | HTMLCanvasElement] = js.native
}

/* static members */
@JSImport("cesium", "ImageryProvider")
@js.native
object ImageryProvider extends js.Object {
  def loadImage(url: String): js.Promise[HTMLImageElement | HTMLCanvasElement] = js.native
}

