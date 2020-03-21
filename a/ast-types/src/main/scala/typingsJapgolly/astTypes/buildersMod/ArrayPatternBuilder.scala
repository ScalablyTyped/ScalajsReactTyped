package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsElements
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.SpreadElementKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayPatternBuilder extends js.Object {
  def apply(elements: js.Array[PatternKind | SpreadElementKind | Null]): ArrayPattern = js.native
  def from(params: AnonCommentsElements): ArrayPattern = js.native
}

