package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.Statement because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _statementBrand */ @js.native
trait DeclarationStatement extends NamedDeclaration {
  var _statementBrand: js.Any = js.native
  @JSName("name")
  var name_DeclarationStatement: js.UndefOr[Identifier | StringLiteral | NumericLiteral] = js.native
}

