package typingsJapgolly.antd.baseMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipsisConfig extends js.Object {
  var expandable: js.UndefOr[Boolean] = js.undefined
  var onExpand: js.UndefOr[js.Function0[Unit]] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
}

object EllipsisConfig {
  @scala.inline
  def apply(
    expandable: js.UndefOr[Boolean] = js.undefined,
    onExpand: js.UndefOr[Callback] = js.undefined,
    rows: Int | Double = null,
    suffix: String = null
  ): EllipsisConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    onExpand.foreach(p => __obj.updateDynamic("onExpand")(p.toJsFn))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipsisConfig]
  }
}

