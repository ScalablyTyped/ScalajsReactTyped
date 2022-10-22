package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Document")
@js.native
open class Document protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Document {
  def this(
    _compiler: typingsJapgolly.typescriptServices.TypeScript.TypeScriptCompiler,
    _semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain,
    fileName: String,
    referencedFiles: js.Array[String],
    _scriptSnapshot: IScriptSnapshot,
    byteOrderMark: typingsJapgolly.typescriptServices.TypeScript.ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    _syntaxTree: typingsJapgolly.typescriptServices.TypeScript.SyntaxTree,
    _topLevelDecl: typingsJapgolly.typescriptServices.TypeScript.PullDecl
  ) = this()
  
  /* private */ /* CompleteClass */
  var _amdDependencies: Any = js.native
  
  /* private */ /* CompleteClass */
  var _astDeclMap: Any = js.native
  
  /* private */ /* CompleteClass */
  var _bloomFilter: Any = js.native
  
  /* private */ /* CompleteClass */
  var _compiler: Any = js.native
  
  /* private */ /* CompleteClass */
  var _declASTMap: Any = js.native
  
  /* private */ /* CompleteClass */
  var _diagnostics: Any = js.native
  
  /* private */ /* CompleteClass */
  var _externalModuleIndicatorSpan: Any = js.native
  
  /* CompleteClass */
  override def _getASTForDecl(decl: typingsJapgolly.typescriptServices.TypeScript.PullDecl): typingsJapgolly.typescriptServices.TypeScript.AST = js.native
  
  /* CompleteClass */
  override def _getDeclForAST(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.PullDecl = js.native
  
  /* private */ /* CompleteClass */
  var _lineMap: Any = js.native
  
  /* private */ /* CompleteClass */
  var _scriptSnapshot: Any = js.native
  
  /* private */ /* CompleteClass */
  var _semanticInfoChain: Any = js.native
  
  /* CompleteClass */
  override def _setASTForDecl(
    decl: typingsJapgolly.typescriptServices.TypeScript.PullDecl,
    ast: typingsJapgolly.typescriptServices.TypeScript.AST
  ): Unit = js.native
  
  /* CompleteClass */
  override def _setDeclForAST(
    ast: typingsJapgolly.typescriptServices.TypeScript.AST,
    decl: typingsJapgolly.typescriptServices.TypeScript.PullDecl
  ): Unit = js.native
  
  /* private */ /* CompleteClass */
  var _sourceUnit: Any = js.native
  
  /* private */ /* CompleteClass */
  var _syntaxTree: Any = js.native
  
  /* private */ /* CompleteClass */
  var _topLevelDecl: Any = js.native
  
  /* CompleteClass */
  override def amdDependencies(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def bloomFilter(): typingsJapgolly.typescriptServices.TypeScript.BloomFilter = js.native
  
  /* CompleteClass */
  var byteOrderMark: typingsJapgolly.typescriptServices.TypeScript.ByteOrderMark = js.native
  
  /* private */ /* CompleteClass */
  override def cacheSyntaxTreeInfo(syntaxTree: Any): Any = js.native
  
  /* CompleteClass */
  override def diagnostics(): js.Array[typingsJapgolly.typescriptServices.TypeScript.Diagnostic] = js.native
  
  /* CompleteClass */
  override def emitToOwnOutputFile(): Boolean = js.native
  
  /* CompleteClass */
  override def externalModuleIndicatorSpan(): typingsJapgolly.typescriptServices.TypeScript.TextSpan = js.native
  
  /* CompleteClass */
  var fileName: String = js.native
  
  /* private */ /* CompleteClass */
  override def getAmdDependency(comment: Any): Any = js.native
  
  /* CompleteClass */
  override def getEnclosingDecl(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.PullDecl = js.native
  
  /* private */ /* CompleteClass */
  override def getImplicitImportSpan(sourceUnitLeadingTrivia: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getImplicitImportSpanWorker(trivia: Any, position: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getTopLevelImportOrExportSpan(node: Any): Any = js.native
  
  /* CompleteClass */
  override def invalidate(): Unit = js.native
  
  /* CompleteClass */
  override def isDeclareFile(): Boolean = js.native
  
  /* CompleteClass */
  override def isExternalModule(): Boolean = js.native
  
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /* CompleteClass */
  override def lineMap(): typingsJapgolly.typescriptServices.TypeScript.LineMap = js.native
  
  /* CompleteClass */
  var referencedFiles: js.Array[String] = js.native
  
  /* CompleteClass */
  override def sourceUnit(): typingsJapgolly.typescriptServices.TypeScript.SourceUnit = js.native
  
  /* CompleteClass */
  override def syntaxTree(): typingsJapgolly.typescriptServices.TypeScript.SyntaxTree = js.native
  
  /* CompleteClass */
  override def topLevelDecl(): typingsJapgolly.typescriptServices.TypeScript.PullDecl = js.native
  
  /* CompleteClass */
  override def update(
    scriptSnapshot: IScriptSnapshot,
    version: Double,
    isOpen: Boolean,
    textChangeRange: typingsJapgolly.typescriptServices.TypeScript.TextChangeRange
  ): typingsJapgolly.typescriptServices.TypeScript.Document = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
object Document {
  
  @JSGlobal("TypeScript.Document")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(
    compiler: typingsJapgolly.typescriptServices.TypeScript.TypeScriptCompiler,
    semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain,
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    byteOrderMark: typingsJapgolly.typescriptServices.TypeScript.ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    referencedFiles: js.Array[String]
  ): typingsJapgolly.typescriptServices.TypeScript.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(compiler.asInstanceOf[js.Any], semanticInfoChain.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], scriptSnapshot.asInstanceOf[js.Any], byteOrderMark.asInstanceOf[js.Any], version.asInstanceOf[js.Any], isOpen.asInstanceOf[js.Any], referencedFiles.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Document]
}
