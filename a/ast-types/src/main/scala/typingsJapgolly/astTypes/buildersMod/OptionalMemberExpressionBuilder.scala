package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonComputedLoc
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalMemberExpressionBuilder extends js.Object {
  def apply(`object`: ExpressionKind, property: ExpressionKind): OptionalMemberExpression = js.native
  def apply(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean): OptionalMemberExpression = js.native
  def apply(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean, optional: Boolean): OptionalMemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind): OptionalMemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean): OptionalMemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean, optional: Boolean): OptionalMemberExpression = js.native
  def from(params: AnonComputedLoc): OptionalMemberExpression = js.native
}

