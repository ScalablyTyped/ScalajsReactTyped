package typingsJapgolly.passportSaml.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-saml", "Strategy")
@js.native
class Strategy protected ()
  extends typingsJapgolly.passport.mod.Strategy {
  def this(config: SamlConfig, verify: VerifyWithRequest) = this()
  def this(config: SamlConfig, verify: VerifyWithoutRequest) = this()
  def authenticate(req: Request_[ParamsDictionary], options: AuthenticateOptions): Unit = js.native
  def authenticate(req: Request_[ParamsDictionary], options: AuthorizeOptions): Unit = js.native
  def generateServiceProviderMetadata(): String = js.native
  def generateServiceProviderMetadata(decryptionCert: String): String = js.native
  def generateServiceProviderMetadata(decryptionCert: String, signingCert: String): String = js.native
  def generateServiceProviderMetadata(decryptionCert: Null, signingCert: String): String = js.native
  def logout(
    req: Request_[ParamsDictionary],
    callback: js.Function2[/* err */ js.Error | Null, /* url */ js.UndefOr[String], Unit]
  ): Unit = js.native
}

