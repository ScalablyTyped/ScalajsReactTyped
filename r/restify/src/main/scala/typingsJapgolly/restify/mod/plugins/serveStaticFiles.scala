package typingsJapgolly.restify.mod.plugins

import typingsJapgolly.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.serveStaticFiles")
@js.native
object serveStaticFiles extends js.Object {
  /**
    * Used to serve static files from a given directory
    */
  def apply(dir: String): RequestHandler = js.native
  def apply(dir: String, options: ServeStaticFiles_): RequestHandler = js.native
}

