package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonConst
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.TSEnumMemberKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSEnumDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, members: js.Array[TSEnumMemberKind]): TSEnumDeclaration = js.native
  def from(params: AnonConst): TSEnumDeclaration = js.native
}

