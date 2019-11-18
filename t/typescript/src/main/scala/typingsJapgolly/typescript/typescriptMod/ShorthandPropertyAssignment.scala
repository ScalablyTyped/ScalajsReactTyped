package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShorthandPropertyAssignment
  extends ObjectLiteralElement
     with JSDocContainer
     with ObjectLiteralElementLike
     with VariableLikeDeclaration
     with _BindingOrAssignmentElement
     with _HasJSDoc {
  var equalsToken: js.UndefOr[Token[typingsJapgolly.typescript.typescriptMod.SyntaxKind.EqualsToken]] = js.native
  var exclamationToken: js.UndefOr[ExclamationToken] = js.native
  @JSName("kind")
  var kind_ShorthandPropertyAssignment: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ShorthandPropertyAssignment = js.native
  @JSName("name")
  var name_ShorthandPropertyAssignment: Identifier = js.native
  var objectAssignmentInitializer: js.UndefOr[Expression] = js.native
  @JSName("parent")
  var parent_ShorthandPropertyAssignment: ObjectLiteralExpression = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
}

