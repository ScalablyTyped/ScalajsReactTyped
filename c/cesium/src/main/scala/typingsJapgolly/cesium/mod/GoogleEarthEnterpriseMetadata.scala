package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.AnonLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GoogleEarthEnterpriseMetadata")
@js.native
class GoogleEarthEnterpriseMetadata protected () extends js.Object {
  def this(resourceOrUrl: String) = this()
  def this(resourceOrUrl: Resource) = this()
  var imageryPresent: Boolean = js.native
  var key: scala.scalajs.js.typedarray.ArrayBuffer = js.native
  var negativeAltitudeExponentBias: Double = js.native
  var negativeAltitudeThreshold: Double = js.native
  var protoImagery: Boolean = js.native
  val proxy: Proxy = js.native
  val readyPromise: js.Promise[Boolean] = js.native
  val resource: Resource = js.native
  var terrainPresent: Boolean = js.native
  val url: String = js.native
}

/* static members */
@JSImport("cesium", "GoogleEarthEnterpriseMetadata")
@js.native
object GoogleEarthEnterpriseMetadata extends js.Object {
  def quadKeyToTileXY(quadkey: String): AnonLevel = js.native
  def tileXYToQuadKey(x: Double, y: Double, level: Double): String = js.native
}

