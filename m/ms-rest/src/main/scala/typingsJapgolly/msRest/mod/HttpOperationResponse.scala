package typingsJapgolly.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOperationResponse[T] extends js.Object {
  var body: T
  var request: WebResource
  var response: typingsJapgolly.node.httpMod.IncomingMessage
}

object HttpOperationResponse {
  @scala.inline
  def apply[T](body: T, request: WebResource, response: typingsJapgolly.node.httpMod.IncomingMessage): HttpOperationResponse[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpOperationResponse[T]]
  }
}

