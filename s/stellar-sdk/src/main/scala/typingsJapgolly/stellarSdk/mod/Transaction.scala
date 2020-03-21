package typingsJapgolly.stellarSdk.mod

import typingsJapgolly.stellarBase.mod.MemoType
import typingsJapgolly.stellarBase.mod.xdr.TransactionEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Transaction")
@js.native
class Transaction[TMemo /* <: typingsJapgolly.stellarBase.mod.Memo[MemoType] */, TOps /* <: js.Array[typingsJapgolly.stellarBase.mod.Operation] */] protected ()
  extends typingsJapgolly.stellarBase.mod.Transaction[TMemo, TOps] {
  def this(envelope: String) = this()
  def this(envelope: TransactionEnvelope) = this()
  def this(envelope: String, networkPassphrase: String) = this()
  def this(envelope: TransactionEnvelope, networkPassphrase: String) = this()
}

