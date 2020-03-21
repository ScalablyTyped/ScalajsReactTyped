package typingsJapgolly.passportGithub2.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.passport.mod.AuthenticateOptions
import typingsJapgolly.passportOauth2.mod.OAuth2Strategy
import typingsJapgolly.passportOauth2.mod.VerifyFunction
import typingsJapgolly.passportOauth2.mod.VerifyFunctionWithRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-github2", "Strategy")
@js.native
class Strategy protected () extends OAuth2Strategy {
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
  def authenticate(req: Request_[ParamsDictionary], options: AuthenticateOptions): Unit = js.native
}

