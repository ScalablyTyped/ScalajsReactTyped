package typingsJapgolly.loaderUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.loaderUtils.loaderUtilsStrings.sha1
  - typingsJapgolly.loaderUtils.loaderUtilsStrings.md5
  - typingsJapgolly.loaderUtils.loaderUtilsStrings.sha256
  - typingsJapgolly.loaderUtils.loaderUtilsStrings.sha512
*/
trait HashType extends js.Object

object HashType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def md5: typingsJapgolly.loaderUtils.loaderUtilsStrings.md5 = this.cast("md5")
  @scala.inline
  def sha1: typingsJapgolly.loaderUtils.loaderUtilsStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha256: typingsJapgolly.loaderUtils.loaderUtilsStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha512: typingsJapgolly.loaderUtils.loaderUtilsStrings.sha512 = this.cast("sha512")
}

