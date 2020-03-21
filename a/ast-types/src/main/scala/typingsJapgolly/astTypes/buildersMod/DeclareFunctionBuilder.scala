package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsIdLoc
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareFunctionBuilder extends js.Object {
  def apply(id: IdentifierKind): DeclareFunction = js.native
  def from(params: AnonCommentsIdLoc): DeclareFunction = js.native
}

