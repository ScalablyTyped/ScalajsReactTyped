package typingsJapgolly.googleAuthLibrary.refreshclientMod

import typingsJapgolly.googleAuthLibrary.credentialsMod.JWTInput
import typingsJapgolly.googleAuthLibrary.oauth2clientMod.OAuth2Client
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library/build/src/auth/refreshclient", "UserRefreshClient")
@js.native
/**
  * User Refresh Token credentials.
  *
  * @param clientId The authentication client ID.
  * @param clientSecret The authentication client secret.
  * @param refreshToken The authentication refresh token.
  */
class UserRefreshClient () extends OAuth2Client {
  def this(clientId: String) = this()
  def this(options: UserRefreshClientOptions) = this()
  def this(clientId: String, clientSecret: String) = this()
  def this(clientId: String, clientSecret: String, refreshToken: String) = this()
  var _refreshToken: js.UndefOr[String | Null] = js.native
  var fromStreamAsync: js.Any = js.native
  /**
    * Create a UserRefreshClient credentials instance using the given input
    * options.
    * @param json The input object.
    */
  def fromJSON(json: JWTInput): Unit = js.native
  /**
    * Create a UserRefreshClient credentials instance using the given input
    * stream.
    * @param inputStream The input stream.
    * @param callback Optional callback.
    */
  def fromStream(inputStream: Readable): js.Promise[Unit] = js.native
  def fromStream(inputStream: Readable, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
}

