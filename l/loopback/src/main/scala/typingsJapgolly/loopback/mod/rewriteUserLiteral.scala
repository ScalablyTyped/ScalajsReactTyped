package typingsJapgolly.loopback.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loopback", "rewriteUserLiteral")
@js.native
object rewriteUserLiteral extends js.Object {
  /**
    * Rewrite the url to replace current user literal with the logged in user id
    */
  def apply(): RequestHandler[ParamsDictionary] = js.native
}

