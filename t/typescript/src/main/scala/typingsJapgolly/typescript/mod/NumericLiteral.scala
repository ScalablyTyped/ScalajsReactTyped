package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.typescript.mod.TextRange because Already inherited
- typingsJapgolly.typescript.mod.Node because Already inherited
- typingsJapgolly.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait NumericLiteral
  extends LiteralExpression
     with DeclarationName
     with PropertyName {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_NumericLiteral: typingsJapgolly.typescript.mod.SyntaxKind.NumericLiteral = js.native
}

