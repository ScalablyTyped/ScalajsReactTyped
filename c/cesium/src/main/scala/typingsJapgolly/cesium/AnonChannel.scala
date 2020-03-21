package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Ellipsoid
import typingsJapgolly.cesium.mod.Resource
import typingsJapgolly.cesium.mod.TileDiscardPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannel extends js.Object {
  var channel: Double
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var maximumLevel: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.undefined
  var url: Resource | String
}

object AnonChannel {
  @scala.inline
  def apply(
    channel: Double,
    url: Resource | String,
    ellipsoid: Ellipsoid = null,
    maximumLevel: Int | Double = null,
    path: String = null,
    tileDiscardPolicy: TileDiscardPolicy = null
  ): AnonChannel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (maximumLevel != null) __obj.updateDynamic("maximumLevel")(maximumLevel.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tileDiscardPolicy != null) __obj.updateDynamic("tileDiscardPolicy")(tileDiscardPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannel]
  }
}

