package typingsJapgolly.ionic.authMod

import typingsJapgolly.ionic.httpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/auth", "AuthClient")
@js.native
class AuthClient protected () extends ResourceClient {
  def this(e: AuthClientDeps) = this()
  val connections: AuthConnectionClient = js.native
  val e: AuthClientDeps = js.native
}

