package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonReadonly
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSMappedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSMappedTypeBuilder extends js.Object {
  def apply(typeParameter: TSTypeParameterKind): TSMappedType = js.native
  def apply(typeParameter: TSTypeParameterKind, typeAnnotation: TSTypeKind): TSMappedType = js.native
  def from(params: AnonReadonly): TSMappedType = js.native
}

