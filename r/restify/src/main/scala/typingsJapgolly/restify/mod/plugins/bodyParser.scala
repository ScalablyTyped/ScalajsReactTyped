package typingsJapgolly.restify.mod.plugins

import typingsJapgolly.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.bodyParser")
@js.native
object bodyParser extends js.Object {
  /**
    * Parses POST bodies to req.body. automatically uses one of the following parsers based on content type.
    */
  def apply(): js.Array[RequestHandler] = js.native
  def apply(options: BodyParserOptions): js.Array[RequestHandler] = js.native
}

