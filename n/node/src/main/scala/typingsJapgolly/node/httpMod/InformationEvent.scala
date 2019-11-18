package typingsJapgolly.node.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InformationEvent extends js.Object {
  var headers: IncomingHttpHeaders
  var httpVersion: java.lang.String
  var httpVersionMajor: Double
  var httpVersionMinor: Double
  var rawHeaders: js.Array[java.lang.String]
  var statusCode: Double
  var statusMessage: java.lang.String
}

object InformationEvent {
  @scala.inline
  def apply(
    headers: IncomingHttpHeaders,
    httpVersion: java.lang.String,
    httpVersionMajor: Double,
    httpVersionMinor: Double,
    rawHeaders: js.Array[java.lang.String],
    statusCode: Double,
    statusMessage: java.lang.String
  ): InformationEvent = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], httpVersionMajor = httpVersionMajor.asInstanceOf[js.Any], httpVersionMinor = httpVersionMinor.asInstanceOf[js.Any], rawHeaders = rawHeaders.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InformationEvent]
  }
}

