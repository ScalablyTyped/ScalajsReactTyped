package typingsJapgolly.lowlight

import typingsJapgolly.lowlight.lowlight.HighlightAutoOptions
import typingsJapgolly.lowlight.lowlight.HighlightAutoResult
import typingsJapgolly.lowlight.lowlight.HighlightOptions
import typingsJapgolly.lowlight.lowlight.HighlightResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lowlight", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def highlight(language: String, value: String): HighlightResult = js.native
  def highlight(language: String, value: String, options: HighlightOptions): HighlightResult = js.native
  def highlightAuto(value: String): HighlightAutoResult = js.native
  def highlightAuto(value: String, options: HighlightAutoOptions): HighlightAutoResult = js.native
  def registerLanguage(name: String, syntax: js.Function): Unit = js.native
}

