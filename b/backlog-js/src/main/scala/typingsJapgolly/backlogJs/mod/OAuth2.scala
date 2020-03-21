package typingsJapgolly.backlogJs.mod

import typingsJapgolly.backlogJs.AnonCode
import typingsJapgolly.backlogJs.AnonHost
import typingsJapgolly.backlogJs.AnonRefreshToken
import typingsJapgolly.backlogJs.mod.Entity.OAuth2.AccessToken
import typingsJapgolly.backlogJs.mod.Option.OAuth2.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backlog-js", "OAuth2")
@js.native
class OAuth2 protected () extends js.Object {
  def this(credentials: Credentials) = this()
  def this(credentials: Credentials, timeout: Double) = this()
  var credentials: js.Any = js.native
  var timeout: js.Any = js.native
  def getAccessToken(options: AnonCode): js.Promise[AccessToken] = js.native
  def getAuthorizationURL(options: AnonHost): String = js.native
  def refreshAccessToken(options: AnonRefreshToken): js.Promise[AccessToken] = js.native
}

