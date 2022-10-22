package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.FormattingOptions
import typingsJapgolly.typescriptServices.TypeScript.ArgumentListSyntax
import typingsJapgolly.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ArrayTypeSyntax
import typingsJapgolly.typescriptServices.TypeScript.BinaryExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
import typingsJapgolly.typescriptServices.TypeScript.BreakStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax
import typingsJapgolly.typescriptServices.TypeScript.CaseSwitchClauseSyntax
import typingsJapgolly.typescriptServices.TypeScript.CastExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.CatchClauseSyntax
import typingsJapgolly.typescriptServices.TypeScript.ClassDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.ConditionalExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ConstraintSyntax
import typingsJapgolly.typescriptServices.TypeScript.ConstructSignatureSyntax
import typingsJapgolly.typescriptServices.TypeScript.ConstructorDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.ConstructorTypeSyntax
import typingsJapgolly.typescriptServices.TypeScript.ContinueStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.DebuggerStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.DefaultSwitchClauseSyntax
import typingsJapgolly.typescriptServices.TypeScript.DeleteExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.DoStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ElementAccessExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ElseClauseSyntax
import typingsJapgolly.typescriptServices.TypeScript.EmptyStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.EnumDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.EnumElementSyntax
import typingsJapgolly.typescriptServices.TypeScript.EqualsValueClauseSyntax
import typingsJapgolly.typescriptServices.TypeScript.ExportAssignmentSyntax
import typingsJapgolly.typescriptServices.TypeScript.ExpressionStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ExternalModuleReferenceSyntax
import typingsJapgolly.typescriptServices.TypeScript.FinallyClauseSyntax
import typingsJapgolly.typescriptServices.TypeScript.ForInStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ForStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.FunctionDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.FunctionExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.FunctionPropertyAssignmentSyntax
import typingsJapgolly.typescriptServices.TypeScript.FunctionTypeSyntax
import typingsJapgolly.typescriptServices.TypeScript.GenericTypeSyntax
import typingsJapgolly.typescriptServices.TypeScript.GetAccessorSyntax
import typingsJapgolly.typescriptServices.TypeScript.HeritageClauseSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import typingsJapgolly.typescriptServices.TypeScript.IfStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ImportDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.IndexMemberDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.IndexSignatureSyntax
import typingsJapgolly.typescriptServices.TypeScript.InterfaceDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.InvocationExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.LabeledStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.MemberAccessExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.MemberVariableDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.MethodSignatureSyntax
import typingsJapgolly.typescriptServices.TypeScript.ModuleDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.ModuleNameModuleReferenceSyntax
import typingsJapgolly.typescriptServices.TypeScript.ObjectCreationExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ObjectTypeSyntax
import typingsJapgolly.typescriptServices.TypeScript.OmittedExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax
import typingsJapgolly.typescriptServices.TypeScript.ParameterSyntax
import typingsJapgolly.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ParenthesizedExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.PostfixUnaryExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.PrefixUnaryExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.PropertySignatureSyntax
import typingsJapgolly.typescriptServices.TypeScript.QualifiedNameSyntax
import typingsJapgolly.typescriptServices.TypeScript.ReturnStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.SetAccessorSyntax
import typingsJapgolly.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax
import typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax
import typingsJapgolly.typescriptServices.TypeScript.SwitchStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.SyntaxNode
import typingsJapgolly.typescriptServices.TypeScript.TextSpan
import typingsJapgolly.typescriptServices.TypeScript.ThrowStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.TryStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax
import typingsJapgolly.typescriptServices.TypeScript.TypeArgumentListSyntax
import typingsJapgolly.typescriptServices.TypeScript.TypeOfExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax
import typingsJapgolly.typescriptServices.TypeScript.TypeParameterSyntax
import typingsJapgolly.typescriptServices.TypeScript.TypeQuerySyntax
import typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.VariableDeclaratorSyntax
import typingsJapgolly.typescriptServices.TypeScript.VariableStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.VoidExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.WhileStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.WithStatementSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleTokenIndenter
  extends StObject
     with IndentationTrackingWalker {
  
  /* private */ var indentationAmount: Any
  
  /* private */ var indentationPosition: Any
}
object SingleTokenIndenter {
  
  inline def apply(
    _indentationNodeContextPool: Any,
    _lastTriviaWasNewLine: Any,
    _parent: Any,
    _position: Any,
    _snapshot: Any,
    _textSpan: Any,
    forceIndentNextToken: Double => Callback,
    forceRecomputeIndentationOfParent: (Any, Any) => Any,
    forceSkipIndentingNextToken: Double => Callback,
    getCommentIndentationAmount: Any => Any,
    getNodeIndentation: (Any, Any) => Any,
    getTokenIndentationAmount: Any => Any,
    indentToken: (ISyntaxToken, Double, Double) => Callback,
    indentationAmount: Any,
    indentationNodeContextPool: CallbackTo[IndentationNodeContextPool],
    indentationPosition: Any,
    options: FormattingOptions,
    parent: CallbackTo[IndentationNodeContext],
    position: CallbackTo[Double],
    shouldIndentBlockInParent: Any => Any,
    snapshot: CallbackTo[ITextSnapshot],
    textSpan: CallbackTo[TextSpan],
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
    visitList: ISyntaxList => Callback,
    visitMemberAccessExpression: MemberAccessExpressionSyntax => Any,
    visitMemberFunctionDeclaration: MemberFunctionDeclarationSyntax => Any,
    visitMemberVariableDeclaration: MemberVariableDeclarationSyntax => Any,
    visitMethodSignature: MethodSignatureSyntax => Any,
    visitModuleDeclaration: ModuleDeclarationSyntax => Any,
    visitModuleNameModuleReference: ModuleNameModuleReferenceSyntax => Any,
    visitNode: SyntaxNode => Callback,
    visitNodeOrToken: ISyntaxNodeOrToken => Callback,
    visitObjectCreationExpression: ObjectCreationExpressionSyntax => Any,
    visitObjectLiteralExpression: ObjectLiteralExpressionSyntax => Any,
    visitObjectType: ObjectTypeSyntax => Any,
    visitOmittedExpression: OmittedExpressionSyntax => Any,
    visitOptionalNode: SyntaxNode => Callback,
    visitOptionalNodeOrToken: ISyntaxNodeOrToken => Callback,
    visitOptionalToken: Any => Any,
    visitParameter: ParameterSyntax => Any,
    visitParameterList: ParameterListSyntax => Any,
    visitParenthesizedArrowFunctionExpression: ParenthesizedArrowFunctionExpressionSyntax => Any,
    visitParenthesizedExpression: ParenthesizedExpressionSyntax => Any,
    visitPostfixUnaryExpression: PostfixUnaryExpressionSyntax => Any,
    visitPrefixUnaryExpression: PrefixUnaryExpressionSyntax => Any,
    visitPropertySignature: PropertySignatureSyntax => Any,
    visitQualifiedName: QualifiedNameSyntax => Any,
    visitReturnStatement: ReturnStatementSyntax => Any,
    visitSeparatedList: ISeparatedSyntaxList => Callback,
    visitSetAccessor: SetAccessorSyntax => Any,
    visitSimpleArrowFunctionExpression: SimpleArrowFunctionExpressionSyntax => Any,
    visitSimplePropertyAssignment: SimplePropertyAssignmentSyntax => Any,
    visitSourceUnit: SourceUnitSyntax => Any,
    visitSwitchStatement: SwitchStatementSyntax => Any,
    visitThrowStatement: ThrowStatementSyntax => Any,
    visitToken: ISyntaxToken => Any,
    visitTokenInSpan: ISyntaxToken => Callback,
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
  ): SingleTokenIndenter = {
    val __obj = js.Dynamic.literal(_indentationNodeContextPool = _indentationNodeContextPool.asInstanceOf[js.Any], _lastTriviaWasNewLine = _lastTriviaWasNewLine.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any], _position = _position.asInstanceOf[js.Any], _snapshot = _snapshot.asInstanceOf[js.Any], _textSpan = _textSpan.asInstanceOf[js.Any], forceIndentNextToken = js.Any.fromFunction1((t0: Double) => forceIndentNextToken(t0).runNow()), forceRecomputeIndentationOfParent = js.Any.fromFunction2(forceRecomputeIndentationOfParent), forceSkipIndentingNextToken = js.Any.fromFunction1((t0: Double) => forceSkipIndentingNextToken(t0).runNow()), getCommentIndentationAmount = js.Any.fromFunction1(getCommentIndentationAmount), getNodeIndentation = js.Any.fromFunction2(getNodeIndentation), getTokenIndentationAmount = js.Any.fromFunction1(getTokenIndentationAmount), indentToken = js.Any.fromFunction3((t0: ISyntaxToken, t1: Double, t2: Double) => (indentToken(t0, t1, t2)).runNow()), indentationAmount = indentationAmount.asInstanceOf[js.Any], indentationNodeContextPool = indentationNodeContextPool.toJsFn, indentationPosition = indentationPosition.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parent = parent.toJsFn, position = position.toJsFn, shouldIndentBlockInParent = js.Any.fromFunction1(shouldIndentBlockInParent), snapshot = snapshot.toJsFn, textSpan = textSpan.toJsFn, visitArgumentList = js.Any.fromFunction1(visitArgumentList), visitArrayLiteralExpression = js.Any.fromFunction1(visitArrayLiteralExpression), visitArrayType = js.Any.fromFunction1(visitArrayType), visitBinaryExpression = js.Any.fromFunction1(visitBinaryExpression), visitBlock = js.Any.fromFunction1(visitBlock), visitBreakStatement = js.Any.fromFunction1(visitBreakStatement), visitCallSignature = js.Any.fromFunction1(visitCallSignature), visitCaseSwitchClause = js.Any.fromFunction1(visitCaseSwitchClause), visitCastExpression = js.Any.fromFunction1(visitCastExpression), visitCatchClause = js.Any.fromFunction1(visitCatchClause), visitClassDeclaration = js.Any.fromFunction1(visitClassDeclaration), visitConditionalExpression = js.Any.fromFunction1(visitConditionalExpression), visitConstraint = js.Any.fromFunction1(visitConstraint), visitConstructSignature = js.Any.fromFunction1(visitConstructSignature), visitConstructorDeclaration = js.Any.fromFunction1(visitConstructorDeclaration), visitConstructorType = js.Any.fromFunction1(visitConstructorType), visitContinueStatement = js.Any.fromFunction1(visitContinueStatement), visitDebuggerStatement = js.Any.fromFunction1(visitDebuggerStatement), visitDefaultSwitchClause = js.Any.fromFunction1(visitDefaultSwitchClause), visitDeleteExpression = js.Any.fromFunction1(visitDeleteExpression), visitDoStatement = js.Any.fromFunction1(visitDoStatement), visitElementAccessExpression = js.Any.fromFunction1(visitElementAccessExpression), visitElseClause = js.Any.fromFunction1(visitElseClause), visitEmptyStatement = js.Any.fromFunction1(visitEmptyStatement), visitEnumDeclaration = js.Any.fromFunction1(visitEnumDeclaration), visitEnumElement = js.Any.fromFunction1(visitEnumElement), visitEqualsValueClause = js.Any.fromFunction1(visitEqualsValueClause), visitExportAssignment = js.Any.fromFunction1(visitExportAssignment), visitExpressionStatement = js.Any.fromFunction1(visitExpressionStatement), visitExternalModuleReference = js.Any.fromFunction1(visitExternalModuleReference), visitFinallyClause = js.Any.fromFunction1(visitFinallyClause), visitForInStatement = js.Any.fromFunction1(visitForInStatement), visitForStatement = js.Any.fromFunction1(visitForStatement), visitFunctionDeclaration = js.Any.fromFunction1(visitFunctionDeclaration), visitFunctionExpression = js.Any.fromFunction1(visitFunctionExpression), visitFunctionPropertyAssignment = js.Any.fromFunction1(visitFunctionPropertyAssignment), visitFunctionType = js.Any.fromFunction1(visitFunctionType), visitGenericType = js.Any.fromFunction1(visitGenericType), visitGetAccessor = js.Any.fromFunction1(visitGetAccessor), visitHeritageClause = js.Any.fromFunction1(visitHeritageClause), visitIfStatement = js.Any.fromFunction1(visitIfStatement), visitImportDeclaration = js.Any.fromFunction1(visitImportDeclaration), visitIndexMemberDeclaration = js.Any.fromFunction1(visitIndexMemberDeclaration), visitIndexSignature = js.Any.fromFunction1(visitIndexSignature), visitInterfaceDeclaration = js.Any.fromFunction1(visitInterfaceDeclaration), visitInvocationExpression = js.Any.fromFunction1(visitInvocationExpression), visitLabeledStatement = js.Any.fromFunction1(visitLabeledStatement), visitList = js.Any.fromFunction1((t0: ISyntaxList) => visitList(t0).runNow()), visitMemberAccessExpression = js.Any.fromFunction1(visitMemberAccessExpression), visitMemberFunctionDeclaration = js.Any.fromFunction1(visitMemberFunctionDeclaration), visitMemberVariableDeclaration = js.Any.fromFunction1(visitMemberVariableDeclaration), visitMethodSignature = js.Any.fromFunction1(visitMethodSignature), visitModuleDeclaration = js.Any.fromFunction1(visitModuleDeclaration), visitModuleNameModuleReference = js.Any.fromFunction1(visitModuleNameModuleReference), visitNode = js.Any.fromFunction1((t0: SyntaxNode) => visitNode(t0).runNow()), visitNodeOrToken = js.Any.fromFunction1((t0: ISyntaxNodeOrToken) => visitNodeOrToken(t0).runNow()), visitObjectCreationExpression = js.Any.fromFunction1(visitObjectCreationExpression), visitObjectLiteralExpression = js.Any.fromFunction1(visitObjectLiteralExpression), visitObjectType = js.Any.fromFunction1(visitObjectType), visitOmittedExpression = js.Any.fromFunction1(visitOmittedExpression), visitOptionalNode = js.Any.fromFunction1((t0: SyntaxNode) => visitOptionalNode(t0).runNow()), visitOptionalNodeOrToken = js.Any.fromFunction1((t0: ISyntaxNodeOrToken) => visitOptionalNodeOrToken(t0).runNow()), visitOptionalToken = js.Any.fromFunction1(visitOptionalToken), visitParameter = js.Any.fromFunction1(visitParameter), visitParameterList = js.Any.fromFunction1(visitParameterList), visitParenthesizedArrowFunctionExpression = js.Any.fromFunction1(visitParenthesizedArrowFunctionExpression), visitParenthesizedExpression = js.Any.fromFunction1(visitParenthesizedExpression), visitPostfixUnaryExpression = js.Any.fromFunction1(visitPostfixUnaryExpression), visitPrefixUnaryExpression = js.Any.fromFunction1(visitPrefixUnaryExpression), visitPropertySignature = js.Any.fromFunction1(visitPropertySignature), visitQualifiedName = js.Any.fromFunction1(visitQualifiedName), visitReturnStatement = js.Any.fromFunction1(visitReturnStatement), visitSeparatedList = js.Any.fromFunction1((t0: ISeparatedSyntaxList) => visitSeparatedList(t0).runNow()), visitSetAccessor = js.Any.fromFunction1(visitSetAccessor), visitSimpleArrowFunctionExpression = js.Any.fromFunction1(visitSimpleArrowFunctionExpression), visitSimplePropertyAssignment = js.Any.fromFunction1(visitSimplePropertyAssignment), visitSourceUnit = js.Any.fromFunction1(visitSourceUnit), visitSwitchStatement = js.Any.fromFunction1(visitSwitchStatement), visitThrowStatement = js.Any.fromFunction1(visitThrowStatement), visitToken = js.Any.fromFunction1(visitToken), visitTokenInSpan = js.Any.fromFunction1((t0: ISyntaxToken) => visitTokenInSpan(t0).runNow()), visitTryStatement = js.Any.fromFunction1(visitTryStatement), visitTypeAnnotation = js.Any.fromFunction1(visitTypeAnnotation), visitTypeArgumentList = js.Any.fromFunction1(visitTypeArgumentList), visitTypeOfExpression = js.Any.fromFunction1(visitTypeOfExpression), visitTypeParameter = js.Any.fromFunction1(visitTypeParameter), visitTypeParameterList = js.Any.fromFunction1(visitTypeParameterList), visitTypeQuery = js.Any.fromFunction1(visitTypeQuery), visitVariableDeclaration = js.Any.fromFunction1(visitVariableDeclaration), visitVariableDeclarator = js.Any.fromFunction1(visitVariableDeclarator), visitVariableStatement = js.Any.fromFunction1(visitVariableStatement), visitVoidExpression = js.Any.fromFunction1(visitVoidExpression), visitWhileStatement = js.Any.fromFunction1(visitWhileStatement), visitWithStatement = js.Any.fromFunction1(visitWithStatement))
    __obj.asInstanceOf[SingleTokenIndenter]
  }
  
  extension [Self <: SingleTokenIndenter](x: Self) {
    
    inline def setIndentationAmount(value: Any): Self = StObject.set(x, "indentationAmount", value.asInstanceOf[js.Any])
    
    inline def setIndentationPosition(value: Any): Self = StObject.set(x, "indentationPosition", value.asInstanceOf[js.Any])
  }
}
