package typingsJapgolly.mangopay2NodejsSdk.mod.transaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT
*/
trait TransactionType extends js.Object

object TransactionType {
  @scala.inline
  def PAYIN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN = this.cast("PAYIN")
  @scala.inline
  def PAYOUT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT = this.cast("PAYOUT")
  @scala.inline
  def TRANSFER: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER = this.cast("TRANSFER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

