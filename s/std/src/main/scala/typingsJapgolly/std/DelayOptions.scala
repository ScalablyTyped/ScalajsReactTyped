package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelayOptions extends AudioNodeOptions {
  var delayTime: js.UndefOr[Double] = js.undefined
  var maxDelayTime: js.UndefOr[Double] = js.undefined
}

object DelayOptions {
  @scala.inline
  def apply(
    channelCount: Int | Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    delayTime: Int | Double = null,
    maxDelayTime: Int | Double = null
  ): DelayOptions = {
    val __obj = js.Dynamic.literal()
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (delayTime != null) __obj.updateDynamic("delayTime")(delayTime.asInstanceOf[js.Any])
    if (maxDelayTime != null) __obj.updateDynamic("maxDelayTime")(maxDelayTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelayOptions]
  }
}

