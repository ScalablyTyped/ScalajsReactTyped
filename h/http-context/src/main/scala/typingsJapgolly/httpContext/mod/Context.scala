package typingsJapgolly.httpContext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context
  extends RequestDelegate
     with ResponseDelegate {
  var request: Request = js.native
  var response: Response = js.native
}

