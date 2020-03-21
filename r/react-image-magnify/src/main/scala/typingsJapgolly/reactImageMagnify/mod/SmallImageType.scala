package typingsJapgolly.reactImageMagnify.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmallImageType extends CommonImageType {
  var alt: js.UndefOr[String] = js.undefined
  /**
    * Required if isFluidWidth is not set
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Default: false
    */
  var isFluidWidth: Boolean
  /**
    * Required if isFluidWidth is not set
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SmallImageType {
  @scala.inline
  def apply(
    isFluidWidth: Boolean,
    src: String,
    alt: String = null,
    height: Int | Double = null,
    onError: js.UndefOr[Callback] = js.undefined,
    onLoad: js.UndefOr[Callback] = js.undefined,
    sizes: String = null,
    srcSet: String = null,
    width: Int | Double = null
  ): SmallImageType = {
    val __obj = js.Dynamic.literal(isFluidWidth = isFluidWidth.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    onError.foreach(p => __obj.updateDynamic("onError")(p.toJsFn))
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmallImageType]
  }
}

