package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonDeclareExtends
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.TSInterfaceBodyKind
import typingsJapgolly.astTypes.kindsMod.TSQualifiedNameKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSInterfaceDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, body: TSInterfaceBodyKind): TSInterfaceDeclaration = js.native
  def apply(id: TSQualifiedNameKind, body: TSInterfaceBodyKind): TSInterfaceDeclaration = js.native
  def from(params: AnonDeclareExtends): TSInterfaceDeclaration = js.native
}

