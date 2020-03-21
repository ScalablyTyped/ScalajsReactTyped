package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLocParams
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameterDeclarationBuilder extends js.Object {
  def apply(params: js.Array[TSTypeParameterKind]): TSTypeParameterDeclaration = js.native
  def from(params: AnonLocParams): TSTypeParameterDeclaration = js.native
}

