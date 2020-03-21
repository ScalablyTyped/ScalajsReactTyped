package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonBound
import typingsJapgolly.astTypes.astTypesStrings.minus
import typingsJapgolly.astTypes.astTypesStrings.plus
import typingsJapgolly.astTypes.kindsMod.TypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.VarianceKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeParameterBuilder extends js.Object {
  def apply(name: String): TypeParameter = js.native
  def apply(name: String, variance: Null, bound: TypeAnnotationKind): TypeParameter = js.native
  def apply(name: String, variance: minus): TypeParameter = js.native
  def apply(name: String, variance: minus, bound: TypeAnnotationKind): TypeParameter = js.native
  def apply(name: String, variance: plus): TypeParameter = js.native
  def apply(name: String, variance: plus, bound: TypeAnnotationKind): TypeParameter = js.native
  def apply(name: String, variance: VarianceKind): TypeParameter = js.native
  def apply(name: String, variance: VarianceKind, bound: TypeAnnotationKind): TypeParameter = js.native
  def from(params: AnonBound): TypeParameter = js.native
}

