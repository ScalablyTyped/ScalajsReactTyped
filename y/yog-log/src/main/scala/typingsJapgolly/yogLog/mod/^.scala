package typingsJapgolly.yogLog.mod

import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yog-log", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Function3[/* req */ Request_[ParamsDictionary], /* resp */ Response_, /* next */ NextFunction, _] = js.native
  def apply(config: LogConfig): js.Function3[/* req */ Request_[ParamsDictionary], /* resp */ Response_, /* next */ NextFunction, _] = js.native
}

