package typingsJapgolly.jose.mod.JWK

import typingsJapgolly.jose.joseBooleans.`false`
import typingsJapgolly.jose.joseStrings.EC
import typingsJapgolly.jose.mod.ECCurve
import typingsJapgolly.jose.mod.JWKECKey
import typingsJapgolly.jose.mod.asymmetricKeyObjectTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECKey extends Key {
  var crv: ECCurve = js.native
  var d: js.UndefOr[String] = js.native
  @JSName("kty")
  var kty_ECKey: EC = js.native
  @JSName("secret")
  var secret_ECKey: `false` = js.native
  @JSName("type")
  var type_ECKey: asymmetricKeyObjectTypes = js.native
  var x: String = js.native
  var y: String = js.native
  def toJWK(): JWKECKey = js.native
  def toJWK(`private`: Boolean): JWKECKey = js.native
}

