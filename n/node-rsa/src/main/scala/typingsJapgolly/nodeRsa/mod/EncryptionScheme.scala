package typingsJapgolly.nodeRsa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeRsa.nodeRsaStrings.pkcs1_oaep
  - typingsJapgolly.nodeRsa.nodeRsaStrings.pkcs1
*/
trait EncryptionScheme extends js.Object

object EncryptionScheme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pkcs1: typingsJapgolly.nodeRsa.nodeRsaStrings.pkcs1 = this.cast("pkcs1")
  @scala.inline
  def pkcs1_oaep: typingsJapgolly.nodeRsa.nodeRsaStrings.pkcs1_oaep = this.cast("pkcs1_oaep")
}

