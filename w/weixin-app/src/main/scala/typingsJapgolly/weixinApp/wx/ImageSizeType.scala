package typingsJapgolly.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 媒体API列表
// 媒体-----图片
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weixinApp.weixinAppStrings.original
  - typingsJapgolly.weixinApp.weixinAppStrings.compressed
*/
trait ImageSizeType extends js.Object

object ImageSizeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compressed: typingsJapgolly.weixinApp.weixinAppStrings.compressed = this.cast("compressed")
  @scala.inline
  def original: typingsJapgolly.weixinApp.weixinAppStrings.original = this.cast("original")
}

