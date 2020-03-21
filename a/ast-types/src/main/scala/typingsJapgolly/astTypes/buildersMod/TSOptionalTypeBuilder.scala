package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonTypeAnnotationTSTypeKind
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSOptionalType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSOptionalTypeBuilder extends js.Object {
  def apply(typeAnnotation: TSTypeKind): TSOptionalType = js.native
  def from(params: AnonTypeAnnotationTSTypeKind): TSOptionalType = js.native
}

