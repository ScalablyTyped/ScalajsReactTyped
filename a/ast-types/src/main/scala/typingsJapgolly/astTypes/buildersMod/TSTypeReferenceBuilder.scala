package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonTypeName
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.TSQualifiedNameKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeReferenceBuilder extends js.Object {
  def apply(typeName: IdentifierKind): TSTypeReference = js.native
  def apply(typeName: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference = js.native
  def apply(typeName: TSQualifiedNameKind): TSTypeReference = js.native
  def apply(typeName: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference = js.native
  def from(params: AnonTypeName): TSTypeReference = js.native
}

