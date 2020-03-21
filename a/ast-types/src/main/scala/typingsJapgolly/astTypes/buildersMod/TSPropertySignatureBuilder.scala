package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonInitializer
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSPropertySignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSPropertySignatureBuilder extends js.Object {
  def apply(key: ExpressionKind): TSPropertySignature = js.native
  def apply(key: ExpressionKind, typeAnnotation: Null, optional: Boolean): TSPropertySignature = js.native
  def apply(key: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): TSPropertySignature = js.native
  def apply(key: ExpressionKind, typeAnnotation: TSTypeAnnotationKind, optional: Boolean): TSPropertySignature = js.native
  def from(params: AnonInitializer): TSPropertySignature = js.native
}

