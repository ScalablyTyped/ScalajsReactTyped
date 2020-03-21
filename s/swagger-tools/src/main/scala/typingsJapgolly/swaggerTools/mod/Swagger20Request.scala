package typingsJapgolly.swaggerTools.mod

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.swaggerTools.AnonApiPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Swagger20Request[P /* <: SwaggerRequestParameters */] extends IncomingMessage {
  var swagger: AnonApiPath[P] = js.native
}

