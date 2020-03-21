package typingsJapgolly.amazonCognitoAuthJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoSessionData extends js.Object {
  /**
    * The session's access token.
    */
  var AccessToken: js.UndefOr[CognitoAccessToken] = js.undefined
  /**
    * The session's Id token.
    */
  var IdToken: js.UndefOr[CognitoIdToken] = js.undefined
  /**
    * The session's refresh token.
    */
  var RefreshToken: js.UndefOr[CognitoRefreshToken] = js.undefined
  /**
    * The session's state.
    */
  var State: js.UndefOr[String] = js.undefined
  /**
    * The session's token scopes.
    */
  var TokenScopes: js.UndefOr[CognitoTokenScopes] = js.undefined
}

object CognitoSessionData {
  @scala.inline
  def apply(
    AccessToken: CognitoAccessToken = null,
    IdToken: CognitoIdToken = null,
    RefreshToken: CognitoRefreshToken = null,
    State: String = null,
    TokenScopes: CognitoTokenScopes = null
  ): CognitoSessionData = {
    val __obj = js.Dynamic.literal()
    if (AccessToken != null) __obj.updateDynamic("AccessToken")(AccessToken.asInstanceOf[js.Any])
    if (IdToken != null) __obj.updateDynamic("IdToken")(IdToken.asInstanceOf[js.Any])
    if (RefreshToken != null) __obj.updateDynamic("RefreshToken")(RefreshToken.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TokenScopes != null) __obj.updateDynamic("TokenScopes")(TokenScopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoSessionData]
  }
}

