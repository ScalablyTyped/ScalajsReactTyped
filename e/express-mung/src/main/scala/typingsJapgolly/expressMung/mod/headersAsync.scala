package typingsJapgolly.expressMung.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", "headersAsync")
@js.native
object headersAsync extends js.Object {
  def apply(fn: TransformHeaderAsync): RequestHandler[ParamsDictionary] = js.native
}

