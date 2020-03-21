package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonElementTypes
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTupleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTupleTypeBuilder extends js.Object {
  def apply(elementTypes: js.Array[TSTypeKind]): TSTupleType = js.native
  def from(params: AnonElementTypes): TSTupleType = js.native
}

