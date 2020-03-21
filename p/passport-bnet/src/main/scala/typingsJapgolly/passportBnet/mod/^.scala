package typingsJapgolly.passportBnet.mod

import typingsJapgolly.passportOauth2.mod.OAuth2Strategy
import typingsJapgolly.passportOauth2.mod.VerifyFunction
import typingsJapgolly.passportOauth2.mod.VerifyFunctionWithRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-bnet", JSImport.Namespace)
@js.native
class ^ protected () extends OAuth2Strategy {
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
}

