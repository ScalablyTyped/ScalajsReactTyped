package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonProperty
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.MemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberExpressionBuilder extends js.Object {
  def apply(`object`: ExpressionKind, property: ExpressionKind): MemberExpression = js.native
  def apply(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean): MemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind): MemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean): MemberExpression = js.native
  def from(params: AnonProperty): MemberExpression = js.native
}

