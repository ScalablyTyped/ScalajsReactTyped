package typingsJapgolly.passportMicrosoft.mod

import typingsJapgolly.passportOauth2.mod.OAuth2Strategy
import typingsJapgolly.passportOauth2.mod.VerifyFunction
import typingsJapgolly.passportOauth2.mod.VerifyFunctionWithRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-microsoft", "Strategy")
@js.native
class Strategy protected () extends OAuth2Strategy {
  def this(options: MicrosoftStrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: MicrosoftStrategyOptions, verify: VerifyFunction) = this()
}

