package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportDeclaration extends Statement {
  var importClause: js.UndefOr[ImportClause] = js.native
  @JSName("kind")
  var kind_ImportDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ImportDeclaration = js.native
  /** If this is not a StringLiteral it will be a grammar error. */
  var moduleSpecifier: Expression = js.native
  @JSName("parent")
  var parent_ImportDeclaration: SourceFile | ModuleBlock = js.native
}

