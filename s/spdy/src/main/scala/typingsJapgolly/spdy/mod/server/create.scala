package typingsJapgolly.spdy.mod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spdy", "server.create")
@js.native
object create extends js.Object {
  def apply(
    base: js.Any,
    options: typingsJapgolly.node.httpsMod.ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ ServerResponse | typingsJapgolly.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server = js.native
  def apply(
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ ServerResponse | typingsJapgolly.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server = js.native
  def apply(
    options: typingsJapgolly.node.httpsMod.ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typingsJapgolly.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server = js.native
}

