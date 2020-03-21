package typingsJapgolly.mangopay2NodejsSdk.mod.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRANCHISE
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
*/
trait BusinessType extends js.Object

object BusinessType {
  @scala.inline
  def CROWDFUNDING: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING = this.cast("CROWDFUNDING")
  @scala.inline
  def FRANCHISE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRANCHISE = this.cast("FRANCHISE")
  @scala.inline
  def MARKETPLACE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE = this.cast("MARKETPLACE")
  @scala.inline
  def OTHER: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = this.cast("OTHER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

