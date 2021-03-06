package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.mlParserAstMod.Node
import typingsJapgolly.angularCompiler.mlParserLexerMod.TokenizeOptions
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseError
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typingsJapgolly.angularCompiler.tagsMod.TagDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/parser", JSImport.Namespace)
@js.native
object mlParserParserMod extends js.Object {
  @js.native
  class ParseTreeResult protected () extends js.Object {
    def this(rootNodes: js.Array[Node], errors: js.Array[ParseError]) = this()
    var errors: js.Array[ParseError] = js.native
    var rootNodes: js.Array[Node] = js.native
  }
  
  @js.native
  class Parser protected () extends js.Object {
    def this(getTagDefinition: js.Function1[/* tagName */ String, TagDefinition]) = this()
    def getTagDefinition(tagName: String): TagDefinition = js.native
    def parse(source: String, url: String): ParseTreeResult = js.native
    def parse(source: String, url: String, options: TokenizeOptions): ParseTreeResult = js.native
  }
  
  @js.native
  class TreeError protected () extends ParseError {
    def this(elementName: String, span: ParseSourceSpan, msg: String) = this()
    def this(elementName: Null, span: ParseSourceSpan, msg: String) = this()
    var elementName: String | Null = js.native
  }
  
  /* static members */
  @js.native
  object TreeError extends js.Object {
    def create(elementName: String, span: ParseSourceSpan, msg: String): TreeError = js.native
    def create(elementName: Null, span: ParseSourceSpan, msg: String): TreeError = js.native
  }
  
}

