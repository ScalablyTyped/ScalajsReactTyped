package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsLocValue
import typingsJapgolly.astTypes.kindsMod.DirectiveLiteralKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Directive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectiveBuilder extends js.Object {
  def apply(value: DirectiveLiteralKind): Directive = js.native
  def from(params: AnonCommentsLocValue): Directive = js.native
}

