package typingsJapgolly.pkijs.mod

import typingsJapgolly.pkijs.AnonCounter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "kdfWithCounter")
@js.native
object kdfWithCounter extends js.Object {
  /**
    * ANS X9.63 Key Derivation Function having a "Counter" as a parameter
    * 
    * @param {string} hashFunction Used hash function
    * @param {ArrayBuffer} Zbuffer ArrayBuffer containing ECDH shared secret to derive from
    * @param {number} Counter
    * @param {ArrayBuffer} SharedInfo Usually DER encoded "ECC_CMS_SharedInfo" structure
    */
  def apply(
    hashFunction: String,
    Zbuffer: scala.scalajs.js.typedarray.ArrayBuffer,
    Counter: Double,
    SharedInfo: scala.scalajs.js.typedarray.ArrayBuffer
  ): js.Thenable[AnonCounter] = js.native
}

