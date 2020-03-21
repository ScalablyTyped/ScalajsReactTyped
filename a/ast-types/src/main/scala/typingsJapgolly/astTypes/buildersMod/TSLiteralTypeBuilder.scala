package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLiteral
import typingsJapgolly.astTypes.kindsMod.BooleanLiteralKind
import typingsJapgolly.astTypes.kindsMod.NumericLiteralKind
import typingsJapgolly.astTypes.kindsMod.StringLiteralKind
import typingsJapgolly.astTypes.kindsMod.TemplateLiteralKind
import typingsJapgolly.astTypes.kindsMod.UnaryExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSLiteralType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSLiteralTypeBuilder extends js.Object {
  def apply(literal: BooleanLiteralKind): TSLiteralType = js.native
  def apply(literal: NumericLiteralKind): TSLiteralType = js.native
  def apply(literal: StringLiteralKind): TSLiteralType = js.native
  def apply(literal: TemplateLiteralKind): TSLiteralType = js.native
  def apply(literal: UnaryExpressionKind): TSLiteralType = js.native
  def from(params: AnonLiteral): TSLiteralType = js.native
}

