package typingsJapgolly.requestPromise.errorsMod

import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.requestPromise.mod.Options
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
      /* response */ IncomingMessage, 
      StatusCodeError
    ] {
  def apply(statusCode: Double, body: js.Any, options: Options, response: IncomingMessage): StatusCodeError = js.native
}

