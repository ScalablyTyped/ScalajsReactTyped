package typingsJapgolly.blessed.mod

import typingsJapgolly.blessed.mod.Widgets.PromptElement
import typingsJapgolly.blessed.mod.Widgets.PromptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "prompt")
@js.native
object prompt extends js.Object {
  def apply(): PromptElement = js.native
  def apply(options: PromptOptions): PromptElement = js.native
}

