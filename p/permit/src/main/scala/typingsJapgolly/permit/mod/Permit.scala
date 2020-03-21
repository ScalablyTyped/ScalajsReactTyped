package typingsJapgolly.permit.mod

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("permit", "Permit")
@js.native
class Permit protected () extends js.Object {
  def this(options: PermitOptions) = this()
  def check(req: IncomingMessage): Unit = js.native
  def fail(res: ServerResponse): Unit = js.native
}

