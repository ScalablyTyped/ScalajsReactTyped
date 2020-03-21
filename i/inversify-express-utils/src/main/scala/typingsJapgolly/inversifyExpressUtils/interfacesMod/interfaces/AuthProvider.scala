package typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthProvider extends js.Object {
  def getUser(req: Request_[ParamsDictionary], res: Response_, next: NextFunction): js.Promise[Principal]
}

object AuthProvider {
  @scala.inline
  def apply(
    getUser: (Request_[ParamsDictionary], Response_, NextFunction) => CallbackTo[js.Promise[Principal]]
  ): AuthProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getUser")(js.Any.fromFunction3((t0: typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: typingsJapgolly.express.mod.Response_, t2: typingsJapgolly.express.mod.NextFunction) => getUser(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AuthProvider]
  }
}

