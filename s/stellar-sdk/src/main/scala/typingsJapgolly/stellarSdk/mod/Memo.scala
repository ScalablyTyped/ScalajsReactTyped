package typingsJapgolly.stellarSdk.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.stellarBase.mod.MemoType
import typingsJapgolly.stellarBase.mod.MemoType.Hash
import typingsJapgolly.stellarBase.mod.MemoType.ID
import typingsJapgolly.stellarBase.mod.MemoType.None
import typingsJapgolly.stellarBase.mod.MemoType.Return
import typingsJapgolly.stellarBase.mod.MemoType.Text
import typingsJapgolly.stellarBase.mod.MemoValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Memo")
@js.native
class Memo[T /* <: MemoType */] protected ()
  extends typingsJapgolly.stellarBase.mod.Memo[T] {
  def this(`type`: None) = this()
  def this(`type`: T, value: MemoValue) = this()
  def this(`type`: Hash, value: String) = this()
  def this(`type`: Hash, value: Buffer) = this()
  def this(`type`: ID, value: String) = this()
  def this(`type`: Return, value: String) = this()
  def this(`type`: Return, value: Buffer) = this()
  def this(`type`: Text, value: String) = this()
}

/* static members */
@JSImport("stellar-sdk", "Memo")
@js.native
object Memo extends js.Object {
  def fromXDRObject(memo: typingsJapgolly.stellarBase.mod.xdr.Memo): typingsJapgolly.stellarBase.mod.Memo[MemoType] = js.native
  def hash(hash: String): typingsJapgolly.stellarBase.mod.Memo[Hash] = js.native
  def id(id: String): typingsJapgolly.stellarBase.mod.Memo[ID] = js.native
  def none(): typingsJapgolly.stellarBase.mod.Memo[None] = js.native
  def `return`(hash: String): typingsJapgolly.stellarBase.mod.Memo[Return] = js.native
  def text(text: String): typingsJapgolly.stellarBase.mod.Memo[Text] = js.native
}

