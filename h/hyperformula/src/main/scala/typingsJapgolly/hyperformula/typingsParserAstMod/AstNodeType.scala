package typingsJapgolly.hyperformula.typingsParserAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AstNodeType extends StObject
@JSImport("hyperformula/typings/parser/Ast", "AstNodeType")
@js.native
object AstNodeType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AstNodeType & String] = js.native
  
  @js.native
  sealed trait ARRAY
    extends StObject
       with AstNodeType
  /* "ARRAY" */ val ARRAY: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.ARRAY & String = js.native
  
  @js.native
  sealed trait CELL_RANGE
    extends StObject
       with AstNodeType
  /* "CELL_RANGE" */ val CELL_RANGE: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.CELL_RANGE & String = js.native
  
  @js.native
  sealed trait CELL_REFERENCE
    extends StObject
       with AstNodeType
  /* "CELL_REFERENCE" */ val CELL_REFERENCE: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.CELL_REFERENCE & String = js.native
  
  @js.native
  sealed trait COLUMN_RANGE
    extends StObject
       with AstNodeType
  /* "COLUMN_RANGE" */ val COLUMN_RANGE: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.COLUMN_RANGE & String = js.native
  
  @js.native
  sealed trait CONCATENATE_OP
    extends StObject
       with AstNodeType
  /* "CONCATENATE_OP" */ val CONCATENATE_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.CONCATENATE_OP & String = js.native
  
  @js.native
  sealed trait DIV_OP
    extends StObject
       with AstNodeType
  /* "DIV_OP" */ val DIV_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.DIV_OP & String = js.native
  
  @js.native
  sealed trait EMPTY
    extends StObject
       with AstNodeType
  /* "EMPTY" */ val EMPTY: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.EMPTY & String = js.native
  
  @js.native
  sealed trait EQUALS_OP
    extends StObject
       with AstNodeType
  /* "EQUALS_OP" */ val EQUALS_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.EQUALS_OP & String = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with AstNodeType
  /* "ERROR" */ val ERROR: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.ERROR & String = js.native
  
  @js.native
  sealed trait ERROR_WITH_RAW_INPUT
    extends StObject
       with AstNodeType
  /* "ERROR_WITH_RAW_INPUT" */ val ERROR_WITH_RAW_INPUT: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.ERROR_WITH_RAW_INPUT & String = js.native
  
  @js.native
  sealed trait FUNCTION_CALL
    extends StObject
       with AstNodeType
  /* "FUNCTION_CALL" */ val FUNCTION_CALL: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.FUNCTION_CALL & String = js.native
  
  @js.native
  sealed trait GREATER_THAN_OP
    extends StObject
       with AstNodeType
  /* "GREATER_THAN_OP" */ val GREATER_THAN_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.GREATER_THAN_OP & String = js.native
  
  @js.native
  sealed trait GREATER_THAN_OR_EQUAL_OP
    extends StObject
       with AstNodeType
  /* "GREATER_THAN_OR_EQUAL_OP" */ val GREATER_THAN_OR_EQUAL_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.GREATER_THAN_OR_EQUAL_OP & String = js.native
  
  @js.native
  sealed trait LESS_THAN_OP
    extends StObject
       with AstNodeType
  /* "LESS_THAN_OP" */ val LESS_THAN_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.LESS_THAN_OP & String = js.native
  
  @js.native
  sealed trait LESS_THAN_OR_EQUAL_OP
    extends StObject
       with AstNodeType
  /* "LESS_THAN_OR_EQUAL_OP" */ val LESS_THAN_OR_EQUAL_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.LESS_THAN_OR_EQUAL_OP & String = js.native
  
  @js.native
  sealed trait MINUS_OP
    extends StObject
       with AstNodeType
  /* "MINUS_OP" */ val MINUS_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.MINUS_OP & String = js.native
  
  @js.native
  sealed trait MINUS_UNARY_OP
    extends StObject
       with AstNodeType
  /* "MINUS_UNARY_OP" */ val MINUS_UNARY_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.MINUS_UNARY_OP & String = js.native
  
  @js.native
  sealed trait NAMED_EXPRESSION
    extends StObject
       with AstNodeType
  /* "NAMED_EXPRESSION" */ val NAMED_EXPRESSION: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.NAMED_EXPRESSION & String = js.native
  
  @js.native
  sealed trait NOT_EQUAL_OP
    extends StObject
       with AstNodeType
  /* "NOT_EQUAL_OP" */ val NOT_EQUAL_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.NOT_EQUAL_OP & String = js.native
  
  @js.native
  sealed trait NUMBER
    extends StObject
       with AstNodeType
  /* "NUMBER" */ val NUMBER: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.NUMBER & String = js.native
  
  @js.native
  sealed trait PARENTHESIS
    extends StObject
       with AstNodeType
  /* "PARENTHESES" */ val PARENTHESIS: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.PARENTHESIS & String = js.native
  
  @js.native
  sealed trait PERCENT_OP
    extends StObject
       with AstNodeType
  /* "PERCENT_OP" */ val PERCENT_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.PERCENT_OP & String = js.native
  
  @js.native
  sealed trait PLUS_OP
    extends StObject
       with AstNodeType
  /* "PLUS_OP" */ val PLUS_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.PLUS_OP & String = js.native
  
  @js.native
  sealed trait PLUS_UNARY_OP
    extends StObject
       with AstNodeType
  /* "PLUS_UNARY_OP" */ val PLUS_UNARY_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.PLUS_UNARY_OP & String = js.native
  
  @js.native
  sealed trait POWER_OP
    extends StObject
       with AstNodeType
  /* "POWER_OP" */ val POWER_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.POWER_OP & String = js.native
  
  @js.native
  sealed trait ROW_RANGE
    extends StObject
       with AstNodeType
  /* "ROW_RANGE" */ val ROW_RANGE: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.ROW_RANGE & String = js.native
  
  @js.native
  sealed trait STRING
    extends StObject
       with AstNodeType
  /* "STRING" */ val STRING: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.STRING & String = js.native
  
  @js.native
  sealed trait TIMES_OP
    extends StObject
       with AstNodeType
  /* "TIMES_OP" */ val TIMES_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.TIMES_OP & String = js.native
}
