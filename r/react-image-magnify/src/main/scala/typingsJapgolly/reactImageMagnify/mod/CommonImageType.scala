package typingsJapgolly.reactImageMagnify.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonImageType extends js.Object {
  var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var src: String
  var srcSet: js.UndefOr[String] = js.undefined
}

object CommonImageType {
  @scala.inline
  def apply(
    src: String,
    onError: js.UndefOr[Callback] = js.undefined,
    onLoad: js.UndefOr[Callback] = js.undefined,
    sizes: String = null,
    srcSet: String = null
  ): CommonImageType = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    onError.foreach(p => __obj.updateDynamic("onError")(p.toJsFn))
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonImageType]
  }
}

