package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLocParameters
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIndexSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSIndexSignatureBuilder extends js.Object {
  def apply(parameters: js.Array[IdentifierKind]): TSIndexSignature = js.native
  def apply(parameters: js.Array[IdentifierKind], typeAnnotation: TSTypeAnnotationKind): TSIndexSignature = js.native
  def from(params: AnonLocParameters): TSIndexSignature = js.native
}

