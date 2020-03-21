package typingsJapgolly.typedoc

import typingsJapgolly.typescript.mod.EnumMember
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.ParameterDeclaration
import typingsJapgolly.typescript.mod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/convert-expression", JSImport.Namespace)
@js.native
object convertExpressionMod extends js.Object {
  def convertDefaultValue(node: EnumMember): js.UndefOr[String] = js.native
  def convertDefaultValue(node: ParameterDeclaration): js.UndefOr[String] = js.native
  def convertDefaultValue(node: VariableDeclaration): js.UndefOr[String] = js.native
  def convertExpression(expression: Expression): String = js.native
}

