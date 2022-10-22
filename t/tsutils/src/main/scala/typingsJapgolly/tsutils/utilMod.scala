package typingsJapgolly.tsutils

import typingsJapgolly.std.Map
import typingsJapgolly.tsutils.anon.BindingElementnameIdentif
import typingsJapgolly.tsutils.anon.VariableDeclarationnameId
import typingsJapgolly.tsutils.tsutilsStrings.CarriagereturnLinefeed
import typingsJapgolly.tsutils.tsutilsStrings.Linefeed
import typingsJapgolly.tsutils.tsutilsStrings.stripInternal
import typingsJapgolly.tsutils.utilControlFlowMod.ControlFlowEnd
import typingsJapgolly.tsutils.utilControlFlowMod.SignatureEffect
import typingsJapgolly.tsutils.utilConvertAstMod.ConvertedAst
import typingsJapgolly.tsutils.utilConvertAstMod.NodeWrap
import typingsJapgolly.tsutils.utilUsageMod.DeclarationDomain
import typingsJapgolly.tsutils.utilUsageMod.UsageDomain
import typingsJapgolly.tsutils.utilUsageMod.VariableInfo
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
import typingsJapgolly.typescript.mod.AccessorDeclaration
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
import typingsJapgolly.typescript.mod.ExpressionWithTypeArguments
import typingsJapgolly.typescript.mod.FunctionExpression
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.JSDoc
import typingsJapgolly.typescript.mod.MethodDeclaration
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
import typingsJapgolly.typescript.mod.PropertyDeclaration
import typingsJapgolly.typescript.mod.PropertyName
import typingsJapgolly.typescript.mod.PseudoBigInt
import typingsJapgolly.typescript.mod.ScriptTarget
import typingsJapgolly.typescript.mod.Signature
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.Statement
import typingsJapgolly.typescript.mod.StringLiteral
import typingsJapgolly.typescript.mod.SwitchStatement
import typingsJapgolly.typescript.mod.Symbol
import typingsJapgolly.typescript.mod.SymbolFlags
import typingsJapgolly.typescript.mod.SyntaxKind
import typingsJapgolly.typescript.mod.SyntaxKind.AbstractKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.AsyncKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.ConstKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.DeclareKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.DefaultKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.ExportKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.InKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.OutKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.OverrideKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.PrivateKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.ProtectedKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.PublicKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.ReadonlyKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.StaticKeyword
import typingsJapgolly.typescript.mod.Token
import typingsJapgolly.typescript.mod.Type
import typingsJapgolly.typescript.mod.TypeChecker
import typingsJapgolly.typescript.mod.TypeFlags
import typingsJapgolly.typescript.mod.VariableDeclaration
import typingsJapgolly.typescript.mod.VariableDeclarationList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("tsutils/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tsutils/util", "AccessKind")
  @js.native
  object AccessKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.AccessKind & Double] = js.native
    
    /* 4 */ val Delete: typingsJapgolly.tsutils.utilUtilMod.AccessKind.Delete & Double = js.native
    
    /* 6 */ val Modification: typingsJapgolly.tsutils.utilUtilMod.AccessKind.Modification & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.tsutils.utilUtilMod.AccessKind.None & Double = js.native
    
    /* 1 */ val Read: typingsJapgolly.tsutils.utilUtilMod.AccessKind.Read & Double = js.native
    
    /* 3 */ val ReadWrite: typingsJapgolly.tsutils.utilUtilMod.AccessKind.ReadWrite & Double = js.native
    
    /* 2 */ val Write: typingsJapgolly.tsutils.utilUtilMod.AccessKind.Write & Double = js.native
  }
  
  @JSImport("tsutils/util", "DeclarationDomain")
  @js.native
  object DeclarationDomain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.utilUsageMod.DeclarationDomain & Double] = js.native
    
    /* 7 */ val Any: typingsJapgolly.tsutils.utilUsageMod.DeclarationDomain.Any & Double = js.native
    
    /* 8 */ val Import: typingsJapgolly.tsutils.utilUsageMod.DeclarationDomain.Import & Double = js.native
    
    /* 1 */ val Namespace: typingsJapgolly.tsutils.utilUsageMod.DeclarationDomain.Namespace & Double = js.native
    
    /* 2 */ val Type: typingsJapgolly.tsutils.utilUsageMod.DeclarationDomain.Type & Double = js.native
    
    /* 4 */ val Value: typingsJapgolly.tsutils.utilUsageMod.DeclarationDomain.Value & Double = js.native
  }
  
  @JSImport("tsutils/util", "ImportKind")
  @js.native
  object ImportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.ImportKind & Double] = js.native
    
    /* 63 */ val All: typingsJapgolly.tsutils.utilUtilMod.ImportKind.All & Double = js.native
    
    /* 24 */ val AllImportExpressions: typingsJapgolly.tsutils.utilUtilMod.ImportKind.AllImportExpressions & Double = js.native
    
    /* 59 */ val AllImports: typingsJapgolly.tsutils.utilUtilMod.ImportKind.AllImports & Double = js.native
    
    /* 18 */ val AllRequireLike: typingsJapgolly.tsutils.utilUtilMod.ImportKind.AllRequireLike & Double = js.native
    
    /* 3 */ val AllStaticImports: typingsJapgolly.tsutils.utilUtilMod.ImportKind.AllStaticImports & Double = js.native
    
    /* 8 */ val DynamicImport: typingsJapgolly.tsutils.utilUtilMod.ImportKind.DynamicImport & Double = js.native
    
    /* 4 */ val ExportFrom: typingsJapgolly.tsutils.utilUtilMod.ImportKind.ExportFrom & Double = js.native
    
    /* 1 */ val ImportDeclaration: typingsJapgolly.tsutils.utilUtilMod.ImportKind.ImportDeclaration & Double = js.native
    
    /* 2 */ val ImportEquals: typingsJapgolly.tsutils.utilUtilMod.ImportKind.ImportEquals & Double = js.native
    
    /* 32 */ val ImportType: typingsJapgolly.tsutils.utilUtilMod.ImportKind.ImportType & Double = js.native
    
    /* 16 */ val Require: typingsJapgolly.tsutils.utilUtilMod.ImportKind.Require & Double = js.native
  }
  
  @JSImport("tsutils/util", "ScopeBoundary")
  @js.native
  object ScopeBoundary extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary & Double] = js.native
    
    /* 2 */ val Block: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary.Block & Double = js.native
    
    /* 8 */ val ConditionalType: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary.ConditionalType & Double = js.native
    
    /* 1 */ val Function: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary.Function & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary.None & Double = js.native
    
    /* 4 */ val Type: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary.Type & Double = js.native
  }
  
  @JSImport("tsutils/util", "ScopeBoundarySelector")
  @js.native
  object ScopeBoundarySelector extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.ScopeBoundarySelector & Double] = js.native
    
    /* 3 */ val Block: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundarySelector.Block & Double = js.native
    
    /* 1 */ val Function: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundarySelector.Function & Double = js.native
    
    /* 8 */ val InferType: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundarySelector.InferType & Double = js.native
    
    /* 7 */ val Type: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundarySelector.Type & Double = js.native
  }
  
  @JSImport("tsutils/util", "SideEffectOptions")
  @js.native
  object SideEffectOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.SideEffectOptions & Double] = js.native
    
    /* 2 */ val Constructor: typingsJapgolly.tsutils.utilUtilMod.SideEffectOptions.Constructor & Double = js.native
    
    /* 4 */ val JsxElement: typingsJapgolly.tsutils.utilUtilMod.SideEffectOptions.JsxElement & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.tsutils.utilUtilMod.SideEffectOptions.None & Double = js.native
    
    /* 1 */ val TaggedTemplate: typingsJapgolly.tsutils.utilUtilMod.SideEffectOptions.TaggedTemplate & Double = js.native
  }
  
  @JSImport("tsutils/util", "SignatureEffect")
  @js.native
  object SignatureEffect extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.utilControlFlowMod.SignatureEffect & Double] = js.native
    
    /* 2 */ val Asserts: typingsJapgolly.tsutils.utilControlFlowMod.SignatureEffect.Asserts & Double = js.native
    
    /* 1 */ val Never: typingsJapgolly.tsutils.utilControlFlowMod.SignatureEffect.Never & Double = js.native
  }
  
  @JSImport("tsutils/util", "UsageDomain")
  @js.native
  object UsageDomain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.utilUsageMod.UsageDomain & Double] = js.native
    
    /* 7 */ val Any: typingsJapgolly.tsutils.utilUsageMod.UsageDomain.Any & Double = js.native
    
    /* 1 */ val Namespace: typingsJapgolly.tsutils.utilUsageMod.UsageDomain.Namespace & Double = js.native
    
    /* 2 */ val Type: typingsJapgolly.tsutils.utilUsageMod.UsageDomain.Type & Double = js.native
    
    /* 8 */ val TypeQuery: typingsJapgolly.tsutils.utilUsageMod.UsageDomain.TypeQuery & Double = js.native
    
    /* 4 */ val Value: typingsJapgolly.tsutils.utilUsageMod.UsageDomain.Value & Double = js.native
    
    /* 5 */ val ValueOrNamespace: typingsJapgolly.tsutils.utilUsageMod.UsageDomain.ValueOrNamespace & Double = js.native
  }
  
  @JSImport("tsutils/util", "VariableDeclarationKind")
  @js.native
  object VariableDeclarationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.VariableDeclarationKind & Double] = js.native
    
    /* 2 */ val Const: typingsJapgolly.tsutils.utilUtilMod.VariableDeclarationKind.Const & Double = js.native
    
    /* 1 */ val Let: typingsJapgolly.tsutils.utilUtilMod.VariableDeclarationKind.Let & Double = js.native
    
    /* 0 */ val Var: typingsJapgolly.tsutils.utilUtilMod.VariableDeclarationKind.Var & Double = js.native
  }
  
  inline def callExpressionAffectsControlFlow(node: CallExpression, checker: TypeChecker): js.UndefOr[SignatureEffect] = (^.asInstanceOf[js.Dynamic].applyDynamic("callExpressionAffectsControlFlow")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SignatureEffect]]
  
  inline def canHaveJsDoc(node: Node): /* is typescript.typescript.HasJSDoc */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canHaveJsDoc")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.HasJSDoc */ Boolean]
  
  inline def collectVariableUsage(sourceFile: SourceFile): Map[Identifier, VariableInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("collectVariableUsage")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[Map[Identifier, VariableInfo]]
  
  inline def commentText(sourceText: String, comment: CommentRange): String = (^.asInstanceOf[js.Dynamic].applyDynamic("commentText")(sourceText.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def convertAst(sourceFile: SourceFile): ConvertedAst = ^.asInstanceOf[js.Dynamic].applyDynamic("convertAst")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[ConvertedAst]
  
  inline def endsControlFlow(statement: BlockLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("endsControlFlow")(statement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def endsControlFlow(statement: BlockLike, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsControlFlow")(statement.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def endsControlFlow(statement: Statement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("endsControlFlow")(statement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def endsControlFlow(statement: Statement, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsControlFlow")(statement.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def findImportLikeNodes(sourceFile: SourceFile, kinds: ImportKind): js.Array[ImportLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("findImportLikeNodes")(sourceFile.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportLike]]
  inline def findImportLikeNodes(sourceFile: SourceFile, kinds: ImportKind, ignoreFileName: Boolean): js.Array[ImportLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("findImportLikeNodes")(sourceFile.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any], ignoreFileName.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportLike]]
  
  inline def findImports(sourceFile: SourceFile, kinds: ImportKind): js.Array[StringLiteral | NoSubstitutionTemplateLiteral] = (^.asInstanceOf[js.Dynamic].applyDynamic("findImports")(sourceFile.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any])).asInstanceOf[js.Array[StringLiteral | NoSubstitutionTemplateLiteral]]
  inline def findImports(sourceFile: SourceFile, kinds: ImportKind, ignoreFileName: Boolean): js.Array[StringLiteral | NoSubstitutionTemplateLiteral] = (^.asInstanceOf[js.Dynamic].applyDynamic("findImports")(sourceFile.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any], ignoreFileName.asInstanceOf[js.Any])).asInstanceOf[js.Array[StringLiteral | NoSubstitutionTemplateLiteral]]
  
  inline def forEachComment(node: Node, cb: ForEachCommentCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachComment")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEachComment(node: Node, cb: ForEachCommentCallback, sourceFile: SourceFile): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachComment")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEachDeclaredVariable[T](
    declarationList: VariableDeclarationList,
    cb: js.Function1[/* element */ VariableDeclarationnameId | BindingElementnameIdentif, T]
  ): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachDeclaredVariable")(declarationList.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def forEachDestructuringIdentifier[T](pattern: BindingPattern, fn: js.Function1[/* element */ BindingElementnameIdentif, T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachDestructuringIdentifier")(pattern.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def forEachToken(node: Node, cb: js.Function1[/* node */ Node, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEachToken(node: Node, cb: js.Function1[/* node */ Node, Unit], sourceFile: SourceFile): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEachTokenWithTrivia(node: Node, cb: ForEachTokenCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachTokenWithTrivia")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEachTokenWithTrivia(node: Node, cb: ForEachTokenCallback, sourceFile: SourceFile): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachTokenWithTrivia")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def formatPseudoBigInt(v: PseudoBigInt): /* template literal string: ${string}n */ String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatPseudoBigInt")(v.asInstanceOf[js.Any]).asInstanceOf[/* template literal string: ${string}n */ String]
  
  inline def getAccessKind(node: Node): AccessKind = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessKind")(node.asInstanceOf[js.Any]).asInstanceOf[AccessKind]
  
  inline def getAstNodeAtPosition(node: Node, pos: Double): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAstNodeAtPosition")(node.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def getBaseClassMemberOfClassElement(node: AccessorDeclaration, checker: TypeChecker): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseClassMemberOfClassElement")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  inline def getBaseClassMemberOfClassElement(node: MethodDeclaration, checker: TypeChecker): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseClassMemberOfClassElement")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  inline def getBaseClassMemberOfClassElement(node: PropertyDeclaration, checker: TypeChecker): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseClassMemberOfClassElement")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  
  inline def getBaseOfClassLikeExpression(node: ClassLikeDeclaration): js.UndefOr[ExpressionWithTypeArguments] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseOfClassLikeExpression")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ExpressionWithTypeArguments]]
  
  inline def getCallSignaturesOfType(`type`: Type): js.Array[Signature] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCallSignaturesOfType")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Signature]]
  
  inline def getCheckJsDirective(source: String): js.UndefOr[CheckJsDirective] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCheckJsDirective")(source.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CheckJsDirective]]
  
  inline def getChildOfKind[T /* <: SyntaxKind */](node: Node, kind: T): js.UndefOr[Token[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildOfKind")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Token[T]]]
  inline def getChildOfKind[T /* <: SyntaxKind */](node: Node, kind: T, sourceFile: SourceFile): js.UndefOr[Token[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildOfKind")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Token[T]]]
  
  inline def getCommentAtPosition(sourceFile: SourceFile, pos: Double): js.UndefOr[CommentRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCommentAtPosition")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CommentRange]]
  inline def getCommentAtPosition(sourceFile: SourceFile, pos: Double, parent: Node): js.UndefOr[CommentRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCommentAtPosition")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CommentRange]]
  
  inline def getConstructorTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("getConstructorTypeOfClassLikeDeclaration")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def getControlFlowEnd(statement: BlockLike): ControlFlowEnd = ^.asInstanceOf[js.Dynamic].applyDynamic("getControlFlowEnd")(statement.asInstanceOf[js.Any]).asInstanceOf[ControlFlowEnd]
  inline def getControlFlowEnd(statement: BlockLike, checker: TypeChecker): ControlFlowEnd = (^.asInstanceOf[js.Dynamic].applyDynamic("getControlFlowEnd")(statement.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[ControlFlowEnd]
  inline def getControlFlowEnd(statement: Statement): ControlFlowEnd = ^.asInstanceOf[js.Dynamic].applyDynamic("getControlFlowEnd")(statement.asInstanceOf[js.Any]).asInstanceOf[ControlFlowEnd]
  inline def getControlFlowEnd(statement: Statement, checker: TypeChecker): ControlFlowEnd = (^.asInstanceOf[js.Dynamic].applyDynamic("getControlFlowEnd")(statement.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[ControlFlowEnd]
  
  inline def getDeclarationDomain(node: Identifier): js.UndefOr[DeclarationDomain] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeclarationDomain")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DeclarationDomain]]
  
  inline def getDeclarationOfBindingElement(node: BindingElement): VariableDeclaration | ParameterDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeclarationOfBindingElement")(node.asInstanceOf[js.Any]).asInstanceOf[VariableDeclaration | ParameterDeclaration]
  
  inline def getIIFE(func: ArrowFunction): js.UndefOr[CallExpression] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIIFE")(func.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CallExpression]]
  inline def getIIFE(func: FunctionExpression): js.UndefOr[CallExpression] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIIFE")(func.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CallExpression]]
  
  inline def getInstanceTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOfClassLikeDeclaration")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def getIteratorYieldResultFromIteratorResult(`type`: Type, node: Node, checker: TypeChecker): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("getIteratorYieldResultFromIteratorResult")(`type`.asInstanceOf[js.Any], node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def getJsDoc(node: Node): js.Array[JSDoc] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJsDoc")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[JSDoc]]
  inline def getJsDoc(node: Node, sourceFile: SourceFile): js.Array[JSDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsDoc")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[JSDoc]]
  
  inline def getLateBoundPropertyNames(node: Expression, checker: TypeChecker): LateBoundPropertyNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getLateBoundPropertyNames")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[LateBoundPropertyNames]
  
  inline def getLateBoundPropertyNamesOfPropertyName(node: PropertyName, checker: TypeChecker): LateBoundPropertyNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getLateBoundPropertyNamesOfPropertyName")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[LateBoundPropertyNames]
  
  inline def getLineBreakStyle(sourceFile: SourceFile): Linefeed | CarriagereturnLinefeed = ^.asInstanceOf[js.Dynamic].applyDynamic("getLineBreakStyle")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[Linefeed | CarriagereturnLinefeed]
  
  inline def getLineRanges(sourceFile: SourceFile): js.Array[LineRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLineRanges")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[js.Array[LineRange]]
  
  inline def getModifier(node: Node, kind: AbstractKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: AsyncKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: ConstKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: DeclareKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: DefaultKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: ExportKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: InKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: OutKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: OverrideKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: PrivateKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: ProtectedKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: PublicKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: ReadonlyKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: StaticKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  
  inline def getNextStatement(statement: Statement): js.UndefOr[Statement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextStatement")(statement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Statement]]
  
  inline def getNextToken(node: Node): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextToken")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
  inline def getNextToken(node: Node, sourceFile: SourceFile): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextToken")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def getPreviousStatement(statement: Statement): js.UndefOr[Statement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousStatement")(statement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Statement]]
  
  inline def getPreviousToken(node: Node): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousToken")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
  inline def getPreviousToken(node: Node, sourceFile: SourceFile): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousToken")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def getPropertyName(propertyName: PropertyName): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyName")(propertyName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getPropertyNameFromType(`type`: Type): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.PropertyName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyNameFromType")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.PropertyName]]
  
  inline def getPropertyNameOfWellKnownSymbol(node: WellKnownSymbolLiteral): typingsJapgolly.tsutils.utilUtilMod.PropertyName = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyNameOfWellKnownSymbol")(node.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tsutils.utilUtilMod.PropertyName]
  
  inline def getPropertyOfType(`type`: Type, name: typingsJapgolly.typescript.mod.String): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyOfType")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  
  inline def getSingleLateBoundPropertyNameOfPropertyName(node: PropertyName, checker: TypeChecker): js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.PropertyName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSingleLateBoundPropertyNameOfPropertyName")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.tsutils.utilUtilMod.PropertyName]]
  
  inline def getSymbolOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Symbol = (^.asInstanceOf[js.Dynamic].applyDynamic("getSymbolOfClassLikeDeclaration")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Symbol]
  
  inline def getTokenAtPosition(parent: Node, pos: Double): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  inline def getTokenAtPosition(parent: Node, pos: Double, sourceFile: Unit, allowJsDoc: Boolean): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], allowJsDoc.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  inline def getTokenAtPosition(parent: Node, pos: Double, sourceFile: SourceFile): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  inline def getTokenAtPosition(parent: Node, pos: Double, sourceFile: SourceFile, allowJsDoc: Boolean): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], allowJsDoc.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def getTsCheckDirective(source: String): js.UndefOr[CheckJsDirective] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTsCheckDirective")(source.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CheckJsDirective]]
  
  inline def getUsageDomain(node: Identifier): js.UndefOr[UsageDomain] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUsageDomain")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[UsageDomain]]
  
  inline def getVariableDeclarationKind(declarationList: VariableDeclarationList): VariableDeclarationKind = ^.asInstanceOf[js.Dynamic].applyDynamic("getVariableDeclarationKind")(declarationList.asInstanceOf[js.Any]).asInstanceOf[VariableDeclarationKind]
  
  inline def getWellKnownSymbolPropertyOfType(`type`: Type, wellKnownSymbolName: String, checker: TypeChecker): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWellKnownSymbolPropertyOfType")(`type`.asInstanceOf[js.Any], wellKnownSymbolName.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  
  inline def getWrappedNodeAtPosition(wrap: NodeWrap, pos: Double): js.UndefOr[NodeWrap] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWrappedNodeAtPosition")(wrap.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NodeWrap]]
  
  inline def hasAccessModifier(node: ClassElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAccessModifier")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasAccessModifier(node: ParameterDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAccessModifier")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasExhaustiveCaseClauses(node: SwitchStatement, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasExhaustiveCaseClauses")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasModifier(
    modifiers: Unit,
    kinds: (AbstractKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | InKeyword | PrivateKeyword | ProtectedKeyword | PublicKeyword | OutKeyword | OverrideKeyword | ReadonlyKeyword | StaticKeyword)*
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(scala.List(modifiers.asInstanceOf[js.Any]).`++`(kinds.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  inline def hasModifier(
    modifiers: ModifiersArray,
    kinds: (AbstractKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | InKeyword | PrivateKeyword | ProtectedKeyword | PublicKeyword | OutKeyword | OverrideKeyword | ReadonlyKeyword | StaticKeyword)*
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(scala.List(modifiers.asInstanceOf[js.Any]).`++`(kinds.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  inline def hasOwnThisReference(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnThisReference")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasSideEffects(node: Expression): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSideEffects")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasSideEffects(node: Expression, options: SideEffectOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasSideEffects")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersectionTypeParts(`type`: Type): js.Array[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersectionTypeParts")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Type]]
  
  inline def isAmbientModule(node: ModuleDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAmbientModule")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAmbientModuleBlock(node: Node): /* is typescript.typescript.ModuleBlock */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAmbientModuleBlock")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ModuleBlock */ Boolean]
  
  inline def isAssignmentKind(kind: SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssignmentKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBindableObjectDefinePropertyCall(node: CallExpression): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBindableObjectDefinePropertyCall")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlockScopeBoundary(node: Node): ScopeBoundary = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[ScopeBoundary]
  
  inline def isBlockScopedDeclarationStatement(statement: Statement): /* is typescript.typescript.DeclarationStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedDeclarationStatement")(statement.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.DeclarationStatement */ Boolean]
  
  inline def isBlockScopedVariableDeclaration(declaration: VariableDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariableDeclaration")(declaration.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlockScopedVariableDeclarationList(declarationList: VariableDeclarationList): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariableDeclarationList")(declarationList.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBooleanLiteralType(`type`: Type, literal: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanLiteralType")(`type`.asInstanceOf[js.Any], literal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCompilerOptionEnabled(options: CompilerOptions, option: BooleanCompilerOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCompilerOptionEnabled")(options.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCompilerOptionEnabled_stripInternal(options: CompilerOptions, option: stripInternal): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCompilerOptionEnabled")(options.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isConstAssertion(node: AssertionExpression): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstAssertion")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmptyObjectType(`type`: Type): /* is typescript.typescript.ObjectType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyObjectType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ObjectType */ Boolean]
  
  inline def isExpressionValueUsed(node: Expression): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionValueUsed")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFalsyType(`type`: Type): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalsyType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunctionScopeBoundary(node: Node): ScopeBoundary = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[ScopeBoundary]
  
  inline def isFunctionWithBody(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionWithBody")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInConstContext(node: Expression): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInConstContext")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInSingleStatementContext(statement: Statement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInSingleStatementContext")(statement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isJsDocKind(kind: SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsDocKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isKeywordKind(kind: SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeywordKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isModifierFlagSet(node: Node, flag: ModifierFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModifierFlagSet")(node.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNodeFlagSet(node: Node, flag: NodeFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNodeFlagSet")(node.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNodeKind(kind: SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumericPropertyName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumericPropertyName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isNumericPropertyName(name: typingsJapgolly.typescript.mod.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumericPropertyName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObjectFlagSet(objectType: ObjectType, flag: ObjectFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectFlagSet")(objectType.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isOptionalChainingUndefinedMarkerType(checker: TypeChecker, t: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalChainingUndefinedMarkerType")(checker.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isParameterProperty(node: ParameterDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParameterProperty")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPositionInComment(sourceFile: SourceFile, pos: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPositionInComment")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPositionInComment(sourceFile: SourceFile, pos: Double, parent: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPositionInComment")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPropertyReadonlyInType(`type`: Type, name: typingsJapgolly.typescript.mod.String, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyReadonlyInType")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isReadonlyAssignmentDeclaration(node: CallExpression, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyAssignmentDeclaration")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isReassignmentTarget(node: Expression): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReassignmentTarget")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSameLine(sourceFile: SourceFile, pos1: Double, pos2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameLine")(sourceFile.asInstanceOf[js.Any], pos1.asInstanceOf[js.Any], pos2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isScopeBoundary(node: Node): ScopeBoundary = ^.asInstanceOf[js.Dynamic].applyDynamic("isScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[ScopeBoundary]
  
  inline def isStatementInAmbientContext(node: Statement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatementInAmbientContext")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStrictCompilerOptionEnabled(options: CompilerOptions, option: StrictCompilerOption): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStrictCompilerOptionEnabled")(options.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSymbolFlagSet(symbol: Symbol, flag: SymbolFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolFlagSet")(symbol.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isThenableType(checker: TypeChecker, node: Expression): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThenableType")(checker.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isThenableType(checker: TypeChecker, node: Expression, `type`: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThenableType")(checker.asInstanceOf[js.Any], node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isThenableType(checker: TypeChecker, node: Node, `type`: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThenableType")(checker.asInstanceOf[js.Any], node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isThisParameter(parameter: ParameterDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisParameter")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTokenKind(kind: SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTypeAssignableToNumber(checker: TypeChecker, `type`: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAssignableToNumber")(checker.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTypeAssignableToString(checker: TypeChecker, `type`: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAssignableToString")(checker.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTypeFlagSet(`type`: Type, flag: TypeFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeFlagSet")(`type`.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTypeNodeKind(kind: SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeNodeKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTypeScopeBoundary(node: Node): ScopeBoundary = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[ScopeBoundary]
  
  inline def isValidIdentifier(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidIdentifier")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidIdentifier(text: String, languageVersion: ScriptTarget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidIdentifier")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidJsxIdentifier(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidJsxIdentifier")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidJsxIdentifier(text: String, languageVersion: ScriptTarget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidJsxIdentifier")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidNumericLiteral(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumericLiteral")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidNumericLiteral(text: String, languageVersion: ScriptTarget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumericLiteral")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidPropertyAccess(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyAccess")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidPropertyAccess(text: String, languageVersion: ScriptTarget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyAccess")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidPropertyName(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyName")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidPropertyName(text: String, languageVersion: ScriptTarget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyName")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isWellKnownSymbolLiterally(node: Expression): /* is tsutils.tsutils/util/util.WellKnownSymbolLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWellKnownSymbolLiterally")(node.asInstanceOf[js.Any]).asInstanceOf[/* is tsutils.tsutils/util/util.WellKnownSymbolLiteral */ Boolean]
  
  inline def parseJsDocOfNode(node: Node): js.Array[JSDoc] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[JSDoc]]
  inline def parseJsDocOfNode(node: Node, considerTrailingComments: Boolean): js.Array[JSDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any], considerTrailingComments.asInstanceOf[js.Any])).asInstanceOf[js.Array[JSDoc]]
  inline def parseJsDocOfNode(node: Node, considerTrailingComments: Boolean, sourceFile: SourceFile): js.Array[JSDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any], considerTrailingComments.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[JSDoc]]
  inline def parseJsDocOfNode(node: Node, considerTrailingComments: Unit, sourceFile: SourceFile): js.Array[JSDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any], considerTrailingComments.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[JSDoc]]
  
  inline def removeOptionalChainingUndefinedMarkerType(checker: TypeChecker, `type`: Type): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeOptionalChainingUndefinedMarkerType")(checker.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def removeOptionalityFromType(checker: TypeChecker, `type`: Type): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeOptionalityFromType")(checker.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def someTypePart(
    `type`: Type,
    predicate: js.Function1[/* t */ Type, /* is typescript.typescript.UnionOrIntersectionType */ Boolean],
    cb: js.Function1[/* t */ Type, Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("someTypePart")(`type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def symbolHasReadonlyDeclaration(symbol: Symbol, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("symbolHasReadonlyDeclaration")(symbol.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def unionTypeParts(`type`: Type): js.Array[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("unionTypeParts")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Type]]
  
  inline def unwrapParentheses(node: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapParentheses")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]
}
