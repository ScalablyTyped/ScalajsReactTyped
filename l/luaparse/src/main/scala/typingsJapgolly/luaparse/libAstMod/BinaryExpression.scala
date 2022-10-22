package typingsJapgolly.luaparse.libAstMod

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryExpression
  extends StObject
     with Base[typingsJapgolly.luaparse.luaparseStrings.BinaryExpression]
     with Expression {
  
  var left: Expression
  
  var operator: Plussign | `-_` | Asterisk | Percentsign | ^ | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
  
  var right: Expression
}
object BinaryExpression {
  
  inline def apply(
    left: Expression,
    operator: Plussign | `-_` | Asterisk | Percentsign | ^ | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
    right: Expression
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[BinaryExpression]
  }
  
  extension [Self <: BinaryExpression](x: Self) {
    
    inline def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(
      value: Plussign | `-_` | Asterisk | Percentsign | ^ | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
