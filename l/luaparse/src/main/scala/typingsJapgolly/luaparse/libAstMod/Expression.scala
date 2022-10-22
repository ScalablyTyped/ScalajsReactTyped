package typingsJapgolly.luaparse.libAstMod

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.luaparse.libAstMod.FunctionDeclaration
  - typingsJapgolly.luaparse.libAstMod.Identifier
  - typingsJapgolly.luaparse.libAstMod.StringLiteral
  - typingsJapgolly.luaparse.libAstMod.NumericLiteral
  - typingsJapgolly.luaparse.libAstMod.BooleanLiteral
  - typingsJapgolly.luaparse.libAstMod.NilLiteral
  - typingsJapgolly.luaparse.libAstMod.VarargLiteral
  - typingsJapgolly.luaparse.libAstMod.TableConstructorExpression
  - typingsJapgolly.luaparse.libAstMod.BinaryExpression
  - typingsJapgolly.luaparse.libAstMod.LogicalExpression
  - typingsJapgolly.luaparse.libAstMod.UnaryExpression
  - typingsJapgolly.luaparse.libAstMod.MemberExpression
  - typingsJapgolly.luaparse.libAstMod.IndexExpression
  - typingsJapgolly.luaparse.libAstMod.CallExpression
  - typingsJapgolly.luaparse.libAstMod.TableCallExpression
  - typingsJapgolly.luaparse.libAstMod.StringCallExpression
*/
trait Expression
  extends StObject
     with _Node
object Expression {
  
  inline def BinaryExpression(
    left: Expression,
    operator: Plussign | `-_` | Asterisk | Percentsign | ^ | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
    right: Expression
  ): typingsJapgolly.luaparse.libAstMod.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.BinaryExpression]
  }
  
  inline def BooleanLiteral(raw: String, value: Boolean): typingsJapgolly.luaparse.libAstMod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.BooleanLiteral]
  }
  
  inline def CallExpression(arguments: js.Array[Expression], base: Expression): typingsJapgolly.luaparse.libAstMod.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.CallExpression]
  }
  
  inline def FunctionDeclaration(body: js.Array[Statement], isLocal: Boolean, parameters: js.Array[Identifier | VarargLiteral]): typingsJapgolly.luaparse.libAstMod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], identifier = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.FunctionDeclaration]
  }
  
  inline def Identifier(name: String): typingsJapgolly.luaparse.libAstMod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.Identifier]
  }
  
  inline def IndexExpression(base: Expression, index: Expression): typingsJapgolly.luaparse.libAstMod.IndexExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IndexExpression")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.IndexExpression]
  }
  
  inline def LogicalExpression(left: Expression, operator: or | and, right: Expression): typingsJapgolly.luaparse.libAstMod.LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.LogicalExpression]
  }
  
  inline def MemberExpression(base: Expression, identifier: Identifier, indexer: Dot | Colon): typingsJapgolly.luaparse.libAstMod.MemberExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.MemberExpression]
  }
  
  inline def NilLiteral(raw: String, value: Null): typingsJapgolly.luaparse.libAstMod.NilLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NilLiteral")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.NilLiteral]
  }
  
  inline def NumericLiteral(raw: String, value: Double): typingsJapgolly.luaparse.libAstMod.NumericLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.NumericLiteral]
  }
  
  inline def StringCallExpression(argument: Expression, base: Expression): typingsJapgolly.luaparse.libAstMod.StringCallExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringCallExpression")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.StringCallExpression]
  }
  
  inline def StringLiteral(raw: String, value: String): typingsJapgolly.luaparse.libAstMod.StringLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.StringLiteral]
  }
  
  inline def TableCallExpression(arguments: Expression, base: Expression): typingsJapgolly.luaparse.libAstMod.TableCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableCallExpression")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.TableCallExpression]
  }
  
  inline def TableConstructorExpression(fields: js.Array[TableKey | TableKeyString | TableValue]): typingsJapgolly.luaparse.libAstMod.TableConstructorExpression = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableConstructorExpression")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.TableConstructorExpression]
  }
  
  inline def UnaryExpression(argument: Expression, operator: not | `-_` | Tilde | Numbersign): typingsJapgolly.luaparse.libAstMod.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.UnaryExpression]
  }
  
  inline def VarargLiteral(raw: String, value: String): typingsJapgolly.luaparse.libAstMod.VarargLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VarargLiteral")
    __obj.asInstanceOf[typingsJapgolly.luaparse.libAstMod.VarargLiteral]
  }
}
