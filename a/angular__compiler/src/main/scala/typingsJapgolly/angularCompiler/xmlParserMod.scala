package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.mlParserAstMod.Node
import typingsJapgolly.angularCompiler.mlParserParserMod.Parser
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseError
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/xml_parser", JSImport.Namespace)
@js.native
object xmlParserMod extends js.Object {
  @js.native
  class ParseTreeResult protected ()
    extends typingsJapgolly.angularCompiler.mlParserParserMod.ParseTreeResult {
    def this(rootNodes: js.Array[Node], errors: js.Array[ParseError]) = this()
  }
  
  @js.native
  class TreeError protected ()
    extends typingsJapgolly.angularCompiler.mlParserParserMod.TreeError {
    def this(elementName: String, span: ParseSourceSpan, msg: String) = this()
    def this(elementName: Null, span: ParseSourceSpan, msg: String) = this()
  }
  
  @js.native
  class XmlParser () extends Parser
  
  /* static members */
  @js.native
  object TreeError extends js.Object {
    def create(elementName: String, span: ParseSourceSpan, msg: String): typingsJapgolly.angularCompiler.mlParserParserMod.TreeError = js.native
    def create(elementName: Null, span: ParseSourceSpan, msg: String): typingsJapgolly.angularCompiler.mlParserParserMod.TreeError = js.native
  }
  
}

