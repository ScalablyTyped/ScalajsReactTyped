package typingsJapgolly.rnFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.utf8
  - typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.ascii
  - typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.base64
*/
trait Encoding extends js.Object

object Encoding {
  @scala.inline
  def ascii: typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.ascii = this.cast("ascii")
  @scala.inline
  def base64: typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def utf8: typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.utf8 = this.cast("utf8")
}

