package typingsJapgolly.reactPopperTooltip

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloseOnOutOfBoundaries extends js.Object {
  var closeOnOutOfBoundaries: Boolean
  var defaultTooltipShown: Boolean
  var delayHide: Double
  var delayShow: Double
  var followCursor: Boolean
  var placement: String
  var portalContainer: HTMLElement | Null
  var trigger: String
  var usePortal: Boolean
  def onVisibilityChange(): Unit
}

object AnonCloseOnOutOfBoundaries {
  @scala.inline
  def apply(
    closeOnOutOfBoundaries: Boolean,
    defaultTooltipShown: Boolean,
    delayHide: Double,
    delayShow: Double,
    followCursor: Boolean,
    onVisibilityChange: Callback,
    placement: String,
    trigger: String,
    usePortal: Boolean,
    portalContainer: HTMLElement = null
  ): AnonCloseOnOutOfBoundaries = {
    val __obj = js.Dynamic.literal(closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], defaultTooltipShown = defaultTooltipShown.asInstanceOf[js.Any], delayHide = delayHide.asInstanceOf[js.Any], delayShow = delayShow.asInstanceOf[js.Any], followCursor = followCursor.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], usePortal = usePortal.asInstanceOf[js.Any])
    __obj.updateDynamic("onVisibilityChange")(onVisibilityChange.toJsFn)
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloseOnOutOfBoundaries]
  }
}

