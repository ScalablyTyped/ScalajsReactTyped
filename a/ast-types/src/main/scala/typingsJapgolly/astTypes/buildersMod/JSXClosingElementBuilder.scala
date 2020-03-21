package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLocName
import typingsJapgolly.astTypes.kindsMod.JSXIdentifierKind
import typingsJapgolly.astTypes.kindsMod.JSXMemberExpressionKind
import typingsJapgolly.astTypes.kindsMod.JSXNamespacedNameKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXClosingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXClosingElementBuilder extends js.Object {
  def apply(name: JSXIdentifierKind): JSXClosingElement = js.native
  def apply(name: JSXMemberExpressionKind): JSXClosingElement = js.native
  def apply(name: JSXNamespacedNameKind): JSXClosingElement = js.native
  def from(params: AnonLocName): JSXClosingElement = js.native
}

