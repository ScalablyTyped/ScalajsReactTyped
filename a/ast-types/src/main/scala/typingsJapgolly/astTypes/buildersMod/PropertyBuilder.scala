package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonComputed
import typingsJapgolly.astTypes.astTypesStrings.get
import typingsJapgolly.astTypes.astTypesStrings.init
import typingsJapgolly.astTypes.astTypesStrings.set
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyBuilder extends js.Object {
  def apply(kind: get, key: ExpressionKind, value: ExpressionKind): Property = js.native
  def apply(kind: get, key: ExpressionKind, value: PatternKind): Property = js.native
  def apply(kind: get, key: IdentifierKind, value: ExpressionKind): Property = js.native
  def apply(kind: get, key: IdentifierKind, value: PatternKind): Property = js.native
  def apply(kind: get, key: LiteralKind, value: ExpressionKind): Property = js.native
  def apply(kind: get, key: LiteralKind, value: PatternKind): Property = js.native
  def apply(kind: init, key: ExpressionKind, value: ExpressionKind): Property = js.native
  def apply(kind: init, key: ExpressionKind, value: PatternKind): Property = js.native
  def apply(kind: init, key: IdentifierKind, value: ExpressionKind): Property = js.native
  def apply(kind: init, key: IdentifierKind, value: PatternKind): Property = js.native
  def apply(kind: init, key: LiteralKind, value: ExpressionKind): Property = js.native
  def apply(kind: init, key: LiteralKind, value: PatternKind): Property = js.native
  def apply(kind: set, key: ExpressionKind, value: ExpressionKind): Property = js.native
  def apply(kind: set, key: ExpressionKind, value: PatternKind): Property = js.native
  def apply(kind: set, key: IdentifierKind, value: ExpressionKind): Property = js.native
  def apply(kind: set, key: IdentifierKind, value: PatternKind): Property = js.native
  def apply(kind: set, key: LiteralKind, value: ExpressionKind): Property = js.native
  def apply(kind: set, key: LiteralKind, value: PatternKind): Property = js.native
  def from(params: AnonComputed): Property = js.native
}

