package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsLabel
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ContinueStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinueStatementBuilder extends js.Object {
  def apply(): ContinueStatement = js.native
  def apply(label: IdentifierKind): ContinueStatement = js.native
  def from(params: AnonCommentsLabel): ContinueStatement = js.native
}

