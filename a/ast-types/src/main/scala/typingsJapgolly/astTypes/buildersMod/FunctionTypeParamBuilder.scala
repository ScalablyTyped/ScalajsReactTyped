package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonOptional
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionTypeParamBuilder extends js.Object {
  def apply(name: IdentifierKind, typeAnnotation: FlowTypeKind, optional: Boolean): FunctionTypeParam = js.native
  def from(params: AnonOptional): FunctionTypeParam = js.native
}

