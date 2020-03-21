package typingsJapgolly.restify.mod.plugins

import typingsJapgolly.restify.AnonMaxBodySize
import typingsJapgolly.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.bodyReader")
@js.native
object bodyReader extends js.Object {
  /**
    * Reads the body of the request.
    */
  def apply(): RequestHandler = js.native
  def apply(options: AnonMaxBodySize): RequestHandler = js.native
}

