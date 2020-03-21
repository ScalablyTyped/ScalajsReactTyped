package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonReturnType
import typingsJapgolly.astTypes.astTypesStrings.get
import typingsJapgolly.astTypes.astTypesStrings.method
import typingsJapgolly.astTypes.astTypesStrings.set
import typingsJapgolly.astTypes.kindsMod.BlockStatementKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectMethodBuilder extends js.Object {
  def apply(kind: get, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: get,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: get, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: get,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: get, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: get,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: method, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: method,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: method, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: method,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: method, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: method,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: set, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: set,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: set, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: set,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: set, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: set,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def from(params: AnonReturnType): ObjectMethod = js.native
}

