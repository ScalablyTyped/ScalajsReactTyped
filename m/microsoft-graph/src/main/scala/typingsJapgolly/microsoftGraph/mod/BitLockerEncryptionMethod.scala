package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.aesCbc128
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.aesCbc256
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.xtsAes128
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.xtsAes256
*/
trait BitLockerEncryptionMethod extends js.Object

object BitLockerEncryptionMethod {
  @scala.inline
  def aesCbc128: typingsJapgolly.microsoftGraph.microsoftGraphStrings.aesCbc128 = this.cast("aesCbc128")
  @scala.inline
  def aesCbc256: typingsJapgolly.microsoftGraph.microsoftGraphStrings.aesCbc256 = this.cast("aesCbc256")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xtsAes128: typingsJapgolly.microsoftGraph.microsoftGraphStrings.xtsAes128 = this.cast("xtsAes128")
  @scala.inline
  def xtsAes256: typingsJapgolly.microsoftGraph.microsoftGraphStrings.xtsAes256 = this.cast("xtsAes256")
}

