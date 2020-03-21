package typingsJapgolly.requestPromiseNative.errorsMod

import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.requestPromiseNative.mod.FullResponse
import typingsJapgolly.requestPromiseNative.mod.Options
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusCodeErrorConstructor
  extends Error
     with Instantiable4[
      /* statusCode */ Double, 
      /* body */ js.Any, 
      /* options */ Options, 
      /* response */ FullResponse, 
      StatusCodeError
    ] {
  def apply(statusCode: Double, body: js.Any, options: Options, response: FullResponse): StatusCodeError = js.native
}

