package typingsJapgolly.mangopay2NodejsSdk.mod.wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DEFAULT
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT
*/
trait FundsType extends js.Object

object FundsType {
  @scala.inline
  def CREDIT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT = this.cast("CREDIT")
  @scala.inline
  def DEFAULT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DEFAULT = this.cast("DEFAULT")
  @scala.inline
  def FEES: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES = this.cast("FEES")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

