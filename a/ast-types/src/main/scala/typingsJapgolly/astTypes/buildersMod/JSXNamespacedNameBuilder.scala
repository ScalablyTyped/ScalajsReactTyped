package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonNamespace
import typingsJapgolly.astTypes.kindsMod.JSXIdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXNamespacedName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXNamespacedNameBuilder extends js.Object {
  def apply(namespace: JSXIdentifierKind, name: JSXIdentifierKind): JSXNamespacedName = js.native
  def from(params: AnonNamespace): JSXNamespacedName = js.native
}

