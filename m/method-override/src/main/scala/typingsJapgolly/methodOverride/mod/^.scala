package typingsJapgolly.methodOverride.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("method-override", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(getter: String): RequestHandler[ParamsDictionary] = js.native
  def apply(getter: String, options: MethodOverrideOptions): RequestHandler[ParamsDictionary] = js.native
  def apply(getter: js.Function2[/* req */ Request_[ParamsDictionary], /* res */ Response_, String]): RequestHandler[ParamsDictionary] = js.native
  def apply(
    getter: js.Function2[/* req */ Request_[ParamsDictionary], /* res */ Response_, String],
    options: MethodOverrideOptions
  ): RequestHandler[ParamsDictionary] = js.native
}

