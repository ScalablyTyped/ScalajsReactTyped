package typingsJapgolly.feathersjsExpress

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.NextFunction
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  @JSName("formatter")
  var formatter_Original: RequestHandler[ParamsDictionary] = js.native
  def apply(): js.Function0[Unit] = js.native
  def apply(handler: RequestHandler[ParamsDictionary]): js.Function0[Unit] = js.native
  def formatter(req: Request[ParamsDictionary, _, _], res: Response[_], next: NextFunction): js.Any = js.native
}

