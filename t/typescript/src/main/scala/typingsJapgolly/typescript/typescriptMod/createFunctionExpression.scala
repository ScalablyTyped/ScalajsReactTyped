package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createFunctionExpression")
@js.native
object createFunctionExpression extends js.Object {
  def apply(
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.UndefOr[js.Array[ParameterDeclaration]],
    `type`: js.UndefOr[TypeNode],
    body: Block
  ): FunctionExpression = js.native
}

