package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonDeclare
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.NoopKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSDeclareFunctionBuilder extends js.Object {
  def apply(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind]): TSDeclareFunction = js.native
  def apply(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction = js.native
  def apply(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction = js.native
  def apply(id: Null, params: js.Array[PatternKind]): TSDeclareFunction = js.native
  def apply(id: Null, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction = js.native
  def apply(id: Null, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind]): TSDeclareFunction = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction = js.native
  def from(params: AnonDeclare): TSDeclareFunction = js.native
}

