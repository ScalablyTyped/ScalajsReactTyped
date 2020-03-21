package typingsJapgolly.expressMung.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", "write")
@js.native
object write extends js.Object {
  def apply(fn: TransformChunk): RequestHandler[ParamsDictionary] = js.native
  def apply(fn: TransformChunk, options: Options): RequestHandler[ParamsDictionary] = js.native
}

