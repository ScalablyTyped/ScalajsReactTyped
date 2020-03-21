package typingsJapgolly.mangopay2NodejsSdk.mod.transaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGULAR
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT
*/
trait TransactionNature extends js.Object

object TransactionNature {
  @scala.inline
  def REFUND: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND = this.cast("REFUND")
  @scala.inline
  def REGULAR: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGULAR = this.cast("REGULAR")
  @scala.inline
  def REPUDIATION: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION = this.cast("REPUDIATION")
  @scala.inline
  def SETTLEMENT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT = this.cast("SETTLEMENT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

