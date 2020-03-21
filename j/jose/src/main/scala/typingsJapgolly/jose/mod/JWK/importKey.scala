package typingsJapgolly.jose.mod.JWK

import typingsJapgolly.jose.mod.JWKECKey
import typingsJapgolly.jose.mod.JWKOKPKey
import typingsJapgolly.jose.mod.JWKOctKey
import typingsJapgolly.jose.mod.JWKRSAKey
import typingsJapgolly.jose.mod.KeyInput
import typingsJapgolly.jose.mod.KeyParameters
import typingsJapgolly.node.cryptoMod.KeyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.importKey")
@js.native
object importKey extends js.Object {
  def apply(jwk: JWKECKey): ECKey = js.native
  def apply(jwk: JWKOKPKey): OKPKey = js.native
  def apply(jwk: JWKOctKey): OctKey = js.native
  def apply(jwk: JWKRSAKey): RSAKey = js.native
  def apply(key: KeyInput): RSAKey | ECKey | OKPKey | OctKey = js.native
  def apply(key: KeyInput, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
  /*
    * @deprecated in favor of asKey
    */
  def apply(key: KeyObject): RSAKey | ECKey | OKPKey | OctKey = js.native
  def apply(key: KeyObject, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
}

