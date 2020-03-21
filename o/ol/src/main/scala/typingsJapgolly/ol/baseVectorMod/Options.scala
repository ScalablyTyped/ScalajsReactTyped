package typingsJapgolly.ol.baseVectorMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.olFeatureMod.FeatureLike
import typingsJapgolly.ol.renderMod.OrderFunction
import typingsJapgolly.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var declutter: js.UndefOr[Boolean] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var map: js.UndefOr[typingsJapgolly.ol.pluggableMapMod.default] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var renderBuffer: js.UndefOr[Double] = js.undefined
  var renderOrder: js.UndefOr[OrderFunction] = js.undefined
  var source: js.UndefOr[
    typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geometryMod.default]
  ] = js.undefined
  var style: js.UndefOr[StyleLike] = js.undefined
  var updateWhileAnimating: js.UndefOr[Boolean] = js.undefined
  var updateWhileInteracting: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: String = null,
    declutter: js.UndefOr[Boolean] = js.undefined,
    extent: Extent = null,
    map: typingsJapgolly.ol.pluggableMapMod.default = null,
    maxResolution: Int | Double = null,
    minResolution: Int | Double = null,
    opacity: Int | Double = null,
    renderBuffer: Int | Double = null,
    renderOrder: (/* p0 */ FeatureLike, /* p1 */ FeatureLike) => CallbackTo[Double] = null,
    source: typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geometryMod.default] = null,
    style: StyleLike = null,
    updateWhileAnimating: js.UndefOr[Boolean] = js.undefined,
    updateWhileInteracting: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(declutter)) __obj.updateDynamic("declutter")(declutter.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (renderBuffer != null) __obj.updateDynamic("renderBuffer")(renderBuffer.asInstanceOf[js.Any])
    if (renderOrder != null) __obj.updateDynamic("renderOrder")(js.Any.fromFunction2((t0: /* p0 */ typingsJapgolly.ol.olFeatureMod.FeatureLike, t1: /* p1 */ typingsJapgolly.ol.olFeatureMod.FeatureLike) => renderOrder(t0, t1).runNow()))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhileAnimating)) __obj.updateDynamic("updateWhileAnimating")(updateWhileAnimating.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhileInteracting)) __obj.updateDynamic("updateWhileInteracting")(updateWhileInteracting.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

