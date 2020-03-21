package typingsJapgolly.otplib

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Authenticator")
@js.native
class Authenticator () extends TOTP {
  var Authenticator: Instantiable0[typingsJapgolly.otplib.Authenticator] = js.native
  def decode(encodedKey: String): String = js.native
  def encode(secret: String): String = js.native
  def generateSecret(): String = js.native
  def generateSecret(len: Double): String = js.native
  def keyuri(user: String, service: String, secret: String): String = js.native
}

