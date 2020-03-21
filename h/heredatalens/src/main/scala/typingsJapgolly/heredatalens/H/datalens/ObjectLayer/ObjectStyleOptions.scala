package typingsJapgolly.heredatalens.H.datalens.ObjectLayer

import typingsJapgolly.heremaps.H.map.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output from the rowToStyle callback.
  * Defines the styles or the icon that is applied to the map object.
  */
trait ObjectStyleOptions extends js.Object {
  /** Style of arrows to render along a polyline */
  var arrows: js.UndefOr[typingsJapgolly.heremaps.H.map.ArrowStyle.Options] = js.undefined
  /** Marker icon */
  var icon: Icon
  /** Spatial style */
  var style: js.UndefOr[typingsJapgolly.heremaps.H.map.SpatialStyle.Options] = js.undefined
  /** The z-index value of the map object, default is 0 */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ObjectStyleOptions {
  @scala.inline
  def apply(
    icon: Icon,
    arrows: typingsJapgolly.heremaps.H.map.ArrowStyle.Options = null,
    style: typingsJapgolly.heremaps.H.map.SpatialStyle.Options = null,
    zIndex: Int | Double = null
  ): ObjectStyleOptions = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (arrows != null) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectStyleOptions]
  }
}

