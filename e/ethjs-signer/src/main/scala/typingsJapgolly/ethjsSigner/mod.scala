package typingsJapgolly.ethjsSigner

import typingsJapgolly.ethjsSigner.ethjsSignerBooleans.`false`
import typingsJapgolly.ethjsSigner.ethjsSignerBooleans.`true`
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethjs-signer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def recover(rawTx: String, v: Double, r: Buffer, s: Buffer): Buffer = js.native
  def recover(rawTx: Buffer, v: Double, r: Buffer, s: Buffer): Buffer = js.native
  def sign(transaction: js.Object, privateKey: String): String = js.native
  @JSName("sign")
  def sign_false(transaction: js.Object, privateKey: String, toObject: `false`): String = js.native
  @JSName("sign")
  def sign_true(transaction: js.Object, privateKey: String, toObject: `true`): js.Array[_] = js.native
}

