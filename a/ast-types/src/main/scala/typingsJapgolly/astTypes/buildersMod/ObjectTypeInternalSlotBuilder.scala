package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonMethod
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeInternalSlotBuilder extends js.Object {
  def apply(id: IdentifierKind, value: FlowTypeKind, optional: Boolean, staticParam: Boolean, method: Boolean): ObjectTypeInternalSlot = js.native
  def from(params: AnonMethod): ObjectTypeInternalSlot = js.native
}

