package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.mlParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ParseTreeResult")
@js.native
class ParseTreeResult protected ()
  extends typingsJapgolly.angularCompiler.htmlParserMod.ParseTreeResult {
  def this(
    rootNodes: js.Array[Node],
    errors: js.Array[typingsJapgolly.angularCompiler.srcParseUtilMod.ParseError]
  ) = this()
}

