package typingsJapgolly.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UdpGroupSettings extends js.Object {
  /**
    * Specifies behavior of last resort when input video is lost, and no more backup inputs are available. When dropTs is selected the entire transport stream will stop being emitted.  When dropProgram is selected the program can be dropped from the transport stream (and replaced with null packets to meet the TS bitrate requirement).  Or, when emitProgram is chosen the transport stream will continue to be produced normally with repeat frames, black frames, or slate frames substituted for the absent input video.
    */
  var InputLossAction: js.UndefOr[InputLossActionForUdpOut] = js.native
  /**
    * Indicates ID3 frame that has the timecode.
    */
  var TimedMetadataId3Frame: js.UndefOr[UdpTimedMetadataId3Frame] = js.native
  /**
    * Timed Metadata interval in seconds.
    */
  var TimedMetadataId3Period: js.UndefOr[integerMin0] = js.native
}

object UdpGroupSettings {
  @scala.inline
  def apply(
    InputLossAction: InputLossActionForUdpOut = null,
    TimedMetadataId3Frame: UdpTimedMetadataId3Frame = null,
    TimedMetadataId3Period: Int | Double = null
  ): UdpGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (InputLossAction != null) __obj.updateDynamic("InputLossAction")(InputLossAction.asInstanceOf[js.Any])
    if (TimedMetadataId3Frame != null) __obj.updateDynamic("TimedMetadataId3Frame")(TimedMetadataId3Frame.asInstanceOf[js.Any])
    if (TimedMetadataId3Period != null) __obj.updateDynamic("TimedMetadataId3Period")(TimedMetadataId3Period.asInstanceOf[js.Any])
    __obj.asInstanceOf[UdpGroupSettings]
  }
}

