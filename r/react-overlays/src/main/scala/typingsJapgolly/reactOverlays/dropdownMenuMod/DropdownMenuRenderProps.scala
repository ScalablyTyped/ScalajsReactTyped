package typingsJapgolly.reactOverlays.dropdownMenuMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactOverlays.AnonArialabelledby
import typingsJapgolly.reactOverlays.AnonRef
import typingsJapgolly.reactOverlays.overlayMod.OverlayRenderProps
import typingsJapgolly.reactOverlays.overlayMod.Placements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownMenuRenderProps extends OverlayRenderProps {
  var alignEnd: Boolean
  def close(event: ReactEventFrom[Element]): Unit
}

object DropdownMenuRenderProps {
  @scala.inline
  def apply(
    alignEnd: Boolean,
    arrowProps: AnonRef,
    close: ReactEventFrom[Element] => Callback,
    placement: Placements,
    props: AnonArialabelledby,
    scheduleUpdate: Callback,
    show: Boolean,
    outOfBoundaries: js.UndefOr[Boolean] = js.undefined
  ): DropdownMenuRenderProps = {
    val __obj = js.Dynamic.literal(alignEnd = alignEnd.asInstanceOf[js.Any], arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => close(t0).runNow()))
    __obj.updateDynamic("scheduleUpdate")(scheduleUpdate.toJsFn)
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownMenuRenderProps]
  }
}

