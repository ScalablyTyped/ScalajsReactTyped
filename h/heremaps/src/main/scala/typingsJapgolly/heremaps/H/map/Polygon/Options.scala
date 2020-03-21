package typingsJapgolly.heremaps.H.map.Polygon

import typingsJapgolly.heremaps.H.map.ArrowStyle
import typingsJapgolly.heremaps.H.map.SpatialStyle
import typingsJapgolly.heremaps.H.map.provider.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property style {H.map.SpatialStyle | H.map.SpatialStyle.Options} - The style to be used when tracing the spatial object.
  * @property arrows {H.map.ArrowStyle | H.map.ArrowStyle.Options} - The arrows style to be used when rendering the spatial object.
  * @property visibility {boolean}
  * Indicates whether the map object is visible, the default is true A map object is only treated as visible, if it self and all of its nesting parent groups are visible.
  */
trait Options extends js.Object {
  var arrows: js.UndefOr[ArrowStyle | typingsJapgolly.heremaps.H.map.ArrowStyle.Options] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var elevation: js.UndefOr[Double] = js.undefined
  var extrusion: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var provider: js.UndefOr[Provider | Null] = js.undefined
  var style: js.UndefOr[SpatialStyle | typingsJapgolly.heremaps.H.map.SpatialStyle.Options] = js.undefined
  var visibility: js.UndefOr[Boolean] = js.undefined
  var volatility: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arrows: ArrowStyle | typingsJapgolly.heremaps.H.map.ArrowStyle.Options = null,
    data: js.Any = null,
    elevation: Int | Double = null,
    extrusion: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    provider: Provider = null,
    style: SpatialStyle | typingsJapgolly.heremaps.H.map.SpatialStyle.Options = null,
    visibility: js.UndefOr[Boolean] = js.undefined,
    volatility: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arrows != null) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (extrusion != null) __obj.updateDynamic("extrusion")(extrusion.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visibility)) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (!js.isUndefined(volatility)) __obj.updateDynamic("volatility")(volatility.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

