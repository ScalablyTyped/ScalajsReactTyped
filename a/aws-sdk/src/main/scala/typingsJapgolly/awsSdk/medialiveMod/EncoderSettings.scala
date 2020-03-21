package typingsJapgolly.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncoderSettings extends js.Object {
  var AudioDescriptions: listOfAudioDescription = js.native
  /**
    * Settings for ad avail blanking.
    */
  var AvailBlanking: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.AvailBlanking] = js.native
  /**
    * Event-wide configuration settings for ad avail insertion.
    */
  var AvailConfiguration: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.AvailConfiguration] = js.native
  /**
    * Settings for blackout slate.
    */
  var BlackoutSlate: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.BlackoutSlate] = js.native
  /**
    * Settings for caption decriptions
    */
  var CaptionDescriptions: js.UndefOr[listOfCaptionDescription] = js.native
  /**
    * Configuration settings that apply to the event as a whole.
    */
  var GlobalConfiguration: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.GlobalConfiguration] = js.native
  /**
    * Nielsen configuration settings.
    */
  var NielsenConfiguration: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.NielsenConfiguration] = js.native
  var OutputGroups: listOfOutputGroup = js.native
  /**
    * Contains settings used to acquire and adjust timecode information from inputs.
    */
  var TimecodeConfig: typingsJapgolly.awsSdk.medialiveMod.TimecodeConfig = js.native
  var VideoDescriptions: listOfVideoDescription = js.native
}

object EncoderSettings {
  @scala.inline
  def apply(
    AudioDescriptions: listOfAudioDescription,
    OutputGroups: listOfOutputGroup,
    TimecodeConfig: TimecodeConfig,
    VideoDescriptions: listOfVideoDescription,
    AvailBlanking: AvailBlanking = null,
    AvailConfiguration: AvailConfiguration = null,
    BlackoutSlate: BlackoutSlate = null,
    CaptionDescriptions: listOfCaptionDescription = null,
    GlobalConfiguration: GlobalConfiguration = null,
    NielsenConfiguration: NielsenConfiguration = null
  ): EncoderSettings = {
    val __obj = js.Dynamic.literal(AudioDescriptions = AudioDescriptions.asInstanceOf[js.Any], OutputGroups = OutputGroups.asInstanceOf[js.Any], TimecodeConfig = TimecodeConfig.asInstanceOf[js.Any], VideoDescriptions = VideoDescriptions.asInstanceOf[js.Any])
    if (AvailBlanking != null) __obj.updateDynamic("AvailBlanking")(AvailBlanking.asInstanceOf[js.Any])
    if (AvailConfiguration != null) __obj.updateDynamic("AvailConfiguration")(AvailConfiguration.asInstanceOf[js.Any])
    if (BlackoutSlate != null) __obj.updateDynamic("BlackoutSlate")(BlackoutSlate.asInstanceOf[js.Any])
    if (CaptionDescriptions != null) __obj.updateDynamic("CaptionDescriptions")(CaptionDescriptions.asInstanceOf[js.Any])
    if (GlobalConfiguration != null) __obj.updateDynamic("GlobalConfiguration")(GlobalConfiguration.asInstanceOf[js.Any])
    if (NielsenConfiguration != null) __obj.updateDynamic("NielsenConfiguration")(NielsenConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncoderSettings]
  }
}

