package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.mlParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ParseTreeResult")
@js.native
class ParseTreeResult protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.ParseTreeResult {
  def this(
    rootNodes: js.Array[Node],
    errors: js.Array[typingsJapgolly.angularCompiler.srcParseUtilMod.ParseError]
  ) = this()
}

