package typingsJapgolly.atlaskitLayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.viewport
  - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.window
  - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.scrollParent
*/
trait BoundariesElementType extends js.Object

object BoundariesElementType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def scrollParent: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.scrollParent = this.cast("scrollParent")
  @scala.inline
  def viewport: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.viewport = this.cast("viewport")
  @scala.inline
  def window: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.window = this.cast("window")
}

