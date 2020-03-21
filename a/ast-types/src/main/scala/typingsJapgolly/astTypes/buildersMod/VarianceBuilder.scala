package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsKind
import typingsJapgolly.astTypes.astTypesStrings.minus
import typingsJapgolly.astTypes.astTypesStrings.plus
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Variance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VarianceBuilder extends js.Object {
  def apply(kind: minus): Variance = js.native
  def apply(kind: plus): Variance = js.native
  def from(params: AnonCommentsKind): Variance = js.native
}

