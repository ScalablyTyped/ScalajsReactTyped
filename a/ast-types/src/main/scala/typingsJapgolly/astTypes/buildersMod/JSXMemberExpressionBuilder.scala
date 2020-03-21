package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsComputed
import typingsJapgolly.astTypes.kindsMod.JSXIdentifierKind
import typingsJapgolly.astTypes.kindsMod.JSXMemberExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXMemberExpressionBuilder extends js.Object {
  def apply(`object`: JSXIdentifierKind, property: JSXIdentifierKind): JSXMemberExpression = js.native
  def apply(`object`: JSXMemberExpressionKind, property: JSXIdentifierKind): JSXMemberExpression = js.native
  def from(params: AnonCommentsComputed): JSXMemberExpression = js.native
}

