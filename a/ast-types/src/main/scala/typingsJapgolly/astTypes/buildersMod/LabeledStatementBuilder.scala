package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLabel
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.LabeledStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabeledStatementBuilder extends js.Object {
  def apply(label: IdentifierKind, body: StatementKind): LabeledStatement = js.native
  def from(params: AnonLabel): LabeledStatement = js.native
}

