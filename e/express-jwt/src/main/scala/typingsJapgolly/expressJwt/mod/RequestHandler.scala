package typingsJapgolly.expressJwt.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressJwt.FnCall
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHandler
  extends typingsJapgolly.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, js.Any, js.Any] {
  @JSName("unless")
  var unless_Original: FnCall = js.native
  def unless(options: js.Function1[/* req */ Request_[ParamsDictionary], Boolean]): typingsJapgolly.express.mod.RequestHandler[ParamsDictionary] = js.native
  def unless(options: typingsJapgolly.expressUnless.mod.Options): typingsJapgolly.express.mod.RequestHandler[ParamsDictionary] = js.native
}

