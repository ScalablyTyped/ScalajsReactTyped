package typingsJapgolly.hapiHawk.serverMod

import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/server", "authenticateBewit")
@js.native
object authenticateBewit extends js.Object {
  def apply(req: IncomingMessage, credentialsFunc: CredentialsFunc): AuthenticatedBewit = js.native
  def apply(req: IncomingMessage, credentialsFunc: CredentialsFunc, options: AuthenticateBewitOptions): AuthenticatedBewit = js.native
}

