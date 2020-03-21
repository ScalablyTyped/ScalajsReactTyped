package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonImplements
import typingsJapgolly.astTypes.kindsMod.ClassBodyKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassDeclarationBuilder extends js.Object {
  def apply(id: Null, body: ClassBodyKind): ClassDeclaration = js.native
  def apply(id: Null, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind): ClassDeclaration = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration = js.native
  def from(params: AnonImplements): ClassDeclaration = js.native
}

