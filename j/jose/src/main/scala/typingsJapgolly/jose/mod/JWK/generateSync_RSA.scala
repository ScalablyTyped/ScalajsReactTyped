package typingsJapgolly.jose.mod.JWK

import typingsJapgolly.jose.joseStrings.RSA
import typingsJapgolly.jose.mod.BasicParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.generateSync")
@js.native
object generateSync_RSA extends js.Object {
  def apply(kty: RSA): RSAKey = js.native
  def apply(kty: RSA, bitlength: Double): RSAKey = js.native
  def apply(kty: RSA, bitlength: Double, parameters: BasicParameters): RSAKey = js.native
  def apply(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): RSAKey = js.native
}

