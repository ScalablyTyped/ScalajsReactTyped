package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonDirectives
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.BlockStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockStatementBuilder extends js.Object {
  def apply(body: js.Array[StatementKind]): BlockStatement = js.native
  def from(params: AnonDirectives): BlockStatement = js.native
}

