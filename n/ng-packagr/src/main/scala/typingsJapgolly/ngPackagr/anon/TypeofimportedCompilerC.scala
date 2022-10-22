package typingsJapgolly.ngPackagr.anon

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
import typingsJapgolly.angularCompilerCli.srcNgtscCoreApiSrcOptionsMod.NgCompilerOptions
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.BrandedPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathSegment
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathString
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel
import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.ConfigurationHost
import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.PerformCompilationResult
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.CompilerHost
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.CompilerOptions
import typingsJapgolly.ngPackagr.ngPackagrStrings.angular
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.FormatDiagnosticsHost
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    /* delegateHost */ CompilerHost, 
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
  
  def createCompilerHost(hasOptionsTsHost: Options): CompilerHost = js.native
  
  def createProgram(hasRootNamesOptionsHostOldProgram: Host): typingsJapgolly.angularCompilerCli.srcTransformersApiMod.Program = js.native
  
  def defaultGatherDiagnostics(program: typingsJapgolly.angularCompilerCli.srcTransformersApiMod.Program): js.Array[Diagnostic] = js.native
  
  def dirname(file: String): String = js.native
  @JSName("dirname")
  def dirname_AbsoluteFsPath(file: BrandedPath[typingsJapgolly.ngPackagr.ngPackagrStrings.AbsoluteFsPath]): BrandedPath[typingsJapgolly.ngPackagr.ngPackagrStrings.AbsoluteFsPath] = js.native
  @JSName("dirname")
  def dirname_PathSegment(file: BrandedPath[typingsJapgolly.ngPackagr.ngPackagrStrings.PathSegment]): BrandedPath[typingsJapgolly.ngPackagr.ngPackagrStrings.PathSegment] = js.native
  
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
  def join_AbsoluteFsPath(basePath: BrandedPath[typingsJapgolly.ngPackagr.ngPackagrStrings.AbsoluteFsPath], paths: String*): BrandedPath[typingsJapgolly.ngPackagr.ngPackagrStrings.AbsoluteFsPath] = js.native
  @JSName("join")
  def join_PathSegment(basePath: BrandedPath[typingsJapgolly.ngPackagr.ngPackagrStrings.PathSegment], paths: String*): BrandedPath[typingsJapgolly.ngPackagr.ngPackagrStrings.PathSegment] = js.native
  
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
    from: BrandedPath[typingsJapgolly.ngPackagr.ngPackagrStrings.AbsoluteFsPath],
    to: BrandedPath[typingsJapgolly.ngPackagr.ngPackagrStrings.AbsoluteFsPath]
  ): PathSegment | AbsoluteFsPath = js.native
  @JSName("relative")
  def relative_PathSegment(
    from: BrandedPath[typingsJapgolly.ngPackagr.ngPackagrStrings.PathSegment],
    to: BrandedPath[typingsJapgolly.ngPackagr.ngPackagrStrings.PathSegment]
  ): PathSegment | AbsoluteFsPath = js.native
  
  def resolve(basePath: String, paths: String*): AbsoluteFsPath = js.native
  
  def setFileSystem(fileSystem: FileSystem): Unit = js.native
  
  def toRelativeImport(relativePath: AbsoluteFsPath | PathSegment): PathSegment | AbsoluteFsPath = js.native
}
