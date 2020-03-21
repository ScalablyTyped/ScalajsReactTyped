package typingsJapgolly.pulumiAws.inputMod.kinesis

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsStartingPositionConfiguration extends js.Object {
  var startingPosition: js.UndefOr[Input[String]] = js.native
}

object AnalyticsApplicationInputsStartingPositionConfiguration {
  @scala.inline
  def apply(startingPosition: Input[String] = null): AnalyticsApplicationInputsStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (startingPosition != null) __obj.updateDynamic("startingPosition")(startingPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsStartingPositionConfiguration]
  }
}

