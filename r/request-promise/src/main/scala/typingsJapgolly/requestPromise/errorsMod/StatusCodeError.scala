package typingsJapgolly.requestPromise.errorsMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.requestPromise.mod.Options
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusCodeError extends Error {
  var error: js.Any
  var options: Options
  var response: IncomingMessage
  var statusCode: Double
}

@JSImport("request-promise/errors", "StatusCodeError")
@js.native
object StatusCodeError extends TopLevel[StatusCodeErrorConstructor]

