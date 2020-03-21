package typingsJapgolly.ltx

import typingsJapgolly.ltx.elementMod.Element
import typingsJapgolly.ltx.parserMod.Parser
import typingsJapgolly.ltx.parserMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltx/lib/parse", JSImport.Namespace)
@js.native
object parseMod extends js.Object {
  def parse(data: String): Element = js.native
  def parse(data: String, options: Parser): Element = js.native
  def parse(data: String, options: ParserOptions): Element = js.native
}

