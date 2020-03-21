package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonName
import typingsJapgolly.astTypes.kindsMod.JSXExpressionContainerKind
import typingsJapgolly.astTypes.kindsMod.JSXIdentifierKind
import typingsJapgolly.astTypes.kindsMod.JSXNamespacedNameKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXAttributeBuilder extends js.Object {
  def apply(name: JSXIdentifierKind): JSXAttribute = js.native
  def apply(name: JSXIdentifierKind, value: JSXExpressionContainerKind): JSXAttribute = js.native
  def apply(name: JSXIdentifierKind, value: LiteralKind): JSXAttribute = js.native
  def apply(name: JSXNamespacedNameKind): JSXAttribute = js.native
  def apply(name: JSXNamespacedNameKind, value: JSXExpressionContainerKind): JSXAttribute = js.native
  def apply(name: JSXNamespacedNameKind, value: LiteralKind): JSXAttribute = js.native
  def from(params: AnonName): JSXAttribute = js.native
}

