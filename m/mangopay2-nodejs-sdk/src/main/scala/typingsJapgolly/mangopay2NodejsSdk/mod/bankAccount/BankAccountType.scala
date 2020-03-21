package typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
*/
trait BankAccountType extends js.Object

object BankAccountType {
  @scala.inline
  def CA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA = this.cast("CA")
  @scala.inline
  def GB: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB = this.cast("GB")
  @scala.inline
  def IBAN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN = this.cast("IBAN")
  @scala.inline
  def OTHER: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = this.cast("OTHER")
  @scala.inline
  def US: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US = this.cast("US")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

