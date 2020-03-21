package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLocTypes
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUnionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSUnionTypeBuilder extends js.Object {
  def apply(types: js.Array[TSTypeKind]): TSUnionType = js.native
  def from(params: AnonLocTypes): TSUnionType = js.native
}

