package typingsJapgolly.reactOverlays.overlayMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactOverlays.AnonArialabelledby
import typingsJapgolly.reactOverlays.AnonRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayRenderProps extends js.Object {
  var arrowProps: AnonRef
  var outOfBoundaries: js.UndefOr[Boolean] = js.undefined
  var placement: Placements
  var props: AnonArialabelledby
  var show: Boolean
  def scheduleUpdate(): Unit
}

object OverlayRenderProps {
  @scala.inline
  def apply(
    arrowProps: AnonRef,
    placement: Placements,
    props: AnonArialabelledby,
    scheduleUpdate: Callback,
    show: Boolean,
    outOfBoundaries: js.UndefOr[Boolean] = js.undefined
  ): OverlayRenderProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("scheduleUpdate")(scheduleUpdate.toJsFn)
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayRenderProps]
  }
}

