package typingsJapgolly.passportFacebook.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-facebook", "Strategy")
@js.native
class Strategy protected ()
  extends typingsJapgolly.passport.mod.Strategy {
  def this(options: StrategyOptionWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOption, verify: VerifyFunction) = this()
  def authenticate(req: Request_[ParamsDictionary], options: js.Object): Unit = js.native
}

