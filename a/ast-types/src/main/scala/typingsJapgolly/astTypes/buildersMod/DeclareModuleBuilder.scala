package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonBodyCommentsId
import typingsJapgolly.astTypes.kindsMod.BlockStatementKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareModuleBuilder extends js.Object {
  def apply(id: IdentifierKind, body: BlockStatementKind): DeclareModule = js.native
  def apply(id: LiteralKind, body: BlockStatementKind): DeclareModule = js.native
  def from(params: AnonBodyCommentsId): DeclareModule = js.native
}

