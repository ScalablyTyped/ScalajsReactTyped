package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonBlock
import typingsJapgolly.astTypes.kindsMod.BlockStatementKind
import typingsJapgolly.astTypes.kindsMod.CatchClauseKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TryStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TryStatementBuilder extends js.Object {
  def apply(block: BlockStatementKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: Null, finalizer: BlockStatementKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: CatchClauseKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: CatchClauseKind, finalizer: BlockStatementKind): TryStatement = js.native
  def from(params: AnonBlock): TryStatement = js.native
}

