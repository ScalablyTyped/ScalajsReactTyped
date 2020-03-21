package typingsJapgolly.apolloServerCore

import typingsJapgolly.graphqlUpload.mod.GraphQLOperation
import typingsJapgolly.graphqlUpload.mod.UploadOptions
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(request: IncomingMessage, response: ServerResponse): js.Promise[GraphQLOperation | js.Array[GraphQLOperation]] = js.native
  def apply(request: IncomingMessage, response: ServerResponse, uploadOptions: UploadOptions): js.Promise[GraphQLOperation | js.Array[GraphQLOperation]] = js.native
}

