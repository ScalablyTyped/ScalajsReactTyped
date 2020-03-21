package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonEach
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ComprehensionBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComprehensionBlockBuilder extends js.Object {
  def apply(left: PatternKind, right: ExpressionKind, each: Boolean): ComprehensionBlock = js.native
  def from(params: AnonEach): ComprehensionBlock = js.native
}

