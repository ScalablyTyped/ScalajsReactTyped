package typingsJapgolly.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Theme Types for CodePane in Spectacle
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.spectacle.spectacleStrings.dark
  - typingsJapgolly.spectacle.spectacleStrings.light
  - typingsJapgolly.spectacle.spectacleStrings.external
*/
trait themeType extends js.Object

object themeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typingsJapgolly.spectacle.spectacleStrings.dark = this.cast("dark")
  @scala.inline
  def external: typingsJapgolly.spectacle.spectacleStrings.external = this.cast("external")
  @scala.inline
  def light: typingsJapgolly.spectacle.spectacleStrings.light = this.cast("light")
}

