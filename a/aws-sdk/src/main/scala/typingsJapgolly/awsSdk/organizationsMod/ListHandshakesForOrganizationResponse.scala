package typingsJapgolly.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHandshakesForOrganizationResponse extends js.Object {
  /**
    * A list of Handshake objects with details about each of the handshakes that are associated with an organization.
    */
  var Handshakes: js.UndefOr[typingsJapgolly.awsSdk.organizationsMod.Handshakes] = js.native
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.organizationsMod.NextToken] = js.native
}

object ListHandshakesForOrganizationResponse {
  @scala.inline
  def apply(Handshakes: Handshakes = null, NextToken: NextToken = null): ListHandshakesForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    if (Handshakes != null) __obj.updateDynamic("Handshakes")(Handshakes.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHandshakesForOrganizationResponse]
  }
}

