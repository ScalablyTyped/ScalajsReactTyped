package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonExpressionLoc
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.TypeAnnotationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeCastExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeCastExpressionBuilder extends js.Object {
  def apply(expression: ExpressionKind, typeAnnotation: TypeAnnotationKind): TypeCastExpression = js.native
  def from(params: AnonExpressionLoc): TypeCastExpression = js.native
}

