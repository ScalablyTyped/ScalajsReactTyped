package typingsJapgolly.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxTreeToAstVisitor")
@js.native
class SyntaxTreeToAstVisitor protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.SyntaxTreeToAstVisitor {
  def this(
    fileName: String,
    lineMap: typingsJapgolly.typescriptServices.TypeScript.LineMap,
    compilationSettings: typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxTreeToAstVisitor")
@js.native
object SyntaxTreeToAstVisitor extends js.Object {
  def visit(
    syntaxTree: typingsJapgolly.typescriptServices.TypeScript.SyntaxTree,
    fileName: String,
    compilationSettings: typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings,
    incrementalAST: Boolean
  ): typingsJapgolly.typescriptServices.TypeScript.SourceUnit = js.native
}

