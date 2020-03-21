package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonElements
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.RestElementKind
import typingsJapgolly.astTypes.kindsMod.SpreadElementKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayExpressionBuilder extends js.Object {
  def apply(elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null]): ArrayExpression = js.native
  def from(params: AnonElements): ArrayExpression = js.native
}

