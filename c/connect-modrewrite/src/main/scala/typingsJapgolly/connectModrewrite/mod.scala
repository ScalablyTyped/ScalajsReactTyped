package typingsJapgolly.connectModrewrite

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-modrewrite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(rewrites: js.Array[String]): RequestHandler[ParamsDictionary] = js.native
}

