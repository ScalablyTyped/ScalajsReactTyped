package typingsJapgolly.urllib.mod

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpClientResponse[T] extends js.Object {
  var data: T
  var headers: OutgoingHttpHeaders
  var res: IncomingMessage
  var status: Double
}

object HttpClientResponse {
  @scala.inline
  def apply[T](data: T, headers: OutgoingHttpHeaders, res: IncomingMessage, status: Double): HttpClientResponse[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpClientResponse[T]]
  }
}

