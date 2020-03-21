package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonIdInitializer
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.StringLiteralKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSEnumMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSEnumMemberBuilder extends js.Object {
  def apply(id: IdentifierKind): TSEnumMember = js.native
  def apply(id: IdentifierKind, initializer: ExpressionKind): TSEnumMember = js.native
  def apply(id: StringLiteralKind): TSEnumMember = js.native
  def apply(id: StringLiteralKind, initializer: ExpressionKind): TSEnumMember = js.native
  def from(params: AnonIdInitializer): TSEnumMember = js.native
}

