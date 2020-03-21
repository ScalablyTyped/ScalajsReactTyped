package typingsJapgolly.typedRestClient.interfacesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHttpClientResponse extends js.Object {
  var message: IncomingMessage
  def readBody(): js.Promise[String]
}

object IHttpClientResponse {
  @scala.inline
  def apply(message: IncomingMessage, readBody: CallbackTo[js.Promise[String]]): IHttpClientResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("readBody")(readBody.toJsFn)
    __obj.asInstanceOf[IHttpClientResponse]
  }
}

