package typingsJapgolly.connectSlashes.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-slashes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * @see https://github.com/avinoamr/connect-slashes#usage
    */
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(addTrailingSlashes: Boolean): RequestHandler[ParamsDictionary] = js.native
  def apply(addTrailingSlashes: Boolean, options: Options): RequestHandler[ParamsDictionary] = js.native
}

