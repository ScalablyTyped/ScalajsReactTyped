package typingsJapgolly.typescriptServices.global.TypeScript.Services

import typingsJapgolly.typescriptServices.TypeScript.AST
import typingsJapgolly.typescriptServices.TypeScript.Diagnostic
import typingsJapgolly.typescriptServices.TypeScript.Document
import typingsJapgolly.typescriptServices.TypeScript.EmitOutput
import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings
import typingsJapgolly.typescriptServices.TypeScript.PullCallSymbolInfo
import typingsJapgolly.typescriptServices.TypeScript.PullDecl
import typingsJapgolly.typescriptServices.TypeScript.PullSymbolInfo
import typingsJapgolly.typescriptServices.TypeScript.PullVisibleSymbolsInfo
import typingsJapgolly.typescriptServices.TypeScript.Services.ILanguageServiceHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.LanguageServiceCompiler")
@js.native
open class LanguageServiceCompiler protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Services.LanguageServiceCompiler {
  def this(host: ILanguageServiceHost) = this()
  
  /* CompleteClass */
  override def canEmitDeclarations(fileName: String): Boolean = js.native
  
  /* CompleteClass */
  override def cleanupSemanticCache(): Unit = js.native
  
  /* CompleteClass */
  override def compilationSettings(): ImmutableCompilationSettings = js.native
  
  /* private */ /* CompleteClass */
  var compiler: Any = js.native
  
  /* CompleteClass */
  override def emit(fileName: String, resolvePath: js.Function1[/* path */ String, String]): EmitOutput = js.native
  
  /* CompleteClass */
  override def emitDeclarations(fileName: String, resolvePath: js.Function1[/* path */ String, String]): EmitOutput = js.native
  
  /* CompleteClass */
  override def fileNames(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def getCachedHostFileName(fileName: String): String = js.native
  
  /* CompleteClass */
  override def getCachedTopLevelDeclaration(fileName: String): PullDecl = js.native
  
  /* CompleteClass */
  override def getCallInformationFromAST(ast: AST, document: Document): PullCallSymbolInfo = js.native
  
  /* CompleteClass */
  override def getCompilerOptionsDiagnostics(resolvePath: js.Function1[/* path */ String, String]): js.Array[Diagnostic] = js.native
  
  /* CompleteClass */
  override def getContextualMembersFromAST(ast: AST, document: Document): PullVisibleSymbolsInfo = js.native
  
  /* CompleteClass */
  override def getDeclForAST(ast: AST): PullDecl = js.native
  
  /* CompleteClass */
  override def getDocument(fileName: String): Document = js.native
  
  /* CompleteClass */
  override def getScriptSnapshot(fileName: String): IScriptSnapshot = js.native
  
  /* CompleteClass */
  override def getSemanticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  
  /* CompleteClass */
  override def getSymbolInformationFromAST(ast: AST, document: Document): PullSymbolInfo = js.native
  
  /* CompleteClass */
  override def getSyntacticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  
  /* CompleteClass */
  override def getVisibleDeclsFromAST(ast: AST, document: Document): js.Array[PullDecl] = js.native
  
  /* CompleteClass */
  override def getVisibleMemberSymbolsFromAST(ast: AST, document: Document): PullVisibleSymbolsInfo = js.native
  
  /* private */ /* CompleteClass */
  var host: Any = js.native
  
  /* private */ /* CompleteClass */
  var hostCache: Any = js.native
  
  /* private */ /* CompleteClass */
  var logger: Any = js.native
  
  /* CompleteClass */
  override def pullGetDeclInformation(decl: PullDecl, ast: AST, document: Document): PullSymbolInfo = js.native
  
  /* private */ /* CompleteClass */
  override def synchronizeHostData(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def synchronizeHostDataWorker(): Any = js.native
  
  /* CompleteClass */
  override def topLevelDeclaration(fileName: String): PullDecl = js.native
  
  /* private */ /* CompleteClass */
  override def tryUpdateFile(compiler: Any, fileName: Any): Any = js.native
}
