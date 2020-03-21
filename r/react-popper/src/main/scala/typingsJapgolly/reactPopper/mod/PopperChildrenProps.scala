package typingsJapgolly.reactPopper.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.popperJs.mod.Placement
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperChildrenProps extends js.Object {
  var arrowProps: PopperArrowProps
  var outOfBoundaries: Boolean | Null
  var placement: Placement
  var ref: Ref
  var style: CSSProperties
  def scheduleUpdate(): Unit
}

object PopperChildrenProps {
  @scala.inline
  def apply(
    arrowProps: PopperArrowProps,
    placement: Placement,
    scheduleUpdate: Callback,
    style: CSSProperties,
    outOfBoundaries: js.UndefOr[Boolean] = js.undefined,
    ref: Ref = null
  ): PopperChildrenProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("scheduleUpdate")(scheduleUpdate.toJsFn)
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperChildrenProps]
  }
}

