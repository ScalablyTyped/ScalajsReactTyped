package typingsJapgolly.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNativeFetchBlob.reactNativeFetchBlobStrings.utf8
  - typingsJapgolly.reactNativeFetchBlob.reactNativeFetchBlobStrings.ascii
  - typingsJapgolly.reactNativeFetchBlob.reactNativeFetchBlobStrings.base64
*/
trait Encoding extends js.Object

object Encoding {
  @scala.inline
  def ascii: typingsJapgolly.reactNativeFetchBlob.reactNativeFetchBlobStrings.ascii = this.cast("ascii")
  @scala.inline
  def base64: typingsJapgolly.reactNativeFetchBlob.reactNativeFetchBlobStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def utf8: typingsJapgolly.reactNativeFetchBlob.reactNativeFetchBlobStrings.utf8 = this.cast("utf8")
}

