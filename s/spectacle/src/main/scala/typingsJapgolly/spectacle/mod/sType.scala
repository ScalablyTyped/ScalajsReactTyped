package typingsJapgolly.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * S Types for StyledS in Spectacle
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.spectacle.spectacleStrings.italic
  - typingsJapgolly.spectacle.spectacleStrings.bold
  - typingsJapgolly.spectacle.spectacleStrings.`line-through`
  - typingsJapgolly.spectacle.spectacleStrings.underline
*/
trait sType extends js.Object

object sType {
  @scala.inline
  def bold: typingsJapgolly.spectacle.spectacleStrings.bold = this.cast("bold")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def italic: typingsJapgolly.spectacle.spectacleStrings.italic = this.cast("italic")
  @scala.inline
  def `line-through`: typingsJapgolly.spectacle.spectacleStrings.`line-through` = this.cast("line-through")
  @scala.inline
  def underline: typingsJapgolly.spectacle.spectacleStrings.underline = this.cast("underline")
}

