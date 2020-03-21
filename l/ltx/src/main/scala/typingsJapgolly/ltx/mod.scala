package typingsJapgolly.ltx

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ltx.elementMod.Node
import typingsJapgolly.ltx.parserMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltx", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Element protected ()
    extends typingsJapgolly.ltx.elementMod.Element {
    def this(name: String) = this()
    def this(name: String, attrs: String) = this()
    def this(name: String, attrs: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class Parser ()
    extends typingsJapgolly.ltx.parserMod.Parser {
    def this(options: ParserOptions) = this()
  }
  
  def attrsEqual(a: typingsJapgolly.ltx.elementMod.Element, b: typingsJapgolly.ltx.elementMod.Element): Boolean = js.native
  def childrenEqual(a: typingsJapgolly.ltx.elementMod.Element, b: typingsJapgolly.ltx.elementMod.Element): Boolean = js.native
  def clone[T /* <: typingsJapgolly.ltx.elementMod.Element */](el: T): T = js.native
  def createElement(name: String): typingsJapgolly.ltx.elementMod.Element = js.native
  def createElement(name: String, attrs: String, children: Node*): typingsJapgolly.ltx.elementMod.Element = js.native
  def createElement(name: String, attrs: StringDictionary[js.Any], children: Node*): typingsJapgolly.ltx.elementMod.Element = js.native
  def equal(a: typingsJapgolly.ltx.elementMod.Element, b: typingsJapgolly.ltx.elementMod.Element): Boolean = js.native
  def escapeXML(s: String): String = js.native
  def escapeXMLText(s: String): String = js.native
  def isElement(el: js.Any): /* is ltx.ltx/lib/Element.Element */ Boolean = js.native
  def isNode(el: js.Any): /* is ltx.ltx/lib/Element.Node */ Boolean = js.native
  def isText(el: js.Any): /* is string */ Boolean = js.native
  def nameEqual(a: typingsJapgolly.ltx.elementMod.Element, b: typingsJapgolly.ltx.elementMod.Element): Boolean = js.native
  def parse(data: String): typingsJapgolly.ltx.elementMod.Element = js.native
  def parse(data: String, options: typingsJapgolly.ltx.parserMod.Parser): typingsJapgolly.ltx.elementMod.Element = js.native
  def parse(data: String, options: ParserOptions): typingsJapgolly.ltx.elementMod.Element = js.native
  def stringify(el: typingsJapgolly.ltx.elementMod.Element): String = js.native
  def stringify(el: typingsJapgolly.ltx.elementMod.Element, indent: Double): String = js.native
  def stringify(el: typingsJapgolly.ltx.elementMod.Element, indent: Double, level: Double): String = js.native
  def tag(literals: js.Array[String], substitutions: String*): typingsJapgolly.ltx.elementMod.Element = js.native
  def tagString(literals: js.Array[String], substitutions: String*): String = js.native
  def unescapeXML(s: String): String = js.native
  def unescapeXMLText(s: String): String = js.native
}

