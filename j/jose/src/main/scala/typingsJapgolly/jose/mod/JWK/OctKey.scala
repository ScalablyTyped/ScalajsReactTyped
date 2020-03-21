package typingsJapgolly.jose.mod.JWK

import typingsJapgolly.jose.joseBooleans.`false`
import typingsJapgolly.jose.joseBooleans.`true`
import typingsJapgolly.jose.joseStrings.oct
import typingsJapgolly.jose.joseStrings.secret
import typingsJapgolly.jose.mod.JWKOctKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OctKey extends Key {
  var k: js.UndefOr[String] = js.native
  @JSName("kty")
  var kty_OctKey: oct = js.native
  @JSName("private")
  var private_OctKey: `false` = js.native
  @JSName("public")
  var public_OctKey: `false` = js.native
  @JSName("secret")
  var secret_OctKey: `true` = js.native
  @JSName("type")
  var type_OctKey: secret = js.native
  def toJWK(): JWKOctKey = js.native
  def toJWK(`private`: Boolean): JWKOctKey = js.native
}

