package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "pbkdf2")
@js.native
object pbkdf2 extends js.Object {
  def apply(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: Double,
    keylen: Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ Error | Null, /* derivedKey */ Buffer, _]
  ): Unit = js.native
}

