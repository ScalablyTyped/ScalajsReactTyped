package typingsJapgolly.reactImageMagnify.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LargeImageType extends CommonImageType {
  /**
    * Defaults to empty string
    */
  var alt: js.UndefOr[String] = js.undefined
  var height: Double
  var width: Double
}

object LargeImageType {
  @scala.inline
  def apply(
    height: Double,
    src: String,
    width: Double,
    alt: String = null,
    onError: js.UndefOr[Callback] = js.undefined,
    onLoad: js.UndefOr[Callback] = js.undefined,
    sizes: String = null,
    srcSet: String = null
  ): LargeImageType = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    onError.foreach(p => __obj.updateDynamic("onError")(p.toJsFn))
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[LargeImageType]
  }
}

