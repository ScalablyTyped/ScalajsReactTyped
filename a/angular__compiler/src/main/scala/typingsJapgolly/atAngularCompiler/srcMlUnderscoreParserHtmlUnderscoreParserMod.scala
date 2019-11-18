package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Node
import typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserParserMod.Parser
import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/html_parser", JSImport.Namespace)
@js.native
object srcMlUnderscoreParserHtmlUnderscoreParserMod extends js.Object {
  @js.native
  class HtmlParser () extends Parser
  
  @js.native
  class ParseTreeResult protected ()
    extends typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserParserMod.ParseTreeResult {
    def this(rootNodes: js.Array[Node], errors: js.Array[ParseError]) = this()
  }
  
  @js.native
  class TreeError protected ()
    extends typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserParserMod.TreeError {
    def this(elementName: String, span: ParseSourceSpan, msg: String) = this()
    def this(elementName: Null, span: ParseSourceSpan, msg: String) = this()
  }
  
  /* static members */
  @js.native
  object TreeError extends js.Object {
    def create(elementName: String, span: ParseSourceSpan, msg: String): typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserParserMod.TreeError = js.native
    def create(elementName: Null, span: ParseSourceSpan, msg: String): typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserParserMod.TreeError = js.native
  }
  
}

