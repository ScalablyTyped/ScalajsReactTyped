package typingsJapgolly.requestPromiseNative.errorsMod

import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.requestPromiseNative.mod.FullResponse
import typingsJapgolly.requestPromiseNative.mod.Options
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformErrorConstructor
  extends Error
     with Instantiable3[/* cause */ js.Any, /* options */ Options, /* response */ FullResponse, TransformError] {
  def apply(cause: js.Any, options: Options, response: FullResponse): TransformError = js.native
}

