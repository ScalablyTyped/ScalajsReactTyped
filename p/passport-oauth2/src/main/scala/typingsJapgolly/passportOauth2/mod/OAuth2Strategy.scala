package typingsJapgolly.passportOauth2.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.oauth.mod.OAuth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2Strategy extends js.Object {
  /**
    *   NOTE: The _oauth2 property is considered "protected".  Subclasses are
    *         allowed to use it when making protected resource requests to retrieve
    *         the user profile.
    */
  var _oauth2: OAuth2 = js.native
  var name: String = js.native
  def authenticate(req: Request_[ParamsDictionary]): Unit = js.native
  def authenticate(req: Request_[ParamsDictionary], options: js.Any): Unit = js.native
  def authorizationParams(options: js.Any): js.Object = js.native
  def parseErrorResponse(body: js.Any, status: Double): js.Error | Null = js.native
  def tokenParams(options: js.Any): js.Object = js.native
  def userProfile(
    accessToken: String,
    done: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* profile */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
}

