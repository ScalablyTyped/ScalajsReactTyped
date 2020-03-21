package typingsJapgolly.typedRestClient.httpClientMod

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.typedRestClient.interfacesMod.IHttpClientResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/HttpClient", "HttpClientResponse")
@js.native
class HttpClientResponse protected () extends IHttpClientResponse {
  def this(message: IncomingMessage) = this()
  /* CompleteClass */
  override var message: IncomingMessage = js.native
  /* CompleteClass */
  override def readBody(): js.Promise[String] = js.native
}

