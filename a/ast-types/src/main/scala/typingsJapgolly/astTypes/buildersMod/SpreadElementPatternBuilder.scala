package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonArgumentCommentsLoc
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadElementPatternBuilder extends js.Object {
  def apply(argument: PatternKind): SpreadElementPattern = js.native
  def from(params: AnonArgumentCommentsLoc): SpreadElementPattern = js.native
}

