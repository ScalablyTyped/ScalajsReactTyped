package typingsJapgolly.expressMung.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", "headers")
@js.native
object headers extends js.Object {
  def apply(fn: TransformHeader): RequestHandler[ParamsDictionary] = js.native
}

