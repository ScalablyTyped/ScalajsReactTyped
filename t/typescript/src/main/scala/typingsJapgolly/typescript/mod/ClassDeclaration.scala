package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.typescript.mod.TextRange because Already inherited
- typingsJapgolly.typescript.mod.Node because Already inherited
- typingsJapgolly.typescript.mod.Declaration because Already inherited
- typingsJapgolly.typescript.mod.Statement because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _statementBrand
- typingsJapgolly.typescript.mod.NamedDeclaration because Already inherited
- typingsJapgolly.typescript.mod.DeclarationStatement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined  */ @js.native
trait ClassDeclaration
  extends ClassLikeDeclarationBase
     with ClassLikeDeclaration {
  var _statementBrand: js.Any = js.native
  @JSName("kind")
  var kind_ClassDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.ClassDeclaration = js.native
}

