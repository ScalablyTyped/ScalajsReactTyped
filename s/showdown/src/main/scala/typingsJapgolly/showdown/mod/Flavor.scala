package typingsJapgolly.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Showdown Flavor names.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.showdown.showdownStrings.github
  - typingsJapgolly.showdown.showdownStrings.original
  - typingsJapgolly.showdown.showdownStrings.ghost
  - typingsJapgolly.showdown.showdownStrings.vanilla
  - typingsJapgolly.showdown.showdownStrings.allOn
*/
trait Flavor extends js.Object

object Flavor {
  @scala.inline
  def allOn: typingsJapgolly.showdown.showdownStrings.allOn = this.cast("allOn")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ghost: typingsJapgolly.showdown.showdownStrings.ghost = this.cast("ghost")
  @scala.inline
  def github: typingsJapgolly.showdown.showdownStrings.github = this.cast("github")
  @scala.inline
  def original: typingsJapgolly.showdown.showdownStrings.original = this.cast("original")
  @scala.inline
  def vanilla: typingsJapgolly.showdown.showdownStrings.vanilla = this.cast("vanilla")
}

