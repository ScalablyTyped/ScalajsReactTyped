package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonImpltype
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.OpaqueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpaqueTypeBuilder extends js.Object {
  def apply(id: IdentifierKind, typeParameters: Null, impltype: FlowTypeKind, supertype: FlowTypeKind): OpaqueType = js.native
  def apply(
    id: IdentifierKind,
    typeParameters: TypeParameterDeclarationKind,
    impltype: FlowTypeKind,
    supertype: FlowTypeKind
  ): OpaqueType = js.native
  def from(params: AnonImpltype): OpaqueType = js.native
}

