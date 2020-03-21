package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonComputedKey
import typingsJapgolly.astTypes.kindsMod.ArrayPatternKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.ObjectPatternKind
import typingsJapgolly.astTypes.kindsMod.RestElementKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSMethodSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSMethodSignatureBuilder extends js.Object {
  def apply(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]
  ): TSMethodSignature = js.native
  def apply(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    typeAnnotation: TSTypeAnnotationKind
  ): TSMethodSignature = js.native
  def from(params: AnonComputedKey): TSMethodSignature = js.native
}

