package typingsJapgolly.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSigningProfilesResponse extends js.Object {
  /**
    * Value for specifying the next set of paginated results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of profiles that are available in the AWS account. This includes profiles with the status of CANCELED if the includeCanceled parameter is set to true.
    */
  var profiles: js.UndefOr[SigningProfiles] = js.native
}

object ListSigningProfilesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, profiles: SigningProfiles = null): ListSigningProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (profiles != null) __obj.updateDynamic("profiles")(profiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSigningProfilesResponse]
  }
}

