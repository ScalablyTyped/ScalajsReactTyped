package typingsJapgolly.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntaxIndenter
  extends StObject
     with SyntaxRewriter {
  
  /* private */ def indentMultiLineComment(trivia: Any, indentThisTrivia: Any, result: Any): Any
  
  /* private */ def indentSegment(segment: Any): Any
  
  /* private */ def indentSingleLineOrSkippedText(trivia: Any, indentThisTrivia: Any, result: Any): Any
  
  def indentTriviaList(triviaList: ISyntaxTriviaList): ISyntaxTriviaList
  
  /* private */ def indentWhitespace(trivia: Any, indentThisTrivia: Any, result: Any): Any
  
  /* private */ var indentationAmount: Any
  
  /* private */ var indentationTrivia: Any
  
  /* private */ var lastTriviaWasNewLine: Any
  
  /* private */ var options: Any
}
object SyntaxIndenter {
  
  inline def apply(
    indentMultiLineComment: (Any, Any, Any) => Any,
    indentSegment: Any => Any,
    indentSingleLineOrSkippedText: (Any, Any, Any) => Any,
    indentTriviaList: ISyntaxTriviaList => ISyntaxTriviaList,
    indentWhitespace: (Any, Any, Any) => Any,
    indentationAmount: Any,
    indentationTrivia: Any,
    lastTriviaWasNewLine: Any,
    options: Any,
    visitArgumentList: ArgumentListSyntax => Any,
    visitArrayLiteralExpression: ArrayLiteralExpressionSyntax => Any,
    visitArrayType: ArrayTypeSyntax => Any,
    visitBinaryExpression: BinaryExpressionSyntax => Any,
    visitBlock: BlockSyntax => Any,
    visitBreakStatement: BreakStatementSyntax => Any,
    visitCallSignature: CallSignatureSyntax => Any,
    visitCaseSwitchClause: CaseSwitchClauseSyntax => Any,
    visitCastExpression: CastExpressionSyntax => Any,
    visitCatchClause: CatchClauseSyntax => Any,
    visitClassDeclaration: ClassDeclarationSyntax => Any,
    visitConditionalExpression: ConditionalExpressionSyntax => Any,
    visitConstraint: ConstraintSyntax => Any,
    visitConstructSignature: ConstructSignatureSyntax => Any,
    visitConstructorDeclaration: ConstructorDeclarationSyntax => Any,
    visitConstructorType: ConstructorTypeSyntax => Any,
    visitContinueStatement: ContinueStatementSyntax => Any,
    visitDebuggerStatement: DebuggerStatementSyntax => Any,
    visitDefaultSwitchClause: DefaultSwitchClauseSyntax => Any,
    visitDeleteExpression: DeleteExpressionSyntax => Any,
    visitDoStatement: DoStatementSyntax => Any,
    visitElementAccessExpression: ElementAccessExpressionSyntax => Any,
    visitElseClause: ElseClauseSyntax => Any,
    visitEmptyStatement: EmptyStatementSyntax => Any,
    visitEnumDeclaration: EnumDeclarationSyntax => Any,
    visitEnumElement: EnumElementSyntax => Any,
    visitEqualsValueClause: EqualsValueClauseSyntax => Any,
    visitExportAssignment: ExportAssignmentSyntax => Any,
    visitExpressionStatement: ExpressionStatementSyntax => Any,
    visitExternalModuleReference: ExternalModuleReferenceSyntax => Any,
    visitFinallyClause: FinallyClauseSyntax => Any,
    visitForInStatement: ForInStatementSyntax => Any,
    visitForStatement: ForStatementSyntax => Any,
    visitFunctionDeclaration: FunctionDeclarationSyntax => Any,
    visitFunctionExpression: FunctionExpressionSyntax => Any,
    visitFunctionPropertyAssignment: FunctionPropertyAssignmentSyntax => Any,
    visitFunctionType: FunctionTypeSyntax => Any,
    visitGenericType: GenericTypeSyntax => Any,
    visitGetAccessor: GetAccessorSyntax => Any,
    visitHeritageClause: HeritageClauseSyntax => Any,
    visitIfStatement: IfStatementSyntax => Any,
    visitImportDeclaration: ImportDeclarationSyntax => Any,
    visitIndexMemberDeclaration: IndexMemberDeclarationSyntax => Any,
    visitIndexSignature: IndexSignatureSyntax => Any,
    visitInterfaceDeclaration: InterfaceDeclarationSyntax => Any,
    visitInvocationExpression: InvocationExpressionSyntax => Any,
    visitLabeledStatement: LabeledStatementSyntax => Any,
    visitList: ISyntaxList => ISyntaxList,
    visitMemberAccessExpression: MemberAccessExpressionSyntax => Any,
    visitMemberFunctionDeclaration: MemberFunctionDeclarationSyntax => Any,
    visitMemberVariableDeclaration: MemberVariableDeclarationSyntax => Any,
    visitMethodSignature: MethodSignatureSyntax => Any,
    visitModuleDeclaration: ModuleDeclarationSyntax => Any,
    visitModuleNameModuleReference: ModuleNameModuleReferenceSyntax => Any,
    visitNode: SyntaxNode => SyntaxNode,
    visitNodeOrToken: ISyntaxNodeOrToken => ISyntaxNodeOrToken,
    visitObjectCreationExpression: ObjectCreationExpressionSyntax => Any,
    visitObjectLiteralExpression: ObjectLiteralExpressionSyntax => Any,
    visitObjectType: ObjectTypeSyntax => Any,
    visitOmittedExpression: OmittedExpressionSyntax => Any,
    visitParameter: ParameterSyntax => Any,
    visitParameterList: ParameterListSyntax => Any,
    visitParenthesizedArrowFunctionExpression: ParenthesizedArrowFunctionExpressionSyntax => Any,
    visitParenthesizedExpression: ParenthesizedExpressionSyntax => Any,
    visitPostfixUnaryExpression: PostfixUnaryExpressionSyntax => Any,
    visitPrefixUnaryExpression: PrefixUnaryExpressionSyntax => Any,
    visitPropertySignature: PropertySignatureSyntax => Any,
    visitQualifiedName: QualifiedNameSyntax => Any,
    visitReturnStatement: ReturnStatementSyntax => Any,
    visitSeparatedList: ISeparatedSyntaxList => ISeparatedSyntaxList,
    visitSetAccessor: SetAccessorSyntax => Any,
    visitSimpleArrowFunctionExpression: SimpleArrowFunctionExpressionSyntax => Any,
    visitSimplePropertyAssignment: SimplePropertyAssignmentSyntax => Any,
    visitSourceUnit: SourceUnitSyntax => Any,
    visitSwitchStatement: SwitchStatementSyntax => Any,
    visitThrowStatement: ThrowStatementSyntax => Any,
    visitToken: ISyntaxToken => Any,
    visitTryStatement: TryStatementSyntax => Any,
    visitTypeAnnotation: TypeAnnotationSyntax => Any,
    visitTypeArgumentList: TypeArgumentListSyntax => Any,
    visitTypeOfExpression: TypeOfExpressionSyntax => Any,
    visitTypeParameter: TypeParameterSyntax => Any,
    visitTypeParameterList: TypeParameterListSyntax => Any,
    visitTypeQuery: TypeQuerySyntax => Any,
    visitVariableDeclaration: VariableDeclarationSyntax => Any,
    visitVariableDeclarator: VariableDeclaratorSyntax => Any,
    visitVariableStatement: VariableStatementSyntax => Any,
    visitVoidExpression: VoidExpressionSyntax => Any,
    visitWhileStatement: WhileStatementSyntax => Any,
    visitWithStatement: WithStatementSyntax => Any
  ): SyntaxIndenter = {
    val __obj = js.Dynamic.literal(indentMultiLineComment = js.Any.fromFunction3(indentMultiLineComment), indentSegment = js.Any.fromFunction1(indentSegment), indentSingleLineOrSkippedText = js.Any.fromFunction3(indentSingleLineOrSkippedText), indentTriviaList = js.Any.fromFunction1(indentTriviaList), indentWhitespace = js.Any.fromFunction3(indentWhitespace), indentationAmount = indentationAmount.asInstanceOf[js.Any], indentationTrivia = indentationTrivia.asInstanceOf[js.Any], lastTriviaWasNewLine = lastTriviaWasNewLine.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], visitArgumentList = js.Any.fromFunction1(visitArgumentList), visitArrayLiteralExpression = js.Any.fromFunction1(visitArrayLiteralExpression), visitArrayType = js.Any.fromFunction1(visitArrayType), visitBinaryExpression = js.Any.fromFunction1(visitBinaryExpression), visitBlock = js.Any.fromFunction1(visitBlock), visitBreakStatement = js.Any.fromFunction1(visitBreakStatement), visitCallSignature = js.Any.fromFunction1(visitCallSignature), visitCaseSwitchClause = js.Any.fromFunction1(visitCaseSwitchClause), visitCastExpression = js.Any.fromFunction1(visitCastExpression), visitCatchClause = js.Any.fromFunction1(visitCatchClause), visitClassDeclaration = js.Any.fromFunction1(visitClassDeclaration), visitConditionalExpression = js.Any.fromFunction1(visitConditionalExpression), visitConstraint = js.Any.fromFunction1(visitConstraint), visitConstructSignature = js.Any.fromFunction1(visitConstructSignature), visitConstructorDeclaration = js.Any.fromFunction1(visitConstructorDeclaration), visitConstructorType = js.Any.fromFunction1(visitConstructorType), visitContinueStatement = js.Any.fromFunction1(visitContinueStatement), visitDebuggerStatement = js.Any.fromFunction1(visitDebuggerStatement), visitDefaultSwitchClause = js.Any.fromFunction1(visitDefaultSwitchClause), visitDeleteExpression = js.Any.fromFunction1(visitDeleteExpression), visitDoStatement = js.Any.fromFunction1(visitDoStatement), visitElementAccessExpression = js.Any.fromFunction1(visitElementAccessExpression), visitElseClause = js.Any.fromFunction1(visitElseClause), visitEmptyStatement = js.Any.fromFunction1(visitEmptyStatement), visitEnumDeclaration = js.Any.fromFunction1(visitEnumDeclaration), visitEnumElement = js.Any.fromFunction1(visitEnumElement), visitEqualsValueClause = js.Any.fromFunction1(visitEqualsValueClause), visitExportAssignment = js.Any.fromFunction1(visitExportAssignment), visitExpressionStatement = js.Any.fromFunction1(visitExpressionStatement), visitExternalModuleReference = js.Any.fromFunction1(visitExternalModuleReference), visitFinallyClause = js.Any.fromFunction1(visitFinallyClause), visitForInStatement = js.Any.fromFunction1(visitForInStatement), visitForStatement = js.Any.fromFunction1(visitForStatement), visitFunctionDeclaration = js.Any.fromFunction1(visitFunctionDeclaration), visitFunctionExpression = js.Any.fromFunction1(visitFunctionExpression), visitFunctionPropertyAssignment = js.Any.fromFunction1(visitFunctionPropertyAssignment), visitFunctionType = js.Any.fromFunction1(visitFunctionType), visitGenericType = js.Any.fromFunction1(visitGenericType), visitGetAccessor = js.Any.fromFunction1(visitGetAccessor), visitHeritageClause = js.Any.fromFunction1(visitHeritageClause), visitIfStatement = js.Any.fromFunction1(visitIfStatement), visitImportDeclaration = js.Any.fromFunction1(visitImportDeclaration), visitIndexMemberDeclaration = js.Any.fromFunction1(visitIndexMemberDeclaration), visitIndexSignature = js.Any.fromFunction1(visitIndexSignature), visitInterfaceDeclaration = js.Any.fromFunction1(visitInterfaceDeclaration), visitInvocationExpression = js.Any.fromFunction1(visitInvocationExpression), visitLabeledStatement = js.Any.fromFunction1(visitLabeledStatement), visitList = js.Any.fromFunction1(visitList), visitMemberAccessExpression = js.Any.fromFunction1(visitMemberAccessExpression), visitMemberFunctionDeclaration = js.Any.fromFunction1(visitMemberFunctionDeclaration), visitMemberVariableDeclaration = js.Any.fromFunction1(visitMemberVariableDeclaration), visitMethodSignature = js.Any.fromFunction1(visitMethodSignature), visitModuleDeclaration = js.Any.fromFunction1(visitModuleDeclaration), visitModuleNameModuleReference = js.Any.fromFunction1(visitModuleNameModuleReference), visitNode = js.Any.fromFunction1(visitNode), visitNodeOrToken = js.Any.fromFunction1(visitNodeOrToken), visitObjectCreationExpression = js.Any.fromFunction1(visitObjectCreationExpression), visitObjectLiteralExpression = js.Any.fromFunction1(visitObjectLiteralExpression), visitObjectType = js.Any.fromFunction1(visitObjectType), visitOmittedExpression = js.Any.fromFunction1(visitOmittedExpression), visitParameter = js.Any.fromFunction1(visitParameter), visitParameterList = js.Any.fromFunction1(visitParameterList), visitParenthesizedArrowFunctionExpression = js.Any.fromFunction1(visitParenthesizedArrowFunctionExpression), visitParenthesizedExpression = js.Any.fromFunction1(visitParenthesizedExpression), visitPostfixUnaryExpression = js.Any.fromFunction1(visitPostfixUnaryExpression), visitPrefixUnaryExpression = js.Any.fromFunction1(visitPrefixUnaryExpression), visitPropertySignature = js.Any.fromFunction1(visitPropertySignature), visitQualifiedName = js.Any.fromFunction1(visitQualifiedName), visitReturnStatement = js.Any.fromFunction1(visitReturnStatement), visitSeparatedList = js.Any.fromFunction1(visitSeparatedList), visitSetAccessor = js.Any.fromFunction1(visitSetAccessor), visitSimpleArrowFunctionExpression = js.Any.fromFunction1(visitSimpleArrowFunctionExpression), visitSimplePropertyAssignment = js.Any.fromFunction1(visitSimplePropertyAssignment), visitSourceUnit = js.Any.fromFunction1(visitSourceUnit), visitSwitchStatement = js.Any.fromFunction1(visitSwitchStatement), visitThrowStatement = js.Any.fromFunction1(visitThrowStatement), visitToken = js.Any.fromFunction1(visitToken), visitTryStatement = js.Any.fromFunction1(visitTryStatement), visitTypeAnnotation = js.Any.fromFunction1(visitTypeAnnotation), visitTypeArgumentList = js.Any.fromFunction1(visitTypeArgumentList), visitTypeOfExpression = js.Any.fromFunction1(visitTypeOfExpression), visitTypeParameter = js.Any.fromFunction1(visitTypeParameter), visitTypeParameterList = js.Any.fromFunction1(visitTypeParameterList), visitTypeQuery = js.Any.fromFunction1(visitTypeQuery), visitVariableDeclaration = js.Any.fromFunction1(visitVariableDeclaration), visitVariableDeclarator = js.Any.fromFunction1(visitVariableDeclarator), visitVariableStatement = js.Any.fromFunction1(visitVariableStatement), visitVoidExpression = js.Any.fromFunction1(visitVoidExpression), visitWhileStatement = js.Any.fromFunction1(visitWhileStatement), visitWithStatement = js.Any.fromFunction1(visitWithStatement))
    __obj.asInstanceOf[SyntaxIndenter]
  }
  
  extension [Self <: SyntaxIndenter](x: Self) {
    
    inline def setIndentMultiLineComment(value: (Any, Any, Any) => Any): Self = StObject.set(x, "indentMultiLineComment", js.Any.fromFunction3(value))
    
    inline def setIndentSegment(value: Any => Any): Self = StObject.set(x, "indentSegment", js.Any.fromFunction1(value))
    
    inline def setIndentSingleLineOrSkippedText(value: (Any, Any, Any) => Any): Self = StObject.set(x, "indentSingleLineOrSkippedText", js.Any.fromFunction3(value))
    
    inline def setIndentTriviaList(value: ISyntaxTriviaList => ISyntaxTriviaList): Self = StObject.set(x, "indentTriviaList", js.Any.fromFunction1(value))
    
    inline def setIndentWhitespace(value: (Any, Any, Any) => Any): Self = StObject.set(x, "indentWhitespace", js.Any.fromFunction3(value))
    
    inline def setIndentationAmount(value: Any): Self = StObject.set(x, "indentationAmount", value.asInstanceOf[js.Any])
    
    inline def setIndentationTrivia(value: Any): Self = StObject.set(x, "indentationTrivia", value.asInstanceOf[js.Any])
    
    inline def setLastTriviaWasNewLine(value: Any): Self = StObject.set(x, "lastTriviaWasNewLine", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
