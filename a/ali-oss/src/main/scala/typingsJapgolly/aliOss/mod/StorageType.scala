package typingsJapgolly.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.aliOss.aliOssStrings.Standard
  - typingsJapgolly.aliOss.aliOssStrings.IA
  - typingsJapgolly.aliOss.aliOssStrings.Archive
*/
trait StorageType extends js.Object

object StorageType {
  @scala.inline
  def Archive: typingsJapgolly.aliOss.aliOssStrings.Archive = this.cast("Archive")
  @scala.inline
  def IA: typingsJapgolly.aliOss.aliOssStrings.IA = this.cast("IA")
  @scala.inline
  def Standard: typingsJapgolly.aliOss.aliOssStrings.Standard = this.cast("Standard")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

