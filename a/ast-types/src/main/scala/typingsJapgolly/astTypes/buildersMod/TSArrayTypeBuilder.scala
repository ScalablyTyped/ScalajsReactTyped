package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsElementType
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSArrayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSArrayTypeBuilder extends js.Object {
  def apply(elementType: TSTypeKind): TSArrayType = js.native
  def from(params: AnonCommentsElementType): TSArrayType = js.native
}

