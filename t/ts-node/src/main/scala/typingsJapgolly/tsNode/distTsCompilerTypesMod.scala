package typingsJapgolly.tsNode

import typingsJapgolly.tsNode.anon.FnCall
import typingsJapgolly.tsNode.anon.FnCallCurrentDirectoryGetCanonicalFileNameOptions
import typingsJapgolly.tsNode.anon.FnCallDiagNewLineIndent
import typingsJapgolly.tsNode.anon.FnCallFileNameSourceTextLanguageVersionOrOptionsSetParentNodesScriptKind
import typingsJapgolly.tsNode.anon.FnCallHasRootNamesOptionsConfigFileParsingDiagnosticsProjectReferencesHostCreateProgram
import typingsJapgolly.tsNode.anon.FnCallHostDocumentRegistrySyntaxOnlyOrLanguageServiceMode
import typingsJapgolly.tsNode.anon.FnCallModuleNameContainingFileCacheMode
import typingsJapgolly.tsNode.anon.FnCallModuleNameContainingFileCompilerOptionsHostCacheRedirectedReferenceResolutionMode
import typingsJapgolly.tsNode.anon.FnCallOptionsSystem
import typingsJapgolly.tsNode.anon.FnCallProgramSourceFileCancellationToken
import typingsJapgolly.tsNode.anon.FnCallRootNamesOptionsHostOldProgramConfigFileParsingDiagnosticsProjectReferences
import typingsJapgolly.tsNode.anon.FnCallSearchPathFileExistsConfigName
import typingsJapgolly.tsNode.anon.FnCallTypeReferenceDirectiveNameContainingFileOptionsHostRedirectedReferenceCacheResolutionMode
import typingsJapgolly.tsNode.anon.FnCallUseCaseSensitiveFileNamesCurrentDirectory
import typingsJapgolly.tsNode.anon.TypeofScriptSnapshot
import typingsJapgolly.tsNode.distTsCompilerTypesMod.TSCommon.ModuleKindEnum
import typingsJapgolly.typescript.anon.Config
import typingsJapgolly.typescript.mod.BuilderProgram
import typingsJapgolly.typescript.mod.BuilderProgramHost
import typingsJapgolly.typescript.mod.CancellationToken
import typingsJapgolly.typescript.mod.CompilerHost
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.CreateSourceFileOptions
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.DiagnosticMessageChain
import typingsJapgolly.typescript.mod.DocumentRegistry
import typingsJapgolly.typescript.mod.EmitAndSemanticDiagnosticsBuilderProgram
import typingsJapgolly.typescript.mod.ExtendedConfigCacheEntry
import typingsJapgolly.typescript.mod.FileExtensionInfo
import typingsJapgolly.typescript.mod.FormatDiagnosticsHost
import typingsJapgolly.typescript.mod.IncrementalProgramOptions
import typingsJapgolly.typescript.mod.LanguageService
import typingsJapgolly.typescript.mod.LanguageServiceHost
import typingsJapgolly.typescript.mod.LanguageServiceMode
import typingsJapgolly.typescript.mod.Map
import typingsJapgolly.typescript.mod.ModuleKind.CommonJS
import typingsJapgolly.typescript.mod.ModuleKind.ESNext
import typingsJapgolly.typescript.mod.ModuleResolutionCache
import typingsJapgolly.typescript.mod.ModuleResolutionHost
import typingsJapgolly.typescript.mod.ParseConfigHost
import typingsJapgolly.typescript.mod.ParsedCommandLine
import typingsJapgolly.typescript.mod.Path
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.ProjectReference
import typingsJapgolly.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typingsJapgolly.typescript.mod.ResolvedProjectReference
import typingsJapgolly.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import typingsJapgolly.typescript.mod.ScriptKind
import typingsJapgolly.typescript.mod.ScriptTarget
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.SymbolDisplayPart
import typingsJapgolly.typescript.mod.System
import typingsJapgolly.typescript.mod.TranspileOptions
import typingsJapgolly.typescript.mod.TranspileOutput
import typingsJapgolly.typescript.mod.TypeReferenceDirectiveResolutionCache
import typingsJapgolly.typescript.mod.WatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTsCompilerTypesMod {
  
  trait TSCommon extends StObject {
    
    var Extension: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.Extension */ Any
    
    var JsxEmit: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.JsxEmit */ Any
    
    var ModuleKind: ModuleKindEnum
    
    var ModuleResolutionKind: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleResolutionKind */ Any
    
    var ScriptSnapshot: TypeofScriptSnapshot
    
    var ScriptTarget: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ScriptTarget */ Any
    
    def createDocumentRegistry(): DocumentRegistry
    def createDocumentRegistry(useCaseSensitiveFileNames: Boolean): DocumentRegistry
    def createDocumentRegistry(useCaseSensitiveFileNames: Boolean, currentDirectory: String): DocumentRegistry
    def createDocumentRegistry(useCaseSensitiveFileNames: Unit, currentDirectory: String): DocumentRegistry
    @JSName("createDocumentRegistry")
    var createDocumentRegistry_Original: FnCallUseCaseSensitiveFileNamesCurrentDirectory
    
    def createEmitAndSemanticDiagnosticsBuilderProgram(newProgram: Program, host: BuilderProgramHost): EmitAndSemanticDiagnosticsBuilderProgram
    def createEmitAndSemanticDiagnosticsBuilderProgram(
      newProgram: Program,
      host: BuilderProgramHost,
      oldProgram: Unit,
      configFileParsingDiagnostics: js.Array[Diagnostic]
    ): EmitAndSemanticDiagnosticsBuilderProgram
    def createEmitAndSemanticDiagnosticsBuilderProgram(
      newProgram: Program,
      host: BuilderProgramHost,
      oldProgram: EmitAndSemanticDiagnosticsBuilderProgram
    ): EmitAndSemanticDiagnosticsBuilderProgram
    def createEmitAndSemanticDiagnosticsBuilderProgram(
      newProgram: Program,
      host: BuilderProgramHost,
      oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
      configFileParsingDiagnostics: js.Array[Diagnostic]
    ): EmitAndSemanticDiagnosticsBuilderProgram
    def createEmitAndSemanticDiagnosticsBuilderProgram(
      rootNames: js.UndefOr[js.Array[String]],
      options: js.UndefOr[CompilerOptions],
      host: js.UndefOr[CompilerHost],
      oldProgram: js.UndefOr[EmitAndSemanticDiagnosticsBuilderProgram],
      configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]],
      projectReferences: js.UndefOr[js.Array[ProjectReference]]
    ): EmitAndSemanticDiagnosticsBuilderProgram
    @JSName("createEmitAndSemanticDiagnosticsBuilderProgram")
    var createEmitAndSemanticDiagnosticsBuilderProgram_Original: FnCallRootNamesOptionsHostOldProgramConfigFileParsingDiagnosticsProjectReferences
    
    def createIncrementalCompilerHost(options: CompilerOptions): CompilerHost
    def createIncrementalCompilerHost(options: CompilerOptions, system: System): CompilerHost
    @JSName("createIncrementalCompilerHost")
    var createIncrementalCompilerHost_Original: FnCallOptionsSystem
    
    def createIncrementalProgram[T /* <: BuilderProgram */](
      hasRootNamesOptionsConfigFileParsingDiagnosticsProjectReferencesHostCreateProgram: IncrementalProgramOptions[T]
    ): T
    @JSName("createIncrementalProgram")
    var createIncrementalProgram_Original: FnCallHasRootNamesOptionsConfigFileParsingDiagnosticsProjectReferencesHostCreateProgram
    
    def createLanguageService(host: LanguageServiceHost): LanguageService
    def createLanguageService(host: LanguageServiceHost, documentRegistry: Unit, syntaxOnlyOrLanguageServiceMode: Boolean): LanguageService
    def createLanguageService(
      host: LanguageServiceHost,
      documentRegistry: Unit,
      syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
    ): LanguageService
    def createLanguageService(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService
    def createLanguageService(
      host: LanguageServiceHost,
      documentRegistry: DocumentRegistry,
      syntaxOnlyOrLanguageServiceMode: Boolean
    ): LanguageService
    def createLanguageService(
      host: LanguageServiceHost,
      documentRegistry: DocumentRegistry,
      syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
    ): LanguageService
    @JSName("createLanguageService")
    var createLanguageService_Original: FnCallHostDocumentRegistrySyntaxOnlyOrLanguageServiceMode
    
    def createModuleResolutionCache(currentDirectory: String, getCanonicalFileName: js.Function1[/* s */ String, String]): ModuleResolutionCache
    def createModuleResolutionCache(
      currentDirectory: String,
      getCanonicalFileName: js.Function1[/* s */ String, String],
      options: CompilerOptions
    ): ModuleResolutionCache
    @JSName("createModuleResolutionCache")
    var createModuleResolutionCache_Original: FnCallCurrentDirectoryGetCanonicalFileNameOptions
    
    def createSourceFile(fileName: String, sourceText: String, languageVersionOrOptions: CreateSourceFileOptions): SourceFile
    def createSourceFile(
      fileName: String,
      sourceText: String,
      languageVersionOrOptions: CreateSourceFileOptions,
      setParentNodes: Boolean
    ): SourceFile
    def createSourceFile(
      fileName: String,
      sourceText: String,
      languageVersionOrOptions: CreateSourceFileOptions,
      setParentNodes: Boolean,
      scriptKind: ScriptKind
    ): SourceFile
    def createSourceFile(
      fileName: String,
      sourceText: String,
      languageVersionOrOptions: CreateSourceFileOptions,
      setParentNodes: Unit,
      scriptKind: ScriptKind
    ): SourceFile
    def createSourceFile(fileName: String, sourceText: String, languageVersionOrOptions: ScriptTarget): SourceFile
    def createSourceFile(
      fileName: String,
      sourceText: String,
      languageVersionOrOptions: ScriptTarget,
      setParentNodes: Boolean
    ): SourceFile
    def createSourceFile(
      fileName: String,
      sourceText: String,
      languageVersionOrOptions: ScriptTarget,
      setParentNodes: Boolean,
      scriptKind: ScriptKind
    ): SourceFile
    def createSourceFile(
      fileName: String,
      sourceText: String,
      languageVersionOrOptions: ScriptTarget,
      setParentNodes: Unit,
      scriptKind: ScriptKind
    ): SourceFile
    @JSName("createSourceFile")
    var createSourceFile_Original: FnCallFileNameSourceTextLanguageVersionOrOptionsSetParentNodesScriptKind
    
    def displayPartsToString(): String
    def displayPartsToString(displayParts: js.Array[SymbolDisplayPart]): String
    @JSName("displayPartsToString")
    var displayPartsToString_Original: FnCall
    
    def findConfigFile(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean]): js.UndefOr[String]
    def findConfigFile(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean], configName: String): js.UndefOr[String]
    @JSName("findConfigFile")
    var findConfigFile_Original: FnCallSearchPathFileExistsConfigName
    
    def flattenDiagnosticMessageText(diag: String, newLine: String): String
    def flattenDiagnosticMessageText(diag: String, newLine: String, indent: Double): String
    def flattenDiagnosticMessageText(diag: Unit, newLine: String): String
    def flattenDiagnosticMessageText(diag: Unit, newLine: String, indent: Double): String
    def flattenDiagnosticMessageText(diag: DiagnosticMessageChain, newLine: String): String
    def flattenDiagnosticMessageText(diag: DiagnosticMessageChain, newLine: String, indent: Double): String
    @JSName("flattenDiagnosticMessageText")
    var flattenDiagnosticMessageText_Original: FnCallDiagNewLineIndent
    
    def formatDiagnostics(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): String
    
    def formatDiagnosticsWithColorAndContext(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): String
    @JSName("formatDiagnosticsWithColorAndContext")
    var formatDiagnosticsWithColorAndContext_Original: js.Function2[/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost, String]
    
    @JSName("formatDiagnostics")
    var formatDiagnostics_Original: js.Function2[/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost, String]
    
    def getDefaultLibFileName(options: CompilerOptions): String
    @JSName("getDefaultLibFileName")
    var getDefaultLibFileName_Original: js.Function1[/* options */ CompilerOptions, String]
    
    def getDefaultLibFilePath(options: CompilerOptions): String
    @JSName("getDefaultLibFilePath")
    var getDefaultLibFilePath_Original: js.Function1[/* options */ CompilerOptions, String]
    
    def getPreEmitDiagnostics(program: Program): js.Array[Diagnostic]
    def getPreEmitDiagnostics(program: Program, sourceFile: Unit, cancellationToken: CancellationToken): js.Array[Diagnostic]
    def getPreEmitDiagnostics(program: Program, sourceFile: SourceFile): js.Array[Diagnostic]
    def getPreEmitDiagnostics(program: Program, sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic]
    @JSName("getPreEmitDiagnostics")
    var getPreEmitDiagnostics_Original: FnCallProgramSourceFileCancellationToken
    
    def parseJsonConfigFileContent(
      json: Any,
      host: ParseConfigHost,
      basePath: String,
      existingOptions: js.UndefOr[CompilerOptions],
      configFileName: js.UndefOr[String],
      resolutionStack: js.UndefOr[js.Array[Path]],
      extraFileExtensions: js.UndefOr[js.Array[FileExtensionInfo]],
      extendedConfigCache: js.UndefOr[Map[ExtendedConfigCacheEntry]],
      existingWatchOptions: js.UndefOr[WatchOptions]
    ): ParsedCommandLine
    @JSName("parseJsonConfigFileContent")
    var parseJsonConfigFileContent_Original: js.Function9[
        /* json */ Any, 
        /* host */ ParseConfigHost, 
        /* basePath */ String, 
        /* existingOptions */ js.UndefOr[CompilerOptions], 
        /* configFileName */ js.UndefOr[String], 
        /* resolutionStack */ js.UndefOr[js.Array[Path]], 
        /* extraFileExtensions */ js.UndefOr[js.Array[FileExtensionInfo]], 
        /* extendedConfigCache */ js.UndefOr[Map[ExtendedConfigCacheEntry]], 
        /* existingWatchOptions */ js.UndefOr[WatchOptions], 
        ParsedCommandLine
      ]
    
    def readConfigFile(fileName: String, readFile: js.Function1[/* path */ String, js.UndefOr[String]]): Config
    @JSName("readConfigFile")
    var readConfigFile_Original: js.Function2[
        /* fileName */ String, 
        /* readFile */ js.Function1[/* path */ String, js.UndefOr[String]], 
        Config
      ]
    
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost
    ): ResolvedModuleWithFailedLookupLocations
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: Unit,
      redirectedReference: Unit,
      resolutionMode: CommonJS
    ): ResolvedModuleWithFailedLookupLocations
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: Unit,
      redirectedReference: Unit,
      resolutionMode: ESNext
    ): ResolvedModuleWithFailedLookupLocations
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: Unit,
      redirectedReference: ResolvedProjectReference
    ): ResolvedModuleWithFailedLookupLocations
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: Unit,
      redirectedReference: ResolvedProjectReference,
      resolutionMode: CommonJS
    ): ResolvedModuleWithFailedLookupLocations
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: Unit,
      redirectedReference: ResolvedProjectReference,
      resolutionMode: ESNext
    ): ResolvedModuleWithFailedLookupLocations
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: ModuleResolutionCache
    ): ResolvedModuleWithFailedLookupLocations
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: ModuleResolutionCache,
      redirectedReference: Unit,
      resolutionMode: CommonJS
    ): ResolvedModuleWithFailedLookupLocations
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: ModuleResolutionCache,
      redirectedReference: Unit,
      resolutionMode: ESNext
    ): ResolvedModuleWithFailedLookupLocations
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: ModuleResolutionCache,
      redirectedReference: ResolvedProjectReference
    ): ResolvedModuleWithFailedLookupLocations
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: ModuleResolutionCache,
      redirectedReference: ResolvedProjectReference,
      resolutionMode: CommonJS
    ): ResolvedModuleWithFailedLookupLocations
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: ModuleResolutionCache,
      redirectedReference: ResolvedProjectReference,
      resolutionMode: ESNext
    ): ResolvedModuleWithFailedLookupLocations
    
    def resolveModuleNameFromCache(moduleName: String, containingFile: String, cache: ModuleResolutionCache): js.UndefOr[ResolvedModuleWithFailedLookupLocations]
    def resolveModuleNameFromCache(moduleName: String, containingFile: String, cache: ModuleResolutionCache, mode: CommonJS): js.UndefOr[ResolvedModuleWithFailedLookupLocations]
    def resolveModuleNameFromCache(moduleName: String, containingFile: String, cache: ModuleResolutionCache, mode: ESNext): js.UndefOr[ResolvedModuleWithFailedLookupLocations]
    @JSName("resolveModuleNameFromCache")
    var resolveModuleNameFromCache_Original: FnCallModuleNameContainingFileCacheMode
    
    @JSName("resolveModuleName")
    var resolveModuleName_Original: FnCallModuleNameContainingFileCompilerOptionsHostCacheRedirectedReferenceResolutionMode
    
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: Unit,
      cache: Unit,
      resolutionMode: CommonJS
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: Unit,
      cache: Unit,
      resolutionMode: ESNext
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: Unit,
      cache: TypeReferenceDirectiveResolutionCache
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: Unit,
      cache: TypeReferenceDirectiveResolutionCache,
      resolutionMode: CommonJS
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: Unit,
      cache: TypeReferenceDirectiveResolutionCache,
      resolutionMode: ESNext
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference,
      cache: Unit,
      resolutionMode: CommonJS
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference,
      cache: Unit,
      resolutionMode: ESNext
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference,
      cache: TypeReferenceDirectiveResolutionCache
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference,
      cache: TypeReferenceDirectiveResolutionCache,
      resolutionMode: CommonJS
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference,
      cache: TypeReferenceDirectiveResolutionCache,
      resolutionMode: ESNext
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: Unit,
      options: CompilerOptions,
      host: ModuleResolutionHost
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: Unit,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: Unit,
      cache: Unit,
      resolutionMode: CommonJS
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: Unit,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: Unit,
      cache: Unit,
      resolutionMode: ESNext
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: Unit,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: Unit,
      cache: TypeReferenceDirectiveResolutionCache
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: Unit,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: Unit,
      cache: TypeReferenceDirectiveResolutionCache,
      resolutionMode: CommonJS
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: Unit,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: Unit,
      cache: TypeReferenceDirectiveResolutionCache,
      resolutionMode: ESNext
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: Unit,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: Unit,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference,
      cache: Unit,
      resolutionMode: CommonJS
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: Unit,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference,
      cache: Unit,
      resolutionMode: ESNext
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: Unit,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference,
      cache: TypeReferenceDirectiveResolutionCache
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: Unit,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference,
      cache: TypeReferenceDirectiveResolutionCache,
      resolutionMode: CommonJS
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: Unit,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference,
      cache: TypeReferenceDirectiveResolutionCache,
      resolutionMode: ESNext
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    @JSName("resolveTypeReferenceDirective")
    var resolveTypeReferenceDirective_Original: FnCallTypeReferenceDirectiveNameContainingFileOptionsHostRedirectedReferenceCacheResolutionMode
    
    var sys: System
    
    def transpileModule(input: String, transpileOptions: TranspileOptions): TranspileOutput
    @JSName("transpileModule")
    var transpileModule_Original: js.Function2[/* input */ String, /* transpileOptions */ TranspileOptions, TranspileOutput]
    
    var version: String
  }
  object TSCommon {
    
    inline def apply(
      Extension: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.Extension */ Any,
      JsxEmit: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.JsxEmit */ Any,
      ModuleKind: ModuleKindEnum,
      ModuleResolutionKind: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleResolutionKind */ Any,
      ScriptSnapshot: TypeofScriptSnapshot,
      ScriptTarget: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ScriptTarget */ Any,
      createDocumentRegistry: FnCallUseCaseSensitiveFileNamesCurrentDirectory,
      createEmitAndSemanticDiagnosticsBuilderProgram: FnCallRootNamesOptionsHostOldProgramConfigFileParsingDiagnosticsProjectReferences,
      createIncrementalCompilerHost: FnCallOptionsSystem,
      createIncrementalProgram: FnCallHasRootNamesOptionsConfigFileParsingDiagnosticsProjectReferencesHostCreateProgram,
      createLanguageService: FnCallHostDocumentRegistrySyntaxOnlyOrLanguageServiceMode,
      createModuleResolutionCache: FnCallCurrentDirectoryGetCanonicalFileNameOptions,
      createSourceFile: FnCallFileNameSourceTextLanguageVersionOrOptionsSetParentNodesScriptKind,
      displayPartsToString: FnCall,
      findConfigFile: FnCallSearchPathFileExistsConfigName,
      flattenDiagnosticMessageText: FnCallDiagNewLineIndent,
      formatDiagnostics: (/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost) => String,
      formatDiagnosticsWithColorAndContext: (/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost) => String,
      getDefaultLibFileName: /* options */ typingsJapgolly.typescript.mod.CompilerOptions => String,
      getDefaultLibFilePath: /* options */ typingsJapgolly.typescript.mod.CompilerOptions => String,
      getPreEmitDiagnostics: FnCallProgramSourceFileCancellationToken,
      parseJsonConfigFileContent: (/* json */ Any, /* host */ ParseConfigHost, /* basePath */ String, /* existingOptions */ js.UndefOr[typingsJapgolly.typescript.mod.CompilerOptions], /* configFileName */ js.UndefOr[String], /* resolutionStack */ js.UndefOr[js.Array[Path]], /* extraFileExtensions */ js.UndefOr[js.Array[FileExtensionInfo]], /* extendedConfigCache */ js.UndefOr[Map[ExtendedConfigCacheEntry]], /* existingWatchOptions */ js.UndefOr[WatchOptions]) => typingsJapgolly.typescript.mod.ParsedCommandLine,
      readConfigFile: (/* fileName */ String, /* readFile */ js.Function1[/* path */ String, js.UndefOr[String]]) => Config,
      resolveModuleName: FnCallModuleNameContainingFileCompilerOptionsHostCacheRedirectedReferenceResolutionMode,
      resolveModuleNameFromCache: FnCallModuleNameContainingFileCacheMode,
      resolveTypeReferenceDirective: FnCallTypeReferenceDirectiveNameContainingFileOptionsHostRedirectedReferenceCacheResolutionMode,
      sys: System,
      transpileModule: (/* input */ String, /* transpileOptions */ TranspileOptions) => TranspileOutput,
      version: String
    ): TSCommon = {
      val __obj = js.Dynamic.literal(Extension = Extension.asInstanceOf[js.Any], JsxEmit = JsxEmit.asInstanceOf[js.Any], ModuleKind = ModuleKind.asInstanceOf[js.Any], ModuleResolutionKind = ModuleResolutionKind.asInstanceOf[js.Any], ScriptSnapshot = ScriptSnapshot.asInstanceOf[js.Any], ScriptTarget = ScriptTarget.asInstanceOf[js.Any], createDocumentRegistry = createDocumentRegistry.asInstanceOf[js.Any], createEmitAndSemanticDiagnosticsBuilderProgram = createEmitAndSemanticDiagnosticsBuilderProgram.asInstanceOf[js.Any], createIncrementalCompilerHost = createIncrementalCompilerHost.asInstanceOf[js.Any], createIncrementalProgram = createIncrementalProgram.asInstanceOf[js.Any], createLanguageService = createLanguageService.asInstanceOf[js.Any], createModuleResolutionCache = createModuleResolutionCache.asInstanceOf[js.Any], createSourceFile = createSourceFile.asInstanceOf[js.Any], displayPartsToString = displayPartsToString.asInstanceOf[js.Any], findConfigFile = findConfigFile.asInstanceOf[js.Any], flattenDiagnosticMessageText = flattenDiagnosticMessageText.asInstanceOf[js.Any], formatDiagnostics = js.Any.fromFunction2(formatDiagnostics), formatDiagnosticsWithColorAndContext = js.Any.fromFunction2(formatDiagnosticsWithColorAndContext), getDefaultLibFileName = js.Any.fromFunction1(getDefaultLibFileName), getDefaultLibFilePath = js.Any.fromFunction1(getDefaultLibFilePath), getPreEmitDiagnostics = getPreEmitDiagnostics.asInstanceOf[js.Any], parseJsonConfigFileContent = js.Any.fromFunction9(parseJsonConfigFileContent), readConfigFile = js.Any.fromFunction2(readConfigFile), resolveModuleName = resolveModuleName.asInstanceOf[js.Any], resolveModuleNameFromCache = resolveModuleNameFromCache.asInstanceOf[js.Any], resolveTypeReferenceDirective = resolveTypeReferenceDirective.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], transpileModule = js.Any.fromFunction2(transpileModule), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSCommon]
    }
    
    type CompilerOptions = typingsJapgolly.typescript.mod.CompilerOptions
    
    type FileReference = typingsJapgolly.typescript.mod.FileReference
    
    type LanguageServiceHost = typingsJapgolly.typescript.mod.LanguageServiceHost
    
    object ModuleKind {
      
      type CommonJS = typingsJapgolly.typescript.mod.ModuleKind.CommonJS
      
      type ESNext = typingsJapgolly.typescript.mod.ModuleKind.ESNext
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleKind * / any */ trait ModuleKindEnum extends StObject {
      
      var Node16: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleKind * / any extends {  Node16 :any} ? / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleKind * / any['Node16'] : 100 */ js.Any
    }
    object ModuleKindEnum {
      
      inline def apply(
        Node16: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleKind * / any extends {  Node16 :any} ? / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleKind * / any['Node16'] : 100 */ js.Any
      ): ModuleKindEnum = {
        val __obj = js.Dynamic.literal(Node16 = Node16.asInstanceOf[js.Any])
        __obj.asInstanceOf[ModuleKindEnum]
      }
      
      extension [Self <: ModuleKindEnum](x: Self) {
        
        inline def setNode16(
          value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleKind * / any extends {  Node16 :any} ? / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleKind * / any['Node16'] : 100 */ js.Any
        ): Self = StObject.set(x, "Node16", value.asInstanceOf[js.Any])
      }
    }
    
    type ModuleResolutionHost = typingsJapgolly.typescript.mod.ModuleResolutionHost
    
    type ParsedCommandLine = typingsJapgolly.typescript.mod.ParsedCommandLine
    
    type ResolvedModule = typingsJapgolly.typescript.mod.ResolvedModule
    
    type ResolvedModuleWithFailedLookupLocations = typingsJapgolly.typescript.mod.ResolvedModuleWithFailedLookupLocations
    
    type ResolvedProjectReference = typingsJapgolly.typescript.mod.ResolvedProjectReference
    
    type ResolvedTypeReferenceDirective = typingsJapgolly.typescript.mod.ResolvedTypeReferenceDirective
    
    type SourceFile = typingsJapgolly.typescript.mod.SourceFile
    
    extension [Self <: TSCommon](x: Self) {
      
      inline def setCreateDocumentRegistry(value: FnCallUseCaseSensitiveFileNamesCurrentDirectory): Self = StObject.set(x, "createDocumentRegistry", value.asInstanceOf[js.Any])
      
      inline def setCreateEmitAndSemanticDiagnosticsBuilderProgram(value: FnCallRootNamesOptionsHostOldProgramConfigFileParsingDiagnosticsProjectReferences): Self = StObject.set(x, "createEmitAndSemanticDiagnosticsBuilderProgram", value.asInstanceOf[js.Any])
      
      inline def setCreateIncrementalCompilerHost(value: FnCallOptionsSystem): Self = StObject.set(x, "createIncrementalCompilerHost", value.asInstanceOf[js.Any])
      
      inline def setCreateIncrementalProgram(value: FnCallHasRootNamesOptionsConfigFileParsingDiagnosticsProjectReferencesHostCreateProgram): Self = StObject.set(x, "createIncrementalProgram", value.asInstanceOf[js.Any])
      
      inline def setCreateLanguageService(value: FnCallHostDocumentRegistrySyntaxOnlyOrLanguageServiceMode): Self = StObject.set(x, "createLanguageService", value.asInstanceOf[js.Any])
      
      inline def setCreateModuleResolutionCache(value: FnCallCurrentDirectoryGetCanonicalFileNameOptions): Self = StObject.set(x, "createModuleResolutionCache", value.asInstanceOf[js.Any])
      
      inline def setCreateSourceFile(value: FnCallFileNameSourceTextLanguageVersionOrOptionsSetParentNodesScriptKind): Self = StObject.set(x, "createSourceFile", value.asInstanceOf[js.Any])
      
      inline def setDisplayPartsToString(value: FnCall): Self = StObject.set(x, "displayPartsToString", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.Extension */ Any): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
      
      inline def setFindConfigFile(value: FnCallSearchPathFileExistsConfigName): Self = StObject.set(x, "findConfigFile", value.asInstanceOf[js.Any])
      
      inline def setFlattenDiagnosticMessageText(value: FnCallDiagNewLineIndent): Self = StObject.set(x, "flattenDiagnosticMessageText", value.asInstanceOf[js.Any])
      
      inline def setFormatDiagnostics(value: (/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost) => String): Self = StObject.set(x, "formatDiagnostics", js.Any.fromFunction2(value))
      
      inline def setFormatDiagnosticsWithColorAndContext(value: (/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost) => String): Self = StObject.set(x, "formatDiagnosticsWithColorAndContext", js.Any.fromFunction2(value))
      
      inline def setGetDefaultLibFileName(value: /* options */ typingsJapgolly.typescript.mod.CompilerOptions => String): Self = StObject.set(x, "getDefaultLibFileName", js.Any.fromFunction1(value))
      
      inline def setGetDefaultLibFilePath(value: /* options */ typingsJapgolly.typescript.mod.CompilerOptions => String): Self = StObject.set(x, "getDefaultLibFilePath", js.Any.fromFunction1(value))
      
      inline def setGetPreEmitDiagnostics(value: FnCallProgramSourceFileCancellationToken): Self = StObject.set(x, "getPreEmitDiagnostics", value.asInstanceOf[js.Any])
      
      inline def setJsxEmit(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.JsxEmit */ Any): Self = StObject.set(x, "JsxEmit", value.asInstanceOf[js.Any])
      
      inline def setModuleKind(value: ModuleKindEnum): Self = StObject.set(x, "ModuleKind", value.asInstanceOf[js.Any])
      
      inline def setModuleResolutionKind(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleResolutionKind */ Any
      ): Self = StObject.set(x, "ModuleResolutionKind", value.asInstanceOf[js.Any])
      
      inline def setParseJsonConfigFileContent(
        value: (/* json */ Any, /* host */ ParseConfigHost, /* basePath */ String, /* existingOptions */ js.UndefOr[typingsJapgolly.typescript.mod.CompilerOptions], /* configFileName */ js.UndefOr[String], /* resolutionStack */ js.UndefOr[js.Array[Path]], /* extraFileExtensions */ js.UndefOr[js.Array[FileExtensionInfo]], /* extendedConfigCache */ js.UndefOr[Map[ExtendedConfigCacheEntry]], /* existingWatchOptions */ js.UndefOr[WatchOptions]) => typingsJapgolly.typescript.mod.ParsedCommandLine
      ): Self = StObject.set(x, "parseJsonConfigFileContent", js.Any.fromFunction9(value))
      
      inline def setReadConfigFile(
        value: (/* fileName */ String, /* readFile */ js.Function1[/* path */ String, js.UndefOr[String]]) => Config
      ): Self = StObject.set(x, "readConfigFile", js.Any.fromFunction2(value))
      
      inline def setResolveModuleName(value: FnCallModuleNameContainingFileCompilerOptionsHostCacheRedirectedReferenceResolutionMode): Self = StObject.set(x, "resolveModuleName", value.asInstanceOf[js.Any])
      
      inline def setResolveModuleNameFromCache(value: FnCallModuleNameContainingFileCacheMode): Self = StObject.set(x, "resolveModuleNameFromCache", value.asInstanceOf[js.Any])
      
      inline def setResolveTypeReferenceDirective(
        value: FnCallTypeReferenceDirectiveNameContainingFileOptionsHostRedirectedReferenceCacheResolutionMode
      ): Self = StObject.set(x, "resolveTypeReferenceDirective", value.asInstanceOf[js.Any])
      
      inline def setScriptSnapshot(value: TypeofScriptSnapshot): Self = StObject.set(x, "ScriptSnapshot", value.asInstanceOf[js.Any])
      
      inline def setScriptTarget(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ScriptTarget */ Any
      ): Self = StObject.set(x, "ScriptTarget", value.asInstanceOf[js.Any])
      
      inline def setSys(value: System): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
      
      inline def setTranspileModule(value: (/* input */ String, /* transpileOptions */ TranspileOptions) => TranspileOutput): Self = StObject.set(x, "transpileModule", js.Any.fromFunction2(value))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
