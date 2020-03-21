package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.mlParserAstMod.Node
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseError
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/icu_ast_expander", JSImport.Namespace)
@js.native
object icuAstExpanderMod extends js.Object {
  @js.native
  class ExpansionError protected () extends ParseError {
    def this(span: ParseSourceSpan, errorMsg: String) = this()
  }
  
  @js.native
  class ExpansionResult protected () extends js.Object {
    def this(nodes: js.Array[Node], expanded: Boolean, errors: js.Array[ParseError]) = this()
    var errors: js.Array[ParseError] = js.native
    var expanded: Boolean = js.native
    var nodes: js.Array[Node] = js.native
  }
  
  def expandNodes(nodes: js.Array[Node]): ExpansionResult = js.native
}

