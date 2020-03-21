package typingsJapgolly.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.aliOss.aliOssStrings.`public-read-write`
  - typingsJapgolly.aliOss.aliOssStrings.`public-read`
  - typingsJapgolly.aliOss.aliOssStrings.`private`
*/
trait ACLType extends js.Object

object ACLType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typingsJapgolly.aliOss.aliOssStrings.`private` = this.cast("private")
  @scala.inline
  def `public-read`: typingsJapgolly.aliOss.aliOssStrings.`public-read` = this.cast("public-read")
  @scala.inline
  def `public-read-write`: typingsJapgolly.aliOss.aliOssStrings.`public-read-write` = this.cast("public-read-write")
}

