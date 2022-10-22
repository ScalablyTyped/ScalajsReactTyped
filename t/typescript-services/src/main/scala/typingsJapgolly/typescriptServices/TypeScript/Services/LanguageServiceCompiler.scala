package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageServiceCompiler extends StObject {
  
  def canEmitDeclarations(fileName: String): Boolean
  
  def cleanupSemanticCache(): Unit
  
  def compilationSettings(): ImmutableCompilationSettings
  
  /* private */ var compiler: Any
  
  def emit(fileName: String, resolvePath: js.Function1[/* path */ String, String]): EmitOutput
  
  def emitDeclarations(fileName: String, resolvePath: js.Function1[/* path */ String, String]): EmitOutput
  
  def fileNames(): js.Array[String]
  
  def getCachedHostFileName(fileName: String): String
  
  def getCachedTopLevelDeclaration(fileName: String): PullDecl
  
  def getCallInformationFromAST(ast: AST, document: Document): PullCallSymbolInfo
  
  def getCompilerOptionsDiagnostics(resolvePath: js.Function1[/* path */ String, String]): js.Array[Diagnostic]
  
  def getContextualMembersFromAST(ast: AST, document: Document): PullVisibleSymbolsInfo
  
  def getDeclForAST(ast: AST): PullDecl
  
  def getDocument(fileName: String): Document
  
  def getScriptSnapshot(fileName: String): IScriptSnapshot
  
  def getSemanticDiagnostics(fileName: String): js.Array[Diagnostic]
  
  def getSymbolInformationFromAST(ast: AST, document: Document): PullSymbolInfo
  
  def getSyntacticDiagnostics(fileName: String): js.Array[Diagnostic]
  
  def getVisibleDeclsFromAST(ast: AST, document: Document): js.Array[PullDecl]
  
  def getVisibleMemberSymbolsFromAST(ast: AST, document: Document): PullVisibleSymbolsInfo
  
  /* private */ var host: Any
  
  /* private */ var hostCache: Any
  
  /* private */ var logger: Any
  
  def pullGetDeclInformation(decl: PullDecl, ast: AST, document: Document): PullSymbolInfo
  
  /* private */ def synchronizeHostData(): Any
  
  /* private */ def synchronizeHostDataWorker(): Any
  
  def topLevelDeclaration(fileName: String): PullDecl
  
  /* private */ def tryUpdateFile(compiler: Any, fileName: Any): Any
}
object LanguageServiceCompiler {
  
  inline def apply(
    canEmitDeclarations: String => Boolean,
    cleanupSemanticCache: Callback,
    compilationSettings: CallbackTo[ImmutableCompilationSettings],
    compiler: Any,
    emit: (String, js.Function1[/* path */ String, String]) => EmitOutput,
    emitDeclarations: (String, js.Function1[/* path */ String, String]) => EmitOutput,
    fileNames: CallbackTo[js.Array[String]],
    getCachedHostFileName: String => String,
    getCachedTopLevelDeclaration: String => PullDecl,
    getCallInformationFromAST: (AST, Document) => PullCallSymbolInfo,
    getCompilerOptionsDiagnostics: js.Function1[/* path */ String, String] => js.Array[Diagnostic],
    getContextualMembersFromAST: (AST, Document) => PullVisibleSymbolsInfo,
    getDeclForAST: AST => PullDecl,
    getDocument: String => Document,
    getScriptSnapshot: String => IScriptSnapshot,
    getSemanticDiagnostics: String => js.Array[Diagnostic],
    getSymbolInformationFromAST: (AST, Document) => PullSymbolInfo,
    getSyntacticDiagnostics: String => js.Array[Diagnostic],
    getVisibleDeclsFromAST: (AST, Document) => js.Array[PullDecl],
    getVisibleMemberSymbolsFromAST: (AST, Document) => PullVisibleSymbolsInfo,
    host: Any,
    hostCache: Any,
    logger: Any,
    pullGetDeclInformation: (PullDecl, AST, Document) => PullSymbolInfo,
    synchronizeHostData: CallbackTo[Any],
    synchronizeHostDataWorker: CallbackTo[Any],
    topLevelDeclaration: String => PullDecl,
    tryUpdateFile: (Any, Any) => Any
  ): LanguageServiceCompiler = {
    val __obj = js.Dynamic.literal(canEmitDeclarations = js.Any.fromFunction1(canEmitDeclarations), cleanupSemanticCache = cleanupSemanticCache.toJsFn, compilationSettings = compilationSettings.toJsFn, compiler = compiler.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit), emitDeclarations = js.Any.fromFunction2(emitDeclarations), fileNames = fileNames.toJsFn, getCachedHostFileName = js.Any.fromFunction1(getCachedHostFileName), getCachedTopLevelDeclaration = js.Any.fromFunction1(getCachedTopLevelDeclaration), getCallInformationFromAST = js.Any.fromFunction2(getCallInformationFromAST), getCompilerOptionsDiagnostics = js.Any.fromFunction1(getCompilerOptionsDiagnostics), getContextualMembersFromAST = js.Any.fromFunction2(getContextualMembersFromAST), getDeclForAST = js.Any.fromFunction1(getDeclForAST), getDocument = js.Any.fromFunction1(getDocument), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getSemanticDiagnostics = js.Any.fromFunction1(getSemanticDiagnostics), getSymbolInformationFromAST = js.Any.fromFunction2(getSymbolInformationFromAST), getSyntacticDiagnostics = js.Any.fromFunction1(getSyntacticDiagnostics), getVisibleDeclsFromAST = js.Any.fromFunction2(getVisibleDeclsFromAST), getVisibleMemberSymbolsFromAST = js.Any.fromFunction2(getVisibleMemberSymbolsFromAST), host = host.asInstanceOf[js.Any], hostCache = hostCache.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], pullGetDeclInformation = js.Any.fromFunction3(pullGetDeclInformation), synchronizeHostData = synchronizeHostData.toJsFn, synchronizeHostDataWorker = synchronizeHostDataWorker.toJsFn, topLevelDeclaration = js.Any.fromFunction1(topLevelDeclaration), tryUpdateFile = js.Any.fromFunction2(tryUpdateFile))
    __obj.asInstanceOf[LanguageServiceCompiler]
  }
  
  extension [Self <: LanguageServiceCompiler](x: Self) {
    
    inline def setCanEmitDeclarations(value: String => Boolean): Self = StObject.set(x, "canEmitDeclarations", js.Any.fromFunction1(value))
    
    inline def setCleanupSemanticCache(value: Callback): Self = StObject.set(x, "cleanupSemanticCache", value.toJsFn)
    
    inline def setCompilationSettings(value: CallbackTo[ImmutableCompilationSettings]): Self = StObject.set(x, "compilationSettings", value.toJsFn)
    
    inline def setCompiler(value: Any): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setEmit(value: (String, js.Function1[/* path */ String, String]) => EmitOutput): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    
    inline def setEmitDeclarations(value: (String, js.Function1[/* path */ String, String]) => EmitOutput): Self = StObject.set(x, "emitDeclarations", js.Any.fromFunction2(value))
    
    inline def setFileNames(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "fileNames", value.toJsFn)
    
    inline def setGetCachedHostFileName(value: String => String): Self = StObject.set(x, "getCachedHostFileName", js.Any.fromFunction1(value))
    
    inline def setGetCachedTopLevelDeclaration(value: String => PullDecl): Self = StObject.set(x, "getCachedTopLevelDeclaration", js.Any.fromFunction1(value))
    
    inline def setGetCallInformationFromAST(value: (AST, Document) => PullCallSymbolInfo): Self = StObject.set(x, "getCallInformationFromAST", js.Any.fromFunction2(value))
    
    inline def setGetCompilerOptionsDiagnostics(value: js.Function1[/* path */ String, String] => js.Array[Diagnostic]): Self = StObject.set(x, "getCompilerOptionsDiagnostics", js.Any.fromFunction1(value))
    
    inline def setGetContextualMembersFromAST(value: (AST, Document) => PullVisibleSymbolsInfo): Self = StObject.set(x, "getContextualMembersFromAST", js.Any.fromFunction2(value))
    
    inline def setGetDeclForAST(value: AST => PullDecl): Self = StObject.set(x, "getDeclForAST", js.Any.fromFunction1(value))
    
    inline def setGetDocument(value: String => Document): Self = StObject.set(x, "getDocument", js.Any.fromFunction1(value))
    
    inline def setGetScriptSnapshot(value: String => IScriptSnapshot): Self = StObject.set(x, "getScriptSnapshot", js.Any.fromFunction1(value))
    
    inline def setGetSemanticDiagnostics(value: String => js.Array[Diagnostic]): Self = StObject.set(x, "getSemanticDiagnostics", js.Any.fromFunction1(value))
    
    inline def setGetSymbolInformationFromAST(value: (AST, Document) => PullSymbolInfo): Self = StObject.set(x, "getSymbolInformationFromAST", js.Any.fromFunction2(value))
    
    inline def setGetSyntacticDiagnostics(value: String => js.Array[Diagnostic]): Self = StObject.set(x, "getSyntacticDiagnostics", js.Any.fromFunction1(value))
    
    inline def setGetVisibleDeclsFromAST(value: (AST, Document) => js.Array[PullDecl]): Self = StObject.set(x, "getVisibleDeclsFromAST", js.Any.fromFunction2(value))
    
    inline def setGetVisibleMemberSymbolsFromAST(value: (AST, Document) => PullVisibleSymbolsInfo): Self = StObject.set(x, "getVisibleMemberSymbolsFromAST", js.Any.fromFunction2(value))
    
    inline def setHost(value: Any): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostCache(value: Any): Self = StObject.set(x, "hostCache", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setPullGetDeclInformation(value: (PullDecl, AST, Document) => PullSymbolInfo): Self = StObject.set(x, "pullGetDeclInformation", js.Any.fromFunction3(value))
    
    inline def setSynchronizeHostData(value: CallbackTo[Any]): Self = StObject.set(x, "synchronizeHostData", value.toJsFn)
    
    inline def setSynchronizeHostDataWorker(value: CallbackTo[Any]): Self = StObject.set(x, "synchronizeHostDataWorker", value.toJsFn)
    
    inline def setTopLevelDeclaration(value: String => PullDecl): Self = StObject.set(x, "topLevelDeclaration", js.Any.fromFunction1(value))
    
    inline def setTryUpdateFile(value: (Any, Any) => Any): Self = StObject.set(x, "tryUpdateFile", js.Any.fromFunction2(value))
  }
}
