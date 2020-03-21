package typingsJapgolly.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////
//
//  RESPONSES
//
////////////////////////
trait AuthResponse extends js.Object {
  var accessToken: String
  var expiresIn: Double
  var grantedScopes: js.UndefOr[String] = js.undefined
  var reauthorize_required_in: js.UndefOr[Double] = js.undefined
  var signedRequest: String
  var userID: String
}

object AuthResponse {
  @scala.inline
  def apply(
    accessToken: String,
    expiresIn: Double,
    signedRequest: String,
    userID: String,
    grantedScopes: String = null,
    reauthorize_required_in: Int | Double = null
  ): AuthResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], signedRequest = signedRequest.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    if (grantedScopes != null) __obj.updateDynamic("grantedScopes")(grantedScopes.asInstanceOf[js.Any])
    if (reauthorize_required_in != null) __obj.updateDynamic("reauthorize_required_in")(reauthorize_required_in.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthResponse]
  }
}

