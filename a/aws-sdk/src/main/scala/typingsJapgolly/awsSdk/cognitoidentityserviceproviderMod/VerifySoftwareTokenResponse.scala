package typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifySoftwareTokenResponse extends js.Object {
  /**
    * The session which should be passed both ways in challenge-response calls to the service.
    */
  var Session: js.UndefOr[SessionType] = js.native
  /**
    * The status of the verify software token.
    */
  var Status: js.UndefOr[VerifySoftwareTokenResponseType] = js.native
}

object VerifySoftwareTokenResponse {
  @scala.inline
  def apply(Session: SessionType = null, Status: VerifySoftwareTokenResponseType = null): VerifySoftwareTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (Session != null) __obj.updateDynamic("Session")(Session.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifySoftwareTokenResponse]
  }
}

