package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsId
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeIndexerBuilder extends js.Object {
  def apply(id: IdentifierKind, key: FlowTypeKind, value: FlowTypeKind): ObjectTypeIndexer = js.native
  def from(params: AnonCommentsId): ObjectTypeIndexer = js.native
}

