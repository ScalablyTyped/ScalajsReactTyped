package typingsJapgolly.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0", "OAuthAuthenticator")
@js.native
class OAuthAuthenticator protected () extends js.Object {
  def this(options: OAuthClientOptions) = this()
  def authorizationCodeGrant(data: AuthorizationCodeGrantOptions): js.Promise[SignInToken] = js.native
  def authorizationCodeGrant(
    data: AuthorizationCodeGrantOptions,
    cb: js.Function2[/* err */ js.Error, /* data */ SignInToken, Unit]
  ): Unit = js.native
  def passwordGrant(options: PasswordGrantOptions): js.Promise[SignInToken] = js.native
  def passwordGrant(
    options: PasswordGrantOptions,
    cb: js.Function2[/* err */ js.Error, /* response */ SignInToken, Unit]
  ): Unit = js.native
  def signIn(data: SignInOptions): js.Promise[SignInToken] = js.native
  def signIn(data: SignInOptions, cb: js.Function2[/* err */ js.Error, /* data */ SignInToken, Unit]): Unit = js.native
  def socialSignIn(data: SocialSignInOptions): js.Promise[SignInToken] = js.native
  def socialSignIn(data: SocialSignInOptions, cb: js.Function2[/* err */ js.Error, /* data */ SignInToken, Unit]): Unit = js.native
}

