package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.typescript.mod.TextRange because Already inherited
- typingsJapgolly.typescript.mod.Node because Already inherited
- typingsJapgolly.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand
- typingsJapgolly.typescript.mod.NamedDeclaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined name */ @js.native
trait PropertyAccessExpression
  extends MemberExpression
     with BindingOrAssignmentElementTarget
     with _BindingOrAssignmentElement {
  var _declarationBrand: js.Any = js.native
  var expression: LeftHandSideExpression = js.native
  @JSName("kind")
  var kind_PropertyAccessExpression: typingsJapgolly.typescript.mod.SyntaxKind.PropertyAccessExpression = js.native
  var name: js.UndefOr[DeclarationName | Identifier | PrivateIdentifier] = js.native
  var questionDotToken: js.UndefOr[QuestionDotToken] = js.native
}

