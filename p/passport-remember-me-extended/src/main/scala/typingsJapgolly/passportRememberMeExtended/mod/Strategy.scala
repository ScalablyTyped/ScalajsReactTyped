package typingsJapgolly.passportRememberMeExtended.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.passport.mod.AuthenticateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-remember-me-extended", "Strategy")
@js.native
class Strategy protected ()
  extends typingsJapgolly.passport.mod.Strategy {
  def this(verify: VerifyFunction, issue: IssueFunction) = this()
  def this(
    options: StrategyOptionWithRequest,
    verify: VerifyFunctionWithRequest,
    issue: IssueFunctionWithRequest
  ) = this()
  def this(options: StrategyOption, verify: VerifyFunction, issue: IssueFunction) = this()
  def authenticate(req: Request_[ParamsDictionary], options: AuthenticateOptions): Unit = js.native
}

