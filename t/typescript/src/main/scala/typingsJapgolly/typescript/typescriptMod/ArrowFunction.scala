package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.Expression because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _expressionBrand */ @js.native
trait ArrowFunction
  extends FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with SignatureDeclaration
     with _HasJSDoc
     with ForInitializer {
  var _expressionBrand: js.Any = js.native
  @JSName("body")
  var body_ArrowFunction: ConciseBody = js.native
  var equalsGreaterThanToken: EqualsGreaterThanToken = js.native
  @JSName("kind")
  var kind_ArrowFunction: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ArrowFunction = js.native
}

