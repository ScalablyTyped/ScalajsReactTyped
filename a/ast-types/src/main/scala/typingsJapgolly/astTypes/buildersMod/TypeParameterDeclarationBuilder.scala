package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonParams
import typingsJapgolly.astTypes.kindsMod.TypeParameterKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeParameterDeclarationBuilder extends js.Object {
  def apply(params: js.Array[TypeParameterKind]): TypeParameterDeclaration = js.native
  def from(params: AnonParams): TypeParameterDeclaration = js.native
}

