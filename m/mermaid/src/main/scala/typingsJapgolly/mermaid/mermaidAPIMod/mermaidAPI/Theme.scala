package typingsJapgolly.mermaid.mermaidAPIMod.mermaidAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mermaid.mermaidStrings.default
  - typingsJapgolly.mermaid.mermaidStrings.forest
  - typingsJapgolly.mermaid.mermaidStrings.dark
  - typingsJapgolly.mermaid.mermaidStrings.neutral
*/
trait Theme extends js.Object

object Theme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typingsJapgolly.mermaid.mermaidStrings.dark = this.cast("dark")
  @scala.inline
  def default: typingsJapgolly.mermaid.mermaidStrings.default = this.cast("default")
  @scala.inline
  def forest: typingsJapgolly.mermaid.mermaidStrings.forest = this.cast("forest")
  @scala.inline
  def neutral: typingsJapgolly.mermaid.mermaidStrings.neutral = this.cast("neutral")
}

