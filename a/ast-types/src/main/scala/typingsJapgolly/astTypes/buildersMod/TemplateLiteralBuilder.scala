package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonQuasis
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.TemplateElementKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TemplateLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateLiteralBuilder extends js.Object {
  def apply(quasis: js.Array[TemplateElementKind], expressions: js.Array[ExpressionKind]): TemplateLiteral = js.native
  def from(params: AnonQuasis): TemplateLiteral = js.native
}

