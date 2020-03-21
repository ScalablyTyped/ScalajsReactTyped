package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonAccessibility
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPropertyBuilder extends js.Object {
  def apply(key: ExpressionKind, value: ExpressionKind): ObjectProperty = js.native
  def apply(key: ExpressionKind, value: PatternKind): ObjectProperty = js.native
  def apply(key: IdentifierKind, value: ExpressionKind): ObjectProperty = js.native
  def apply(key: IdentifierKind, value: PatternKind): ObjectProperty = js.native
  def apply(key: LiteralKind, value: ExpressionKind): ObjectProperty = js.native
  def apply(key: LiteralKind, value: PatternKind): ObjectProperty = js.native
  def from(params: AnonAccessibility): ObjectProperty = js.native
}

