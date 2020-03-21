package typingsJapgolly.mangopay2NodejsSdk.mod.kycDocument

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
*/
trait DocumentStatus extends js.Object

object DocumentStatus {
  @scala.inline
  def CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = this.cast("CREATED")
  @scala.inline
  def REFUSED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED = this.cast("REFUSED")
  @scala.inline
  def VALIDATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED = this.cast("VALIDATED")
  @scala.inline
  def VALIDATION_ASKED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED = this.cast("VALIDATION_ASKED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

