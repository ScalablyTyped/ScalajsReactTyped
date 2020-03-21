package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonBlocks
import typingsJapgolly.astTypes.kindsMod.ComprehensionBlockKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.GeneratorExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratorExpressionBuilder extends js.Object {
  def apply(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind]): GeneratorExpression = js.native
  def apply(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind], filter: ExpressionKind): GeneratorExpression = js.native
  def from(params: AnonBlocks): GeneratorExpression = js.native
}

