package typingsJapgolly.ngtoolsWebpack

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.angularCompiler.mod.Version
import typingsJapgolly.angularCompilerCli.anon.BasePath
import typingsJapgolly.angularCompilerCli.anon.CustomTransformers
import typingsJapgolly.angularCompilerCli.anon.FileName
import typingsJapgolly.angularCompilerCli.anon.Host
import typingsJapgolly.angularCompilerCli.anon.Options
import typingsJapgolly.angularCompilerCli.anon.PickCompilerHostgetCanoni
import typingsJapgolly.angularCompilerCli.ngccSrcNgccOptionsMod.AsyncNgccOptions
import typingsJapgolly.angularCompilerCli.ngccSrcNgccOptionsMod.SyncNgccOptions
import typingsJapgolly.angularCompilerCli.srcNgtscCoreApiSrcOptionsMod.NgCompilerOptions
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcLogicalMod.LogicalProjectPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.BrandedPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathSegment
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathString
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel
import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.ConfigurationHost
import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.PerformCompilationResult
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.CompilerOptions
import typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.angular
import typingsJapgolly.std.Record
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.FormatDiagnosticsHost
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TransformerFactory
import typingsJapgolly.webpack.mod.ResolveOptionsWithDependencyType
import typingsJapgolly.webpack.mod.ResolverWithOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CompilerHost extends StObject {
    
    var compilerHost: typingsJapgolly.typescript.mod.CompilerHost
    
    var program: Program
  }
  object CompilerHost {
    
    inline def apply(compilerHost: typingsJapgolly.typescript.mod.CompilerHost, program: Program): CompilerHost = {
      val __obj = js.Dynamic.literal(compilerHost = compilerHost.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilerHost]
    }
    
    extension [Self <: CompilerHost](x: Self) {
      
      inline def setCompilerHost(value: typingsJapgolly.typescript.mod.CompilerHost): Self = StObject.set(x, "compilerHost", value.asInstanceOf[js.Any])
      
      inline def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.UndefOr[String] = js.undefined
  }
  object Data {
    
    inline def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  trait DirectTemplateLoading extends StObject {
    
    var directTemplateLoading: js.UndefOr[Boolean] = js.undefined
    
    var inlineStyleFileExtension: js.UndefOr[String] = js.undefined
  }
  object DirectTemplateLoading {
    
    inline def apply(): DirectTemplateLoading = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectTemplateLoading]
    }
    
    extension [Self <: DirectTemplateLoading](x: Self) {
      
      inline def setDirectTemplateLoading(value: Boolean): Self = StObject.set(x, "directTemplateLoading", value.asInstanceOf[js.Any])
      
      inline def setDirectTemplateLoadingUndefined: Self = StObject.set(x, "directTemplateLoading", js.undefined)
      
      inline def setInlineStyleFileExtension(value: String): Self = StObject.set(x, "inlineStyleFileExtension", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleFileExtensionUndefined: Self = StObject.set(x, "inlineStyleFileExtension", js.undefined)
    }
  }
  
  trait EmitClassMetadata extends StObject {
    
    var emitClassMetadata: js.UndefOr[Boolean] = js.undefined
    
    var emitNgModuleScope: js.UndefOr[Boolean] = js.undefined
  }
  object EmitClassMetadata {
    
    inline def apply(): EmitClassMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmitClassMetadata]
    }
    
    extension [Self <: EmitClassMetadata](x: Self) {
      
      inline def setEmitClassMetadata(value: Boolean): Self = StObject.set(x, "emitClassMetadata", value.asInstanceOf[js.Any])
      
      inline def setEmitClassMetadataUndefined: Self = StObject.set(x, "emitClassMetadata", js.undefined)
      
      inline def setEmitNgModuleScope(value: Boolean): Self = StObject.set(x, "emitNgModuleScope", value.asInstanceOf[js.Any])
      
      inline def setEmitNgModuleScopeUndefined: Self = StObject.set(x, "emitNgModuleScope", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(`type`: String): ResolverWithOptions = js.native
    def apply(`type`: String, resolveOptions: ResolveOptionsWithDependencyType): ResolverWithOptions = js.native
  }
  
  trait InlineStyleFileExtension extends StObject {
    
    var inlineStyleFileExtension: js.UndefOr[String] = js.undefined
  }
  object InlineStyleFileExtension {
    
    inline def apply(): InlineStyleFileExtension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlineStyleFileExtension]
    }
    
    extension [Self <: InlineStyleFileExtension](x: Self) {
      
      inline def setInlineStyleFileExtension(value: String): Self = StObject.set(x, "inlineStyleFileExtension", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleFileExtensionUndefined: Self = StObject.set(x, "inlineStyleFileExtension", js.undefined)
    }
  }
  
  trait IsDirectory extends StObject {
    
    def isDirectory(): Boolean
    
    def isFile(): Boolean
    
    var mtime: js.Date
    
    var size: Double
  }
  object IsDirectory {
    
    inline def apply(isDirectory: CallbackTo[Boolean], isFile: CallbackTo[Boolean], mtime: js.Date, size: Double): IsDirectory = {
      val __obj = js.Dynamic.literal(isDirectory = isDirectory.toJsFn, isFile = isFile.toJsFn, mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsDirectory]
    }
    
    extension [Self <: IsDirectory](x: Self) {
      
      inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
      
      inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait Issuer extends StObject {
    
    var issuer: js.UndefOr[String] = js.undefined
  }
  object Issuer {
    
    inline def apply(): Issuer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Issuer]
    }
    
    extension [Self <: Issuer](x: Self) {
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@ngtools/webpack.@ngtools/webpack/src/ivy/plugin.AngularWebpackPluginOptions> */
  trait PartialAngularWebpackPlug extends StObject {
    
    var compilerOptions: js.UndefOr[CompilerOptions] = js.undefined
    
    var directTemplateLoading: js.UndefOr[Boolean] = js.undefined
    
    var emitClassMetadata: js.UndefOr[Boolean] = js.undefined
    
    var emitNgModuleScope: js.UndefOr[Boolean] = js.undefined
    
    var fileReplacements: js.UndefOr[Record[String, String]] = js.undefined
    
    var inlineStyleFileExtension: js.UndefOr[String] = js.undefined
    
    var jitMode: js.UndefOr[Boolean] = js.undefined
    
    var substitutions: js.UndefOr[Record[String, String]] = js.undefined
    
    var tsconfig: js.UndefOr[String] = js.undefined
  }
  object PartialAngularWebpackPlug {
    
    inline def apply(): PartialAngularWebpackPlug = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAngularWebpackPlug]
    }
    
    extension [Self <: PartialAngularWebpackPlug](x: Self) {
      
      inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setDirectTemplateLoading(value: Boolean): Self = StObject.set(x, "directTemplateLoading", value.asInstanceOf[js.Any])
      
      inline def setDirectTemplateLoadingUndefined: Self = StObject.set(x, "directTemplateLoading", js.undefined)
      
      inline def setEmitClassMetadata(value: Boolean): Self = StObject.set(x, "emitClassMetadata", value.asInstanceOf[js.Any])
      
      inline def setEmitClassMetadataUndefined: Self = StObject.set(x, "emitClassMetadata", js.undefined)
      
      inline def setEmitNgModuleScope(value: Boolean): Self = StObject.set(x, "emitNgModuleScope", value.asInstanceOf[js.Any])
      
      inline def setEmitNgModuleScopeUndefined: Self = StObject.set(x, "emitNgModuleScope", js.undefined)
      
      inline def setFileReplacements(value: Record[String, String]): Self = StObject.set(x, "fileReplacements", value.asInstanceOf[js.Any])
      
      inline def setFileReplacementsUndefined: Self = StObject.set(x, "fileReplacements", js.undefined)
      
      inline def setInlineStyleFileExtension(value: String): Self = StObject.set(x, "inlineStyleFileExtension", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleFileExtensionUndefined: Self = StObject.set(x, "inlineStyleFileExtension", js.undefined)
      
      inline def setJitMode(value: Boolean): Self = StObject.set(x, "jitMode", value.asInstanceOf[js.Any])
      
      inline def setJitModeUndefined: Self = StObject.set(x, "jitMode", js.undefined)
      
      inline def setSubstitutions(value: Record[String, String]): Self = StObject.set(x, "substitutions", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionsUndefined: Self = StObject.set(x, "substitutions", js.undefined)
      
      inline def setTsconfig(value: String): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
      
      inline def setTsconfigUndefined: Self = StObject.set(x, "tsconfig", js.undefined)
    }
  }
  
  trait TypeofGLOBALDEFSFORTER extends StObject {
    
    var ngDevMode: Boolean
    
    var ngI18nClosureMode: Boolean
  }
  object TypeofGLOBALDEFSFORTER {
    
    inline def apply(ngDevMode: Boolean, ngI18nClosureMode: Boolean): TypeofGLOBALDEFSFORTER = {
      val __obj = js.Dynamic.literal(ngDevMode = ngDevMode.asInstanceOf[js.Any], ngI18nClosureMode = ngI18nClosureMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofGLOBALDEFSFORTER]
    }
    
    extension [Self <: TypeofGLOBALDEFSFORTER](x: Self) {
      
      inline def setNgDevMode(value: Boolean): Self = StObject.set(x, "ngDevMode", value.asInstanceOf[js.Any])
      
      inline def setNgI18nClosureMode(value: Boolean): Self = StObject.set(x, "ngI18nClosureMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofGLOBALDEFSFORTERNgDevMode extends StObject {
    
    var ngDevMode: Boolean
    
    var ngI18nClosureMode: Boolean
    
    var ngJitMode: Boolean
  }
  object TypeofGLOBALDEFSFORTERNgDevMode {
    
    inline def apply(ngDevMode: Boolean, ngI18nClosureMode: Boolean, ngJitMode: Boolean): TypeofGLOBALDEFSFORTERNgDevMode = {
      val __obj = js.Dynamic.literal(ngDevMode = ngDevMode.asInstanceOf[js.Any], ngI18nClosureMode = ngI18nClosureMode.asInstanceOf[js.Any], ngJitMode = ngJitMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofGLOBALDEFSFORTERNgDevMode]
    }
    
    extension [Self <: TypeofGLOBALDEFSFORTERNgDevMode](x: Self) {
      
      inline def setNgDevMode(value: Boolean): Self = StObject.set(x, "ngDevMode", value.asInstanceOf[js.Any])
      
      inline def setNgI18nClosureMode(value: Boolean): Self = StObject.set(x, "ngI18nClosureMode", value.asInstanceOf[js.Any])
      
      inline def setNgJitMode(value: Boolean): Self = StObject.set(x, "ngJitMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofLogicalProjectPath extends StObject {
    
    /**
      * Get the relative path between two `LogicalProjectPath`s.
      *
      * This will return a `PathSegment` which would be a valid module specifier to use in `from` when
      * importing from `to`.
      */
    def relativePathBetween(from: LogicalProjectPath, to: LogicalProjectPath): PathSegment
  }
  object TypeofLogicalProjectPath {
    
    inline def apply(relativePathBetween: (LogicalProjectPath, LogicalProjectPath) => PathSegment): TypeofLogicalProjectPath = {
      val __obj = js.Dynamic.literal(relativePathBetween = js.Any.fromFunction2(relativePathBetween))
      __obj.asInstanceOf[TypeofLogicalProjectPath]
    }
    
    extension [Self <: TypeofLogicalProjectPath](x: Self) {
      
      inline def setRelativePathBetween(value: (LogicalProjectPath, LogicalProjectPath) => PathSegment): Self = StObject.set(x, "relativePathBetween", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait TypeofimportedCompilerC extends StObject {
    
    var ConsoleLogger: Instantiable1[/* level */ LogLevel, typingsJapgolly.angularCompilerCli.mod.ConsoleLogger] = js.native
    
    val DEFAULT_ERROR_CODE: /* 100 */ Double = js.native
    
    val GLOBAL_DEFS_FOR_TERSER: TypeofGLOBALDEFSFORTER = js.native
    
    val GLOBAL_DEFS_FOR_TERSER_WITH_AOT: TypeofGLOBALDEFSFORTERNgDevMode = js.native
    
    var LogicalFileSystem: Instantiable2[
        /* rootDirs */ js.Array[AbsoluteFsPath], 
        /* compilerHost */ PickCompilerHostgetCanoni, 
        typingsJapgolly.angularCompilerCli.mod.LogicalFileSystem
      ] = js.native
    
    val LogicalProjectPath: TypeofLogicalProjectPath = js.native
    
    var NgTscPlugin: Instantiable1[/* ngOptions */ js.Object, typingsJapgolly.angularCompilerCli.mod.NgTscPlugin] = js.native
    
    var NgtscCompilerHost: Instantiable1[/* fs */ FileSystem, typingsJapgolly.angularCompilerCli.mod.NgtscCompilerHost] = js.native
    
    var NgtscProgram: Instantiable3[
        /* rootNames */ js.Array[String], 
        /* options */ NgCompilerOptions, 
        /* delegateHost */ typingsJapgolly.angularCompilerCli.srcTransformersApiMod.CompilerHost, 
        typingsJapgolly.angularCompilerCli.mod.NgtscProgram
      ] = js.native
    
    var NodeJSFileSystem: Instantiable0[typingsJapgolly.angularCompilerCli.mod.NodeJSFileSystem] = js.native
    
    val SOURCE: angular = js.native
    
    val UNKNOWN_ERROR_CODE: /* 500 */ Double = js.native
    
    val VERSION: Version = js.native
    
    def absoluteFrom(path: String): AbsoluteFsPath = js.native
    
    def absoluteFromSourceFile(sf: FileName): AbsoluteFsPath = js.native
    
    def basename(filePath: PathString): PathSegment = js.native
    def basename(filePath: PathString, `extension`: String): PathSegment = js.native
    
    def calcProjectFileAndBasePath(project: String): BasePath = js.native
    def calcProjectFileAndBasePath(project: String, host: ConfigurationHost): BasePath = js.native
    
    def constructorParametersDownlevelTransform(program: Program): TransformerFactory[SourceFile] = js.native
    
    def createCompilerHost(hasOptionsTsHost: Options): typingsJapgolly.angularCompilerCli.srcTransformersApiMod.CompilerHost = js.native
    
    def createProgram(hasRootNamesOptionsHostOldProgram: Host): typingsJapgolly.angularCompilerCli.srcTransformersApiMod.Program = js.native
    
    def defaultGatherDiagnostics(program: typingsJapgolly.angularCompilerCli.srcTransformersApiMod.Program): js.Array[Diagnostic] = js.native
    
    def dirname(file: String): String = js.native
    @JSName("dirname")
    def dirname_AbsoluteFsPath(file: BrandedPath[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.AbsoluteFsPath]): BrandedPath[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.AbsoluteFsPath] = js.native
    @JSName("dirname")
    def dirname_PathSegment(file: BrandedPath[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.PathSegment]): BrandedPath[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.PathSegment] = js.native
    
    def exitCodeFromResult(): Double = js.native
    def exitCodeFromResult(diags: js.Array[Diagnostic]): Double = js.native
    
    def formatDiagnostics(diags: js.Array[Diagnostic]): String = js.native
    def formatDiagnostics(diags: js.Array[Diagnostic], host: FormatDiagnosticsHost): String = js.native
    
    def getFileSystem(): FileSystem = js.native
    
    def getSourceFileOrError(program: Program, fileName: AbsoluteFsPath): SourceFile = js.native
    
    def isLocalRelativePath(relativePath: String): Boolean = js.native
    
    def isRoot(path: AbsoluteFsPath): Boolean = js.native
    
    def isRooted(path: String): Boolean = js.native
    
    def isTsDiagnostic(diagnostic: Any): /* is typescript.typescript.Diagnostic */ Boolean = js.native
    
    def join(basePath: String, paths: String*): String = js.native
    @JSName("join")
    def join_AbsoluteFsPath(
      basePath: BrandedPath[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.AbsoluteFsPath],
      paths: String*
    ): BrandedPath[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.AbsoluteFsPath] = js.native
    @JSName("join")
    def join_PathSegment(
      basePath: BrandedPath[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.PathSegment],
      paths: String*
    ): BrandedPath[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.PathSegment] = js.native
    
    def performCompilation(
      hasRootNamesOptionsHostOldProgramEmitCallbackMergeEmitResultsCallbackGatherDiagnosticsCustomTransformersEmitFlagsForceEmitModifiedResourceFiles: CustomTransformers
    ): PerformCompilationResult = js.native
    
    def readConfiguration(project: String): ParsedConfiguration = js.native
    def readConfiguration(project: String, existingOptions: Unit, host: ConfigurationHost): ParsedConfiguration = js.native
    def readConfiguration(project: String, existingOptions: CompilerOptions): ParsedConfiguration = js.native
    def readConfiguration(project: String, existingOptions: CompilerOptions, host: ConfigurationHost): ParsedConfiguration = js.native
    
    def relative(from: String, to: String): PathSegment | AbsoluteFsPath = js.native
    
    def relativeFrom(path: String): PathSegment = js.native
    
    @JSName("relative")
    def relative_AbsoluteFsPath(
      from: BrandedPath[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.AbsoluteFsPath],
      to: BrandedPath[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.AbsoluteFsPath]
    ): PathSegment | AbsoluteFsPath = js.native
    @JSName("relative")
    def relative_PathSegment(
      from: BrandedPath[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.PathSegment],
      to: BrandedPath[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.PathSegment]
    ): PathSegment | AbsoluteFsPath = js.native
    
    def resolve(basePath: String, paths: String*): AbsoluteFsPath = js.native
    
    def setFileSystem(fileSystem: FileSystem): Unit = js.native
    
    def toRelativeImport(relativePath: AbsoluteFsPath | PathSegment): PathSegment | AbsoluteFsPath = js.native
  }
  
  @js.native
  trait TypeofimportedNgcc extends StObject {
    
    var ConsoleLogger: Instantiable1[/* level */ LogLevel, typingsJapgolly.angularCompilerCli.ngccMod.ConsoleLogger] = js.native
    
    def clearTsConfigCache(): Unit = js.native
    
    val containingDirPath: String = js.native
    
    val ngccMainFilePath: String = js.native
    
    def process(options: AsyncNgccOptions): /* import warning: importer.ImportType#apply Failed type conversion: @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.AsyncNgccOptions extends @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.AsyncNgccOptions ? std.Promise<void> : void */ js.Any = js.native
    def process(options: SyncNgccOptions): /* import warning: importer.ImportType#apply Failed type conversion: @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.SyncNgccOptions extends @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.AsyncNgccOptions ? std.Promise<void> : void */ js.Any = js.native
  }
}
