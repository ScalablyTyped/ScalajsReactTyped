package typingsJapgolly.contractProxyKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CPK extends js.Object {
  def address(): String = js.native
  def execTransactions(transactions: js.Array[Transaction]): js.Promise[TransactionResult] = js.native
  def execTransactions(transactions: js.Array[Transaction], options: TransactionOptions): js.Promise[TransactionResult] = js.native
  def getOwnerAccount(): js.Promise[String] = js.native
}

