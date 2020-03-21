package typingsJapgolly.passportClientCert.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-client-cert", "Strategy")
@js.native
class Strategy protected () extends js.Object {
  def this(verify: VerifyFunction) = this()
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
  var name: String = js.native
  def authenticate(req: Request_[ParamsDictionary]): Unit = js.native
  def authenticate(req: Request_[ParamsDictionary], options: js.Object): Unit = js.native
}

