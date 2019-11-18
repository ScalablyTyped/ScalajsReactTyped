package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclaration
  extends NamedDeclaration
     with HasExpressionInitializer
     with HasType
     with VariableLikeDeclaration
     with _BindingOrAssignmentElement {
  var exclamationToken: js.UndefOr[ExclamationToken] = js.native
  var initializer: js.UndefOr[Expression] = js.native
  @JSName("kind")
  var kind_VariableDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.VariableDeclaration = js.native
  @JSName("name")
  var name_VariableDeclaration: BindingName = js.native
  @JSName("parent")
  var parent_VariableDeclaration: VariableDeclarationList | CatchClause = js.native
  var `type`: js.UndefOr[TypeNode] = js.native
}

