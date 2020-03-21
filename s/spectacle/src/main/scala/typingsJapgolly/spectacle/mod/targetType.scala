package typingsJapgolly.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target Types for links
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.spectacle.spectacleStrings._blank
  - typingsJapgolly.spectacle.spectacleStrings._self
  - typingsJapgolly.spectacle.spectacleStrings._parent
  - typingsJapgolly.spectacle.spectacleStrings._top
*/
trait targetType extends js.Object

object targetType {
  @scala.inline
  def _blank: typingsJapgolly.spectacle.spectacleStrings._blank = this.cast("_blank")
  @scala.inline
  def _parent: typingsJapgolly.spectacle.spectacleStrings._parent = this.cast("_parent")
  @scala.inline
  def _self: typingsJapgolly.spectacle.spectacleStrings._self = this.cast("_self")
  @scala.inline
  def _top: typingsJapgolly.spectacle.spectacleStrings._top = this.cast("_top")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

