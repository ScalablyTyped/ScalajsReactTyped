package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsLabel
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.BreakStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreakStatementBuilder extends js.Object {
  def apply(): BreakStatement = js.native
  def apply(label: IdentifierKind): BreakStatement = js.native
  def from(params: AnonCommentsLabel): BreakStatement = js.native
}

