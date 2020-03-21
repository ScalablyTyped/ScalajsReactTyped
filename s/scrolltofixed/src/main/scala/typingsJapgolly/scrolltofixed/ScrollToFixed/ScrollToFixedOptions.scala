package typingsJapgolly.scrolltofixed.ScrollToFixed

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollToFixedOptions extends js.Object {
  var baseClassName: js.UndefOr[String] = js.undefined
  var bottom: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dontCheckForPositionFixedSupport: js.UndefOr[Boolean] = js.undefined
  var dontSetWidth: js.UndefOr[Boolean] = js.undefined
  var fixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var limit: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  var marginTop: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var offsets: js.UndefOr[Boolean] = js.undefined
  var postAbsolute: js.UndefOr[js.Function0[Unit]] = js.undefined
  var postFixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var postUnfixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var preAbsolute: js.UndefOr[js.Function0[Unit]] = js.undefined
  var preFixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var preUnfixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var removeOffsets: js.UndefOr[Boolean] = js.undefined
  var spacerClass: js.UndefOr[String] = js.undefined
  var unfixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ScrollToFixedOptions {
  @scala.inline
  def apply(
    baseClassName: String = null,
    bottom: Int | Double = null,
    className: String = null,
    dontCheckForPositionFixedSupport: js.UndefOr[Boolean] = js.undefined,
    dontSetWidth: js.UndefOr[Boolean] = js.undefined,
    fixed: js.UndefOr[Callback] = js.undefined,
    limit: Double | js.Function0[Double] = null,
    marginTop: Double | js.Function0[Double] = null,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    offsets: js.UndefOr[Boolean] = js.undefined,
    postAbsolute: js.UndefOr[Callback] = js.undefined,
    postFixed: js.UndefOr[Callback] = js.undefined,
    postUnfixed: js.UndefOr[Callback] = js.undefined,
    preAbsolute: js.UndefOr[Callback] = js.undefined,
    preFixed: js.UndefOr[Callback] = js.undefined,
    preUnfixed: js.UndefOr[Callback] = js.undefined,
    removeOffsets: js.UndefOr[Boolean] = js.undefined,
    spacerClass: String = null,
    unfixed: js.UndefOr[Callback] = js.undefined,
    zIndex: Int | Double = null
  ): ScrollToFixedOptions = {
    val __obj = js.Dynamic.literal()
    if (baseClassName != null) __obj.updateDynamic("baseClassName")(baseClassName.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dontCheckForPositionFixedSupport)) __obj.updateDynamic("dontCheckForPositionFixedSupport")(dontCheckForPositionFixedSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(dontSetWidth)) __obj.updateDynamic("dontSetWidth")(dontSetWidth.asInstanceOf[js.Any])
    fixed.foreach(p => __obj.updateDynamic("fixed")(p.toJsFn))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(offsets)) __obj.updateDynamic("offsets")(offsets.asInstanceOf[js.Any])
    postAbsolute.foreach(p => __obj.updateDynamic("postAbsolute")(p.toJsFn))
    postFixed.foreach(p => __obj.updateDynamic("postFixed")(p.toJsFn))
    postUnfixed.foreach(p => __obj.updateDynamic("postUnfixed")(p.toJsFn))
    preAbsolute.foreach(p => __obj.updateDynamic("preAbsolute")(p.toJsFn))
    preFixed.foreach(p => __obj.updateDynamic("preFixed")(p.toJsFn))
    preUnfixed.foreach(p => __obj.updateDynamic("preUnfixed")(p.toJsFn))
    if (!js.isUndefined(removeOffsets)) __obj.updateDynamic("removeOffsets")(removeOffsets.asInstanceOf[js.Any])
    if (spacerClass != null) __obj.updateDynamic("spacerClass")(spacerClass.asInstanceOf[js.Any])
    unfixed.foreach(p => __obj.updateDynamic("unfixed")(p.toJsFn))
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollToFixedOptions]
  }
}

