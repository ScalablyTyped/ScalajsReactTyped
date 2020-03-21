package typingsJapgolly.ionic.authMod

import typingsJapgolly.ionic.definitionsMod.ResourceClientLoad
import typingsJapgolly.ionic.httpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/auth", "AuthConnectionClient")
@js.native
class AuthConnectionClient protected ()
  extends ResourceClient
     with ResourceClientLoad[AuthConnection] {
  def this(e: AuthClientDeps) = this()
  val e: AuthClientDeps = js.native
  def load(email: String): js.Promise[AuthConnection] = js.native
}

