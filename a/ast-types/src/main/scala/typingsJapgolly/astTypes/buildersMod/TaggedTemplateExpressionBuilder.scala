package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonQuasi
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.TemplateLiteralKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedTemplateExpressionBuilder extends js.Object {
  def apply(tag: ExpressionKind, quasi: TemplateLiteralKind): TaggedTemplateExpression = js.native
  def from(params: AnonQuasi): TaggedTemplateExpression = js.native
}

