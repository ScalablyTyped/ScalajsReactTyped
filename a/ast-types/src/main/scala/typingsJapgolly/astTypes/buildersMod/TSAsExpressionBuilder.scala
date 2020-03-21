package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonExpressionExtra
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSAsExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSAsExpressionBuilder extends js.Object {
  def apply(expression: ExpressionKind, typeAnnotation: TSTypeKind): TSAsExpression = js.native
  def from(params: AnonExpressionExtra): TSAsExpression = js.native
}

