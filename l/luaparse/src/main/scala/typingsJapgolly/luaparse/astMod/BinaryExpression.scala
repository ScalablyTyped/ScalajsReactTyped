package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import typingsJapgolly.luaparse.luaparseStrings.Ampersand
import typingsJapgolly.luaparse.luaparseStrings.Asterisk
import typingsJapgolly.luaparse.luaparseStrings.DotDot
import typingsJapgolly.luaparse.luaparseStrings.EqualssignEqualssign
import typingsJapgolly.luaparse.luaparseStrings.Greaterthansign
import typingsJapgolly.luaparse.luaparseStrings.GreaterthansignEqualssign
import typingsJapgolly.luaparse.luaparseStrings.GreaterthansignGreaterthansign
import typingsJapgolly.luaparse.luaparseStrings.Lessthansign
import typingsJapgolly.luaparse.luaparseStrings.LessthansignEqualssign
import typingsJapgolly.luaparse.luaparseStrings.LessthansignLessthansign
import typingsJapgolly.luaparse.luaparseStrings.Percentsign
import typingsJapgolly.luaparse.luaparseStrings.Plussign
import typingsJapgolly.luaparse.luaparseStrings.Slash
import typingsJapgolly.luaparse.luaparseStrings.SlashSlash
import typingsJapgolly.luaparse.luaparseStrings.Tilde
import typingsJapgolly.luaparse.luaparseStrings.TildeEqualssign
import typingsJapgolly.luaparse.luaparseStrings.Verticalline
import typingsJapgolly.luaparse.luaparseStrings.^
import typingsJapgolly.luaparse.luaparseStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryExpression
  extends Expression
     with Base[typingsJapgolly.luaparse.luaparseStrings.BinaryExpression] {
  var left: Expression
  var operator: Plussign | `-_` | Asterisk | Percentsign | ^  | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
  var right: Expression
}

object BinaryExpression {
  @scala.inline
  def apply(
    left: Expression,
    operator: Plussign | `-_` | Asterisk | Percentsign | ^  | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
    right: Expression,
    `type`: typingsJapgolly.luaparse.luaparseStrings.BinaryExpression,
    loc: AnonEnd = null
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression]
  }
}

