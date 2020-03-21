package typingsJapgolly.libxslt.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.libxmljs.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxslt", "libxmljs")
@js.native
object libxmljs extends js.Object {
  @js.native
  class Attribute ()
    extends typingsJapgolly.libxmljs.mod.Attribute
  
  @js.native
  /**
    * Create a new XML Document
    * @param version XML document version, defaults to 1.0
    * @param encoding Encoding, defaults to utf8
    */
  class Document ()
    extends typingsJapgolly.libxmljs.mod.Document
  
  @js.native
  class Element protected ()
    extends typingsJapgolly.libxmljs.mod.Element {
    def this(doc: typingsJapgolly.libxmljs.mod.Document, name: String) = this()
  }
  
  @js.native
  class Namespace ()
    extends typingsJapgolly.libxmljs.mod.Namespace
  
  @js.native
  class Node ()
    extends typingsJapgolly.libxmljs.mod.Node
  
  @js.native
  class SaxParser ()
    extends typingsJapgolly.libxmljs.mod.SaxParser
  
  @js.native
  class SaxPushParser ()
    extends typingsJapgolly.libxmljs.mod.SaxPushParser
  
  val libxml_parser_version: String = js.native
  val libxml_version: String = js.native
  val version: String = js.native
  def memoryUsage(): Double = js.native
  def nodeCount(): Double = js.native
  def parseHtml(source: String): typingsJapgolly.libxmljs.mod.Document = js.native
  def parseHtml(source: String, options: ParserOptions): typingsJapgolly.libxmljs.mod.Document = js.native
  def parseHtmlFragment(source: String): typingsJapgolly.libxmljs.mod.Document = js.native
  def parseHtmlFragment(source: String, options: ParserOptions): typingsJapgolly.libxmljs.mod.Document = js.native
  def parseHtmlString(source: String): typingsJapgolly.libxmljs.mod.Document = js.native
  def parseHtmlString(source: String, options: ParserOptions): typingsJapgolly.libxmljs.mod.Document = js.native
  def parseXml(source: String): typingsJapgolly.libxmljs.mod.Document = js.native
  def parseXml(source: String, options: ParserOptions): typingsJapgolly.libxmljs.mod.Document = js.native
  def parseXmlString(source: String): typingsJapgolly.libxmljs.mod.Document = js.native
  def parseXmlString(source: String, options: ParserOptions): typingsJapgolly.libxmljs.mod.Document = js.native
  @js.native
  object Attribute
    extends TopLevel[Instantiable0[typingsJapgolly.libxmljs.mod.Attribute]]
  
  @js.native
  object Document
    extends TopLevel[Instantiable0[typingsJapgolly.libxmljs.mod.Document]]
  
  @js.native
  object Element
    extends TopLevel[
          Instantiable2[
            /* doc */ typingsJapgolly.libxmljs.mod.Document, 
            /* name */ String, 
            typingsJapgolly.libxmljs.mod.Element
          ]
        ]
  
  @js.native
  object Namespace
    extends TopLevel[Instantiable0[typingsJapgolly.libxmljs.mod.Namespace]]
  
  @js.native
  object Node
    extends TopLevel[Instantiable0[typingsJapgolly.libxmljs.mod.Node]]
  
  @js.native
  object SaxParser
    extends TopLevel[Instantiable0[typingsJapgolly.libxmljs.mod.SaxParser]]
  
  @js.native
  object SaxPushParser
    extends TopLevel[Instantiable0[typingsJapgolly.libxmljs.mod.SaxPushParser]]
  
}

