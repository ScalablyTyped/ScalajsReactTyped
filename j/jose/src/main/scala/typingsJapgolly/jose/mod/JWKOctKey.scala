package typingsJapgolly.jose.mod

import typingsJapgolly.jose.joseStrings.oct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWKOctKey
  extends _ProduceKeyInput
     with BasicParameters
     with JSONWebKey {
  var k: js.UndefOr[String] = js.undefined
  // no x5c
  var kty: oct
}

object JWKOctKey {
  @scala.inline
  def apply(
    kty: oct,
    alg: String = null,
    k: String = null,
    key_ops: js.Array[keyOperation] = null,
    kid: String = null,
    use: use = null
  ): JWKOctKey = {
    val __obj = js.Dynamic.literal(kty = kty.asInstanceOf[js.Any])
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (k != null) __obj.updateDynamic("k")(k.asInstanceOf[js.Any])
    if (key_ops != null) __obj.updateDynamic("key_ops")(key_ops.asInstanceOf[js.Any])
    if (kid != null) __obj.updateDynamic("kid")(kid.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKOctKey]
  }
}

