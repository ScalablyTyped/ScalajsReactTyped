package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait BinaryExpression extends Expression {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_BinaryExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.BinaryExpression = js.native
  var left: Expression = js.native
  var operatorToken: BinaryOperatorToken = js.native
  var right: Expression = js.native
}

