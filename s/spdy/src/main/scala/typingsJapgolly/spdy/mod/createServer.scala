package typingsJapgolly.spdy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spdy", "createServer")
@js.native
object createServer extends js.Object {
  def apply(
    base: js.Any,
    options: ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typingsJapgolly.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server_ = js.native
  def apply(
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typingsJapgolly.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server_ = js.native
  def apply(
    options: ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typingsJapgolly.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server_ = js.native
}

