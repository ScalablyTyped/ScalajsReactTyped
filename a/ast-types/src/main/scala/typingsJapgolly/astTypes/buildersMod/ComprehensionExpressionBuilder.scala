package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonBlocks
import typingsJapgolly.astTypes.kindsMod.ComprehensionBlockKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComprehensionExpressionBuilder extends js.Object {
  def apply(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind]): ComprehensionExpression = js.native
  def apply(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind], filter: ExpressionKind): ComprehensionExpression = js.native
  def from(params: AnonBlocks): ComprehensionExpression = js.native
}

