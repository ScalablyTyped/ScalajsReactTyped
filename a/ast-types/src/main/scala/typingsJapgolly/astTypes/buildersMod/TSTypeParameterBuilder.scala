package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonConstraint
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameterBuilder extends js.Object {
  def apply(name: String): TSTypeParameter = js.native
  def apply(name: String, constraint: js.UndefOr[scala.Nothing], defaultParam: TSTypeKind): TSTypeParameter = js.native
  def apply(name: String, constraint: TSTypeKind): TSTypeParameter = js.native
  def apply(name: String, constraint: TSTypeKind, defaultParam: TSTypeKind): TSTypeParameter = js.native
  def from(params: AnonConstraint): TSTypeParameter = js.native
}

