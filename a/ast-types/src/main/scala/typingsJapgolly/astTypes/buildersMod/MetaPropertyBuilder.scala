package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonMeta
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.MetaProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaPropertyBuilder extends js.Object {
  def apply(meta: IdentifierKind, property: IdentifierKind): MetaProperty = js.native
  def from(params: AnonMeta): MetaProperty = js.native
}

