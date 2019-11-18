package typingsJapgolly.atAngularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ASTWithSource")
@js.native
class ASTWithSource protected ()
  extends typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ASTWithSource {
  def this(
    ast: typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    source: String,
    location: String,
    absoluteOffset: Double,
    errors: js.Array[
        typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParserError
      ]
  ) = this()
  def this(
    ast: typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    source: Null,
    location: String,
    absoluteOffset: Double,
    errors: js.Array[
        typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParserError
      ]
  ) = this()
}

