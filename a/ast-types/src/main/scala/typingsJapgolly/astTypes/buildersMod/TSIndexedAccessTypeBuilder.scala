package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonIndexType
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSIndexedAccessTypeBuilder extends js.Object {
  def apply(objectType: TSTypeKind, indexType: TSTypeKind): TSIndexedAccessType = js.native
  def from(params: AnonIndexType): TSIndexedAccessType = js.native
}

