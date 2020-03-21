package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonParameter
import typingsJapgolly.astTypes.kindsMod.AssignmentPatternKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSParameterProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSParameterPropertyBuilder extends js.Object {
  def apply(parameter: AssignmentPatternKind): TSParameterProperty = js.native
  def apply(parameter: IdentifierKind): TSParameterProperty = js.native
  def from(params: AnonParameter): TSParameterProperty = js.native
}

