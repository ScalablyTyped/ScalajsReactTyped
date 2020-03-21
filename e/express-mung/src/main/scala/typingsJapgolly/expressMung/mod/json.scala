package typingsJapgolly.expressMung.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", "json")
@js.native
object json extends js.Object {
  def apply(fn: Transform): RequestHandler[ParamsDictionary] = js.native
  def apply(fn: Transform, options: Options): RequestHandler[ParamsDictionary] = js.native
}

