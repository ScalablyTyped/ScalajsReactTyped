package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLocRight
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.AssignmentPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignmentPatternBuilder extends js.Object {
  def apply(left: PatternKind, right: ExpressionKind): AssignmentPattern = js.native
  def from(params: AnonLocRight): AssignmentPattern = js.native
}

