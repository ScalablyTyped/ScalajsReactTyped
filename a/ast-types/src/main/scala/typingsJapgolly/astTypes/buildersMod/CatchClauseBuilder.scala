package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonGuard
import typingsJapgolly.astTypes.kindsMod.BlockStatementKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.CatchClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatchClauseBuilder extends js.Object {
  def apply(param: js.UndefOr[scala.Nothing], guard: js.UndefOr[scala.Nothing], body: BlockStatementKind): CatchClause = js.native
  def apply(param: js.UndefOr[scala.Nothing], guard: Null, body: BlockStatementKind): CatchClause = js.native
  def apply(param: js.UndefOr[scala.Nothing], guard: ExpressionKind, body: BlockStatementKind): CatchClause = js.native
  def apply(param: Null, guard: js.UndefOr[scala.Nothing], body: BlockStatementKind): CatchClause = js.native
  def apply(param: Null, guard: Null, body: BlockStatementKind): CatchClause = js.native
  def apply(param: Null, guard: ExpressionKind, body: BlockStatementKind): CatchClause = js.native
  def apply(param: PatternKind, guard: js.UndefOr[scala.Nothing], body: BlockStatementKind): CatchClause = js.native
  def apply(param: PatternKind, guard: Null, body: BlockStatementKind): CatchClause = js.native
  def apply(param: PatternKind, guard: ExpressionKind, body: BlockStatementKind): CatchClause = js.native
  def from(params: AnonGuard): CatchClause = js.native
}

