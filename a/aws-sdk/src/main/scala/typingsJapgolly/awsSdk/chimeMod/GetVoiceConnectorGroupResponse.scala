package typingsJapgolly.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorGroupResponse extends js.Object {
  /**
    * The Amazon Chime Voice Connector group details.
    */
  var VoiceConnectorGroup: js.UndefOr[typingsJapgolly.awsSdk.chimeMod.VoiceConnectorGroup] = js.native
}

object GetVoiceConnectorGroupResponse {
  @scala.inline
  def apply(VoiceConnectorGroup: VoiceConnectorGroup = null): GetVoiceConnectorGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (VoiceConnectorGroup != null) __obj.updateDynamic("VoiceConnectorGroup")(VoiceConnectorGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorGroupResponse]
  }
}

