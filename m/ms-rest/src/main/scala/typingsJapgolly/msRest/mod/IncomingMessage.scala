package typingsJapgolly.msRest.mod

import typingsJapgolly.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest", "IncomingMessage")
@js.native
class IncomingMessage protected ()
  extends typingsJapgolly.node.httpMod.IncomingMessage {
  def this(socket: Socket) = this()
}

