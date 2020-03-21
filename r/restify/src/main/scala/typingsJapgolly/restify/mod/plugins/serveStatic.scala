package typingsJapgolly.restify.mod.plugins

import typingsJapgolly.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.serveStatic")
@js.native
object serveStatic extends js.Object {
  /**
    * Used to serve static files
    */
  def apply(): RequestHandler = js.native
  def apply(options: ServeStatic_): RequestHandler = js.native
}

