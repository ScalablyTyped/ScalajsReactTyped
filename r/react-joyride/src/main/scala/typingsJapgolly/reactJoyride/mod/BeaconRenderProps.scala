package typingsJapgolly.reactJoyride.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeaconRenderProps extends js.Object {
  var continuous: Boolean
  var index: Double
  var isLastStep: Boolean
  var size: Double
  var step: Step
  def setTooltipRef(): Unit
}

object BeaconRenderProps {
  @scala.inline
  def apply(
    continuous: Boolean,
    index: Double,
    isLastStep: Boolean,
    setTooltipRef: Callback,
    size: Double,
    step: Step
  ): BeaconRenderProps = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isLastStep = isLastStep.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("setTooltipRef")(setTooltipRef.toJsFn)
    __obj.asInstanceOf[BeaconRenderProps]
  }
}

