package typingsJapgolly.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weappApi.weappApiStrings.front
  - typingsJapgolly.weappApi.weappApiStrings.back
*/
trait CameraDevice extends js.Object

object CameraDevice {
  @scala.inline
  def back: typingsJapgolly.weappApi.weappApiStrings.back = this.cast("back")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def front: typingsJapgolly.weappApi.weappApiStrings.front = this.cast("front")
}

