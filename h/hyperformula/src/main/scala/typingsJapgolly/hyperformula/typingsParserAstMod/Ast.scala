package typingsJapgolly.hyperformula.typingsParserAstMod

import typingsJapgolly.hyperformula.typingsCellMod.CellError
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.ARRAY
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.CELL_RANGE
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.CELL_REFERENCE
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.COLUMN_RANGE
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.CONCATENATE_OP
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.DIV_OP
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.EMPTY
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.EQUALS_OP
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.ERROR
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.ERROR_WITH_RAW_INPUT
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.FUNCTION_CALL
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.GREATER_THAN_OP
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.GREATER_THAN_OR_EQUAL_OP
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.LESS_THAN_OP
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.LESS_THAN_OR_EQUAL_OP
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.MINUS_OP
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.MINUS_UNARY_OP
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.NAMED_EXPRESSION
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.NOT_EQUAL_OP
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.NUMBER
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.PARENTHESIS
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.PERCENT_OP
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.PLUS_OP
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.PLUS_UNARY_OP
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.POWER_OP
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.ROW_RANGE
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.STRING
import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.TIMES_OP
import typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress
import typingsJapgolly.hyperformula.typingsParserColumnAddressMod.ColumnAddress
import typingsJapgolly.hyperformula.typingsParserRowAddressMod.RowAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hyperformula.typingsParserAstMod.NumberAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.StringAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.CellReferenceAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.CellRangeAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.ColumnRangeAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.RowRangeAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.ConcatenateOpAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.MinusUnaryOpAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.PlusUnaryOpAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.PercentOpAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.EqualsOpAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.NotEqualOpAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.GreaterThanOpAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.LessThanOpAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.LessThanOrEqualOpAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.GreaterThanOrEqualOpAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.PlusOpAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.MinusOpAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.TimesOpAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.DivOpAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.PowerOpAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.NamedExpressionAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.ParenthesisAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.ErrorAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.ErrorWithRawInputAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.EmptyArgAst
  - typingsJapgolly.hyperformula.typingsParserAstMod.ArrayAst
*/
trait Ast extends StObject
object Ast {
  
  inline def ArrayAst(args: js.Array[js.Array[Ast]], `type`: ARRAY): typingsJapgolly.hyperformula.typingsParserAstMod.ArrayAst = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.ArrayAst]
  }
  
  inline def CellRangeAst(
    end: CellAddress,
    sheetReferenceType: RangeSheetReferenceType,
    start: CellAddress,
    `type`: CELL_RANGE
  ): typingsJapgolly.hyperformula.typingsParserAstMod.CellRangeAst = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], sheetReferenceType = sheetReferenceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.CellRangeAst]
  }
  
  inline def CellReferenceAst(reference: CellAddress, `type`: CELL_REFERENCE): typingsJapgolly.hyperformula.typingsParserAstMod.CellReferenceAst = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.CellReferenceAst]
  }
  
  inline def ColumnRangeAst(
    end: ColumnAddress,
    sheetReferenceType: RangeSheetReferenceType,
    start: ColumnAddress,
    `type`: COLUMN_RANGE
  ): typingsJapgolly.hyperformula.typingsParserAstMod.ColumnRangeAst = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], sheetReferenceType = sheetReferenceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.ColumnRangeAst]
  }
  
  inline def ConcatenateOpAst(left: Ast, right: Ast, `type`: CONCATENATE_OP): typingsJapgolly.hyperformula.typingsParserAstMod.ConcatenateOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.ConcatenateOpAst]
  }
  
  inline def DivOpAst(left: Ast, right: Ast, `type`: DIV_OP): typingsJapgolly.hyperformula.typingsParserAstMod.DivOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.DivOpAst]
  }
  
  inline def EmptyArgAst(`type`: EMPTY): typingsJapgolly.hyperformula.typingsParserAstMod.EmptyArgAst = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.EmptyArgAst]
  }
  
  inline def EqualsOpAst(left: Ast, right: Ast, `type`: EQUALS_OP): typingsJapgolly.hyperformula.typingsParserAstMod.EqualsOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.EqualsOpAst]
  }
  
  inline def ErrorAst(error: CellError, `type`: ERROR): typingsJapgolly.hyperformula.typingsParserAstMod.ErrorAst = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.ErrorAst]
  }
  
  inline def ErrorWithRawInputAst(error: CellError, rawInput: String, `type`: ERROR_WITH_RAW_INPUT): typingsJapgolly.hyperformula.typingsParserAstMod.ErrorWithRawInputAst = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], rawInput = rawInput.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.ErrorWithRawInputAst]
  }
  
  inline def GreaterThanOpAst(left: Ast, right: Ast, `type`: GREATER_THAN_OP): typingsJapgolly.hyperformula.typingsParserAstMod.GreaterThanOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.GreaterThanOpAst]
  }
  
  inline def GreaterThanOrEqualOpAst(left: Ast, right: Ast, `type`: GREATER_THAN_OR_EQUAL_OP): typingsJapgolly.hyperformula.typingsParserAstMod.GreaterThanOrEqualOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.GreaterThanOrEqualOpAst]
  }
  
  inline def LessThanOpAst(left: Ast, right: Ast, `type`: LESS_THAN_OP): typingsJapgolly.hyperformula.typingsParserAstMod.LessThanOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.LessThanOpAst]
  }
  
  inline def LessThanOrEqualOpAst(left: Ast, right: Ast, `type`: LESS_THAN_OR_EQUAL_OP): typingsJapgolly.hyperformula.typingsParserAstMod.LessThanOrEqualOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.LessThanOrEqualOpAst]
  }
  
  inline def MinusOpAst(left: Ast, right: Ast, `type`: MINUS_OP): typingsJapgolly.hyperformula.typingsParserAstMod.MinusOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.MinusOpAst]
  }
  
  inline def MinusUnaryOpAst(`type`: MINUS_UNARY_OP, value: Ast): typingsJapgolly.hyperformula.typingsParserAstMod.MinusUnaryOpAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.MinusUnaryOpAst]
  }
  
  inline def NamedExpressionAst(expressionName: String, `type`: NAMED_EXPRESSION): typingsJapgolly.hyperformula.typingsParserAstMod.NamedExpressionAst = {
    val __obj = js.Dynamic.literal(expressionName = expressionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.NamedExpressionAst]
  }
  
  inline def NotEqualOpAst(left: Ast, right: Ast, `type`: NOT_EQUAL_OP): typingsJapgolly.hyperformula.typingsParserAstMod.NotEqualOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.NotEqualOpAst]
  }
  
  inline def NumberAst(`type`: NUMBER, value: Double): typingsJapgolly.hyperformula.typingsParserAstMod.NumberAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.NumberAst]
  }
  
  inline def ParenthesisAst(expression: Ast, `type`: PARENTHESIS): typingsJapgolly.hyperformula.typingsParserAstMod.ParenthesisAst = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.ParenthesisAst]
  }
  
  inline def PercentOpAst(`type`: PERCENT_OP, value: Ast): typingsJapgolly.hyperformula.typingsParserAstMod.PercentOpAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.PercentOpAst]
  }
  
  inline def PlusOpAst(left: Ast, right: Ast, `type`: PLUS_OP): typingsJapgolly.hyperformula.typingsParserAstMod.PlusOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.PlusOpAst]
  }
  
  inline def PlusUnaryOpAst(`type`: PLUS_UNARY_OP, value: Ast): typingsJapgolly.hyperformula.typingsParserAstMod.PlusUnaryOpAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.PlusUnaryOpAst]
  }
  
  inline def PowerOpAst(left: Ast, right: Ast, `type`: POWER_OP): typingsJapgolly.hyperformula.typingsParserAstMod.PowerOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.PowerOpAst]
  }
  
  inline def ProcedureAst(args: js.Array[Ast], procedureName: String, `type`: FUNCTION_CALL): typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], procedureName = procedureName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst]
  }
  
  inline def RowRangeAst(end: RowAddress, sheetReferenceType: RangeSheetReferenceType, start: RowAddress, `type`: ROW_RANGE): typingsJapgolly.hyperformula.typingsParserAstMod.RowRangeAst = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], sheetReferenceType = sheetReferenceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.RowRangeAst]
  }
  
  inline def StringAst(`type`: STRING, value: String): typingsJapgolly.hyperformula.typingsParserAstMod.StringAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.StringAst]
  }
  
  inline def TimesOpAst(left: Ast, right: Ast, `type`: TIMES_OP): typingsJapgolly.hyperformula.typingsParserAstMod.TimesOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsParserAstMod.TimesOpAst]
  }
}
