package typingsJapgolly.typescriptServices.global.TypeScript.Services

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
import typingsJapgolly.typescriptServices.TypeScript.ILogger
import typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISimpleText
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
import typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind
import typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.ITextSnapshotLine
import typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleAction
import typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleFlags
import typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesPosition
import typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.ITokenAccess
import typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange
import typingsJapgolly.typescriptServices.TypeScript.SetAccessorSyntax
import typingsJapgolly.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax
import typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax
import typingsJapgolly.typescriptServices.TypeScript.SwitchStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.SyntaxKind
import typingsJapgolly.typescriptServices.TypeScript.SyntaxNode
import typingsJapgolly.typescriptServices.TypeScript.SyntaxTree
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

object Formatting {
  
  @JSGlobal("TypeScript.Services.Formatting.Formatter")
  @js.native
  open class Formatter protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Formatter {
    def this(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      indentFirstToken: Boolean,
      options: FormattingOptions,
      snapshot: ITextSnapshot,
      rulesProvider: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
      formattingRequestKind: FormattingRequestKind
    ) = this()
    
    /* private */ /* CompleteClass */
    override def RecordRuleEdits(rule: Any, t1: Any, t2: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    var _edits: Any = js.native
    
    /* private */ /* CompleteClass */
    var _indentationNodeContextPool: Any = js.native
    
    /* private */ /* CompleteClass */
    var _lastTriviaWasNewLine: Any = js.native
    
    /* private */ /* CompleteClass */
    var _parent: Any = js.native
    
    /* private */ /* CompleteClass */
    var _position: Any = js.native
    
    /* private */ /* CompleteClass */
    var _snapshot: Any = js.native
    
    /* private */ /* CompleteClass */
    var _textSpan: Any = js.native
    
    /* CompleteClass */
    override def edits(): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.TextEditInfo] = js.native
    
    /* private */ /* CompleteClass */
    override def findCommonParents(parent1: Any, parent2: Any): Any = js.native
    
    /* CompleteClass */
    override def forceIndentNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def forceRecomputeIndentationOfParent(tokenStart: Any, newLineAdded: Any): Any = js.native
    
    /* CompleteClass */
    override def forceSkipIndentingNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def formatPair(t1: Any, t1Parent: Any, t2: Any, t2Parent: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    var formattingContext: Any = js.native
    
    /* private */ /* CompleteClass */
    var formattingRequestKind: Any = js.native
    
    /* private */ /* CompleteClass */
    override def getCommentIndentationAmount(token: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def getLineNumber(span: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def getNodeIndentation(node: Any, newLineInsertedByFormatting: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def getTokenIndentationAmount(token: Any): Any = js.native
    
    /* CompleteClass */
    override def indentToken(token: ISyntaxToken, indentationAmount: Double, commentIndentationAmount: Double): Unit = js.native
    
    /* CompleteClass */
    override def indentationNodeContextPool(): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContextPool = js.native
    
    /* CompleteClass */
    var options: FormattingOptions = js.native
    
    /* CompleteClass */
    override def parent(): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    override def position(): Double = js.native
    
    /* private */ /* CompleteClass */
    var previousTokenParent: Any = js.native
    
    /* private */ /* CompleteClass */
    var previousTokenSpan: Any = js.native
    
    /* private */ /* CompleteClass */
    override def processToken(token: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def processTrivia(triviaList: Any, fullStart: Any): Any = js.native
    
    /* CompleteClass */
    override def recordEdit(position: Double, length: Double, replaceWith: String): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForMultiLineComment(
      trivia: Any,
      fullStart: Any,
      indentationString: Any,
      leadingWhiteSpace: Any,
      firstLineAlreadyIndented: Any
    ): Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForSegment(segment: Any, fullStart: Any, indentationColumns: Any, whiteSpaceColumnsInFirstSegment: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForSingleLineOrSkippedText(trivia: Any, fullStart: Any, indentationString: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForToken(token: Any, indentationString: Any, commentIndentationString: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForWhitespace(trivia: Any, fullStart: Any, indentationString: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    var rulesProvider: Any = js.native
    
    /* private */ /* CompleteClass */
    var scriptHasErrors: Any = js.native
    
    /* private */ /* CompleteClass */
    override def shouldIndentBlockInParent(parent: Any): Any = js.native
    
    /* CompleteClass */
    override def snapshot(): ITextSnapshot = js.native
    
    /* CompleteClass */
    override def textSpan(): TextSpan = js.native
    
    /* private */ /* CompleteClass */
    override def trimWhitespace(line: Any, token: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def trimWhitespaceInLineRange(startLine: Any, endLine: Any, token: Any): Any = js.native
    
    /* CompleteClass */
    override def visitArgumentList(node: ArgumentListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitArrayLiteralExpression(node: ArrayLiteralExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitArrayType(node: ArrayTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitBinaryExpression(node: BinaryExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitBlock(node: BlockSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitBreakStatement(node: BreakStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCallSignature(node: CallSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCaseSwitchClause(node: CaseSwitchClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCastExpression(node: CastExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCatchClause(node: CatchClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitClassDeclaration(node: ClassDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConditionalExpression(node: ConditionalExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstraint(node: ConstraintSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstructSignature(node: ConstructSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstructorDeclaration(node: ConstructorDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstructorType(node: ConstructorTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitContinueStatement(node: ContinueStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDebuggerStatement(node: DebuggerStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDefaultSwitchClause(node: DefaultSwitchClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDeleteExpression(node: DeleteExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDoStatement(node: DoStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitElementAccessExpression(node: ElementAccessExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitElseClause(node: ElseClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEmptyStatement(node: EmptyStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEnumDeclaration(node: EnumDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEnumElement(node: EnumElementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEqualsValueClause(node: EqualsValueClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitExportAssignment(node: ExportAssignmentSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitExpressionStatement(node: ExpressionStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitExternalModuleReference(node: ExternalModuleReferenceSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFinallyClause(node: FinallyClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitForInStatement(node: ForInStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitForStatement(node: ForStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionDeclaration(node: FunctionDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionExpression(node: FunctionExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionPropertyAssignment(node: FunctionPropertyAssignmentSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionType(node: FunctionTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitGenericType(node: GenericTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitGetAccessor(node: GetAccessorSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitHeritageClause(node: HeritageClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitIfStatement(node: IfStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitImportDeclaration(node: ImportDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitIndexMemberDeclaration(node: IndexMemberDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitIndexSignature(node: IndexSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitInterfaceDeclaration(node: InterfaceDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitInvocationExpression(node: InvocationExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitLabeledStatement(node: LabeledStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitList(list: ISyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitMemberAccessExpression(node: MemberAccessExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitMemberFunctionDeclaration(node: MemberFunctionDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitMemberVariableDeclaration(node: MemberVariableDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitMethodSignature(node: MethodSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitModuleDeclaration(node: ModuleDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitModuleNameModuleReference(node: ModuleNameModuleReferenceSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* CompleteClass */
    override def visitObjectCreationExpression(node: ObjectCreationExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitObjectLiteralExpression(node: ObjectLiteralExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitObjectType(node: ObjectTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitOmittedExpression(node: OmittedExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitOptionalNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitOptionalNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def visitOptionalToken(token: Any): Any = js.native
    
    /* CompleteClass */
    override def visitParameter(node: ParameterSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitParameterList(node: ParameterListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedArrowFunctionExpression(node: ParenthesizedArrowFunctionExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedExpression(node: ParenthesizedExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitPostfixUnaryExpression(node: PostfixUnaryExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitPrefixUnaryExpression(node: PrefixUnaryExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitPropertySignature(node: PropertySignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitQualifiedName(node: QualifiedNameSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitReturnStatement(node: ReturnStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSeparatedList(list: ISeparatedSyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitSetAccessor(node: SetAccessorSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSimpleArrowFunctionExpression(node: SimpleArrowFunctionExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSimplePropertyAssignment(node: SimplePropertyAssignmentSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSourceUnit(node: SourceUnitSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSwitchStatement(node: SwitchStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitThrowStatement(node: ThrowStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitToken(token: ISyntaxToken): Any = js.native
    
    /* CompleteClass */
    override def visitTokenInSpan(token: ISyntaxToken): Unit = js.native
    
    /* CompleteClass */
    override def visitTryStatement(node: TryStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeAnnotation(node: TypeAnnotationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeArgumentList(node: TypeArgumentListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeOfExpression(node: TypeOfExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameter(node: TypeParameterSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameterList(node: TypeParameterListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeQuery(node: TypeQuerySyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclaration(node: VariableDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclarator(node: VariableDeclaratorSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVariableStatement(node: VariableStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVoidExpression(node: VoidExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitWhileStatement(node: WhileStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitWithStatement(node: WithStatementSyntax): Any = js.native
  }
  object Formatter {
    
    @JSGlobal("TypeScript.Services.Formatting.Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getEdits(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      options: FormattingOptions,
      indentFirstToken: Boolean,
      snapshot: ITextSnapshot,
      rulesProvider: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
      formattingRequestKind: FormattingRequestKind
    ): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.TextEditInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEdits")(textSpan.asInstanceOf[js.Any], sourceUnit.asInstanceOf[js.Any], options.asInstanceOf[js.Any], indentFirstToken.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any], rulesProvider.asInstanceOf[js.Any], formattingRequestKind.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.TextEditInfo]]
  }
  
  @JSGlobal("TypeScript.Services.Formatting.FormattingContext")
  @js.native
  open class FormattingContext protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext {
    def this(snapshot: ITextSnapshot, formattingRequestKind: FormattingRequestKind) = this()
    
    /* CompleteClass */
    override def BlockIsOnOneLine(node: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
    
    /* CompleteClass */
    override def ContextNodeAllOnSameLine(): Boolean = js.native
    
    /* CompleteClass */
    override def ContextNodeBlockIsOnOneLine(): Boolean = js.native
    
    /* CompleteClass */
    override def NextNodeAllOnSameLine(): Boolean = js.native
    
    /* CompleteClass */
    override def NextNodeBlockIsOnOneLine(): Boolean = js.native
    
    /* CompleteClass */
    override def NodeIsOnOneLine(node: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
    
    /* CompleteClass */
    override def TokensAreOnSameLine(): Boolean = js.native
    
    /* CompleteClass */
    var contextNode: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* private */ /* CompleteClass */
    var contextNodeAllOnSameLine: Any = js.native
    
    /* private */ /* CompleteClass */
    var contextNodeBlockIsOnOneLine: Any = js.native
    
    /* CompleteClass */
    var currentTokenParent: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    var currentTokenSpan: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.TokenSpan = js.native
    
    /* CompleteClass */
    var formattingRequestKind: FormattingRequestKind = js.native
    
    /* private */ /* CompleteClass */
    var nextNodeAllOnSameLine: Any = js.native
    
    /* private */ /* CompleteClass */
    var nextNodeBlockIsOnOneLine: Any = js.native
    
    /* CompleteClass */
    var nextTokenParent: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    var nextTokenSpan: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.TokenSpan = js.native
    
    /* private */ /* CompleteClass */
    var snapshot: Any = js.native
    
    /* private */ /* CompleteClass */
    var tokensAreOnSameLine: Any = js.native
    
    /* CompleteClass */
    override def updateContext(
      currentTokenSpan: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.TokenSpan,
      currentTokenParent: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
      nextTokenSpan: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.TokenSpan,
      nextTokenParent: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
      commonParent: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext
    ): Unit = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.FormattingManager")
  @js.native
  open class FormattingManager protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingManager {
    def this(
      syntaxTree: SyntaxTree,
      snapshot: ITextSnapshot,
      rulesProvider: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
      editorOptions: typingsJapgolly.typescriptServices.TypeScript.Services.EditorOptions
    ) = this()
    
    /* CompleteClass */
    override def formatDocument(minChar: Double, limChar: Double): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.TextEdit] = js.native
    
    /* CompleteClass */
    override def formatOnClosingCurlyBrace(caretPosition: Double): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.TextEdit] = js.native
    
    /* CompleteClass */
    override def formatOnEnter(caretPosition: Double): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.TextEdit] = js.native
    
    /* CompleteClass */
    override def formatOnPaste(minChar: Double, limChar: Double): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.TextEdit] = js.native
    
    /* CompleteClass */
    override def formatOnSemicolon(caretPosition: Double): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.TextEdit] = js.native
    
    /* CompleteClass */
    override def formatSelection(minChar: Double, limChar: Double): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.TextEdit] = js.native
    
    /* private */ /* CompleteClass */
    override def formatSpan(span: Any, formattingRequestKind: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    var options: Any = js.native
    
    /* private */ /* CompleteClass */
    var rulesProvider: Any = js.native
    
    /* private */ /* CompleteClass */
    var snapshot: Any = js.native
    
    /* private */ /* CompleteClass */
    var syntaxTree: Any = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.FormattingRequestKind")
  @js.native
  object FormattingRequestKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind & Double
      ] = js.native
    
    /* 0 */ val FormatDocument: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatDocument & Double = js.native
    
    /* 4 */ val FormatOnClosingCurlyBrace: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnClosingCurlyBrace & Double = js.native
    
    /* 2 */ val FormatOnEnter: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnEnter & Double = js.native
    
    /* 5 */ val FormatOnPaste: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnPaste & Double = js.native
    
    /* 3 */ val FormatOnSemicolon: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnSemicolon & Double = js.native
    
    /* 1 */ val FormatSelection: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatSelection & Double = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.IndentationNodeContext")
  @js.native
  open class IndentationNodeContext protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext {
    def this(
      parent: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
      node: SyntaxNode,
      fullStart: Double,
      indentationAmount: Double,
      childIndentationAmountDelta: Double
    ) = this()
    
    /* private */ /* CompleteClass */
    var _childIndentationAmountDelta: Any = js.native
    
    /* private */ /* CompleteClass */
    var _depth: Any = js.native
    
    /* private */ /* CompleteClass */
    var _fullStart: Any = js.native
    
    /* private */ /* CompleteClass */
    var _hasSkippedOrMissingTokenChild: Any = js.native
    
    /* private */ /* CompleteClass */
    var _indentationAmount: Any = js.native
    
    /* private */ /* CompleteClass */
    var _node: Any = js.native
    
    /* private */ /* CompleteClass */
    var _parent: Any = js.native
    
    /* CompleteClass */
    override def childIndentationAmountDelta(): Double = js.native
    
    /* CompleteClass */
    override def clone(pool: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContextPool): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    override def depth(): Double = js.native
    
    /* CompleteClass */
    override def end(): Double = js.native
    
    /* CompleteClass */
    override def fullStart(): Double = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasSkippedOrMissingTokenChild(): Boolean = js.native
    
    /* CompleteClass */
    override def indentationAmount(): Double = js.native
    
    /* CompleteClass */
    override def kind(): SyntaxKind = js.native
    
    /* CompleteClass */
    override def node(): SyntaxNode = js.native
    
    /* CompleteClass */
    override def parent(): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    override def start(): Double = js.native
    
    /* CompleteClass */
    override def update(
      parent: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
      node: SyntaxNode,
      fullStart: Double,
      indentationAmount: Double,
      childIndentationAmountDelta: Double
    ): Unit = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.IndentationNodeContextPool")
  @js.native
  open class IndentationNodeContextPool ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContextPool
  
  @JSGlobal("TypeScript.Services.Formatting.IndentationTrackingWalker")
  @js.native
  open class IndentationTrackingWalker protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationTrackingWalker {
    def this(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      indentFirstToken: Boolean,
      options: FormattingOptions
    ) = this()
    
    /* private */ /* CompleteClass */
    var _indentationNodeContextPool: Any = js.native
    
    /* private */ /* CompleteClass */
    var _lastTriviaWasNewLine: Any = js.native
    
    /* private */ /* CompleteClass */
    var _parent: Any = js.native
    
    /* private */ /* CompleteClass */
    var _position: Any = js.native
    
    /* private */ /* CompleteClass */
    var _snapshot: Any = js.native
    
    /* private */ /* CompleteClass */
    var _textSpan: Any = js.native
    
    /* CompleteClass */
    override def forceIndentNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def forceRecomputeIndentationOfParent(tokenStart: Any, newLineAdded: Any): Any = js.native
    
    /* CompleteClass */
    override def forceSkipIndentingNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def getCommentIndentationAmount(token: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def getNodeIndentation(node: Any, newLineInsertedByFormatting: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def getTokenIndentationAmount(token: Any): Any = js.native
    
    /* CompleteClass */
    override def indentToken(token: ISyntaxToken, indentationAmount: Double, commentIndentationAmount: Double): Unit = js.native
    
    /* CompleteClass */
    override def indentationNodeContextPool(): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContextPool = js.native
    
    /* CompleteClass */
    var options: FormattingOptions = js.native
    
    /* CompleteClass */
    override def parent(): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    override def position(): Double = js.native
    
    /* private */ /* CompleteClass */
    override def shouldIndentBlockInParent(parent: Any): Any = js.native
    
    /* CompleteClass */
    override def snapshot(): ITextSnapshot = js.native
    
    /* CompleteClass */
    override def textSpan(): TextSpan = js.native
    
    /* CompleteClass */
    override def visitArgumentList(node: ArgumentListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitArrayLiteralExpression(node: ArrayLiteralExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitArrayType(node: ArrayTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitBinaryExpression(node: BinaryExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitBlock(node: BlockSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitBreakStatement(node: BreakStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCallSignature(node: CallSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCaseSwitchClause(node: CaseSwitchClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCastExpression(node: CastExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCatchClause(node: CatchClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitClassDeclaration(node: ClassDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConditionalExpression(node: ConditionalExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstraint(node: ConstraintSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstructSignature(node: ConstructSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstructorDeclaration(node: ConstructorDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstructorType(node: ConstructorTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitContinueStatement(node: ContinueStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDebuggerStatement(node: DebuggerStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDefaultSwitchClause(node: DefaultSwitchClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDeleteExpression(node: DeleteExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDoStatement(node: DoStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitElementAccessExpression(node: ElementAccessExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitElseClause(node: ElseClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEmptyStatement(node: EmptyStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEnumDeclaration(node: EnumDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEnumElement(node: EnumElementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEqualsValueClause(node: EqualsValueClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitExportAssignment(node: ExportAssignmentSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitExpressionStatement(node: ExpressionStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitExternalModuleReference(node: ExternalModuleReferenceSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFinallyClause(node: FinallyClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitForInStatement(node: ForInStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitForStatement(node: ForStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionDeclaration(node: FunctionDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionExpression(node: FunctionExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionPropertyAssignment(node: FunctionPropertyAssignmentSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionType(node: FunctionTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitGenericType(node: GenericTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitGetAccessor(node: GetAccessorSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitHeritageClause(node: HeritageClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitIfStatement(node: IfStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitImportDeclaration(node: ImportDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitIndexMemberDeclaration(node: IndexMemberDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitIndexSignature(node: IndexSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitInterfaceDeclaration(node: InterfaceDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitInvocationExpression(node: InvocationExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitLabeledStatement(node: LabeledStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitList(list: ISyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitMemberAccessExpression(node: MemberAccessExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitMemberFunctionDeclaration(node: MemberFunctionDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitMemberVariableDeclaration(node: MemberVariableDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitMethodSignature(node: MethodSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitModuleDeclaration(node: ModuleDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitModuleNameModuleReference(node: ModuleNameModuleReferenceSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* CompleteClass */
    override def visitObjectCreationExpression(node: ObjectCreationExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitObjectLiteralExpression(node: ObjectLiteralExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitObjectType(node: ObjectTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitOmittedExpression(node: OmittedExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitOptionalNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitOptionalNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def visitOptionalToken(token: Any): Any = js.native
    
    /* CompleteClass */
    override def visitParameter(node: ParameterSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitParameterList(node: ParameterListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedArrowFunctionExpression(node: ParenthesizedArrowFunctionExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedExpression(node: ParenthesizedExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitPostfixUnaryExpression(node: PostfixUnaryExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitPrefixUnaryExpression(node: PrefixUnaryExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitPropertySignature(node: PropertySignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitQualifiedName(node: QualifiedNameSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitReturnStatement(node: ReturnStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSeparatedList(list: ISeparatedSyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitSetAccessor(node: SetAccessorSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSimpleArrowFunctionExpression(node: SimpleArrowFunctionExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSimplePropertyAssignment(node: SimplePropertyAssignmentSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSourceUnit(node: SourceUnitSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSwitchStatement(node: SwitchStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitThrowStatement(node: ThrowStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitToken(token: ISyntaxToken): Any = js.native
    
    /* CompleteClass */
    override def visitTokenInSpan(token: ISyntaxToken): Unit = js.native
    
    /* CompleteClass */
    override def visitTryStatement(node: TryStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeAnnotation(node: TypeAnnotationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeArgumentList(node: TypeArgumentListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeOfExpression(node: TypeOfExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameter(node: TypeParameterSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameterList(node: TypeParameterListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeQuery(node: TypeQuerySyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclaration(node: VariableDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclarator(node: VariableDeclaratorSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVariableStatement(node: VariableStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVoidExpression(node: VoidExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitWhileStatement(node: WhileStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitWithStatement(node: WithStatementSyntax): Any = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.MultipleTokenIndenter")
  @js.native
  open class MultipleTokenIndenter protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.MultipleTokenIndenter {
    def this(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      indentFirstToken: Boolean,
      options: FormattingOptions
    ) = this()
    
    /* private */ /* CompleteClass */
    var _edits: Any = js.native
    
    /* private */ /* CompleteClass */
    var _indentationNodeContextPool: Any = js.native
    
    /* private */ /* CompleteClass */
    var _lastTriviaWasNewLine: Any = js.native
    
    /* private */ /* CompleteClass */
    var _parent: Any = js.native
    
    /* private */ /* CompleteClass */
    var _position: Any = js.native
    
    /* private */ /* CompleteClass */
    var _snapshot: Any = js.native
    
    /* private */ /* CompleteClass */
    var _textSpan: Any = js.native
    
    /* CompleteClass */
    override def edits(): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.TextEditInfo] = js.native
    
    /* CompleteClass */
    override def forceIndentNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def forceRecomputeIndentationOfParent(tokenStart: Any, newLineAdded: Any): Any = js.native
    
    /* CompleteClass */
    override def forceSkipIndentingNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def getCommentIndentationAmount(token: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def getNodeIndentation(node: Any, newLineInsertedByFormatting: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def getTokenIndentationAmount(token: Any): Any = js.native
    
    /* CompleteClass */
    override def indentToken(token: ISyntaxToken, indentationAmount: Double, commentIndentationAmount: Double): Unit = js.native
    
    /* CompleteClass */
    override def indentationNodeContextPool(): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContextPool = js.native
    
    /* CompleteClass */
    var options: FormattingOptions = js.native
    
    /* CompleteClass */
    override def parent(): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    override def position(): Double = js.native
    
    /* CompleteClass */
    override def recordEdit(position: Double, length: Double, replaceWith: String): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForMultiLineComment(
      trivia: Any,
      fullStart: Any,
      indentationString: Any,
      leadingWhiteSpace: Any,
      firstLineAlreadyIndented: Any
    ): Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForSegment(segment: Any, fullStart: Any, indentationColumns: Any, whiteSpaceColumnsInFirstSegment: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForSingleLineOrSkippedText(trivia: Any, fullStart: Any, indentationString: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForToken(token: Any, indentationString: Any, commentIndentationString: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForWhitespace(trivia: Any, fullStart: Any, indentationString: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def shouldIndentBlockInParent(parent: Any): Any = js.native
    
    /* CompleteClass */
    override def snapshot(): ITextSnapshot = js.native
    
    /* CompleteClass */
    override def textSpan(): TextSpan = js.native
    
    /* CompleteClass */
    override def visitArgumentList(node: ArgumentListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitArrayLiteralExpression(node: ArrayLiteralExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitArrayType(node: ArrayTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitBinaryExpression(node: BinaryExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitBlock(node: BlockSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitBreakStatement(node: BreakStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCallSignature(node: CallSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCaseSwitchClause(node: CaseSwitchClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCastExpression(node: CastExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCatchClause(node: CatchClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitClassDeclaration(node: ClassDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConditionalExpression(node: ConditionalExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstraint(node: ConstraintSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstructSignature(node: ConstructSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstructorDeclaration(node: ConstructorDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstructorType(node: ConstructorTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitContinueStatement(node: ContinueStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDebuggerStatement(node: DebuggerStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDefaultSwitchClause(node: DefaultSwitchClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDeleteExpression(node: DeleteExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDoStatement(node: DoStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitElementAccessExpression(node: ElementAccessExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitElseClause(node: ElseClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEmptyStatement(node: EmptyStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEnumDeclaration(node: EnumDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEnumElement(node: EnumElementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEqualsValueClause(node: EqualsValueClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitExportAssignment(node: ExportAssignmentSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitExpressionStatement(node: ExpressionStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitExternalModuleReference(node: ExternalModuleReferenceSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFinallyClause(node: FinallyClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitForInStatement(node: ForInStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitForStatement(node: ForStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionDeclaration(node: FunctionDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionExpression(node: FunctionExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionPropertyAssignment(node: FunctionPropertyAssignmentSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionType(node: FunctionTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitGenericType(node: GenericTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitGetAccessor(node: GetAccessorSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitHeritageClause(node: HeritageClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitIfStatement(node: IfStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitImportDeclaration(node: ImportDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitIndexMemberDeclaration(node: IndexMemberDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitIndexSignature(node: IndexSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitInterfaceDeclaration(node: InterfaceDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitInvocationExpression(node: InvocationExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitLabeledStatement(node: LabeledStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitList(list: ISyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitMemberAccessExpression(node: MemberAccessExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitMemberFunctionDeclaration(node: MemberFunctionDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitMemberVariableDeclaration(node: MemberVariableDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitMethodSignature(node: MethodSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitModuleDeclaration(node: ModuleDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitModuleNameModuleReference(node: ModuleNameModuleReferenceSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* CompleteClass */
    override def visitObjectCreationExpression(node: ObjectCreationExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitObjectLiteralExpression(node: ObjectLiteralExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitObjectType(node: ObjectTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitOmittedExpression(node: OmittedExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitOptionalNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitOptionalNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def visitOptionalToken(token: Any): Any = js.native
    
    /* CompleteClass */
    override def visitParameter(node: ParameterSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitParameterList(node: ParameterListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedArrowFunctionExpression(node: ParenthesizedArrowFunctionExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedExpression(node: ParenthesizedExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitPostfixUnaryExpression(node: PostfixUnaryExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitPrefixUnaryExpression(node: PrefixUnaryExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitPropertySignature(node: PropertySignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitQualifiedName(node: QualifiedNameSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitReturnStatement(node: ReturnStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSeparatedList(list: ISeparatedSyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitSetAccessor(node: SetAccessorSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSimpleArrowFunctionExpression(node: SimpleArrowFunctionExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSimplePropertyAssignment(node: SimplePropertyAssignmentSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSourceUnit(node: SourceUnitSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSwitchStatement(node: SwitchStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitThrowStatement(node: ThrowStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitToken(token: ISyntaxToken): Any = js.native
    
    /* CompleteClass */
    override def visitTokenInSpan(token: ISyntaxToken): Unit = js.native
    
    /* CompleteClass */
    override def visitTryStatement(node: TryStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeAnnotation(node: TypeAnnotationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeArgumentList(node: TypeArgumentListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeOfExpression(node: TypeOfExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameter(node: TypeParameterSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameterList(node: TypeParameterListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeQuery(node: TypeQuerySyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclaration(node: VariableDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclarator(node: VariableDeclaratorSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVariableStatement(node: VariableStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVoidExpression(node: VoidExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitWhileStatement(node: WhileStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitWithStatement(node: WithStatementSyntax): Any = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.Rule")
  @js.native
  open class Rule protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule {
    def this(
      Descriptor: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor,
      Operation: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleOperation
    ) = this()
    def this(
      Descriptor: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor,
      Operation: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleOperation,
      Flag: RuleFlags
    ) = this()
    
    /* CompleteClass */
    var Descriptor: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
    
    /* CompleteClass */
    var Flag: RuleFlags = js.native
    
    /* CompleteClass */
    var Operation: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleOperation = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RuleAction")
  @js.native
  object RuleAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleAction & Double
      ] = js.native
    
    /* 3 */ val Delete: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleAction.Delete & Double = js.native
    
    /* 0 */ val Ignore: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleAction.Ignore & Double = js.native
    
    /* 2 */ val NewLine: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleAction.NewLine & Double = js.native
    
    /* 1 */ val Space: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleAction.Space & Double = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RuleDescriptor")
  @js.native
  open class RuleDescriptor protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor {
    def this(LeftTokenRange: TokenRange, RightTokenRange: TokenRange) = this()
    
    /* CompleteClass */
    var LeftTokenRange: TokenRange = js.native
    
    /* CompleteClass */
    var RightTokenRange: TokenRange = js.native
  }
  object RuleDescriptor {
    
    @JSGlobal("TypeScript.Services.Formatting.RuleDescriptor")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create1(left: SyntaxKind, right: SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("create1")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor]
    
    /* static member */
    inline def create2(left: TokenRange, right: SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("create2")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor]
    
    /* static member */
    inline def create3(left: SyntaxKind, right: TokenRange): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("create3")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor]
    
    /* static member */
    inline def create4(left: TokenRange, right: TokenRange): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("create4")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor]
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RuleFlags")
  @js.native
  object RuleFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleFlags & Double
      ] = js.native
    
    /* 1 */ val CanDeleteNewLines: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleFlags.CanDeleteNewLines & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleFlags.None & Double = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RuleOperation")
  @js.native
  open class RuleOperation ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleOperation {
    
    /* CompleteClass */
    var Action: RuleAction = js.native
    
    /* CompleteClass */
    var Context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext = js.native
  }
  object RuleOperation {
    
    @JSGlobal("TypeScript.Services.Formatting.RuleOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create1(action: RuleAction): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("create1")(action.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleOperation]
    
    /* static member */
    inline def create2(
      context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext,
      action: RuleAction
    ): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleOperation = (^.asInstanceOf[js.Dynamic].applyDynamic("create2")(context.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleOperation]
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RuleOperationContext")
  @js.native
  open class RuleOperationContext protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext {
    def this(funcs: (js.Function1[
            /* context */ typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext, 
            Boolean
          ])*) = this()
    
    /* CompleteClass */
    override def InContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* CompleteClass */
    override def IsAny(): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var customContextChecks: Any = js.native
  }
  object RuleOperationContext {
    
    @JSGlobal("TypeScript.Services.Formatting.RuleOperationContext")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.RuleOperationContext.Any")
    @js.native
    def Any: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext = js.native
    inline def Any_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("TypeScript.Services.Formatting.Rules")
  @js.native
  open class Rules ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rules {
    
    /* CompleteClass */
    var ControlOpenBraceLeftTokenRange: TokenRange = js.native
    
    /* CompleteClass */
    var FunctionOpenBraceLeftTokenRange: TokenRange = js.native
    
    /* CompleteClass */
    var HighPriorityCommonRules: js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule] = js.native
    
    /* CompleteClass */
    var IgnoreAfterLineComment: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var IgnoreBeforeComment: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var LowPriorityCommonRules: js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule] = js.native
    
    /* CompleteClass */
    var NewLineAfterOpenBraceInBlockContext: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NewLineBeforeCloseBraceInBlockContext: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NewLineBeforeOpenBraceInControl: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NewLineBeforeOpenBraceInFunction: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NewLineBeforeOpenBraceInTypeScriptDeclWithBlock: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterAnonymousFunctionKeyword: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterBinaryOperator: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterCloseAngularBracket: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterCloseBrace: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterCloseBracket: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterComma: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterConstructor: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterDot: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterEllipsis: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterKeywordInControl: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterModuleImport: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterOpenAngularBracket: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterOpenBracket: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterOpenParen: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterOptionalParameters: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterSemicolonInFor: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterUnaryPredecrementOperator: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterUnaryPrefixOperator: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterUnaryPreincrementOperator: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeBinaryOperator: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeCloseAngularBracket: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeCloseBracket: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeCloseParen: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeColon: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeComma: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeDot: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeOpenAngularBracket: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeOpenBracket: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeOpenParenInFuncCall: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeOpenParenInFuncDecl: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeQMark: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeSemicolon: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeUnaryPostdecrementOperator: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeUnaryPostincrementOperator: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBetweenCloseParenAndAngularBracket: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBetweenEmptyBraceBrackets: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBetweenEmptyInterfaceBraceBrackets: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBetweenParens: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBetweenReturnAndSemicolon: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterAddWhenFollowedByPreincrement: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterAddWhenFollowedByUnaryPlus: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterAnonymousFunctionKeyword: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterArrow: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterBinaryKeywordOperator: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterBinaryOperator: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterCertainKeywords: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterCertainTypeScriptKeywords: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterCloseBrace: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterColon: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterComma: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterFunctionInFuncDecl: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterGetSetInMember: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterKeywordInControl: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterModuleName: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterOpenBrace: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterOpenParen: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterPostdecrementWhenFollowedBySubtract: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterPostincrementWhenFollowedByAdd: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterQMark: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterSemicolon: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterSemicolonInFor: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterSubtractWhenFollowedByPredecrement: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterSubtractWhenFollowedByUnaryMinus: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterTryFinally: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterVoidOperator: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeBinaryKeywordOperator: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeBinaryOperator: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeCertainTypeScriptKeywords: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeCloseBrace: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeCloseParen: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeOpenBraceInControl: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeOpenBraceInFunction: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeOpenBraceInTypeScriptDeclWithBlock: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBetweenCloseBraceAndElse: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBetweenCloseBraceAndWhile: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBetweenStatements: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var TypeScriptOpenBraceLeftTokenRange: TokenRange = js.native
    
    /* CompleteClass */
    override def getRuleName(rule: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule): Any = js.native
  }
  object Rules {
    
    @JSGlobal("TypeScript.Services.Formatting.Rules")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def IsAfterCodeBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAfterCodeBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsBeforeBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBeforeBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsBeforeMultilineBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBeforeMultilineBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsBinaryOpContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBinaryOpContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsControlDeclContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsControlDeclContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsForContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsForContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsFunctionCallContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFunctionCallContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsFunctionCallOrNewContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFunctionCallOrNewContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsFunctionDeclContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFunctionDeclContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsModuleDeclContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsModuleDeclContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsMultilineBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMultilineBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsNewContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNewContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsNotBinaryOpContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotBinaryOpContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsNotForContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotForContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsNotFormatOnEnter(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotFormatOnEnter")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsObjectContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsObjectContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsObjectTypeContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsObjectTypeContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsSameLineTokenContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSameLineTokenContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsSameLineTokenOrBeforeMultilineBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSameLineTokenOrBeforeMultilineBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsSingleLineBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSingleLineBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsTypeArgumentOrParameter(tokenKind: SyntaxKind, parentKind: SyntaxKind): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("IsTypeArgumentOrParameter")(tokenKind.asInstanceOf[js.Any], parentKind.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsTypeArgumentOrParameterContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsTypeArgumentOrParameterContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsTypeScriptDeclWithBlockContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsTypeScriptDeclWithBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsVoidOpContext(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsVoidOpContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def NodeIsBlockContext(node: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("NodeIsBlockContext")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def NodeIsTypeScriptDeclWithBlockContext(node: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("NodeIsTypeScriptDeclWithBlockContext")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RulesBucket")
  @js.native
  open class RulesBucket ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesBucket {
    
    /* CompleteClass */
    override def AddRule(
      rule: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule,
      specificTokens: Boolean,
      constructionState: js.Array[
          typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesBucketConstructionState
        ],
      rulesBucketIndex: Double
    ): Unit = js.native
    
    /* CompleteClass */
    override def Rules(): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule] = js.native
    
    /* private */ /* CompleteClass */
    var rules: Any = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RulesBucketConstructionState")
  @js.native
  open class RulesBucketConstructionState ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesBucketConstructionState {
    
    /* CompleteClass */
    override def GetInsertionIndex(maskPosition: RulesPosition): Double = js.native
    
    /* CompleteClass */
    override def IncreaseInsertionIndex(maskPosition: RulesPosition): Unit = js.native
    
    /* private */ /* CompleteClass */
    var rulesInsertionIndexBitmap: Any = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RulesMap")
  @js.native
  open class RulesMap ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesMap {
    
    /* private */ /* CompleteClass */
    override def FillRule(rule: Any, rulesBucketConstructionStateList: Any): Any = js.native
    
    /* CompleteClass */
    override def FillRules(
      rules: js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule],
      rulesBucketConstructionStateList: js.Array[
          typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesBucketConstructionState
        ]
    ): Unit = js.native
    
    /* CompleteClass */
    override def GetRule(context: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingContext): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* private */ /* CompleteClass */
    override def GetRuleBucketIndex(row: Any, column: Any): Any = js.native
    
    /* CompleteClass */
    override def Initialize(rules: js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule]): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesBucket] = js.native
    
    /* CompleteClass */
    var map: js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesBucket] = js.native
    
    /* CompleteClass */
    var mapRowLength: Double = js.native
  }
  object RulesMap {
    
    @JSGlobal("TypeScript.Services.Formatting.RulesMap")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(rules: js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule]): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesMap = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rules.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesMap]
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RulesPosition")
  @js.native
  object RulesPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesPosition & Double
      ] = js.native
    
    /* 2 */ val ContextRulesAny: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesPosition.ContextRulesAny & Double = js.native
    
    /* 1 */ val ContextRulesSpecific: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesPosition.ContextRulesSpecific & Double = js.native
    
    /* 0 */ val IgnoreRulesAny: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesPosition.IgnoreRulesAny & Double = js.native
    
    /* 0 */ val IgnoreRulesSpecific: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesPosition.IgnoreRulesSpecific & Double = js.native
    
    /* 4 */ val NoContextRulesAny: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesPosition.NoContextRulesAny & Double = js.native
    
    /* 3 */ val NoContextRulesSpecific: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesPosition.NoContextRulesSpecific & Double = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RulesProvider")
  @js.native
  open class RulesProvider protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesProvider {
    def this(logger: ILogger) = this()
    
    /* private */ /* CompleteClass */
    var activeRules: Any = js.native
    
    /* private */ /* CompleteClass */
    override def createActiveRules(options: Any): Any = js.native
    
    /* CompleteClass */
    override def ensureUpToDate(options: typingsJapgolly.typescriptServices.TypeScript.Services.FormatCodeOptions): Unit = js.native
    
    /* CompleteClass */
    override def getRuleByName(name: String): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    override def getRuleName(rule: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Rule): String = js.native
    
    /* CompleteClass */
    override def getRulesMap(): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesMap = js.native
    
    /* private */ /* CompleteClass */
    var globalRules: Any = js.native
    
    /* private */ /* CompleteClass */
    var logger: Any = js.native
    
    /* private */ /* CompleteClass */
    var options: Any = js.native
    
    /* private */ /* CompleteClass */
    var rulesMap: Any = js.native
  }
  
  object Shared {
    
    @JSGlobal("TypeScript.Services.Formatting.Shared.TokenAllAccess")
    @js.native
    open class TokenAllAccess ()
      extends StObject
         with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenAllAccess {
      
      /* CompleteClass */
      override def Contains(token: SyntaxKind): Boolean = js.native
      
      /* CompleteClass */
      override def GetTokens(): js.Array[SyntaxKind] = js.native
    }
    
    @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange")
    @js.native
    open class TokenRange protected ()
      extends StObject
         with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange {
      def this(tokenAccess: ITokenAccess) = this()
      
      /* CompleteClass */
      override def Contains(token: SyntaxKind): Boolean = js.native
      
      /* CompleteClass */
      override def GetTokens(): js.Array[SyntaxKind] = js.native
      
      /* CompleteClass */
      var tokenAccess: ITokenAccess = js.native
    }
    object TokenRange {
      
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def AllTokens(): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = ^.asInstanceOf[js.Dynamic].applyDynamic("AllTokens")().asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange]
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.Any")
      @js.native
      def Any: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.AnyIncludingMultilineComments")
      @js.native
      def AnyIncludingMultilineComments: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def AnyIncludingMultilineComments_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnyIncludingMultilineComments")(x.asInstanceOf[js.Any])
      
      inline def Any_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.BinaryKeywordOperators")
      @js.native
      def BinaryKeywordOperators: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def BinaryKeywordOperators_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BinaryKeywordOperators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.BinaryOperators")
      @js.native
      def BinaryOperators: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def BinaryOperators_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BinaryOperators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.Comments")
      @js.native
      def Comments: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def Comments_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Comments")(x.asInstanceOf[js.Any])
      
      /* static member */
      inline def FromRange(f: SyntaxKind, to: SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = (^.asInstanceOf[js.Dynamic].applyDynamic("FromRange")(f.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange]
      inline def FromRange(f: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = (^.asInstanceOf[js.Dynamic].applyDynamic("FromRange")(f.asInstanceOf[js.Any], to.asInstanceOf[js.Any], except.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange]
      
      /* static member */
      inline def FromToken(token: SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = ^.asInstanceOf[js.Dynamic].applyDynamic("FromToken")(token.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange]
      
      /* static member */
      inline def FromTokens(tokens: js.Array[SyntaxKind]): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = ^.asInstanceOf[js.Dynamic].applyDynamic("FromTokens")(tokens.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange]
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.Keywords")
      @js.native
      def Keywords: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def Keywords_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Keywords")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.Operators")
      @js.native
      def Operators: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def Operators_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Operators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.ReservedKeywords")
      @js.native
      def ReservedKeywords: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def ReservedKeywords_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReservedKeywords")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.TypeNames")
      @js.native
      def TypeNames: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def TypeNames_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeNames")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPostdecrementExpressions")
      @js.native
      def UnaryPostdecrementExpressions: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def UnaryPostdecrementExpressions_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPostdecrementExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPostincrementExpressions")
      @js.native
      def UnaryPostincrementExpressions: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def UnaryPostincrementExpressions_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPostincrementExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPredecrementExpressions")
      @js.native
      def UnaryPredecrementExpressions: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def UnaryPredecrementExpressions_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPredecrementExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPrefixExpressions")
      @js.native
      def UnaryPrefixExpressions: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def UnaryPrefixExpressions_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPrefixExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPrefixOperators")
      @js.native
      def UnaryPrefixOperators: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def UnaryPrefixOperators_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPrefixOperators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPreincrementExpressions")
      @js.native
      def UnaryPreincrementExpressions: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def UnaryPreincrementExpressions_=(x: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPreincrementExpressions")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRangeAccess")
    @js.native
    open class TokenRangeAccess protected ()
      extends StObject
         with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRangeAccess {
      def this(from: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]) = this()
      
      /* CompleteClass */
      override def Contains(token: SyntaxKind): Boolean = js.native
      
      /* CompleteClass */
      override def GetTokens(): js.Array[SyntaxKind] = js.native
      
      /* private */ /* CompleteClass */
      var tokens: Any = js.native
    }
    
    @JSGlobal("TypeScript.Services.Formatting.Shared.TokenSingleValueAccess")
    @js.native
    open class TokenSingleValueAccess protected ()
      extends StObject
         with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenSingleValueAccess {
      def this(token: SyntaxKind) = this()
      
      /* CompleteClass */
      override def Contains(token: SyntaxKind): Boolean = js.native
      
      /* CompleteClass */
      override def GetTokens(): js.Array[SyntaxKind] = js.native
      
      /* CompleteClass */
      var token: SyntaxKind = js.native
    }
    
    @JSGlobal("TypeScript.Services.Formatting.Shared.TokenValuesAccess")
    @js.native
    open class TokenValuesAccess protected ()
      extends StObject
         with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenValuesAccess {
      def this(tks: js.Array[SyntaxKind]) = this()
      
      /* CompleteClass */
      override def Contains(token: SyntaxKind): Boolean = js.native
      
      /* CompleteClass */
      override def GetTokens(): js.Array[SyntaxKind] = js.native
      
      /* private */ /* CompleteClass */
      var tokens: Any = js.native
    }
  }
  
  @JSGlobal("TypeScript.Services.Formatting.SingleTokenIndenter")
  @js.native
  open class SingleTokenIndenter protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.SingleTokenIndenter {
    def this(
      indentationPosition: Double,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      indentFirstToken: Boolean,
      options: FormattingOptions
    ) = this()
    
    /* private */ /* CompleteClass */
    var _indentationNodeContextPool: Any = js.native
    
    /* private */ /* CompleteClass */
    var _lastTriviaWasNewLine: Any = js.native
    
    /* private */ /* CompleteClass */
    var _parent: Any = js.native
    
    /* private */ /* CompleteClass */
    var _position: Any = js.native
    
    /* private */ /* CompleteClass */
    var _snapshot: Any = js.native
    
    /* private */ /* CompleteClass */
    var _textSpan: Any = js.native
    
    /* CompleteClass */
    override def forceIndentNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def forceRecomputeIndentationOfParent(tokenStart: Any, newLineAdded: Any): Any = js.native
    
    /* CompleteClass */
    override def forceSkipIndentingNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def getCommentIndentationAmount(token: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def getNodeIndentation(node: Any, newLineInsertedByFormatting: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def getTokenIndentationAmount(token: Any): Any = js.native
    
    /* CompleteClass */
    override def indentToken(token: ISyntaxToken, indentationAmount: Double, commentIndentationAmount: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var indentationAmount: Any = js.native
    
    /* CompleteClass */
    override def indentationNodeContextPool(): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContextPool = js.native
    
    /* private */ /* CompleteClass */
    var indentationPosition: Any = js.native
    
    /* CompleteClass */
    var options: FormattingOptions = js.native
    
    /* CompleteClass */
    override def parent(): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    override def position(): Double = js.native
    
    /* private */ /* CompleteClass */
    override def shouldIndentBlockInParent(parent: Any): Any = js.native
    
    /* CompleteClass */
    override def snapshot(): ITextSnapshot = js.native
    
    /* CompleteClass */
    override def textSpan(): TextSpan = js.native
    
    /* CompleteClass */
    override def visitArgumentList(node: ArgumentListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitArrayLiteralExpression(node: ArrayLiteralExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitArrayType(node: ArrayTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitBinaryExpression(node: BinaryExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitBlock(node: BlockSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitBreakStatement(node: BreakStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCallSignature(node: CallSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCaseSwitchClause(node: CaseSwitchClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCastExpression(node: CastExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitCatchClause(node: CatchClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitClassDeclaration(node: ClassDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConditionalExpression(node: ConditionalExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstraint(node: ConstraintSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstructSignature(node: ConstructSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstructorDeclaration(node: ConstructorDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitConstructorType(node: ConstructorTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitContinueStatement(node: ContinueStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDebuggerStatement(node: DebuggerStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDefaultSwitchClause(node: DefaultSwitchClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDeleteExpression(node: DeleteExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitDoStatement(node: DoStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitElementAccessExpression(node: ElementAccessExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitElseClause(node: ElseClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEmptyStatement(node: EmptyStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEnumDeclaration(node: EnumDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEnumElement(node: EnumElementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitEqualsValueClause(node: EqualsValueClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitExportAssignment(node: ExportAssignmentSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitExpressionStatement(node: ExpressionStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitExternalModuleReference(node: ExternalModuleReferenceSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFinallyClause(node: FinallyClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitForInStatement(node: ForInStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitForStatement(node: ForStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionDeclaration(node: FunctionDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionExpression(node: FunctionExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionPropertyAssignment(node: FunctionPropertyAssignmentSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitFunctionType(node: FunctionTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitGenericType(node: GenericTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitGetAccessor(node: GetAccessorSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitHeritageClause(node: HeritageClauseSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitIfStatement(node: IfStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitImportDeclaration(node: ImportDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitIndexMemberDeclaration(node: IndexMemberDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitIndexSignature(node: IndexSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitInterfaceDeclaration(node: InterfaceDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitInvocationExpression(node: InvocationExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitLabeledStatement(node: LabeledStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitList(list: ISyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitMemberAccessExpression(node: MemberAccessExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitMemberFunctionDeclaration(node: MemberFunctionDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitMemberVariableDeclaration(node: MemberVariableDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitMethodSignature(node: MethodSignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitModuleDeclaration(node: ModuleDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitModuleNameModuleReference(node: ModuleNameModuleReferenceSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* CompleteClass */
    override def visitObjectCreationExpression(node: ObjectCreationExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitObjectLiteralExpression(node: ObjectLiteralExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitObjectType(node: ObjectTypeSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitOmittedExpression(node: OmittedExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitOptionalNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitOptionalNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def visitOptionalToken(token: Any): Any = js.native
    
    /* CompleteClass */
    override def visitParameter(node: ParameterSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitParameterList(node: ParameterListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedArrowFunctionExpression(node: ParenthesizedArrowFunctionExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedExpression(node: ParenthesizedExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitPostfixUnaryExpression(node: PostfixUnaryExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitPrefixUnaryExpression(node: PrefixUnaryExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitPropertySignature(node: PropertySignatureSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitQualifiedName(node: QualifiedNameSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitReturnStatement(node: ReturnStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSeparatedList(list: ISeparatedSyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitSetAccessor(node: SetAccessorSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSimpleArrowFunctionExpression(node: SimpleArrowFunctionExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSimplePropertyAssignment(node: SimplePropertyAssignmentSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSourceUnit(node: SourceUnitSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitSwitchStatement(node: SwitchStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitThrowStatement(node: ThrowStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitToken(token: ISyntaxToken): Any = js.native
    
    /* CompleteClass */
    override def visitTokenInSpan(token: ISyntaxToken): Unit = js.native
    
    /* CompleteClass */
    override def visitTryStatement(node: TryStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeAnnotation(node: TypeAnnotationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeArgumentList(node: TypeArgumentListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeOfExpression(node: TypeOfExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameter(node: TypeParameterSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameterList(node: TypeParameterListSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitTypeQuery(node: TypeQuerySyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclaration(node: VariableDeclarationSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclarator(node: VariableDeclaratorSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVariableStatement(node: VariableStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitVoidExpression(node: VoidExpressionSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitWhileStatement(node: WhileStatementSyntax): Any = js.native
    
    /* CompleteClass */
    override def visitWithStatement(node: WithStatementSyntax): Any = js.native
  }
  object SingleTokenIndenter {
    
    @JSGlobal("TypeScript.Services.Formatting.SingleTokenIndenter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getIndentationAmount(
      position: Double,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      options: FormattingOptions
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndentationAmount")(position.asInstanceOf[js.Any], sourceUnit.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSGlobal("TypeScript.Services.Formatting.SnapshotPoint")
  @js.native
  open class SnapshotPoint protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint {
    def this(snapshot: ITextSnapshot, position: Double) = this()
    
    /* CompleteClass */
    override def add(offset: Double): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint = js.native
    
    /* CompleteClass */
    override def getContainingLine(): ITextSnapshotLine = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    var snapshot: ITextSnapshot = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.TextEditInfo")
  @js.native
  open class TextEditInfo protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.TextEditInfo {
    def this(position: Double, length: Double, replaceWith: String) = this()
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    var replaceWith: String = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.TextSnapshot")
  @js.native
  open class TextSnapshot protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.TextSnapshot {
    def this(snapshot: ISimpleText) = this()
    
    /* CompleteClass */
    override def getLineFromLineNumber(lineNumber: Double): ITextSnapshotLine = js.native
    
    /* private */ /* CompleteClass */
    override def getLineFromLineNumberWorker(lineNumber: Any): Any = js.native
    
    /* CompleteClass */
    override def getLineFromPosition(position: Double): ITextSnapshotLine = js.native
    
    /* CompleteClass */
    override def getLineNumberFromPosition(position: Double): Double = js.native
    
    /* CompleteClass */
    override def getText(span: TextSpan): String = js.native
    
    /* private */ /* CompleteClass */
    var lines: Any = js.native
    
    /* private */ /* CompleteClass */
    var snapshot: Any = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.TextSnapshotLine")
  @js.native
  open class TextSnapshotLine protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.TextSnapshotLine {
    def this(_snapshot: ITextSnapshot, _lineNumber: Double, _start: Double, _end: Double, _lineBreak: String) = this()
    
    /* private */ /* CompleteClass */
    var _end: Any = js.native
    
    /* private */ /* CompleteClass */
    var _lineBreak: Any = js.native
    
    /* private */ /* CompleteClass */
    var _lineNumber: Any = js.native
    
    /* private */ /* CompleteClass */
    var _snapshot: Any = js.native
    
    /* private */ /* CompleteClass */
    var _start: Any = js.native
    
    /* CompleteClass */
    override def end(): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint = js.native
    
    /* CompleteClass */
    override def endIncludingLineBreak(): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint = js.native
    
    /* CompleteClass */
    override def endIncludingLineBreakPosition(): Double = js.native
    
    /* CompleteClass */
    override def endPosition(): Double = js.native
    
    /* CompleteClass */
    override def getText(): String = js.native
    
    /* CompleteClass */
    override def length(): Double = js.native
    
    /* CompleteClass */
    override def lineNumber(): Double = js.native
    
    /* CompleteClass */
    override def snapshot(): ITextSnapshot = js.native
    
    /* CompleteClass */
    override def start(): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint = js.native
    
    /* CompleteClass */
    override def startPosition(): Double = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.TokenSpan")
  @js.native
  open class TokenSpan protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.TokenSpan {
    def this(kind: SyntaxKind, start: Double, length: Double) = this()
    
    /* private */ /* CompleteClass */
    var _kind: Any = js.native
    
    /* private */ /* CompleteClass */
    var _length: Any = js.native
    
    /* private */ /* CompleteClass */
    var _start: Any = js.native
    
    /* CompleteClass */
    override def containsPosition(position: Double): Boolean = js.native
    
    /* CompleteClass */
    override def containsTextSpan(span: TextSpan): Boolean = js.native
    
    /* CompleteClass */
    override def end(): Double = js.native
    
    /* CompleteClass */
    override def intersection(span: TextSpan): TextSpan = js.native
    
    /* CompleteClass */
    override def intersectsWith(start: Double, length: Double): Boolean = js.native
    
    /* CompleteClass */
    override def intersectsWithPosition(position: Double): Boolean = js.native
    
    /* CompleteClass */
    override def intersectsWithTextSpan(span: TextSpan): Boolean = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    override def kind(): SyntaxKind = js.native
    
    /* CompleteClass */
    override def length(): Double = js.native
    
    /* CompleteClass */
    override def overlap(span: TextSpan): TextSpan = js.native
    
    /* CompleteClass */
    override def overlapsWith(span: TextSpan): Boolean = js.native
    
    /* CompleteClass */
    override def start(): Double = js.native
  }
}
