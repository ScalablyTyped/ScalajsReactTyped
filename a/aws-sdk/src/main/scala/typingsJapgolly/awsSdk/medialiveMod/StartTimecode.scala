package typingsJapgolly.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTimecode extends js.Object {
  /**
    * The timecode for the frame where you want to start the clip. Optional; if not specified, the clip starts at first frame in the file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
    */
  var Timecode: js.UndefOr[string] = js.native
}

object StartTimecode {
  @scala.inline
  def apply(Timecode: string = null): StartTimecode = {
    val __obj = js.Dynamic.literal()
    if (Timecode != null) __obj.updateDynamic("Timecode")(Timecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTimecode]
  }
}

