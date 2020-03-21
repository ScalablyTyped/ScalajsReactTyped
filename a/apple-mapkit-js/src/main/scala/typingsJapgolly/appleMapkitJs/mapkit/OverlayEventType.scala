package typingsJapgolly.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.select
  - typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.deselect
*/
trait OverlayEventType extends js.Object

object OverlayEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deselect: typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.deselect = this.cast("deselect")
  @scala.inline
  def select: typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.select = this.cast("select")
}

