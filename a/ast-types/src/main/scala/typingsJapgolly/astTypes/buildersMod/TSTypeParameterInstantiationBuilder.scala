package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonParamsArray
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameterInstantiationBuilder extends js.Object {
  def apply(params: js.Array[TSTypeKind]): TSTypeParameterInstantiation = js.native
  def from(params: AnonParamsArray): TSTypeParameterInstantiation = js.native
}

