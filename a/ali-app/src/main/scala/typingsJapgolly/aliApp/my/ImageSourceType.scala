package typingsJapgolly.aliApp.my

import typingsJapgolly.aliApp.aliAppStrings.camera_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 图片 https://docs.alipay.com/mini/api/media-image
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.aliApp.aliAppStrings.album
  - typingsJapgolly.aliApp.aliAppStrings.camera_
*/
trait ImageSourceType extends js.Object

object ImageSourceType {
  @scala.inline
  def album: typingsJapgolly.aliApp.aliAppStrings.album = this.cast("album")
  @scala.inline
  def camera: camera_ = this.cast("camera")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

