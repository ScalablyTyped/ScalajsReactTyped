package typingsJapgolly.ably.mod.Types

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  /**
  		 * A function which is called when a new token is required.
  		 * The role of the callback is to either generate a signed TokenRequest which may then be submitted automatically
  		 * by the library to the Ably REST API requestToken; or to provide a valid token in as a TokenDetails object.
  		 **/
  var authCallback: js.UndefOr[
    js.Function2[
      /* data */ TokenParams, 
      /* callback */ js.Function2[
        /* error */ ErrorInfo | String, 
        /* tokenRequestOrDetails */ TokenDetails | TokenRequest | String, 
        Unit
      ], 
      Unit
    ]
  ] = js.undefined
  var authHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var authMethod: js.UndefOr[HTTPMethods] = js.undefined
  var authParams: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
  		 * A URL that the library may use to obtain a token string (in plain text format), or a signed TokenRequest or TokenDetails (in JSON format).
  		 **/
  var authUrl: js.UndefOr[String] = js.undefined
  /**
  		 * Optional clientId that can be used to specify the identity for this client. In most cases
  		 * it is preferable to instead specift a clientId in the token issued to this client.
  		 */
  var clientId: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var queryTime: js.UndefOr[Boolean] = js.undefined
  var token: js.UndefOr[TokenDetails | String] = js.undefined
  var tokenDetails: js.UndefOr[TokenDetails] = js.undefined
  var useTokenAuth: js.UndefOr[Boolean] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(
    authCallback: (/* data */ TokenParams, /* callback */ js.Function2[
      /* error */ ErrorInfo | String, 
      /* tokenRequestOrDetails */ TokenDetails | TokenRequest | String, 
      Unit
    ]) => Callback = null,
    authHeaders: StringDictionary[String] = null,
    authMethod: HTTPMethods = null,
    authParams: StringDictionary[String] = null,
    authUrl: String = null,
    clientId: String = null,
    key: String = null,
    queryTime: js.UndefOr[Boolean] = js.undefined,
    token: TokenDetails | String = null,
    tokenDetails: TokenDetails = null,
    useTokenAuth: js.UndefOr[Boolean] = js.undefined
  ): AuthOptions = {
    val __obj = js.Dynamic.literal()
    if (authCallback != null) __obj.updateDynamic("authCallback")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.ably.mod.Types.TokenParams, t1: /* callback */ js.Function2[
  /* error */ typingsJapgolly.ably.mod.Types.ErrorInfo | java.lang.String, 
  /* tokenRequestOrDetails */ typingsJapgolly.ably.mod.Types.TokenDetails | typingsJapgolly.ably.mod.Types.TokenRequest | java.lang.String, 
  scala.Unit]) => authCallback(t0, t1).runNow()))
    if (authHeaders != null) __obj.updateDynamic("authHeaders")(authHeaders.asInstanceOf[js.Any])
    if (authMethod != null) __obj.updateDynamic("authMethod")(authMethod.asInstanceOf[js.Any])
    if (authParams != null) __obj.updateDynamic("authParams")(authParams.asInstanceOf[js.Any])
    if (authUrl != null) __obj.updateDynamic("authUrl")(authUrl.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(queryTime)) __obj.updateDynamic("queryTime")(queryTime.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (tokenDetails != null) __obj.updateDynamic("tokenDetails")(tokenDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(useTokenAuth)) __obj.updateDynamic("useTokenAuth")(useTokenAuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOptions]
  }
}

