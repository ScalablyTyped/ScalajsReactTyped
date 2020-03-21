package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import typingsJapgolly.luaparse.luaparseStrings.Ampersand
import typingsJapgolly.luaparse.luaparseStrings.Asterisk
import typingsJapgolly.luaparse.luaparseStrings.Colon
import typingsJapgolly.luaparse.luaparseStrings.Dot
import typingsJapgolly.luaparse.luaparseStrings.DotDot
import typingsJapgolly.luaparse.luaparseStrings.EqualssignEqualssign
import typingsJapgolly.luaparse.luaparseStrings.Greaterthansign
import typingsJapgolly.luaparse.luaparseStrings.GreaterthansignEqualssign
import typingsJapgolly.luaparse.luaparseStrings.GreaterthansignGreaterthansign
import typingsJapgolly.luaparse.luaparseStrings.Lessthansign
import typingsJapgolly.luaparse.luaparseStrings.LessthansignEqualssign
import typingsJapgolly.luaparse.luaparseStrings.LessthansignLessthansign
import typingsJapgolly.luaparse.luaparseStrings.Numbersign
import typingsJapgolly.luaparse.luaparseStrings.Percentsign
import typingsJapgolly.luaparse.luaparseStrings.Plussign
import typingsJapgolly.luaparse.luaparseStrings.Slash
import typingsJapgolly.luaparse.luaparseStrings.SlashSlash
import typingsJapgolly.luaparse.luaparseStrings.Tilde
import typingsJapgolly.luaparse.luaparseStrings.TildeEqualssign
import typingsJapgolly.luaparse.luaparseStrings.Verticalline
import typingsJapgolly.luaparse.luaparseStrings.^
import typingsJapgolly.luaparse.luaparseStrings.`-_`
import typingsJapgolly.luaparse.luaparseStrings.and
import typingsJapgolly.luaparse.luaparseStrings.not
import typingsJapgolly.luaparse.luaparseStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.luaparse.astMod.FunctionDeclaration
  - typingsJapgolly.luaparse.astMod.Identifier
  - typingsJapgolly.luaparse.astMod.StringLiteral
  - typingsJapgolly.luaparse.astMod.NumericLiteral
  - typingsJapgolly.luaparse.astMod.BooleanLiteral
  - typingsJapgolly.luaparse.astMod.NilLiteral
  - typingsJapgolly.luaparse.astMod.VarargLiteral
  - typingsJapgolly.luaparse.astMod.TableConstructorExpression
  - typingsJapgolly.luaparse.astMod.BinaryExpression
  - typingsJapgolly.luaparse.astMod.LogicalExpression
  - typingsJapgolly.luaparse.astMod.UnaryExpression
  - typingsJapgolly.luaparse.astMod.MemberExpression
  - typingsJapgolly.luaparse.astMod.IndexExpression
  - typingsJapgolly.luaparse.astMod.CallExpression
  - typingsJapgolly.luaparse.astMod.TableCallExpression
  - typingsJapgolly.luaparse.astMod.StringCallExpression
*/
trait Expression extends _Node

object Expression {
  @scala.inline
  def Identifier(name: String, `type`: typingsJapgolly.luaparse.luaparseStrings.Identifier, loc: AnonEnd = null): Expression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def TableConstructorExpression(
    fields: js.Array[TableKey | TableKeyString | TableValue],
    `type`: typingsJapgolly.luaparse.luaparseStrings.TableConstructorExpression,
    loc: AnonEnd = null
  ): Expression = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def IndexExpression(
    base: Expression,
    index: Expression,
    `type`: typingsJapgolly.luaparse.luaparseStrings.IndexExpression,
    loc: AnonEnd = null
  ): Expression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def FunctionDeclaration(
    body: js.Array[Statement],
    isLocal: Boolean,
    parameters: js.Array[Identifier | VarargLiteral],
    `type`: typingsJapgolly.luaparse.luaparseStrings.FunctionDeclaration,
    identifier: Identifier | MemberExpression = null,
    loc: AnonEnd = null
  ): Expression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def BooleanLiteral(
    raw: String,
    `type`: typingsJapgolly.luaparse.luaparseStrings.BooleanLiteral,
    value: Boolean,
    loc: AnonEnd = null
  ): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def UnaryExpression(
    argument: Expression,
    operator: not | `-_` | Tilde | Numbersign,
    `type`: typingsJapgolly.luaparse.luaparseStrings.UnaryExpression,
    loc: AnonEnd = null
  ): Expression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def LogicalExpression(
    left: Expression,
    operator: or | and,
    right: Expression,
    `type`: typingsJapgolly.luaparse.luaparseStrings.LogicalExpression,
    loc: AnonEnd = null
  ): Expression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def StringLiteral(
    raw: String,
    `type`: typingsJapgolly.luaparse.luaparseStrings.StringLiteral,
    value: String,
    loc: AnonEnd = null
  ): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def NilLiteral(
    raw: String,
    `type`: typingsJapgolly.luaparse.luaparseStrings.NilLiteral,
    value: Null,
    loc: AnonEnd = null
  ): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def CallExpression(
    arguments: js.Array[Expression],
    base: Expression,
    `type`: typingsJapgolly.luaparse.luaparseStrings.CallExpression,
    loc: AnonEnd = null
  ): Expression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def VarargLiteral(
    raw: String,
    `type`: typingsJapgolly.luaparse.luaparseStrings.VarargLiteral,
    value: String,
    loc: AnonEnd = null
  ): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def NumericLiteral(
    raw: String,
    `type`: typingsJapgolly.luaparse.luaparseStrings.NumericLiteral,
    value: Double,
    loc: AnonEnd = null
  ): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def StringCallExpression(
    argument: Expression,
    base: Expression,
    `type`: typingsJapgolly.luaparse.luaparseStrings.StringCallExpression,
    loc: AnonEnd = null
  ): Expression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def MemberExpression(
    base: Expression,
    identifier: Identifier,
    indexer: Dot | Colon,
    `type`: typingsJapgolly.luaparse.luaparseStrings.MemberExpression,
    loc: AnonEnd = null
  ): Expression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def TableCallExpression(
    arguments: Expression,
    base: Expression,
    `type`: typingsJapgolly.luaparse.luaparseStrings.TableCallExpression,
    loc: AnonEnd = null
  ): Expression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def BinaryExpression(
    left: Expression,
    operator: Plussign | `-_` | Asterisk | Percentsign | ^  | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
    right: Expression,
    `type`: typingsJapgolly.luaparse.luaparseStrings.BinaryExpression,
    loc: AnonEnd = null
  ): Expression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
}

