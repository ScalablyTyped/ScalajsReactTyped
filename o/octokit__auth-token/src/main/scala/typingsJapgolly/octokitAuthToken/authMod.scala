package typingsJapgolly.octokitAuthToken

import typingsJapgolly.octokitAuthToken.typesMod.Authentication
import typingsJapgolly.octokitAuthToken.typesMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/auth-token/dist-types/auth", JSImport.Namespace)
@js.native
object authMod extends js.Object {
  def auth(token: Token): js.Promise[Authentication] = js.native
}

