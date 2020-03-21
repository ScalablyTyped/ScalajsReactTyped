package typingsJapgolly.vis.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph2dDrawPointsOption extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var onRender: js.UndefOr[js.Function0[Boolean]] = js.undefined
   // TODO
  var size: js.UndefOr[Double] = js.undefined
  var style: Graph2dDrawPointsStyle
}

object Graph2dDrawPointsOption {
  @scala.inline
  def apply(
    style: Graph2dDrawPointsStyle,
    enabled: js.UndefOr[Boolean] = js.undefined,
    onRender: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    size: Int | Double = null
  ): Graph2dDrawPointsOption = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    onRender.foreach(p => __obj.updateDynamic("onRender")(p.toJsFn))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph2dDrawPointsOption]
  }
}

