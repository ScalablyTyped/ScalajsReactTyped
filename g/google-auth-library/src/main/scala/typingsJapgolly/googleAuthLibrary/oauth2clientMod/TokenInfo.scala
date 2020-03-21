package typingsJapgolly.googleAuthLibrary.oauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenInfo extends js.Object {
  /**
    * Indicates whether your application can refresh access tokens
    * when the user is not present at the browser. Valid parameter values are
    * 'online', which is the default value, and 'offline'. Set the value to
    * 'offline' if your application needs to refresh access tokens when the user
    * is not present at the browser. This value instructs the Google
    * authorization server to return a refresh token and an access token the
    * first time that your application exchanges an authorization code for
    * tokens.
    */
  var access_type: js.UndefOr[String] = js.undefined
  /**
    * The application that is the intended user of the access token.
    */
  var aud: String
  /**
    * The client_id of the authorized presenter. This claim is only needed when
    * the party requesting the ID token is not the same as the audience of the ID
    * token. This may be the case at Google for hybrid apps where a web
    * application and Android app have a different client_id but share the same
    * project.
    */
  var azp: js.UndefOr[String] = js.undefined
  /**
    * The datetime when the token becomes invalid.
    */
  var expiry_date: Double
  /**
    * An array of scopes that the user granted access to.
    */
  var scopes: js.Array[String]
  /**
    * An identifier for the user, unique among all Google accounts and never
    * reused. A Google account can have multiple emails at different points in
    * time, but the sub value is never changed. Use sub within your application
    * as the unique-identifier key for the user.
    */
  var sub: js.UndefOr[String] = js.undefined
  /**
    * This value lets you correlate profile information from multiple Google
    * APIs. It is only present in the response if you included the profile scope
    * in your request in step 1. The field value is an immutable identifier for
    * the logged-in user that can be used to create and manage user sessions in
    * your application. The identifier is the same regardless of which client ID
    * is used to retrieve it. This enables multiple applications in the same
    * organization to correlate profile information.
    */
  var user_id: js.UndefOr[String] = js.undefined
}

object TokenInfo {
  @scala.inline
  def apply(
    aud: String,
    expiry_date: Double,
    scopes: js.Array[String],
    access_type: String = null,
    azp: String = null,
    sub: String = null,
    user_id: String = null
  ): TokenInfo = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], expiry_date = expiry_date.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    if (access_type != null) __obj.updateDynamic("access_type")(access_type.asInstanceOf[js.Any])
    if (azp != null) __obj.updateDynamic("azp")(azp.asInstanceOf[js.Any])
    if (sub != null) __obj.updateDynamic("sub")(sub.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInfo]
  }
}

