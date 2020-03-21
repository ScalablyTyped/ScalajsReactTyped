package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonArgumentCommentsLoc
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadPropertyPatternBuilder extends js.Object {
  def apply(argument: PatternKind): SpreadPropertyPattern = js.native
  def from(params: AnonArgumentCommentsLoc): SpreadPropertyPattern = js.native
}

