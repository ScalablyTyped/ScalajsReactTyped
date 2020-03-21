package typingsJapgolly.mangopay2NodejsSdk.mod.card

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID
*/
trait CardValidity extends js.Object

object CardValidity {
  @scala.inline
  def INVALID: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID = this.cast("INVALID")
  @scala.inline
  def UNKNOWN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  def VALID: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID = this.cast("VALID")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

