package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsExtends
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.InterfaceExtendsKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeAnnotationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceDeclaration = js.native
  def from(params: AnonCommentsExtends): InterfaceDeclaration = js.native
}

