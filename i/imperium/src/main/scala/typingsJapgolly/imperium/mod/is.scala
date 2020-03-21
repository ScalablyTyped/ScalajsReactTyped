package typingsJapgolly.imperium.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", "is")
@js.native
object is extends js.Object {
  def apply(roleNames: String): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  def apply(roleNames: js.Array[String]): js.Promise[RequestHandler[ParamsDictionary]] = js.native
}

