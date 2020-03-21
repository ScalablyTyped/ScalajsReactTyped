package typingsJapgolly.tsutils

import typingsJapgolly.std.Map
import typingsJapgolly.tsutils.controlFlowMod.ControlFlowEnd
import typingsJapgolly.tsutils.convertAstMod.ConvertedAst
import typingsJapgolly.tsutils.convertAstMod.NodeWrap
import typingsJapgolly.tsutils.tsutilsStrings.CarriagereturnLinefeed
import typingsJapgolly.tsutils.tsutilsStrings.Linefeed
import typingsJapgolly.tsutils.tsutilsStrings.stripInternal
import typingsJapgolly.tsutils.usageMod.DeclarationDomain
import typingsJapgolly.tsutils.usageMod.UsageDomain
import typingsJapgolly.tsutils.usageMod.VariableInfo
import typingsJapgolly.tsutils.utilUtilMod.AccessKind
import typingsJapgolly.tsutils.utilUtilMod.BooleanCompilerOptions
import typingsJapgolly.tsutils.utilUtilMod.ForEachCommentCallback
import typingsJapgolly.tsutils.utilUtilMod.ForEachTokenCallback
import typingsJapgolly.tsutils.utilUtilMod.ImportKind
import typingsJapgolly.tsutils.utilUtilMod.ImportLike
import typingsJapgolly.tsutils.utilUtilMod.LateBoundPropertyNames
import typingsJapgolly.tsutils.utilUtilMod.LineRange
import typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary
import typingsJapgolly.tsutils.utilUtilMod.SideEffectOptions
import typingsJapgolly.tsutils.utilUtilMod.StrictCompilerOption
import typingsJapgolly.tsutils.utilUtilMod.VariableDeclarationKind
import typingsJapgolly.tsutils.utilUtilMod.WellKnownSymbolLiteral
import typingsJapgolly.typescript.mod.ArrowFunction
import typingsJapgolly.typescript.mod.AssertionExpression
import typingsJapgolly.typescript.mod.BindingElement
import typingsJapgolly.typescript.mod.BindingPattern
import typingsJapgolly.typescript.mod.BlockLike
import typingsJapgolly.typescript.mod.CallExpression
import typingsJapgolly.typescript.mod.CheckJsDirective
import typingsJapgolly.typescript.mod.ClassElement
import typingsJapgolly.typescript.mod.ClassLikeDeclaration
import typingsJapgolly.typescript.mod.CommentRange
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.FunctionExpression
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.JSDoc
import typingsJapgolly.typescript.mod.Modifier
import typingsJapgolly.typescript.mod.ModifierFlags
import typingsJapgolly.typescript.mod.ModifiersArray
import typingsJapgolly.typescript.mod.ModuleDeclaration
import typingsJapgolly.typescript.mod.NoSubstitutionTemplateLiteral
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.NodeFlags
import typingsJapgolly.typescript.mod.ObjectFlags
import typingsJapgolly.typescript.mod.ObjectType
import typingsJapgolly.typescript.mod.ParameterDeclaration
import typingsJapgolly.typescript.mod.PropertyName
import typingsJapgolly.typescript.mod.ScriptTarget
import typingsJapgolly.typescript.mod.Signature
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.Statement
import typingsJapgolly.typescript.mod.StringLiteral
import typingsJapgolly.typescript.mod.Symbol
import typingsJapgolly.typescript.mod.SymbolFlags
import typingsJapgolly.typescript.mod.SyntaxKind
import typingsJapgolly.typescript.mod.Token
import typingsJapgolly.typescript.mod.Type
import typingsJapgolly.typescript.mod.TypeChecker
import typingsJapgolly.typescript.mod.TypeFlags
import typingsJapgolly.typescript.mod.VariableDeclaration
import typingsJapgolly.typescript.mod.VariableDeclarationList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def canHaveJsDoc(node: Node): /* is typescript.typescript.HasJSDoc */ Boolean = js.native
  def collectVariableUsage(sourceFile: SourceFile): Map[Identifier, VariableInfo] = js.native
  def commentText(sourceText: String, comment: CommentRange): String = js.native
  def convertAst(sourceFile: SourceFile): ConvertedAst = js.native
  def endsControlFlow(statement: BlockLike): Boolean = js.native
  def endsControlFlow(statement: Statement): Boolean = js.native
  def findImportLikeNodes(sourceFile: SourceFile, kinds: ImportKind): js.Array[ImportLike] = js.native
  def findImports(sourceFile: SourceFile, kinds: ImportKind): js.Array[StringLiteral | NoSubstitutionTemplateLiteral] = js.native
  def forEachComment(node: Node, cb: ForEachCommentCallback): Unit = js.native
  def forEachComment(node: Node, cb: ForEachCommentCallback, sourceFile: SourceFile): Unit = js.native
  def forEachDeclaredVariable[T](
    declarationList: VariableDeclarationList,
    cb: js.Function1[/* element */ (VariableDeclaration | BindingElement) with AnonName, T]
  ): js.UndefOr[T] = js.native
  def forEachDestructuringIdentifier[T](pattern: BindingPattern, fn: js.Function1[/* element */ BindingElementnameIdentif, T]): js.UndefOr[T] = js.native
  def forEachToken(node: Node, cb: js.Function1[/* node */ Node, Unit]): Unit = js.native
  def forEachToken(node: Node, cb: js.Function1[/* node */ Node, Unit], sourceFile: SourceFile): Unit = js.native
  def forEachTokenWithTrivia(node: Node, cb: ForEachTokenCallback): Unit = js.native
  def forEachTokenWithTrivia(node: Node, cb: ForEachTokenCallback, sourceFile: SourceFile): Unit = js.native
  def getAccessKind(node: Node): AccessKind = js.native
  def getCallSignaturesOfType(`type`: Type): js.Array[Signature] = js.native
  def getCheckJsDirective(source: String): js.UndefOr[CheckJsDirective] = js.native
  def getChildOfKind[T /* <: SyntaxKind */](node: Node, kind: T): js.UndefOr[Token[T]] = js.native
  def getChildOfKind[T /* <: SyntaxKind */](node: Node, kind: T, sourceFile: SourceFile): js.UndefOr[Token[T]] = js.native
  def getCommentAtPosition(sourceFile: SourceFile, pos: Double): js.UndefOr[CommentRange] = js.native
  def getCommentAtPosition(sourceFile: SourceFile, pos: Double, parent: Node): js.UndefOr[CommentRange] = js.native
  def getConstructorTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = js.native
  def getControlFlowEnd(statement: BlockLike): ControlFlowEnd = js.native
  def getControlFlowEnd(statement: Statement): ControlFlowEnd = js.native
  def getDeclarationDomain(node: Identifier): js.UndefOr[DeclarationDomain] = js.native
  def getDeclarationOfBindingElement(node: BindingElement): VariableDeclaration | ParameterDeclaration = js.native
  def getIIFE(func: ArrowFunction): js.UndefOr[CallExpression] = js.native
  def getIIFE(func: FunctionExpression): js.UndefOr[CallExpression] = js.native
  def getInstanceTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = js.native
  def getIteratorYieldResultFromIteratorResult(`type`: Type, node: Node, checker: TypeChecker): Type = js.native
  def getJsDoc(node: Node): js.Array[JSDoc] = js.native
  def getJsDoc(node: Node, sourceFile: SourceFile): js.Array[JSDoc] = js.native
  def getLateBoundPropertyNames(node: Expression, checker: TypeChecker): LateBoundPropertyNames = js.native
  def getLateBoundPropertyNamesOfPropertyName(node: PropertyName, checker: TypeChecker): LateBoundPropertyNames = js.native
  def getLineBreakStyle(sourceFile: SourceFile): Linefeed | CarriagereturnLinefeed = js.native
  def getLineRanges(sourceFile: SourceFile): js.Array[LineRange] = js.native
  @JSName("getModifier")
  def getModifier_kind(
    node: Node,
    kind: /* import warning: importer.ImportType#apply Failed type conversion: typescript.typescript.Modifier['kind'] */ js.Any
  ): js.UndefOr[Modifier] = js.native
  def getNextStatement(statement: Statement): js.UndefOr[Statement] = js.native
  def getNextToken(node: Node): js.UndefOr[Node] = js.native
  def getNextToken(node: Node, sourceFile: SourceFile): js.UndefOr[Node] = js.native
  def getPreviousStatement(statement: Statement): js.UndefOr[Statement] = js.native
  def getPreviousToken(node: Node): js.UndefOr[Node] = js.native
  def getPreviousToken(node: Node, sourceFile: SourceFile): js.UndefOr[Node] = js.native
  def getPropertyName(propertyName: PropertyName): js.UndefOr[String] = js.native
  def getPropertyNameFromType(`type`: Type): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.PropertyName] = js.native
  def getPropertyNameOfWellKnownSymbol(node: WellKnownSymbolLiteral): typingsJapgolly.tsutils.utilUtilMod.PropertyName = js.native
  def getPropertyOfType(`type`: Type, name: typingsJapgolly.typescript.mod.String): js.UndefOr[Symbol] = js.native
  def getSingleLateBoundPropertyNameOfPropertyName(node: PropertyName, checker: TypeChecker): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.PropertyName] = js.native
  def getTokenAtPosition(parent: Node, pos: Double): js.UndefOr[Node] = js.native
  def getTokenAtPosition(parent: Node, pos: Double, sourceFile: SourceFile): js.UndefOr[Node] = js.native
  def getTokenAtPosition(parent: Node, pos: Double, sourceFile: SourceFile, allowJsDoc: Boolean): js.UndefOr[Node] = js.native
  def getUsageDomain(node: Identifier): js.UndefOr[UsageDomain] = js.native
  def getVariableDeclarationKind(declarationList: VariableDeclarationList): VariableDeclarationKind = js.native
  def getWrappedNodeAtPosition(wrap: NodeWrap, pos: Double): js.UndefOr[NodeWrap] = js.native
  def hasAccessModifier(node: ClassElement): Boolean = js.native
  def hasAccessModifier(node: ParameterDeclaration): Boolean = js.native
  @JSName("hasModifier")
  def hasModifier_kind(
    kinds: (/* import warning: importer.ImportType#apply Failed type conversion: typescript.typescript.Modifier['kind'] */ js.Any)*
  ): Boolean = js.native
  @JSName("hasModifier")
  def hasModifier_kind(
    modifiers: ModifiersArray,
    kinds: (/* import warning: importer.ImportType#apply Failed type conversion: typescript.typescript.Modifier['kind'] */ js.Any)*
  ): Boolean = js.native
  def hasOwnThisReference(node: Node): Boolean = js.native
  def hasSideEffects(node: Expression): Boolean = js.native
  def hasSideEffects(node: Expression, options: SideEffectOptions): Boolean = js.native
  def intersectionTypeParts(`type`: Type): js.Array[Type] = js.native
  def isAccessorDeclaration(node: Node): /* is typescript.typescript.AccessorDeclaration */ Boolean = js.native
  def isAmbientModule(node: ModuleDeclaration): Boolean = js.native
  def isAmbientModuleBlock(node: Node): /* is typescript.typescript.ModuleBlock */ Boolean = js.native
  def isArrayBindingPattern(node: Node): /* is typescript.typescript.ArrayBindingPattern */ Boolean = js.native
  def isArrayLiteralExpression(node: Node): /* is typescript.typescript.ArrayLiteralExpression */ Boolean = js.native
  def isArrayTypeNode(node: Node): /* is typescript.typescript.ArrayTypeNode */ Boolean = js.native
  def isArrowFunction(node: Node): /* is typescript.typescript.ArrowFunction */ Boolean = js.native
  def isAsExpression(node: Node): /* is typescript.typescript.AsExpression */ Boolean = js.native
  def isAssertionExpression(node: Node): /* is typescript.typescript.AssertionExpression */ Boolean = js.native
  def isAssignmentKind(kind: SyntaxKind): Boolean = js.native
  def isAwaitExpression(node: Node): /* is typescript.typescript.AwaitExpression */ Boolean = js.native
  def isBigIntLiteral(node: Node): /* is typescript.typescript.BigIntLiteral */ Boolean = js.native
  def isBinaryExpression(node: Node): /* is typescript.typescript.BinaryExpression */ Boolean = js.native
  def isBindableObjectDefinePropertyCall(node: CallExpression): Boolean = js.native
  def isBindingElement(node: Node): /* is typescript.typescript.BindingElement */ Boolean = js.native
  def isBindingPattern(node: Node): /* is typescript.typescript.BindingPattern */ Boolean = js.native
  def isBlock(node: Node): /* is typescript.typescript.Block */ Boolean = js.native
  def isBlockLike(node: Node): /* is typescript.typescript.BlockLike */ Boolean = js.native
  def isBlockScopeBoundary(node: Node): ScopeBoundary = js.native
  def isBlockScopedDeclarationStatement(statement: Statement): /* is typescript.typescript.DeclarationStatement */ Boolean = js.native
  def isBlockScopedVariableDeclaration(declaration: VariableDeclaration): Boolean = js.native
  def isBlockScopedVariableDeclarationList(declarationList: VariableDeclarationList): Boolean = js.native
  def isBooleanLiteral(node: Node): /* is typescript.typescript.BooleanLiteral */ Boolean = js.native
  def isBooleanLiteralType(`type`: Type, literal: Boolean): Boolean = js.native
  def isBreakOrContinueStatement(node: Node): /* is typescript.typescript.BreakOrContinueStatement */ Boolean = js.native
  def isBreakStatement(node: Node): /* is typescript.typescript.BreakStatement */ Boolean = js.native
  def isCallExpression(node: Node): /* is typescript.typescript.CallExpression */ Boolean = js.native
  def isCallLikeExpression(node: Node): /* is typescript.typescript.CallLikeExpression */ Boolean = js.native
  def isCallSignatureDeclaration(node: Node): /* is typescript.typescript.CallSignatureDeclaration */ Boolean = js.native
  def isCaseBlock(node: Node): /* is typescript.typescript.CaseBlock */ Boolean = js.native
  def isCaseClause(node: Node): /* is typescript.typescript.CaseClause */ Boolean = js.native
  def isCaseOrDefaultClause(node: Node): /* is typescript.typescript.CaseOrDefaultClause */ Boolean = js.native
  def isCatchClause(node: Node): /* is typescript.typescript.CatchClause */ Boolean = js.native
  def isClassDeclaration(node: Node): /* is typescript.typescript.ClassDeclaration */ Boolean = js.native
  def isClassExpression(node: Node): /* is typescript.typescript.ClassExpression */ Boolean = js.native
  def isClassLikeDeclaration(node: Node): /* is typescript.typescript.ClassLikeDeclaration */ Boolean = js.native
  def isCommaListExpression(node: Node): /* is typescript.typescript.CommaListExpression */ Boolean = js.native
  def isCompilerOptionEnabled(options: CompilerOptions, option: BooleanCompilerOptions): Boolean = js.native
  @JSName("isCompilerOptionEnabled")
  def isCompilerOptionEnabled_stripInternal(options: CompilerOptions, option: stripInternal): Boolean = js.native
  def isComputedPropertyName(node: Node): /* is typescript.typescript.ComputedPropertyName */ Boolean = js.native
  def isConditionalExpression(node: Node): /* is typescript.typescript.ConditionalExpression */ Boolean = js.native
  def isConditionalType(`type`: Type): /* is typescript.typescript.ConditionalType */ Boolean = js.native
  def isConditionalTypeNode(node: Node): /* is typescript.typescript.ConditionalTypeNode */ Boolean = js.native
  def isConstAssertion(node: AssertionExpression): Boolean = js.native
  def isConstructSignatureDeclaration(node: Node): /* is typescript.typescript.ConstructSignatureDeclaration */ Boolean = js.native
  def isConstructorDeclaration(node: Node): /* is typescript.typescript.ConstructorDeclaration */ Boolean = js.native
  def isConstructorTypeNode(node: Node): /* is typescript.typescript.ConstructorTypeNode */ Boolean = js.native
  def isContinueStatement(node: Node): /* is typescript.typescript.ContinueStatement */ Boolean = js.native
  def isDebuggerStatement(node: Node): /* is typescript.typescript.DebuggerStatement */ Boolean = js.native
  def isDecorator(node: Node): /* is typescript.typescript.Decorator */ Boolean = js.native
  def isDefaultClause(node: Node): /* is typescript.typescript.DefaultClause */ Boolean = js.native
  def isDeleteExpression(node: Node): /* is typescript.typescript.DeleteExpression */ Boolean = js.native
  def isDoStatement(node: Node): /* is typescript.typescript.DoStatement */ Boolean = js.native
  def isElementAccessExpression(node: Node): /* is typescript.typescript.ElementAccessExpression */ Boolean = js.native
  def isEmptyObjectType(`type`: Type): /* is typescript.typescript.ObjectType */ Boolean = js.native
  def isEmptyStatement(node: Node): /* is typescript.typescript.EmptyStatement */ Boolean = js.native
  def isEntityName(node: Node): /* is typescript.typescript.EntityName */ Boolean = js.native
  def isEntityNameExpression(node: Node): /* is typescript.typescript.EntityNameExpression */ Boolean = js.native
  def isEnumDeclaration(node: Node): /* is typescript.typescript.EnumDeclaration */ Boolean = js.native
  def isEnumMember(node: Node): /* is typescript.typescript.EnumMember */ Boolean = js.native
  def isEnumType(`type`: Type): /* is typescript.typescript.EnumType */ Boolean = js.native
  def isExportAssignment(node: Node): /* is typescript.typescript.ExportAssignment */ Boolean = js.native
  def isExportDeclaration(node: Node): /* is typescript.typescript.ExportDeclaration */ Boolean = js.native
  def isExportSpecifier(node: Node): /* is typescript.typescript.ExportSpecifier */ Boolean = js.native
  def isExpression(node: Node): /* is typescript.typescript.Expression */ Boolean = js.native
  def isExpressionStatement(node: Node): /* is typescript.typescript.ExpressionStatement */ Boolean = js.native
  def isExpressionValueUsed(node: Expression): Boolean = js.native
  def isExpressionWithTypeArguments(node: Node): /* is typescript.typescript.ExpressionWithTypeArguments */ Boolean = js.native
  def isExternalModuleReference(node: Node): /* is typescript.typescript.ExternalModuleReference */ Boolean = js.native
  def isFalsyType(`type`: Type): Boolean = js.native
  def isForInOrOfStatement(node: Node): /* is typescript.typescript.ForInOrOfStatement */ Boolean = js.native
  def isForInStatement(node: Node): /* is typescript.typescript.ForInStatement */ Boolean = js.native
  def isForOfStatement(node: Node): /* is typescript.typescript.ForOfStatement */ Boolean = js.native
  def isForStatement(node: Node): /* is typescript.typescript.ForStatement */ Boolean = js.native
  def isFunctionDeclaration(node: Node): /* is typescript.typescript.FunctionDeclaration */ Boolean = js.native
  def isFunctionExpression(node: Node): /* is typescript.typescript.FunctionExpression */ Boolean = js.native
  def isFunctionScopeBoundary(node: Node): ScopeBoundary = js.native
  def isFunctionTypeNode(node: Node): /* is typescript.typescript.FunctionTypeNode */ Boolean = js.native
  def isFunctionWithBody(node: Node): Boolean = js.native
  def isGenericType(`type`: Type): /* is typescript.typescript.GenericType */ Boolean = js.native
  def isGetAccessorDeclaration(node: Node): /* is typescript.typescript.GetAccessorDeclaration */ Boolean = js.native
  def isIdentifier(node: Node): /* is typescript.typescript.Identifier */ Boolean = js.native
  def isIfStatement(node: Node): /* is typescript.typescript.IfStatement */ Boolean = js.native
  def isImportClause(node: Node): /* is typescript.typescript.ImportClause */ Boolean = js.native
  def isImportDeclaration(node: Node): /* is typescript.typescript.ImportDeclaration */ Boolean = js.native
  def isImportEqualsDeclaration(node: Node): /* is typescript.typescript.ImportEqualsDeclaration */ Boolean = js.native
  def isImportSpecifier(node: Node): /* is typescript.typescript.ImportSpecifier */ Boolean = js.native
  def isImportTypeNode(node: Node): /* is typescript.typescript.ImportTypeNode */ Boolean = js.native
  def isInConstContext(node: Expression): Boolean = js.native
  def isInSingleStatementContext(statement: Statement): Boolean = js.native
  def isIndexSignatureDeclaration(node: Node): /* is typescript.typescript.IndexSignatureDeclaration */ Boolean = js.native
  def isIndexedAccessType(`type`: Type): /* is typescript.typescript.IndexedAccessType */ Boolean = js.native
  def isIndexedAccessTypeNode(node: Node): /* is typescript.typescript.IndexedAccessTypeNode */ Boolean = js.native
  def isIndexedAccessype(`type`: Type): /* is typescript.typescript.IndexType */ Boolean = js.native
  def isInferTypeNode(node: Node): /* is typescript.typescript.InferTypeNode */ Boolean = js.native
  def isInstantiableType(`type`: Type): /* is typescript.typescript.InstantiableType */ Boolean = js.native
  def isInterfaceDeclaration(node: Node): /* is typescript.typescript.InterfaceDeclaration */ Boolean = js.native
  def isInterfaceType(`type`: Type): /* is typescript.typescript.InterfaceType */ Boolean = js.native
  def isIntersectionType(`type`: Type): /* is typescript.typescript.IntersectionType */ Boolean = js.native
  def isIntersectionTypeNode(node: Node): /* is typescript.typescript.IntersectionTypeNode */ Boolean = js.native
  def isIterationStatement(node: Node): /* is typescript.typescript.IterationStatement */ Boolean = js.native
  def isJsDoc(node: Node): /* is typescript.typescript.JSDoc */ Boolean = js.native
  def isJsDocKind(kind: SyntaxKind): Boolean = js.native
  def isJsxAttribute(node: Node): /* is typescript.typescript.JsxAttribute */ Boolean = js.native
  def isJsxAttributeLike(node: Node): /* is typescript.typescript.JsxAttributeLike */ Boolean = js.native
  def isJsxAttributes(node: Node): /* is typescript.typescript.JsxAttributes */ Boolean = js.native
  def isJsxClosingElement(node: Node): /* is typescript.typescript.JsxClosingElement */ Boolean = js.native
  def isJsxClosingFragment(node: Node): /* is typescript.typescript.JsxClosingFragment */ Boolean = js.native
  def isJsxElement(node: Node): /* is typescript.typescript.JsxElement */ Boolean = js.native
  def isJsxExpression(node: Node): /* is typescript.typescript.JsxExpression */ Boolean = js.native
  def isJsxFragment(node: Node): /* is typescript.typescript.JsxFragment */ Boolean = js.native
  def isJsxOpeningElement(node: Node): /* is typescript.typescript.JsxOpeningElement */ Boolean = js.native
  def isJsxOpeningFragment(node: Node): /* is typescript.typescript.JsxOpeningFragment */ Boolean = js.native
  def isJsxOpeningLikeElement(node: Node): /* is typescript.typescript.JsxOpeningLikeElement */ Boolean = js.native
  def isJsxSelfClosingElement(node: Node): /* is typescript.typescript.JsxSelfClosingElement */ Boolean = js.native
  def isJsxSpreadAttribute(node: Node): /* is typescript.typescript.JsxSpreadAttribute */ Boolean = js.native
  def isJsxText(node: Node): /* is typescript.typescript.JsxText */ Boolean = js.native
  def isKeywordKind(kind: SyntaxKind): Boolean = js.native
  def isLabeledStatement(node: Node): /* is typescript.typescript.LabeledStatement */ Boolean = js.native
  def isLiteralExpression(node: Node): /* is typescript.typescript.LiteralExpression */ Boolean = js.native
  def isLiteralType(`type`: Type): /* is typescript.typescript.LiteralType */ Boolean = js.native
  def isLiteralTypeNode(node: Node): /* is typescript.typescript.LiteralTypeNode */ Boolean = js.native
  def isMappedTypeNode(node: Node): /* is typescript.typescript.MappedTypeNode */ Boolean = js.native
  def isMetaProperty(node: Node): /* is typescript.typescript.MetaProperty */ Boolean = js.native
  def isMethodDeclaration(node: Node): /* is typescript.typescript.MethodDeclaration */ Boolean = js.native
  def isMethodSignature(node: Node): /* is typescript.typescript.MethodSignature */ Boolean = js.native
  def isModifierFlagSet(node: Node, flag: ModifierFlags): Boolean = js.native
  def isModuleBlock(node: Node): /* is typescript.typescript.ModuleBlock */ Boolean = js.native
  def isModuleDeclaration(node: Node): /* is typescript.typescript.ModuleDeclaration */ Boolean = js.native
  def isNamedExports(node: Node): /* is typescript.typescript.NamedExports */ Boolean = js.native
  def isNamedImports(node: Node): /* is typescript.typescript.NamedImports */ Boolean = js.native
  def isNamespaceDeclaration(node: Node): /* is typescript.typescript.NamespaceDeclaration */ Boolean = js.native
  def isNamespaceExportDeclaration(node: Node): /* is typescript.typescript.NamespaceExportDeclaration */ Boolean = js.native
  def isNamespaceImport(node: Node): /* is typescript.typescript.NamespaceImport */ Boolean = js.native
  def isNewExpression(node: Node): /* is typescript.typescript.NewExpression */ Boolean = js.native
  def isNoSubstitutionTemplateLiteral(node: Node): /* is typescript.typescript.NoSubstitutionTemplateLiteral */ Boolean = js.native
  def isNodeFlagSet(node: Node, flag: NodeFlags): Boolean = js.native
  def isNodeKind(kind: SyntaxKind): Boolean = js.native
  def isNonNullExpression(node: Node): /* is typescript.typescript.NonNullExpression */ Boolean = js.native
  def isNullLiteral(node: Node): /* is typescript.typescript.NullLiteral */ Boolean = js.native
  def isNumericLiteral(node: Node): /* is typescript.typescript.NumericLiteral */ Boolean = js.native
  def isNumericOrStringLikeLiteral(node: Node): Boolean = js.native
  def isNumericPropertyName(name: String): Boolean = js.native
  def isNumericPropertyName(name: typingsJapgolly.typescript.mod.String): Boolean = js.native
  def isObjectBindingPattern(node: Node): /* is typescript.typescript.ObjectBindingPattern */ Boolean = js.native
  def isObjectFlagSet(objectType: ObjectType, flag: ObjectFlags): Boolean = js.native
  def isObjectLiteralExpression(node: Node): /* is typescript.typescript.ObjectLiteralExpression */ Boolean = js.native
  def isObjectType(`type`: Type): /* is typescript.typescript.ObjectType */ Boolean = js.native
  def isOmittedExpression(node: Node): /* is typescript.typescript.OmittedExpression */ Boolean = js.native
  def isOptionalTypeNode(node: Node): /* is typescript.typescript.OptionalTypeNode */ Boolean = js.native
  def isParameterDeclaration(node: Node): /* is typescript.typescript.ParameterDeclaration */ Boolean = js.native
  def isParameterProperty(node: ParameterDeclaration): Boolean = js.native
  def isParenthesizedExpression(node: Node): /* is typescript.typescript.ParenthesizedExpression */ Boolean = js.native
  def isParenthesizedTypeNode(node: Node): /* is typescript.typescript.ParenthesizedTypeNode */ Boolean = js.native
  def isPositionInComment(sourceFile: SourceFile, pos: Double): Boolean = js.native
  def isPositionInComment(sourceFile: SourceFile, pos: Double, parent: Node): Boolean = js.native
  def isPostfixUnaryExpression(node: Node): /* is typescript.typescript.PostfixUnaryExpression */ Boolean = js.native
  def isPrefixUnaryExpression(node: Node): /* is typescript.typescript.PrefixUnaryExpression */ Boolean = js.native
  def isPropertyAccessExpression(node: Node): /* is typescript.typescript.PropertyAccessExpression */ Boolean = js.native
  def isPropertyAssignment(node: Node): /* is typescript.typescript.PropertyAssignment */ Boolean = js.native
  def isPropertyDeclaration(node: Node): /* is typescript.typescript.PropertyDeclaration */ Boolean = js.native
  def isPropertyReadonlyInType(`type`: Type, name: typingsJapgolly.typescript.mod.String, checker: TypeChecker): Boolean = js.native
  def isPropertySignature(node: Node): /* is typescript.typescript.PropertySignature */ Boolean = js.native
  def isQualifiedName(node: Node): /* is typescript.typescript.QualifiedName */ Boolean = js.native
  def isReadonlyAssignmentDeclaration(node: CallExpression, checker: TypeChecker): Boolean = js.native
  def isReassignmentTarget(node: Expression): Boolean = js.native
  def isRegularExpressionLiteral(node: Node): /* is typescript.typescript.RegularExpressionLiteral */ Boolean = js.native
  def isRestTypeNode(node: Node): /* is typescript.typescript.RestTypeNode */ Boolean = js.native
  def isReturnStatement(node: Node): /* is typescript.typescript.ReturnStatement */ Boolean = js.native
  def isSameLine(sourceFile: SourceFile, pos1: Double, pos2: Double): Boolean = js.native
  def isScopeBoundary(node: Node): ScopeBoundary = js.native
  def isSetAccessorDeclaration(node: Node): /* is typescript.typescript.SetAccessorDeclaration */ Boolean = js.native
  def isShorthandPropertyAssignment(node: Node): /* is typescript.typescript.ShorthandPropertyAssignment */ Boolean = js.native
  def isSignatureDeclaration(node: Node): /* is typescript.typescript.SignatureDeclaration */ Boolean = js.native
  def isSourceFile(node: Node): /* is typescript.typescript.SourceFile */ Boolean = js.native
  def isSpreadAssignment(node: Node): /* is typescript.typescript.SpreadAssignment */ Boolean = js.native
  def isSpreadElement(node: Node): /* is typescript.typescript.SpreadElement */ Boolean = js.native
  def isStatementInAmbientContext(node: Statement): Boolean = js.native
  def isStrictCompilerOptionEnabled(options: CompilerOptions, option: StrictCompilerOption): Boolean = js.native
  def isStringLiteral(node: Node): /* is typescript.typescript.StringLiteral */ Boolean = js.native
  def isSubstitutionType(`type`: Type): /* is typescript.typescript.SubstitutionType */ Boolean = js.native
  def isSwitchStatement(node: Node): /* is typescript.typescript.SwitchStatement */ Boolean = js.native
  def isSymbolFlagSet(symbol: Symbol, flag: SymbolFlags): Boolean = js.native
  def isSyntaxList(node: Node): /* is typescript.typescript.SyntaxList */ Boolean = js.native
  def isSyntheticExpression(node: Node): /* is typescript.typescript.SyntheticExpression */ Boolean = js.native
  def isTaggedTemplateExpression(node: Node): /* is typescript.typescript.TaggedTemplateExpression */ Boolean = js.native
  def isTemplateExpression(node: Node): /* is typescript.typescript.TemplateExpression */ Boolean = js.native
  def isTemplateLiteral(node: Node): /* is typescript.typescript.TemplateLiteral */ Boolean = js.native
  def isTextualLiteral(node: Node): Boolean = js.native
  def isThenableType(checker: TypeChecker, node: Expression): Boolean = js.native
  def isThenableType(checker: TypeChecker, node: Expression, `type`: Type): Boolean = js.native
  def isThenableType(checker: TypeChecker, node: Node, `type`: Type): Boolean = js.native
  def isThisParameter(parameter: ParameterDeclaration): Boolean = js.native
  def isThrowStatement(node: Node): /* is typescript.typescript.ThrowStatement */ Boolean = js.native
  def isTokenKind(kind: SyntaxKind): Boolean = js.native
  def isTryStatement(node: Node): /* is typescript.typescript.TryStatement */ Boolean = js.native
  def isTupleType(`type`: Type): /* is typescript.typescript.TupleType */ Boolean = js.native
  def isTupleTypeNode(node: Node): /* is typescript.typescript.TupleTypeNode */ Boolean = js.native
  def isTupleTypeReference(`type`: Type): /* is tsutils.TypeReferencetargetTupleT */ Boolean = js.native
  def isTypeAliasDeclaration(node: Node): /* is typescript.typescript.TypeAliasDeclaration */ Boolean = js.native
  def isTypeAssertion(node: Node): /* is typescript.typescript.TypeAssertion */ Boolean = js.native
  def isTypeAssignableToNumber(checker: TypeChecker, `type`: Type): Boolean = js.native
  def isTypeAssignableToString(checker: TypeChecker, `type`: Type): Boolean = js.native
  def isTypeFlagSet(`type`: Type, flag: TypeFlags): Boolean = js.native
  def isTypeLiteralNode(node: Node): /* is typescript.typescript.TypeLiteralNode */ Boolean = js.native
  def isTypeNodeKind(kind: SyntaxKind): Boolean = js.native
  def isTypeOfExpression(node: Node): /* is typescript.typescript.TypeOfExpression */ Boolean = js.native
  def isTypeOperatorNode(node: Node): /* is typescript.typescript.TypeOperatorNode */ Boolean = js.native
  def isTypeParameter(`type`: Type): /* is typescript.typescript.TypeParameter */ Boolean = js.native
  def isTypeParameterDeclaration(node: Node): /* is typescript.typescript.TypeParameterDeclaration */ Boolean = js.native
  def isTypePredicateNode(node: Node): /* is typescript.typescript.TypePredicateNode */ Boolean = js.native
  def isTypeQueryNode(node: Node): /* is typescript.typescript.TypeQueryNode */ Boolean = js.native
  def isTypeReference(`type`: Type): /* is typescript.typescript.TypeReference */ Boolean = js.native
  def isTypeReferenceNode(node: Node): /* is typescript.typescript.TypeReferenceNode */ Boolean = js.native
  def isTypeScopeBoundary(node: Node): ScopeBoundary = js.native
  def isTypeVariable(`type`: Type): Boolean = js.native
  def isUnionOrIntersectionType(`type`: Type): /* is typescript.typescript.UnionOrIntersectionType */ Boolean = js.native
  def isUnionType(`type`: Type): /* is typescript.typescript.UnionType */ Boolean = js.native
  def isUnionTypeNode(node: Node): /* is typescript.typescript.UnionTypeNode */ Boolean = js.native
  def isUniqueESSymbolType(`type`: Type): /* is typescript.typescript.UniqueESSymbolType */ Boolean = js.native
  def isValidIdentifier(text: String): Boolean = js.native
  def isValidIdentifier(text: String, languageVersion: ScriptTarget): Boolean = js.native
  def isValidJsxIdentifier(text: String): Boolean = js.native
  def isValidJsxIdentifier(text: String, languageVersion: ScriptTarget): Boolean = js.native
  def isValidNumericLiteral(text: String): Boolean = js.native
  def isValidNumericLiteral(text: String, languageVersion: ScriptTarget): Boolean = js.native
  def isValidPropertyAccess(text: String): Boolean = js.native
  def isValidPropertyAccess(text: String, languageVersion: ScriptTarget): Boolean = js.native
  def isValidPropertyName(text: String): Boolean = js.native
  def isValidPropertyName(text: String, languageVersion: ScriptTarget): Boolean = js.native
  def isVariableDeclaration(node: Node): /* is typescript.typescript.VariableDeclaration */ Boolean = js.native
  def isVariableDeclarationList(node: Node): /* is typescript.typescript.VariableDeclarationList */ Boolean = js.native
  def isVariableStatement(node: Node): /* is typescript.typescript.VariableStatement */ Boolean = js.native
  def isVoidExpression(node: Node): /* is typescript.typescript.VoidExpression */ Boolean = js.native
  def isWellKnownSymbolLiterally(node: Expression): /* is tsutils.tsutils/util/util.WellKnownSymbolLiteral */ Boolean = js.native
  def isWhileStatement(node: Node): /* is typescript.typescript.WhileStatement */ Boolean = js.native
  def isWithStatement(node: Node): /* is typescript.typescript.WithStatement */ Boolean = js.native
  def parseJsDocOfNode(node: Node): js.Array[JSDoc] = js.native
  def parseJsDocOfNode(node: Node, considerTrailingComments: Boolean): js.Array[JSDoc] = js.native
  def parseJsDocOfNode(node: Node, considerTrailingComments: Boolean, sourceFile: SourceFile): js.Array[JSDoc] = js.native
  def removeOptionalityFromType(checker: TypeChecker, `type`: Type): Type = js.native
  def someTypePart(
    `type`: Type,
    predicate: js.Function1[/* t */ Type, /* is typescript.typescript.UnionOrIntersectionType */ Boolean],
    cb: js.Function1[/* t */ Type, Boolean]
  ): Boolean = js.native
  def symbolHasReadonlyDeclaration(symbol: Symbol, checker: TypeChecker): Boolean = js.native
  def unionTypeParts(`type`: Type): js.Array[Type] = js.native
  def unwrapParentheses(node: Expression): Expression = js.native
  @js.native
  object AccessKind extends js.Object {
    /* 4 */ val Delete: typingsJapgolly.tsutils.utilUtilMod.AccessKind.Delete with Double = js.native
    /* 6 */ val Modification: typingsJapgolly.tsutils.utilUtilMod.AccessKind.Modification with Double = js.native
    /* 0 */ val None: typingsJapgolly.tsutils.utilUtilMod.AccessKind.None with Double = js.native
    /* 1 */ val Read: typingsJapgolly.tsutils.utilUtilMod.AccessKind.Read with Double = js.native
    /* 3 */ val ReadWrite: typingsJapgolly.tsutils.utilUtilMod.AccessKind.ReadWrite with Double = js.native
    /* 2 */ val Write: typingsJapgolly.tsutils.utilUtilMod.AccessKind.Write with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.AccessKind with Double] = js.native
  }
  
  @js.native
  object DeclarationDomain extends js.Object {
    /* 7 */ val Any: typingsJapgolly.tsutils.usageMod.DeclarationDomain.Any with Double = js.native
    /* 8 */ val Import: typingsJapgolly.tsutils.usageMod.DeclarationDomain.Import with Double = js.native
    /* 1 */ val Namespace: typingsJapgolly.tsutils.usageMod.DeclarationDomain.Namespace with Double = js.native
    /* 2 */ val Type: typingsJapgolly.tsutils.usageMod.DeclarationDomain.Type with Double = js.native
    /* 4 */ val Value: typingsJapgolly.tsutils.usageMod.DeclarationDomain.Value with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.usageMod.DeclarationDomain with Double] = js.native
  }
  
  @js.native
  object ImportKind extends js.Object {
    /* 63 */ val All: typingsJapgolly.tsutils.utilUtilMod.ImportKind.All with Double = js.native
    /* 24 */ val AllImportExpressions: typingsJapgolly.tsutils.utilUtilMod.ImportKind.AllImportExpressions with Double = js.native
    /* 59 */ val AllImports: typingsJapgolly.tsutils.utilUtilMod.ImportKind.AllImports with Double = js.native
    /* 18 */ val AllRequireLike: typingsJapgolly.tsutils.utilUtilMod.ImportKind.AllRequireLike with Double = js.native
    /* 3 */ val AllStaticImports: typingsJapgolly.tsutils.utilUtilMod.ImportKind.AllStaticImports with Double = js.native
    /* 8 */ val DynamicImport: typingsJapgolly.tsutils.utilUtilMod.ImportKind.DynamicImport with Double = js.native
    /* 4 */ val ExportFrom: typingsJapgolly.tsutils.utilUtilMod.ImportKind.ExportFrom with Double = js.native
    /* 1 */ val ImportDeclaration: typingsJapgolly.tsutils.utilUtilMod.ImportKind.ImportDeclaration with Double = js.native
    /* 2 */ val ImportEquals: typingsJapgolly.tsutils.utilUtilMod.ImportKind.ImportEquals with Double = js.native
    /* 32 */ val ImportType: typingsJapgolly.tsutils.utilUtilMod.ImportKind.ImportType with Double = js.native
    /* 16 */ val Require: typingsJapgolly.tsutils.utilUtilMod.ImportKind.Require with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.ImportKind with Double] = js.native
  }
  
  @js.native
  object ScopeBoundary extends js.Object {
    /* 2 */ val Block: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary.Block with Double = js.native
    /* 8 */ val ConditionalType: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary.ConditionalType with Double = js.native
    /* 1 */ val Function: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary.Function with Double = js.native
    /* 0 */ val None: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary.None with Double = js.native
    /* 4 */ val Type: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary.Type with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary with Double] = js.native
  }
  
  @js.native
  object ScopeBoundarySelector extends js.Object {
    /* 3 */ val Block: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundarySelector.Block with Double = js.native
    /* 1 */ val Function: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundarySelector.Function with Double = js.native
    /* 8 */ val InferType: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundarySelector.InferType with Double = js.native
    /* 7 */ val Type: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundarySelector.Type with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.ScopeBoundarySelector with Double] = js.native
  }
  
  @js.native
  object SideEffectOptions extends js.Object {
    /* 2 */ val Constructor: typingsJapgolly.tsutils.utilUtilMod.SideEffectOptions.Constructor with Double = js.native
    /* 4 */ val JsxElement: typingsJapgolly.tsutils.utilUtilMod.SideEffectOptions.JsxElement with Double = js.native
    /* 0 */ val None: typingsJapgolly.tsutils.utilUtilMod.SideEffectOptions.None with Double = js.native
    /* 1 */ val TaggedTemplate: typingsJapgolly.tsutils.utilUtilMod.SideEffectOptions.TaggedTemplate with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.SideEffectOptions with Double] = js.native
  }
  
  @js.native
  object UsageDomain extends js.Object {
    /* 7 */ val Any: typingsJapgolly.tsutils.usageMod.UsageDomain.Any with Double = js.native
    /* 1 */ val Namespace: typingsJapgolly.tsutils.usageMod.UsageDomain.Namespace with Double = js.native
    /* 2 */ val Type: typingsJapgolly.tsutils.usageMod.UsageDomain.Type with Double = js.native
    /* 8 */ val TypeQuery: typingsJapgolly.tsutils.usageMod.UsageDomain.TypeQuery with Double = js.native
    /* 4 */ val Value: typingsJapgolly.tsutils.usageMod.UsageDomain.Value with Double = js.native
    /* 5 */ val ValueOrNamespace: typingsJapgolly.tsutils.usageMod.UsageDomain.ValueOrNamespace with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.usageMod.UsageDomain with Double] = js.native
  }
  
  @js.native
  object VariableDeclarationKind extends js.Object {
    /* 2 */ val Const: typingsJapgolly.tsutils.utilUtilMod.VariableDeclarationKind.Const with Double = js.native
    /* 1 */ val Let: typingsJapgolly.tsutils.utilUtilMod.VariableDeclarationKind.Let with Double = js.native
    /* 0 */ val Var: typingsJapgolly.tsutils.utilUtilMod.VariableDeclarationKind.Var with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.VariableDeclarationKind with Double] = js.native
  }
  
}

