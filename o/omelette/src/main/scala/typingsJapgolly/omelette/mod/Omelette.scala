package typingsJapgolly.omelette.mod

import typingsJapgolly.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Omelette extends js.Object {
  def apply(literals: TemplateStringsArray, placeholders: TemplateValue*): Instance = js.native
  def apply(message: String): Instance = js.native
}

