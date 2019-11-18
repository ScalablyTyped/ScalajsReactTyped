package typingsJapgolly.atAngularCompiler.atAngularCompilerMod

import typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ParseTreeResult")
@js.native
class ParseTreeResult protected ()
  extends typingsJapgolly.atAngularCompiler.publicUnderscoreApiMod.ParseTreeResult {
  def this(
    rootNodes: js.Array[Node],
    errors: js.Array[typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]
  ) = this()
}

