package typingsJapgolly.escapeGoat

import typingsJapgolly.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("escape-goat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def htmlEscape(string: String): String = js.native
  def htmlEscapeTag(template: TemplateStringsArray, substitutions: js.Any*): String = js.native
  def htmlUnescape(htmlString: String): String = js.native
  def htmlUnescapeTag(template: TemplateStringsArray, substitutions: js.Any*): String = js.native
}

