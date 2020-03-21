package typingsJapgolly.mangopay2NodejsSdk.mod.dispute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CONTESTABLE
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOT_CONTESTABLE
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RETRIEVAL
*/
trait DisputeType extends js.Object

object DisputeType {
  @scala.inline
  def CONTESTABLE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CONTESTABLE = this.cast("CONTESTABLE")
  @scala.inline
  def NOT_CONTESTABLE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOT_CONTESTABLE = this.cast("NOT_CONTESTABLE")
  @scala.inline
  def RETRIEVAL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RETRIEVAL = this.cast("RETRIEVAL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

