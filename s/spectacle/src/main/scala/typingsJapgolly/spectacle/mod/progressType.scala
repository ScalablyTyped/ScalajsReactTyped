package typingsJapgolly.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Progress Types for Spectacle
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.spectacle.spectacleStrings.pacman
  - typingsJapgolly.spectacle.spectacleStrings.bar
  - typingsJapgolly.spectacle.spectacleStrings.number
  - typingsJapgolly.spectacle.spectacleStrings.none
*/
trait progressType extends js.Object

object progressType {
  @scala.inline
  def bar: typingsJapgolly.spectacle.spectacleStrings.bar = this.cast("bar")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.spectacle.spectacleStrings.none = this.cast("none")
  @scala.inline
  def number: typingsJapgolly.spectacle.spectacleStrings.number = this.cast("number")
  @scala.inline
  def pacman: typingsJapgolly.spectacle.spectacleStrings.pacman = this.cast("pacman")
}

