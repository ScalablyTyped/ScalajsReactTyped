package typingsJapgolly.loopback.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loopback", "urlNotFound")
@js.native
object urlNotFound extends js.Object {
  /**
    * Convert any request not handled so far to a 404 error
    * to be handled by error-handling middleware.
    * @header loopback.urlNotFound(
    */
  def apply(): RequestHandler[ParamsDictionary] = js.native
}

