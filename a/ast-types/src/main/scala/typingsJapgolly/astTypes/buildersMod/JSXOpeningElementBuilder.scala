package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonSelfClosing
import typingsJapgolly.astTypes.kindsMod.JSXAttributeKind
import typingsJapgolly.astTypes.kindsMod.JSXIdentifierKind
import typingsJapgolly.astTypes.kindsMod.JSXMemberExpressionKind
import typingsJapgolly.astTypes.kindsMod.JSXNamespacedNameKind
import typingsJapgolly.astTypes.kindsMod.JSXSpreadAttributeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXOpeningElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXOpeningElementBuilder extends js.Object {
  def apply(name: JSXIdentifierKind): JSXOpeningElement = js.native
  def apply(name: JSXIdentifierKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement = js.native
  def apply(
    name: JSXIdentifierKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  def apply(name: JSXMemberExpressionKind): JSXOpeningElement = js.native
  def apply(name: JSXMemberExpressionKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement = js.native
  def apply(
    name: JSXMemberExpressionKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  def apply(name: JSXNamespacedNameKind): JSXOpeningElement = js.native
  def apply(name: JSXNamespacedNameKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement = js.native
  def apply(
    name: JSXNamespacedNameKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  def from(params: AnonSelfClosing): JSXOpeningElement = js.native
}

