package typingsJapgolly.apolloServerCore

import typingsJapgolly.apolloServerEnv.mod.Request
import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/nodeHttpToRequest", JSImport.Namespace)
@js.native
object nodeHttpToRequestMod extends js.Object {
  def convertNodeHttpToRequest(req: IncomingMessage): Request = js.native
}

