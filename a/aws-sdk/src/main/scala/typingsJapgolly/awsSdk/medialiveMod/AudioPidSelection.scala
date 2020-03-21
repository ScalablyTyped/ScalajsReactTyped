package typingsJapgolly.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioPidSelection extends js.Object {
  /**
    * Selects a specific PID from within a source.
    */
  var Pid: integerMin0Max8191 = js.native
}

object AudioPidSelection {
  @scala.inline
  def apply(Pid: integerMin0Max8191): AudioPidSelection = {
    val __obj = js.Dynamic.literal(Pid = Pid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AudioPidSelection]
  }
}

