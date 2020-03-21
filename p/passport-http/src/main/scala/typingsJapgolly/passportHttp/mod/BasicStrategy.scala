package typingsJapgolly.passportHttp.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.passport.mod.Strategy
import typingsJapgolly.passportHttp.passportHttpBooleans.`false`
import typingsJapgolly.passportHttp.passportHttpBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-http", "BasicStrategy")
@js.native
class BasicStrategy protected () extends Strategy {
  def this(verify: BasicVerifyFunction) = this()
  def this(options: BasicStrategyOptions[`false`], verify: BasicVerifyFunction) = this()
  def this(options: BasicStrategyOptions[`true`], verify: BasicVerifyFunctionWithRequest) = this()
  @JSName("name")
  var name_BasicStrategy: String = js.native
  def authenticate(req: Request_[ParamsDictionary], options: js.Object): Unit = js.native
}

