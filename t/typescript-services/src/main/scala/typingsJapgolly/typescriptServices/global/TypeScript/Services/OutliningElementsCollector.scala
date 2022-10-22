package typingsJapgolly.typescriptServices.global.TypeScript.Services

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
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxElement
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

@JSGlobal("TypeScript.Services.OutliningElementsCollector")
@js.native
open class OutliningElementsCollector ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Services.OutliningElementsCollector {
  
  /* private */ /* CompleteClass */
  var _depth: Any = js.native
  
  /* private */ /* CompleteClass */
  var _maximumDepth: Any = js.native
  
  /* private */ /* CompleteClass */
  var _position: Any = js.native
  
  /* private */ /* CompleteClass */
  override def addOutlineRange(node: Any, startElement: Any, endElement: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var elements: Any = js.native
  
  /* private */ /* CompleteClass */
  var inObjectLiteralExpression: Any = js.native
  
  /* CompleteClass */
  override def position(): Double = js.native
  
  /* CompleteClass */
  override def skip(element: ISyntaxElement): Unit = js.native
  
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
object OutliningElementsCollector {
  
  @JSGlobal("TypeScript.Services.OutliningElementsCollector")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Services.OutliningElementsCollector.MaximumDepth")
  @js.native
  def MaximumDepth: Any = js.native
  inline def MaximumDepth_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaximumDepth")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def collectElements(node: SourceUnitSyntax): js.Array[TextSpan] = ^.asInstanceOf[js.Dynamic].applyDynamic("collectElements")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[TextSpan]]
}
