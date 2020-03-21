package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonTypeParameter
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInferType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSInferTypeBuilder extends js.Object {
  def apply(typeParameter: TSTypeParameterKind): TSInferType = js.native
  def from(params: AnonTypeParameter): TSInferType = js.native
}

