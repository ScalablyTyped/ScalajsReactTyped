package typingsJapgolly.sodiumNative.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_pwhash_async")
@js.native
object cryptoPwhashAsync extends js.Object {
  def apply(
    output: Buffer,
    password: Buffer,
    salt: Buffer,
    opslimit: Double,
    memlimit: Double,
    algorithm: Double,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
}

