package typingsJapgolly.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED
*/
trait PreAuthorizationStatus extends js.Object

object PreAuthorizationStatus {
  @scala.inline
  def CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = this.cast("CREATED")
  @scala.inline
  def FAILED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def SUCCEEDED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED = this.cast("SUCCEEDED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

