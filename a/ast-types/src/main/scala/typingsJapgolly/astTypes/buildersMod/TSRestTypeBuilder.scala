package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonTypeAnnotationTSTypeKind
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSRestType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSRestTypeBuilder extends js.Object {
  def apply(typeAnnotation: TSTypeKind): TSRestType = js.native
  def from(params: AnonTypeAnnotationTSTypeKind): TSRestType = js.native
}

