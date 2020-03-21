package typingsJapgolly.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoSelectorSettings extends js.Object {
  var VideoSelectorPid: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.VideoSelectorPid] = js.native
  var VideoSelectorProgramId: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.VideoSelectorProgramId] = js.native
}

object VideoSelectorSettings {
  @scala.inline
  def apply(VideoSelectorPid: VideoSelectorPid = null, VideoSelectorProgramId: VideoSelectorProgramId = null): VideoSelectorSettings = {
    val __obj = js.Dynamic.literal()
    if (VideoSelectorPid != null) __obj.updateDynamic("VideoSelectorPid")(VideoSelectorPid.asInstanceOf[js.Any])
    if (VideoSelectorProgramId != null) __obj.updateDynamic("VideoSelectorProgramId")(VideoSelectorProgramId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSelectorSettings]
  }
}

