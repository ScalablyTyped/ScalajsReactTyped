package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLocTypes
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIntersectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSIntersectionTypeBuilder extends js.Object {
  def apply(types: js.Array[TSTypeKind]): TSIntersectionType = js.native
  def from(params: AnonLocTypes): TSIntersectionType = js.native
}

