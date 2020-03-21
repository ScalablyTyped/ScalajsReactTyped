package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonVariance
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypePropertyBuilder extends js.Object {
  def apply(key: IdentifierKind, value: FlowTypeKind, optional: Boolean): ObjectTypeProperty = js.native
  def apply(key: LiteralKind, value: FlowTypeKind, optional: Boolean): ObjectTypeProperty = js.native
  def from(params: AnonVariance): ObjectTypeProperty = js.native
}

