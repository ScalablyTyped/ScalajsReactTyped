package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonAccessAccessibility
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.NoopKind
import typingsJapgolly.astTypes.kindsMod.NumericLiteralKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.StringLiteralKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSDeclareMethodBuilder extends js.Object {
  def apply(key: ExpressionKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def apply(key: ExpressionKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def apply(key: ExpressionKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def apply(key: IdentifierKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def apply(key: IdentifierKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def apply(key: IdentifierKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def apply(key: NumericLiteralKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def apply(key: NumericLiteralKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def apply(key: NumericLiteralKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def apply(key: StringLiteralKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def apply(key: StringLiteralKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def apply(key: StringLiteralKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def from(params: AnonAccessAccessibility): TSDeclareMethod = js.native
}

