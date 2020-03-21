package typingsJapgolly.jose.mod.JWK

import typingsJapgolly.jose.joseBooleans.`false`
import typingsJapgolly.jose.joseStrings.OKP
import typingsJapgolly.jose.mod.JWKOKPKey
import typingsJapgolly.jose.mod.OKPCurve
import typingsJapgolly.jose.mod.asymmetricKeyObjectTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OKPKey extends Key {
  var crv: OKPCurve = js.native
  var d: js.UndefOr[String] = js.native
  @JSName("kty")
  var kty_OKPKey: OKP = js.native
  @JSName("secret")
  var secret_OKPKey: `false` = js.native
  @JSName("type")
  var type_OKPKey: asymmetricKeyObjectTypes = js.native
  var x: String = js.native
  def toJWK(): JWKOKPKey = js.native
  def toJWK(`private`: Boolean): JWKOKPKey = js.native
}

