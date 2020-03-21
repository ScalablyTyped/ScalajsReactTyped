package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsIdLoc
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareVariableBuilder extends js.Object {
  def apply(id: IdentifierKind): DeclareVariable = js.native
  def from(params: AnonCommentsIdLoc): DeclareVariable = js.native
}

