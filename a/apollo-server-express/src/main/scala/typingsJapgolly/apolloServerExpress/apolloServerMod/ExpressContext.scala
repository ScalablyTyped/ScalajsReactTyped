package typingsJapgolly.apolloServerExpress.apolloServerMod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.subscriptionsTransportWs.serverMod.ExecutionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressContext extends js.Object {
  var connection: js.UndefOr[ExecutionParams[_]] = js.undefined
  var req: Request_[ParamsDictionary]
  var res: Response_
}

object ExpressContext {
  @scala.inline
  def apply(req: Request_[ParamsDictionary], res: Response_, connection: ExecutionParams[_] = null): ExpressContext = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressContext]
  }
}

