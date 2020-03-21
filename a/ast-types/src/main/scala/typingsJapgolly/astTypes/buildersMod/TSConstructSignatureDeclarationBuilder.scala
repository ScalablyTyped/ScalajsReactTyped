package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonParameters
import typingsJapgolly.astTypes.kindsMod.ArrayPatternKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.ObjectPatternKind
import typingsJapgolly.astTypes.kindsMod.RestElementKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSConstructSignatureDeclarationBuilder extends js.Object {
  def apply(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSConstructSignatureDeclaration = js.native
  def apply(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    typeAnnotation: TSTypeAnnotationKind
  ): TSConstructSignatureDeclaration = js.native
  def from(params: AnonParameters): TSConstructSignatureDeclaration = js.native
}

