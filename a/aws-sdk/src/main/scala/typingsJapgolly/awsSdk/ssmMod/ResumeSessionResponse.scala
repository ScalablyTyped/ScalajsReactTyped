package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResumeSessionResponse extends js.Object {
  /**
    * The ID of the session.
    */
  var SessionId: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.SessionId] = js.native
  /**
    * A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output from the instance. Format: wss://ssmmessages.region.amazonaws.com/v1/data-channel/session-id?stream=(input|output).  region represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as us-east-2 for the US East (Ohio) Region. For a list of supported region values, see the Region column in Systems Manager Service Endpoints in the AWS General Reference.  session-id represents the ID of a Session Manager session, such as 1a2b3c4dEXAMPLE.
    */
  var StreamUrl: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.StreamUrl] = js.native
  /**
    * An encrypted token value containing session and caller information. Used to authenticate the connection to the instance.
    */
  var TokenValue: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.TokenValue] = js.native
}

object ResumeSessionResponse {
  @scala.inline
  def apply(SessionId: SessionId = null, StreamUrl: StreamUrl = null, TokenValue: TokenValue = null): ResumeSessionResponse = {
    val __obj = js.Dynamic.literal()
    if (SessionId != null) __obj.updateDynamic("SessionId")(SessionId.asInstanceOf[js.Any])
    if (StreamUrl != null) __obj.updateDynamic("StreamUrl")(StreamUrl.asInstanceOf[js.Any])
    if (TokenValue != null) __obj.updateDynamic("TokenValue")(TokenValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeSessionResponse]
  }
}

