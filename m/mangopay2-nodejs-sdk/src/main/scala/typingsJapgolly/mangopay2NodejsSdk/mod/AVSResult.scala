package typingsJapgolly.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_CHECK
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_MATCH
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_MATCH_ONLY
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.POSTAL_CODE_MATCH_ONLY
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FULL_MATCH
*/
trait AVSResult extends js.Object

object AVSResult {
  @scala.inline
  def ADDRESS_MATCH_ONLY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_MATCH_ONLY = this.cast("ADDRESS_MATCH_ONLY")
  @scala.inline
  def FULL_MATCH: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FULL_MATCH = this.cast("FULL_MATCH")
  @scala.inline
  def NO_CHECK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_CHECK = this.cast("NO_CHECK")
  @scala.inline
  def NO_MATCH: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_MATCH = this.cast("NO_MATCH")
  @scala.inline
  def POSTAL_CODE_MATCH_ONLY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.POSTAL_CODE_MATCH_ONLY = this.cast("POSTAL_CODE_MATCH_ONLY")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

