package typingsJapgolly.jsonRpcWs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-rpc-ws", "createServer")
@js.native
object createServer extends js.Object {
  def apply[TConnection /* <: Connection */](): Server[TConnection] = js.native
}

