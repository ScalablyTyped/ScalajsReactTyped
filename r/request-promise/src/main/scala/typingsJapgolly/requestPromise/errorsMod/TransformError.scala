package typingsJapgolly.requestPromise.errorsMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.requestPromise.mod.Options
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformError extends Error {
  var cause: js.Any
  var error: js.Any
  var options: Options
  var response: IncomingMessage
}

@JSImport("request-promise/errors", "TransformError")
@js.native
object TransformError extends TopLevel[TransformErrorConstructor]

