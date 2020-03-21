package typingsJapgolly.stellarBase.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.stellarBase.mod.MemoType.Hash
import typingsJapgolly.stellarBase.mod.MemoType.ID
import typingsJapgolly.stellarBase.mod.MemoType.None
import typingsJapgolly.stellarBase.mod.MemoType.Return
import typingsJapgolly.stellarBase.mod.MemoType.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Memo")
@js.native
class Memo[T /* <: MemoType */] protected () extends js.Object {
  def this(`type`: None) = this()
  def this(`type`: T, value: MemoValue) = this()
  def this(`type`: Hash, value: String) = this()
  def this(`type`: Hash, value: Buffer) = this()
  def this(`type`: ID, value: String) = this()
  def this(`type`: Return, value: String) = this()
  def this(`type`: Return, value: Buffer) = this()
  def this(`type`: Text, value: String) = this()
  var `type`: T = js.native
  var value: MemoValue | Buffer | String | Null = js.native
  def toXDRObject(): typingsJapgolly.stellarBase.mod.xdr.Memo = js.native
}

/* static members */
@JSImport("stellar-base", "Memo")
@js.native
object Memo extends js.Object {
  def fromXDRObject(memo: typingsJapgolly.stellarBase.mod.xdr.Memo): Memo[MemoType] = js.native
  def hash(hash: String): Memo[Hash] = js.native
  def id(id: String): Memo[ID] = js.native
  def none(): Memo[None] = js.native
  def `return`(hash: String): Memo[Return] = js.native
  def text(text: String): Memo[Text] = js.native
}

