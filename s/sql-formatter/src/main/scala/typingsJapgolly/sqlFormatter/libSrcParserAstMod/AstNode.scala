package typingsJapgolly.sqlFormatter.libSrcParserAstMod

import typingsJapgolly.sqlFormatter.libSrcLexerTokenMod.TokenType
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.all_columns_asterisk
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.array_subscript
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.between_predicate
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.block_comment
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.case_else
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.case_expression
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.case_when
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.clause
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.comma
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.function_call
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.identifier
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.keyword
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.limit_clause
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.line_comment
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.literal
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.operator
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.parameter
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.parenthesis
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.property_access
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.set_operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.ClauseNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.SetOperationNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.FunctionCallNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.ArraySubscriptNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.PropertyAccessNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.ParenthesisNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.BetweenPredicateNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.CaseExpressionNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.CaseWhenNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.CaseElseNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.LimitClauseNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.AllColumnsAsteriskNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.LiteralNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.IdentifierNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.KeywordNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.ParameterNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.OperatorNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.CommaNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.LineCommentNode
  - typingsJapgolly.sqlFormatter.libSrcParserAstMod.BlockCommentNode
*/
trait AstNode extends StObject
object AstNode {
  
  inline def AllColumnsAsteriskNode(`type`: all_columns_asterisk): typingsJapgolly.sqlFormatter.libSrcParserAstMod.AllColumnsAsteriskNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.AllColumnsAsteriskNode]
  }
  
  inline def ArraySubscriptNode(array: IdentifierNode | KeywordNode, parenthesis: ParenthesisNode, `type`: array_subscript): typingsJapgolly.sqlFormatter.libSrcParserAstMod.ArraySubscriptNode = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], parenthesis = parenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.ArraySubscriptNode]
  }
  
  inline def BetweenPredicateNode(
    andKw: KeywordNode,
    betweenKw: KeywordNode,
    expr1: js.Array[AstNode],
    expr2: js.Array[AstNode],
    `type`: between_predicate
  ): typingsJapgolly.sqlFormatter.libSrcParserAstMod.BetweenPredicateNode = {
    val __obj = js.Dynamic.literal(andKw = andKw.asInstanceOf[js.Any], betweenKw = betweenKw.asInstanceOf[js.Any], expr1 = expr1.asInstanceOf[js.Any], expr2 = expr2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.BetweenPredicateNode]
  }
  
  inline def BlockCommentNode(precedingWhitespace: String, text: String, `type`: block_comment): typingsJapgolly.sqlFormatter.libSrcParserAstMod.BlockCommentNode = {
    val __obj = js.Dynamic.literal(precedingWhitespace = precedingWhitespace.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.BlockCommentNode]
  }
  
  inline def CaseElseNode(elseKw: KeywordNode, result: js.Array[AstNode], `type`: case_else): typingsJapgolly.sqlFormatter.libSrcParserAstMod.CaseElseNode = {
    val __obj = js.Dynamic.literal(elseKw = elseKw.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.CaseElseNode]
  }
  
  inline def CaseExpressionNode(
    caseKw: KeywordNode,
    clauses: js.Array[CaseWhenNode | CaseElseNode],
    endKw: KeywordNode,
    expr: js.Array[AstNode],
    `type`: case_expression
  ): typingsJapgolly.sqlFormatter.libSrcParserAstMod.CaseExpressionNode = {
    val __obj = js.Dynamic.literal(caseKw = caseKw.asInstanceOf[js.Any], clauses = clauses.asInstanceOf[js.Any], endKw = endKw.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.CaseExpressionNode]
  }
  
  inline def CaseWhenNode(
    condition: js.Array[AstNode],
    result: js.Array[AstNode],
    thenKw: KeywordNode,
    `type`: case_when,
    whenKw: KeywordNode
  ): typingsJapgolly.sqlFormatter.libSrcParserAstMod.CaseWhenNode = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], thenKw = thenKw.asInstanceOf[js.Any], whenKw = whenKw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.CaseWhenNode]
  }
  
  inline def ClauseNode(children: js.Array[AstNode], nameKw: KeywordNode, `type`: clause): typingsJapgolly.sqlFormatter.libSrcParserAstMod.ClauseNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], nameKw = nameKw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.ClauseNode]
  }
  
  inline def CommaNode(`type`: comma): typingsJapgolly.sqlFormatter.libSrcParserAstMod.CommaNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.CommaNode]
  }
  
  inline def FunctionCallNode(nameKw: KeywordNode, parenthesis: ParenthesisNode, `type`: function_call): typingsJapgolly.sqlFormatter.libSrcParserAstMod.FunctionCallNode = {
    val __obj = js.Dynamic.literal(nameKw = nameKw.asInstanceOf[js.Any], parenthesis = parenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.FunctionCallNode]
  }
  
  inline def IdentifierNode(text: String, `type`: identifier): typingsJapgolly.sqlFormatter.libSrcParserAstMod.IdentifierNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.IdentifierNode]
  }
  
  inline def KeywordNode(raw: String, text: String, tokenType: TokenType, `type`: keyword): typingsJapgolly.sqlFormatter.libSrcParserAstMod.KeywordNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.KeywordNode]
  }
  
  inline def LimitClauseNode(count: js.Array[AstNode], limitKw: KeywordNode, `type`: limit_clause): typingsJapgolly.sqlFormatter.libSrcParserAstMod.LimitClauseNode = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], limitKw = limitKw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.LimitClauseNode]
  }
  
  inline def LineCommentNode(precedingWhitespace: String, text: String, `type`: line_comment): typingsJapgolly.sqlFormatter.libSrcParserAstMod.LineCommentNode = {
    val __obj = js.Dynamic.literal(precedingWhitespace = precedingWhitespace.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.LineCommentNode]
  }
  
  inline def LiteralNode(text: String, `type`: literal): typingsJapgolly.sqlFormatter.libSrcParserAstMod.LiteralNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.LiteralNode]
  }
  
  inline def OperatorNode(text: String, `type`: operator): typingsJapgolly.sqlFormatter.libSrcParserAstMod.OperatorNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.OperatorNode]
  }
  
  inline def ParameterNode(text: String, `type`: parameter): typingsJapgolly.sqlFormatter.libSrcParserAstMod.ParameterNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.ParameterNode]
  }
  
  inline def ParenthesisNode(children: js.Array[AstNode], closeParen: String, openParen: String, `type`: parenthesis): typingsJapgolly.sqlFormatter.libSrcParserAstMod.ParenthesisNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closeParen = closeParen.asInstanceOf[js.Any], openParen = openParen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.ParenthesisNode]
  }
  
  inline def PropertyAccessNode(
    `object`: AstNode,
    property: IdentifierNode | ArraySubscriptNode | AllColumnsAsteriskNode,
    `type`: property_access
  ): typingsJapgolly.sqlFormatter.libSrcParserAstMod.PropertyAccessNode = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.PropertyAccessNode]
  }
  
  inline def SetOperationNode(children: js.Array[AstNode], nameKw: KeywordNode, `type`: set_operation): typingsJapgolly.sqlFormatter.libSrcParserAstMod.SetOperationNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], nameKw = nameKw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcParserAstMod.SetOperationNode]
  }
}
