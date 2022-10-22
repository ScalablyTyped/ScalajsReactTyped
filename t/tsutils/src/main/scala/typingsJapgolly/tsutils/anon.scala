package typingsJapgolly.tsutils

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tsutils.tsutilsStrings.Symbol
import typingsJapgolly.tsutils.tsutilsStrings.require
import typingsJapgolly.tsutils.tsutilsStrings.symbol_
import typingsJapgolly.tsutils.utilUtilMod._ImportLike
import typingsJapgolly.typescript.mod.ArrayTypeNode
import typingsJapgolly.typescript.mod.AssertClause
import typingsJapgolly.typescript.mod.BaseType
import typingsJapgolly.typescript.mod.BindingName
import typingsJapgolly.typescript.mod.BindingPattern
import typingsJapgolly.typescript.mod.CatchClause
import typingsJapgolly.typescript.mod.DestructuringPattern
import typingsJapgolly.typescript.mod.DotDotDotToken
import typingsJapgolly.typescript.mod.ExclamationToken
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.ExternalModuleReference
import typingsJapgolly.typescript.mod.GenericType
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.LeftHandSideExpression
import typingsJapgolly.typescript.mod.Modifier
import typingsJapgolly.typescript.mod.ModifierLike
import typingsJapgolly.typescript.mod.ModuleBlock
import typingsJapgolly.typescript.mod.ModuleReference
import typingsJapgolly.typescript.mod.NamedExportBindings
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.NodeArray
import typingsJapgolly.typescript.mod.NodeFlags
import typingsJapgolly.typescript.mod.NumericLiteral
import typingsJapgolly.typescript.mod.ObjectFlags
import typingsJapgolly.typescript.mod.PropertyName
import typingsJapgolly.typescript.mod.QuestionDotToken
import typingsJapgolly.typescript.mod.Signature
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.SourceFileLike
import typingsJapgolly.typescript.mod.StringLiteral
import typingsJapgolly.typescript.mod.SyntaxKind
import typingsJapgolly.typescript.mod.SyntaxKind.BindingElement
import typingsJapgolly.typescript.mod.SyntaxKind.CallExpression
import typingsJapgolly.typescript.mod.SyntaxKind.ExportDeclaration
import typingsJapgolly.typescript.mod.SyntaxKind.ExpressionStatement
import typingsJapgolly.typescript.mod.SyntaxKind.ImportEqualsDeclaration
import typingsJapgolly.typescript.mod.SyntaxKind.ImportKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.VariableDeclaration
import typingsJapgolly.typescript.mod.Token
import typingsJapgolly.typescript.mod.TupleType
import typingsJapgolly.typescript.mod.TupleTypeNode
import typingsJapgolly.typescript.mod.Type
import typingsJapgolly.typescript.mod.TypeFlags
import typingsJapgolly.typescript.mod.TypeNode
import typingsJapgolly.typescript.mod.TypeReferenceNode
import typingsJapgolly.typescript.mod.VariableDeclarationList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined typescript.typescript.BindingElement & {  name :typescript.typescript.Identifier} */
  @js.native
  trait BindingElementnameIdentif extends StObject {
    
    var _declarationBrand: Any = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val dotDotDotToken: js.UndefOr[DotDotDotToken] = js.native
    
    val end: Double = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val initializer: js.UndefOr[Expression] = js.native
    
    val kind: BindingElement = js.native
    
    /**
      * @deprecated `modifiers` has been removed from `Node` and moved to the `Node` subtypes that support them.
      * Use `ts.canHaveModifiers()` to test whether a `Node` can have modifiers.
      * Use `ts.getModifiers()` to get the modifiers of a `Node`.
      *
      * For example:
      * ```ts
      * const modifiers = ts.canHaveModifiers(node) ? ts.getModifiers(node) : undefined;
      * ```
      */
    val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
    
    val name: BindingName & Identifier = js.native
    
    val parent: BindingPattern = js.native
    
    val pos: Double = js.native
    
    val propertyName: js.UndefOr[PropertyName] = js.native
  }
  
  trait Body extends StObject
  
  /* Inlined typescript.typescript.CallExpression & {  expression :typescript.typescript.Token<typescript.typescript.SyntaxKind.ImportKeyword> | typescript.typescript.Identifier & {  text :'require'},   arguments :[typescript.typescript.Expression, ...std.Array<typescript.typescript.Expression>]} */
  @js.native
  trait CallExpressionexpressionT
    extends StObject
       with _ImportLike {
    
    var _declarationBrand: Any = js.native
    
    var _expressionBrand: Any = js.native
    
    var _leftHandSideExpressionBrand: Any = js.native
    
    var _unaryExpressionBrand: Any = js.native
    
    var _updateExpressionBrand: Any = js.native
    
    val arguments: NodeArray[Expression] & Array[Expression] = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val end: Double = js.native
    
    val expression: LeftHandSideExpression & (Token[ImportKeyword] | Identifiertextrequire) = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val kind: CallExpression = js.native
    
    /**
      * @deprecated `modifiers` has been removed from `Node` and moved to the `Node` subtypes that support them.
      * Use `ts.canHaveModifiers()` to test whether a `Node` can have modifiers.
      * Use `ts.getModifiers()` to get the modifiers of a `Node`.
      *
      * For example:
      * ```ts
      * const modifiers = ts.canHaveModifiers(node) ? ts.getModifiers(node) : undefined;
      * ```
      */
    val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
    
    val parent: Node = js.native
    
    val pos: Double = js.native
    
    val questionDotToken: js.UndefOr[QuestionDotToken] = js.native
    
    val typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
  }
  
  /* Inlined typescript.typescript.ExportDeclaration & {  moduleSpecifier :{}} */
  @js.native
  trait ExportDeclarationmoduleSp
    extends StObject
       with _ImportLike {
    
    var _declarationBrand: Any = js.native
    
    var _statementBrand: Any = js.native
    
    val assertClause: js.UndefOr[AssertClause] = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val end: Double = js.native
    
    /** Will not be assigned in the case of `export * from "foo";` */
    val exportClause: js.UndefOr[NamedExportBindings] = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val isTypeOnly: Boolean = js.native
    
    val kind: ExportDeclaration = js.native
    
    val modifiers: js.UndefOr[NodeArray[Modifier]] = js.native
    
    /** If this is not a StringLiteral it will be a grammar error. */
    val moduleSpecifier: js.UndefOr[Expression] & js.Object = js.native
    
    val name: js.UndefOr[Identifier | StringLiteral | NumericLiteral] = js.native
    
    val parent: SourceFile | ModuleBlock = js.native
    
    val pos: Double = js.native
  }
  
  /* Inlined typescript.typescript.ExpressionStatement & {  expression :typescript.typescript.CallExpression} */
  @js.native
  trait ExpressionStatementexpres extends StObject {
    
    var _statementBrand: Any = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val end: Double = js.native
    
    val expression: Expression & typingsJapgolly.typescript.mod.CallExpression = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val kind: ExpressionStatement = js.native
    
    /**
      * @deprecated `modifiers` has been removed from `Node` and moved to the `Node` subtypes that support them.
      * Use `ts.canHaveModifiers()` to test whether a `Node` can have modifiers.
      * Use `ts.getModifiers()` to get the modifiers of a `Node`.
      *
      * For example:
      * ```ts
      * const modifiers = ts.canHaveModifiers(node) ? ts.getModifiers(node) : undefined;
      * ```
      */
    val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
    
    val parent: Node = js.native
    
    val pos: Double = js.native
  }
  
  /* Inlined typescript.typescript.Identifier & {  text :'Symbol',   escapedText :'symbol'} */
  @js.native
  trait IdentifiertextSymbolescap extends StObject {
    
    var _declarationBrand: Any = js.native
    
    var _expressionBrand: Any = js.native
    
    var _leftHandSideExpressionBrand: Any = js.native
    
    var _memberExpressionBrand: Any = js.native
    
    var _primaryExpressionBrand: Any = js.native
    
    var _unaryExpressionBrand: Any = js.native
    
    var _updateExpressionBrand: Any = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val end: Double = js.native
    
    /**
      * Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
      * Text of identifier, but if the identifier begins with two underscores, this will begin with three.
      */
    val escapedText: typingsJapgolly.typescript.mod.String & symbol_ = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    var isInJSDocNamespace: js.UndefOr[Boolean] = js.native
    
    val kind: typingsJapgolly.typescript.mod.SyntaxKind.Identifier = js.native
    
    /**
      * @deprecated `modifiers` has been removed from `Node` and moved to the `Node` subtypes that support them.
      * Use `ts.canHaveModifiers()` to test whether a `Node` can have modifiers.
      * Use `ts.getModifiers()` to get the modifiers of a `Node`.
      *
      * For example:
      * ```ts
      * const modifiers = ts.canHaveModifiers(node) ? ts.getModifiers(node) : undefined;
      * ```
      */
    val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
    
    val originalKeywordKind: js.UndefOr[SyntaxKind] = js.native
    
    val parent: Node = js.native
    
    val pos: Double = js.native
    
    val text: String & Symbol = js.native
  }
  
  /* Inlined typescript.typescript.Identifier & {  text :'require'} */
  @js.native
  trait Identifiertextrequire extends StObject {
    
    var _declarationBrand: Any = js.native
    
    var _expressionBrand: Any = js.native
    
    var _leftHandSideExpressionBrand: Any = js.native
    
    var _memberExpressionBrand: Any = js.native
    
    var _primaryExpressionBrand: Any = js.native
    
    var _unaryExpressionBrand: Any = js.native
    
    var _updateExpressionBrand: Any = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val end: Double = js.native
    
    /**
      * Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
      * Text of identifier, but if the identifier begins with two underscores, this will begin with three.
      */
    val escapedText: typingsJapgolly.typescript.mod.String = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    var isInJSDocNamespace: js.UndefOr[Boolean] = js.native
    
    val kind: typingsJapgolly.typescript.mod.SyntaxKind.Identifier = js.native
    
    /**
      * @deprecated `modifiers` has been removed from `Node` and moved to the `Node` subtypes that support them.
      * Use `ts.canHaveModifiers()` to test whether a `Node` can have modifiers.
      * Use `ts.getModifiers()` to get the modifiers of a `Node`.
      *
      * For example:
      * ```ts
      * const modifiers = ts.canHaveModifiers(node) ? ts.getModifiers(node) : undefined;
      * ```
      */
    val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
    
    val originalKeywordKind: js.UndefOr[SyntaxKind] = js.native
    
    val parent: Node = js.native
    
    val pos: Double = js.native
    
    val text: String & require = js.native
  }
  
  /* Inlined typescript.typescript.ImportEqualsDeclaration & {  moduleReference :typescript.typescript.ExternalModuleReference} */
  @js.native
  trait ImportEqualsDeclarationmo
    extends StObject
       with _ImportLike {
    
    var _declarationBrand: Any = js.native
    
    var _statementBrand: Any = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val end: Double = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val isTypeOnly: Boolean = js.native
    
    val kind: ImportEqualsDeclaration = js.native
    
    val modifiers: js.UndefOr[NodeArray[Modifier]] = js.native
    
    val moduleReference: ModuleReference & ExternalModuleReference = js.native
    
    val name: Identifier = js.native
    
    val parent: SourceFile | ModuleBlock = js.native
    
    val pos: Double = js.native
  }
  
  /* Inlined typescript.typescript.TypeReference & {  target :typescript.typescript.TupleType} */
  trait TypeReferencetargetTupleT extends StObject {
    
    var aliasSymbol: js.UndefOr[typingsJapgolly.typescript.mod.Symbol] = js.undefined
    
    var aliasTypeArguments: js.UndefOr[js.Array[Type]] = js.undefined
    
    var flags: TypeFlags
    
    def getApparentProperties(): js.Array[typingsJapgolly.typescript.mod.Symbol]
    
    def getBaseTypes(): js.UndefOr[js.Array[BaseType]]
    
    def getCallSignatures(): js.Array[Signature]
    
    def getConstraint(): js.UndefOr[Type]
    
    def getConstructSignatures(): js.Array[Signature]
    
    def getDefault(): js.UndefOr[Type]
    
    def getFlags(): TypeFlags
    
    def getNonNullableType(): Type
    
    def getNumberIndexType(): js.UndefOr[Type]
    
    def getProperties(): js.Array[typingsJapgolly.typescript.mod.Symbol]
    
    def getProperty(propertyName: String): js.UndefOr[typingsJapgolly.typescript.mod.Symbol]
    
    def getStringIndexType(): js.UndefOr[Type]
    
    def getSymbol(): js.UndefOr[typingsJapgolly.typescript.mod.Symbol]
    
    def isClass(): /* is typescript.typescript.InterfaceType */ Boolean
    
    def isClassOrInterface(): /* is typescript.typescript.InterfaceType */ Boolean
    
    def isIndexType(): /* is typescript.typescript.IndexType */ Boolean
    
    def isIntersection(): /* is typescript.typescript.IntersectionType */ Boolean
    
    def isLiteral(): /* is typescript.typescript.LiteralType */ Boolean
    
    def isNumberLiteral(): /* is typescript.typescript.NumberLiteralType */ Boolean
    
    def isStringLiteral(): /* is typescript.typescript.StringLiteralType */ Boolean
    
    def isTypeParameter(): /* is typescript.typescript.TypeParameter */ Boolean
    
    def isUnion(): /* is typescript.typescript.UnionType */ Boolean
    
    def isUnionOrIntersection(): /* is typescript.typescript.UnionOrIntersectionType */ Boolean
    
    var node: js.UndefOr[TypeReferenceNode | ArrayTypeNode | TupleTypeNode] = js.undefined
    
    var objectFlags: ObjectFlags
    
    var pattern: js.UndefOr[DestructuringPattern] = js.undefined
    
    var symbol: typingsJapgolly.typescript.mod.Symbol
    
    var target: GenericType & TupleType
    
    var typeArguments: js.UndefOr[js.Array[Type]] = js.undefined
  }
  object TypeReferencetargetTupleT {
    
    inline def apply(
      flags: TypeFlags,
      getApparentProperties: CallbackTo[js.Array[typingsJapgolly.typescript.mod.Symbol]],
      getBaseTypes: CallbackTo[js.UndefOr[js.Array[BaseType]]],
      getCallSignatures: CallbackTo[js.Array[Signature]],
      getConstraint: CallbackTo[js.UndefOr[Type]],
      getConstructSignatures: CallbackTo[js.Array[Signature]],
      getDefault: CallbackTo[js.UndefOr[Type]],
      getFlags: CallbackTo[TypeFlags],
      getNonNullableType: CallbackTo[Type],
      getNumberIndexType: CallbackTo[js.UndefOr[Type]],
      getProperties: CallbackTo[js.Array[typingsJapgolly.typescript.mod.Symbol]],
      getProperty: String => js.UndefOr[typingsJapgolly.typescript.mod.Symbol],
      getStringIndexType: CallbackTo[js.UndefOr[Type]],
      getSymbol: CallbackTo[js.UndefOr[typingsJapgolly.typescript.mod.Symbol]],
      isClass: CallbackTo[/* is typescript.typescript.InterfaceType */ Boolean],
      isClassOrInterface: CallbackTo[/* is typescript.typescript.InterfaceType */ Boolean],
      isIndexType: CallbackTo[/* is typescript.typescript.IndexType */ Boolean],
      isIntersection: CallbackTo[/* is typescript.typescript.IntersectionType */ Boolean],
      isLiteral: CallbackTo[/* is typescript.typescript.LiteralType */ Boolean],
      isNumberLiteral: CallbackTo[/* is typescript.typescript.NumberLiteralType */ Boolean],
      isStringLiteral: CallbackTo[/* is typescript.typescript.StringLiteralType */ Boolean],
      isTypeParameter: CallbackTo[/* is typescript.typescript.TypeParameter */ Boolean],
      isUnion: CallbackTo[/* is typescript.typescript.UnionType */ Boolean],
      isUnionOrIntersection: CallbackTo[/* is typescript.typescript.UnionOrIntersectionType */ Boolean],
      objectFlags: ObjectFlags,
      symbol: typingsJapgolly.typescript.mod.Symbol,
      target: GenericType & TupleType
    ): TypeReferencetargetTupleT = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = getApparentProperties.toJsFn, getBaseTypes = getBaseTypes.toJsFn, getCallSignatures = getCallSignatures.toJsFn, getConstraint = getConstraint.toJsFn, getConstructSignatures = getConstructSignatures.toJsFn, getDefault = getDefault.toJsFn, getFlags = getFlags.toJsFn, getNonNullableType = getNonNullableType.toJsFn, getNumberIndexType = getNumberIndexType.toJsFn, getProperties = getProperties.toJsFn, getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = getStringIndexType.toJsFn, getSymbol = getSymbol.toJsFn, isClass = isClass.toJsFn, isClassOrInterface = isClassOrInterface.toJsFn, isIndexType = isIndexType.toJsFn, isIntersection = isIntersection.toJsFn, isLiteral = isLiteral.toJsFn, isNumberLiteral = isNumberLiteral.toJsFn, isStringLiteral = isStringLiteral.toJsFn, isTypeParameter = isTypeParameter.toJsFn, isUnion = isUnion.toJsFn, isUnionOrIntersection = isUnionOrIntersection.toJsFn, objectFlags = objectFlags.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeReferencetargetTupleT]
    }
    
    extension [Self <: TypeReferencetargetTupleT](x: Self) {
      
      inline def setAliasSymbol(value: typingsJapgolly.typescript.mod.Symbol): Self = StObject.set(x, "aliasSymbol", value.asInstanceOf[js.Any])
      
      inline def setAliasSymbolUndefined: Self = StObject.set(x, "aliasSymbol", js.undefined)
      
      inline def setAliasTypeArguments(value: js.Array[Type]): Self = StObject.set(x, "aliasTypeArguments", value.asInstanceOf[js.Any])
      
      inline def setAliasTypeArgumentsUndefined: Self = StObject.set(x, "aliasTypeArguments", js.undefined)
      
      inline def setAliasTypeArgumentsVarargs(value: Type*): Self = StObject.set(x, "aliasTypeArguments", js.Array(value*))
      
      inline def setFlags(value: TypeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setGetApparentProperties(value: CallbackTo[js.Array[typingsJapgolly.typescript.mod.Symbol]]): Self = StObject.set(x, "getApparentProperties", value.toJsFn)
      
      inline def setGetBaseTypes(value: CallbackTo[js.UndefOr[js.Array[BaseType]]]): Self = StObject.set(x, "getBaseTypes", value.toJsFn)
      
      inline def setGetCallSignatures(value: CallbackTo[js.Array[Signature]]): Self = StObject.set(x, "getCallSignatures", value.toJsFn)
      
      inline def setGetConstraint(value: CallbackTo[js.UndefOr[Type]]): Self = StObject.set(x, "getConstraint", value.toJsFn)
      
      inline def setGetConstructSignatures(value: CallbackTo[js.Array[Signature]]): Self = StObject.set(x, "getConstructSignatures", value.toJsFn)
      
      inline def setGetDefault(value: CallbackTo[js.UndefOr[Type]]): Self = StObject.set(x, "getDefault", value.toJsFn)
      
      inline def setGetFlags(value: CallbackTo[TypeFlags]): Self = StObject.set(x, "getFlags", value.toJsFn)
      
      inline def setGetNonNullableType(value: CallbackTo[Type]): Self = StObject.set(x, "getNonNullableType", value.toJsFn)
      
      inline def setGetNumberIndexType(value: CallbackTo[js.UndefOr[Type]]): Self = StObject.set(x, "getNumberIndexType", value.toJsFn)
      
      inline def setGetProperties(value: CallbackTo[js.Array[typingsJapgolly.typescript.mod.Symbol]]): Self = StObject.set(x, "getProperties", value.toJsFn)
      
      inline def setGetProperty(value: String => js.UndefOr[typingsJapgolly.typescript.mod.Symbol]): Self = StObject.set(x, "getProperty", js.Any.fromFunction1(value))
      
      inline def setGetStringIndexType(value: CallbackTo[js.UndefOr[Type]]): Self = StObject.set(x, "getStringIndexType", value.toJsFn)
      
      inline def setGetSymbol(value: CallbackTo[js.UndefOr[typingsJapgolly.typescript.mod.Symbol]]): Self = StObject.set(x, "getSymbol", value.toJsFn)
      
      inline def setIsClass(value: CallbackTo[/* is typescript.typescript.InterfaceType */ Boolean]): Self = StObject.set(x, "isClass", value.toJsFn)
      
      inline def setIsClassOrInterface(value: CallbackTo[/* is typescript.typescript.InterfaceType */ Boolean]): Self = StObject.set(x, "isClassOrInterface", value.toJsFn)
      
      inline def setIsIndexType(value: CallbackTo[/* is typescript.typescript.IndexType */ Boolean]): Self = StObject.set(x, "isIndexType", value.toJsFn)
      
      inline def setIsIntersection(value: CallbackTo[/* is typescript.typescript.IntersectionType */ Boolean]): Self = StObject.set(x, "isIntersection", value.toJsFn)
      
      inline def setIsLiteral(value: CallbackTo[/* is typescript.typescript.LiteralType */ Boolean]): Self = StObject.set(x, "isLiteral", value.toJsFn)
      
      inline def setIsNumberLiteral(value: CallbackTo[/* is typescript.typescript.NumberLiteralType */ Boolean]): Self = StObject.set(x, "isNumberLiteral", value.toJsFn)
      
      inline def setIsStringLiteral(value: CallbackTo[/* is typescript.typescript.StringLiteralType */ Boolean]): Self = StObject.set(x, "isStringLiteral", value.toJsFn)
      
      inline def setIsTypeParameter(value: CallbackTo[/* is typescript.typescript.TypeParameter */ Boolean]): Self = StObject.set(x, "isTypeParameter", value.toJsFn)
      
      inline def setIsUnion(value: CallbackTo[/* is typescript.typescript.UnionType */ Boolean]): Self = StObject.set(x, "isUnion", value.toJsFn)
      
      inline def setIsUnionOrIntersection(value: CallbackTo[/* is typescript.typescript.UnionOrIntersectionType */ Boolean]): Self = StObject.set(x, "isUnionOrIntersection", value.toJsFn)
      
      inline def setNode(value: TypeReferenceNode | ArrayTypeNode | TupleTypeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setObjectFlags(value: ObjectFlags): Self = StObject.set(x, "objectFlags", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: DestructuringPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setSymbol(value: typingsJapgolly.typescript.mod.Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: GenericType & TupleType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTypeArguments(value: js.Array[Type]): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
      
      inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
      
      inline def setTypeArgumentsVarargs(value: Type*): Self = StObject.set(x, "typeArguments", js.Array(value*))
    }
  }
  
  /* Inlined typescript.typescript.VariableDeclaration & {  name :typescript.typescript.Identifier} */
  @js.native
  trait VariableDeclarationnameId extends StObject {
    
    var _declarationBrand: Any = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val end: Double = js.native
    
    val exclamationToken: js.UndefOr[ExclamationToken] = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val initializer: js.UndefOr[Expression] = js.native
    
    val kind: VariableDeclaration = js.native
    
    /**
      * @deprecated `modifiers` has been removed from `Node` and moved to the `Node` subtypes that support them.
      * Use `ts.canHaveModifiers()` to test whether a `Node` can have modifiers.
      * Use `ts.getModifiers()` to get the modifiers of a `Node`.
      *
      * For example:
      * ```ts
      * const modifiers = ts.canHaveModifiers(node) ? ts.getModifiers(node) : undefined;
      * ```
      */
    val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
    
    val name: BindingName & Identifier = js.native
    
    val parent: VariableDeclarationList | CatchClause = js.native
    
    val pos: Double = js.native
    
    val `type`: js.UndefOr[TypeNode] = js.native
  }
}
