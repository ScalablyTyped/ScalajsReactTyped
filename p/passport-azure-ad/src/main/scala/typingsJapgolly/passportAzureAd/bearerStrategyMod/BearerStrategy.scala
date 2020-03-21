package typingsJapgolly.passportAzureAd.bearerStrategyMod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.passport.mod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-azure-ad/bearer-strategy", "BearerStrategy")
@js.native
class BearerStrategy protected () extends Strategy {
  def this(options: IBearerStrategyOptionWithRequest, verify: VerifyBearerFunctionWithReq) = this()
  def this(options: IBearerStrategyOption, verify: VerifyBearerFunction) = this()
  @JSName("name")
  var name_BearerStrategy: String = js.native
  def authenticate(req: Request_[ParamsDictionary], options: js.Object): Unit = js.native
}

