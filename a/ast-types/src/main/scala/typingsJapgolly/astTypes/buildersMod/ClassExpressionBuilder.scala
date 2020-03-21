package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonSuperClass
import typingsJapgolly.astTypes.kindsMod.ClassBodyKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassExpressionBuilder extends js.Object {
  def apply(id: js.UndefOr[scala.Nothing], body: ClassBodyKind): ClassExpression = js.native
  def apply(id: js.UndefOr[scala.Nothing], body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  def apply(id: Null, body: ClassBodyKind): ClassExpression = js.native
  def apply(id: Null, body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind): ClassExpression = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  def from(params: AnonSuperClass): ClassExpression = js.native
}

