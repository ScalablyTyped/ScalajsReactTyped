package typingsJapgolly.nodemailer.smtpConnectionMod

import typingsJapgolly.nodemailer.nodemailerBooleans.`false`
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAuthenticationContext extends js.Object {
  var auth: AuthenticationCredentials = js.native
  var authMethod: String = js.native
  var authMethods: js.Array[String] = js.native
  var extensions: js.Array[String] = js.native
  var maxAllowedSize: Double | `false` = js.native
  def reject(err: String): js.Any = js.native
  def reject(err: Error): js.Any = js.native
  def resolve(): js.Any = js.native
  def sendCommand(cmd: String): js.Promise[CustomAuthenticationResponse] = js.native
  def sendCommand(
    cmd: String,
    done: js.Function2[/* err */ js.Error | Null, /* data */ CustomAuthenticationResponse, Unit]
  ): Unit = js.native
}

