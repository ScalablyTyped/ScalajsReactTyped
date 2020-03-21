package typingsJapgolly.requestPromiseNative.errorsMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.requestPromiseNative.mod.FullResponse
import typingsJapgolly.requestPromiseNative.mod.Options
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestError extends Error {
  var cause: js.Any
  var error: js.Any
  var options: Options
  var response: FullResponse
}

@JSImport("request-promise-native/errors", "RequestError")
@js.native
object RequestError extends TopLevel[RequestErrorConstructor]

