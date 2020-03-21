package typingsJapgolly.vis.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataAxisSideOption extends js.Object {
  var format: js.UndefOr[js.Function0[String]] = js.undefined
  var range: js.UndefOr[RangeType] = js.undefined
  var title: js.UndefOr[TitleOption] = js.undefined
}

object DataAxisSideOption {
  @scala.inline
  def apply(
    format: js.UndefOr[CallbackTo[String]] = js.undefined,
    range: RangeType = null,
    title: TitleOption = null
  ): DataAxisSideOption = {
    val __obj = js.Dynamic.literal()
    format.foreach(p => __obj.updateDynamic("format")(p.toJsFn))
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataAxisSideOption]
  }
}

