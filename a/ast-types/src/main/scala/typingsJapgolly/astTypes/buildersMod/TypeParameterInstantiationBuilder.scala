package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsLocParams
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeParameterInstantiationBuilder extends js.Object {
  def apply(params: js.Array[FlowTypeKind]): TypeParameterInstantiation = js.native
  def from(params: AnonCommentsLocParams): TypeParameterInstantiation = js.native
}

