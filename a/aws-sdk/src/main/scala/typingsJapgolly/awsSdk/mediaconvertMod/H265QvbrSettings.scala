package typingsJapgolly.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait H265QvbrSettings extends js.Object {
  /**
    * Use this setting only when Rate control mode is QVBR and Quality tuning level is Multi-pass HQ. For Max average bitrate values suited to the complexity of your input video, the service limits the average bitrate of the video part of this output to the value that you choose. That is, the total size of the video element is less than or equal to the value you set multiplied by the number of seconds of encoded output.
    */
  var MaxAverageBitrate: js.UndefOr[integerMin1000Max1466400000] = js.native
  /**
    * Required when you use QVBR rate control mode. That is, when you specify qvbrSettings within h265Settings. Specify the general target quality level for this output, from 1 to 10. Use higher numbers for greater quality. Level 10 results in nearly lossless compression. The quality level for most broadcast-quality transcodes is between 6 and 9. Optionally, to specify a value between whole numbers, also provide a value for the setting qvbrQualityLevelFineTune. For example, if you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33.
    */
  var QvbrQualityLevel: js.UndefOr[integerMin1Max10] = js.native
  /**
    * Optional. Specify a value here to set the QVBR quality to a level that is between whole numbers. For example, if you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33. MediaConvert rounds your QVBR quality level to the nearest third of a whole number. For example, if you set qvbrQualityLevel to 7 and you set qvbrQualityLevelFineTune to .25, your actual QVBR quality level is 7.33.
    */
  var QvbrQualityLevelFineTune: js.UndefOr[doubleMin0Max1] = js.native
}

object H265QvbrSettings {
  @scala.inline
  def apply(
    MaxAverageBitrate: Int | Double = null,
    QvbrQualityLevel: Int | Double = null,
    QvbrQualityLevelFineTune: Int | Double = null
  ): H265QvbrSettings = {
    val __obj = js.Dynamic.literal()
    if (MaxAverageBitrate != null) __obj.updateDynamic("MaxAverageBitrate")(MaxAverageBitrate.asInstanceOf[js.Any])
    if (QvbrQualityLevel != null) __obj.updateDynamic("QvbrQualityLevel")(QvbrQualityLevel.asInstanceOf[js.Any])
    if (QvbrQualityLevelFineTune != null) __obj.updateDynamic("QvbrQualityLevelFineTune")(QvbrQualityLevelFineTune.asInstanceOf[js.Any])
    __obj.asInstanceOf[H265QvbrSettings]
  }
}

