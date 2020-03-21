package typingsJapgolly.heremaps.H.map.Circle

import typingsJapgolly.heremaps.H.map.SpatialStyle
import typingsJapgolly.heremaps.H.map.provider.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property style {H.map.SpatialStyle=} - the style to be used when tracing the polyline
  * @property visibility {boolean=} - An optional boolean value indicating whether this map object is visible, default is true
  * @property precision {number=} - The precision of a circle as a number of segments to be used when rendering the circle.
  * The value is clamped to the range between [4 ... 360], where 60 is
  * the default. Note that the lower the value the more angular and the less circle-like the shape appears and, conversely, the higher the value the smoother and more rounded the result.
  * Thus, starting at the extreme low end of the possible values, 4 produces a square, 6 a hexagon, while 30 results in a circle-like shape, although it appears increasingly angular as
  * the zoom level increases (as you zoom in), and finally 360 produces a smooth circle.
  * @property zIndex {number=} - The z-index value of the circle, default is 0
  * @property min {number=} - The minimum zoom level for which the circle is visible, default is -Infinity
  * @property max {number=} - The maximum zoom level for which the circle is visible, default is Infinity
  * @property provider {(H.map.provider.Provider | null)=} - The provider of this object.
  * This property is only needed if a customized Implementation of ObjectProvider wants to instantiate an object.
  * @property data {*} - Optional arbitrary data to be stored with this map object. This data can be retrieved by calling getData
  */
trait Options extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var provider: js.UndefOr[Provider] = js.undefined
  var style: js.UndefOr[SpatialStyle | typingsJapgolly.heremaps.H.map.SpatialStyle.Options] = js.undefined
  var visibility: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    data: js.Any = null,
    max: Int | Double = null,
    min: Int | Double = null,
    precision: Int | Double = null,
    provider: Provider = null,
    style: SpatialStyle | typingsJapgolly.heremaps.H.map.SpatialStyle.Options = null,
    visibility: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visibility)) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

