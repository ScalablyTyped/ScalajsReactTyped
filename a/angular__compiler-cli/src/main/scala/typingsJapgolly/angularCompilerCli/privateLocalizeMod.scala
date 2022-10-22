package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.anon.FileName
import typingsJapgolly.angularCompilerCli.anon.PickCompilerHostgetCanoni
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.BrandedPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathSegment
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathString
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typingsJapgolly.angularCompilerCli.srcNgtscSourcemapsSrcRawSourceMapMod.SourceMapInfo
import typingsJapgolly.std.Record
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateLocalizeMod {
  
  @JSImport("@angular/compiler-cli/private/localize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/private/localize", "ConsoleLogger")
  @js.native
  open class ConsoleLogger protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscLoggingMod.ConsoleLogger {
    def this(level: LogLevel) = this()
  }
  
  @JSImport("@angular/compiler-cli/private/localize", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel & Double] = js.native
    
    /* 0 */ val debug: typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.debug & Double = js.native
    
    /* 3 */ val error: typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.error & Double = js.native
    
    /* 1 */ val info: typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.info & Double = js.native
    
    /* 2 */ val warn: typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.warn & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/private/localize", "LogicalFileSystem")
  @js.native
  open class LogicalFileSystem protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscFileSystemMod.LogicalFileSystem {
    def this(rootDirs: js.Array[AbsoluteFsPath], compilerHost: PickCompilerHostgetCanoni) = this()
  }
  
  object LogicalProjectPath {
    
    @JSImport("@angular/compiler-cli/private/localize", "LogicalProjectPath")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the relative path between two `LogicalProjectPath`s.
      *
      * This will return a `PathSegment` which would be a valid module specifier to use in `from` when
      * importing from `to`.
      */
    inline def relativePathBetween(
      from: typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcLogicalMod.LogicalProjectPath,
      to: typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcLogicalMod.LogicalProjectPath
    ): PathSegment = (^.asInstanceOf[js.Dynamic].applyDynamic("relativePathBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[PathSegment]
  }
  
  @JSImport("@angular/compiler-cli/private/localize", "NgtscCompilerHost")
  @js.native
  open class NgtscCompilerHost protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscFileSystemMod.NgtscCompilerHost {
    def this(fs: FileSystem) = this()
    def this(fs: FileSystem, options: CompilerOptions) = this()
  }
  
  @JSImport("@angular/compiler-cli/private/localize", "NodeJSFileSystem")
  @js.native
  open class NodeJSFileSystem ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscFileSystemMod.NodeJSFileSystem
  
  @JSImport("@angular/compiler-cli/private/localize", "SourceFile")
  @js.native
  open class SourceFile protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscSourcemapsMod.SourceFile {
    def this(
      /** The path to this source file. */
    sourcePath: AbsoluteFsPath,
      /** The contents of this source file. */
    contents: String,
      /** The raw source map (if any) referenced by this source file. */
    rawMap: Null,
      /** Any source files referenced by the raw source map associated with this source file. */
    sources: js.Array[
            typingsJapgolly.angularCompilerCli.srcNgtscSourcemapsSrcSourceFileMod.SourceFile | Null
          ],
      fs: PathManipulation
    ) = this()
    def this(
      /** The path to this source file. */
    sourcePath: AbsoluteFsPath,
      /** The contents of this source file. */
    contents: String,
      /** The raw source map (if any) referenced by this source file. */
    rawMap: SourceMapInfo,
      /** Any source files referenced by the raw source map associated with this source file. */
    sources: js.Array[
            typingsJapgolly.angularCompilerCli.srcNgtscSourcemapsSrcSourceFileMod.SourceFile | Null
          ],
      fs: PathManipulation
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/private/localize", "SourceFileLoader")
  @js.native
  open class SourceFileLoader protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscSourcemapsMod.SourceFileLoader {
    def this(
      fs: ReadonlyFileSystem,
      logger: Logger,
      /** A map of URL schemes to base paths. The scheme name should be lowercase. */
    schemeMap: Record[String, AbsoluteFsPath]
    ) = this()
  }
  
  inline def absoluteFrom(path: String): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteFrom")(path.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
  
  inline def absoluteFromSourceFile(sf: FileName): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteFromSourceFile")(sf.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
  
  inline def basename(filePath: PathString): PathSegment = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(filePath.asInstanceOf[js.Any]).asInstanceOf[PathSegment]
  inline def basename(filePath: PathString, `extension`: String): PathSegment = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(filePath.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[PathSegment]
  
  inline def dirname(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dirname_AbsoluteFsPath(file: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]): BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath] = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(file.asInstanceOf[js.Any]).asInstanceOf[BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]]
  
  inline def dirname_PathSegment(file: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment]): BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment] = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(file.asInstanceOf[js.Any]).asInstanceOf[BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment]]
  
  inline def getFileSystem(): FileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystem")().asInstanceOf[FileSystem]
  
  inline def getSourceFileOrError(program: Program, fileName: AbsoluteFsPath): typingsJapgolly.typescript.mod.SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceFileOrError")(program.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescript.mod.SourceFile]
  
  inline def isLocalRelativePath(relativePath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocalRelativePath")(relativePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRoot(path: AbsoluteFsPath): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRoot")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRooted(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRooted")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def join(basePath: String, paths: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(scala.List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def join_AbsoluteFsPath(
    basePath: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath],
    paths: String*
  ): BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath] = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(scala.List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]]
  
  inline def join_PathSegment(
    basePath: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment],
    paths: String*
  ): BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment] = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(scala.List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment]]
  
  inline def relative(from: String, to: String): PathSegment | AbsoluteFsPath = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[PathSegment | AbsoluteFsPath]
  
  inline def relativeFrom(path: String): PathSegment = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeFrom")(path.asInstanceOf[js.Any]).asInstanceOf[PathSegment]
  
  inline def relative_AbsoluteFsPath(
    from: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath],
    to: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]
  ): PathSegment | AbsoluteFsPath = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[PathSegment | AbsoluteFsPath]
  
  inline def relative_PathSegment(
    from: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment],
    to: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment]
  ): PathSegment | AbsoluteFsPath = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[PathSegment | AbsoluteFsPath]
  
  inline def resolve(basePath: String, paths: String*): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(scala.List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[AbsoluteFsPath]
  
  inline def setFileSystem(fileSystem: FileSystem): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFileSystem")(fileSystem.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toRelativeImport(relativePath: AbsoluteFsPath | PathSegment): PathSegment | AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("toRelativeImport")(relativePath.asInstanceOf[js.Any]).asInstanceOf[PathSegment | AbsoluteFsPath]
}
