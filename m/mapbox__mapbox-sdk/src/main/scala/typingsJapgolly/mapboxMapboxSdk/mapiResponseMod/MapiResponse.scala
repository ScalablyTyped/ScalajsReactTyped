package typingsJapgolly.mapboxMapboxSdk.mapiResponseMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapiResponse extends js.Object {
  /**
    * The response body, parsed as JSON.
    */
  var body: js.Any
  /**
    * The parsed response headers.
    */
  var headers: js.Any
  /**
    * The parsed response links
    */
  var links: js.Any
  /**
    * The raw response body.
    */
  var rawBody: String
  /**
    * The response's originating MapiRequest.
    */
  var request: MapiRequest
  /**
    * The response's status code.
    */
  var statusCode: Double
  def hasNextPage(): Boolean
  def nextPage(): MapiRequest
}

object MapiResponse {
  @scala.inline
  def apply(
    body: js.Any,
    hasNextPage: CallbackTo[Boolean],
    headers: js.Any,
    links: js.Any,
    nextPage: CallbackTo[MapiRequest],
    rawBody: String,
    request: MapiRequest,
    statusCode: Double
  ): MapiResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], rawBody = rawBody.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.updateDynamic("hasNextPage")(hasNextPage.toJsFn)
    __obj.updateDynamic("nextPage")(nextPage.toJsFn)
    __obj.asInstanceOf[MapiResponse]
  }
}

