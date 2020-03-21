package typingsJapgolly.xmldoc.mod

import typingsJapgolly.xmldoc.xmldocStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldoc", "XmlTextNode")
@js.native
class XmlTextNode protected () extends XmlNode {
  def this(text: String) = this()
  var text: String = js.native
  var `type`: text = js.native
  def toString(opts: XmlOptions): String = js.native
  def toStringWithIndent(indent: String): String = js.native
  def toStringWithIndent(indent: String, opts: XmlOptions): String = js.native
}

