package typingsJapgolly.cropperjs.Cropper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cropperjs.cropperjsStrings.crop
  - typingsJapgolly.cropperjs.cropperjsStrings.move
  - typingsJapgolly.cropperjs.cropperjsStrings.none
*/
trait DragMode extends js.Object

object DragMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crop: typingsJapgolly.cropperjs.cropperjsStrings.crop = this.cast("crop")
  @scala.inline
  def move: typingsJapgolly.cropperjs.cropperjsStrings.move = this.cast("move")
  @scala.inline
  def none: typingsJapgolly.cropperjs.cropperjsStrings.none = this.cast("none")
}

