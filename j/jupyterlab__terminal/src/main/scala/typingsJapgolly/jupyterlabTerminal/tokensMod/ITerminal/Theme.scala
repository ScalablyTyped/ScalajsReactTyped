package typingsJapgolly.jupyterlabTerminal.tokensMod.ITerminal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type for the terminal theme.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabTerminal.jupyterlabTerminalStrings.light
  - typingsJapgolly.jupyterlabTerminal.jupyterlabTerminalStrings.dark
  - typingsJapgolly.jupyterlabTerminal.jupyterlabTerminalStrings.inherit
*/
trait Theme extends js.Object

object Theme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typingsJapgolly.jupyterlabTerminal.jupyterlabTerminalStrings.dark = this.cast("dark")
  @scala.inline
  def inherit: typingsJapgolly.jupyterlabTerminal.jupyterlabTerminalStrings.inherit = this.cast("inherit")
  @scala.inline
  def light: typingsJapgolly.jupyterlabTerminal.jupyterlabTerminalStrings.light = this.cast("light")
}

