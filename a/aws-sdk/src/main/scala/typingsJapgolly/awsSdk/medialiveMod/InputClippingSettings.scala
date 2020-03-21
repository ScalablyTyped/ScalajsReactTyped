package typingsJapgolly.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputClippingSettings extends js.Object {
  /**
    * The source of the timecodes in the source being clipped.
    */
  var InputTimecodeSource: typingsJapgolly.awsSdk.medialiveMod.InputTimecodeSource = js.native
  /**
    * Settings to identify the start of the clip.
    */
  var StartTimecode: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.StartTimecode] = js.native
  /**
    * Settings to identify the end of the clip.
    */
  var StopTimecode: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.StopTimecode] = js.native
}

object InputClippingSettings {
  @scala.inline
  def apply(
    InputTimecodeSource: InputTimecodeSource,
    StartTimecode: StartTimecode = null,
    StopTimecode: StopTimecode = null
  ): InputClippingSettings = {
    val __obj = js.Dynamic.literal(InputTimecodeSource = InputTimecodeSource.asInstanceOf[js.Any])
    if (StartTimecode != null) __obj.updateDynamic("StartTimecode")(StartTimecode.asInstanceOf[js.Any])
    if (StopTimecode != null) __obj.updateDynamic("StopTimecode")(StopTimecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputClippingSettings]
  }
}

