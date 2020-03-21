package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsJobExecutionsRolloutConfig extends js.Object {
  /**
    * The maximum number of OTA update job executions started per minute.
    */
  var maximumPerMinute: js.UndefOr[MaximumPerMinute] = js.native
}

object AwsJobExecutionsRolloutConfig {
  @scala.inline
  def apply(maximumPerMinute: Int | Double = null): AwsJobExecutionsRolloutConfig = {
    val __obj = js.Dynamic.literal()
    if (maximumPerMinute != null) __obj.updateDynamic("maximumPerMinute")(maximumPerMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsJobExecutionsRolloutConfig]
  }
}

