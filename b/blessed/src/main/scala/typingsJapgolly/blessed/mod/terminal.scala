package typingsJapgolly.blessed.mod

import typingsJapgolly.blessed.mod.Widgets.TerminalElement
import typingsJapgolly.blessed.mod.Widgets.TerminalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "terminal")
@js.native
object terminal extends js.Object {
  def apply(): TerminalElement = js.native
  def apply(options: TerminalOptions): TerminalElement = js.native
}

