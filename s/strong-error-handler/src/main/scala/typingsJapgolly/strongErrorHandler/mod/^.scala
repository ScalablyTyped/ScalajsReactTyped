package typingsJapgolly.strongErrorHandler.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.strongErrorHandler.mod.StrongErrorHandler.options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strong-error-handler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /***
    * Create a new strong error middleware funciton using the given options.
    * @param options
    */
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: options): RequestHandler[ParamsDictionary] = js.native
}

