package typingsJapgolly.serveFavicon

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serve-favicon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Node.js middleware for serving a favicon.
    */
  def apply(path: String): RequestHandler[ParamsDictionary] = js.native
  def apply(path: String, options: AnonMaxAge): RequestHandler[ParamsDictionary] = js.native
  def apply(path: Buffer): RequestHandler[ParamsDictionary] = js.native
  def apply(path: Buffer, options: AnonMaxAge): RequestHandler[ParamsDictionary] = js.native
}

