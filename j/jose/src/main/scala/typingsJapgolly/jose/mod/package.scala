package typingsJapgolly.jose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jose.mod.ProduceKeyInput
    - typingsJapgolly.jose.mod.JWKS.KeyStore
  */
  type ConsumeKeyInput = typingsJapgolly.jose.mod._ConsumeKeyInput | typingsJapgolly.node.cryptoMod.KeyObject | typingsJapgolly.jose.mod.KeyInput
  type ConsumeKeyInputWithNone = typingsJapgolly.jose.mod.ConsumeKeyInput | typingsJapgolly.jose.mod.NoneKey
  type KeyInput = typingsJapgolly.node.cryptoMod.PrivateKeyInput | typingsJapgolly.node.cryptoMod.PublicKeyInput | java.lang.String | typingsJapgolly.node.Buffer
  type NoneKey = typingsJapgolly.jose.mod.JWK.NoneKey
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jose.mod.JWK.Key
    - typingsJapgolly.node.cryptoMod.KeyObject
    - typingsJapgolly.jose.mod.KeyInput
    - typingsJapgolly.jose.mod.JWKOctKey
    - typingsJapgolly.jose.mod.JWKRSAKey
    - typingsJapgolly.jose.mod.JWKECKey
    - typingsJapgolly.jose.mod.JWKOKPKey
  */
  type ProduceKeyInput = typingsJapgolly.jose.mod._ProduceKeyInput | typingsJapgolly.node.cryptoMod.KeyObject | typingsJapgolly.jose.mod.KeyInput
  type ProduceKeyInputWithNone = typingsJapgolly.jose.mod.ProduceKeyInput | typingsJapgolly.jose.mod.NoneKey
}
