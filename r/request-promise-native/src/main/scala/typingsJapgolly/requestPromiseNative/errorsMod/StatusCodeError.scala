package typingsJapgolly.requestPromiseNative.errorsMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.requestPromiseNative.mod.FullResponse
import typingsJapgolly.requestPromiseNative.mod.Options
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusCodeError extends Error {
  var error: js.Any
  var options: Options
  var response: FullResponse
  var statusCode: Double
}

@JSImport("request-promise-native/errors", "StatusCodeError")
@js.native
object StatusCodeError extends TopLevel[StatusCodeErrorConstructor]

