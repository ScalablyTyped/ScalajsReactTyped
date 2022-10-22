package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typingsJapgolly.angularCompilerCli.srcNgtscSourcemapsSrcRawSourceMapMod.SourceMapInfo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscSourcemapsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/sourcemaps", "ContentOrigin")
  @js.native
  object ContentOrigin extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.angularCompilerCli.srcNgtscSourcemapsSrcContentOriginMod.ContentOrigin & Double
      ] = js.native
    
    /* 2 */ val FileSystem: typingsJapgolly.angularCompilerCli.srcNgtscSourcemapsSrcContentOriginMod.ContentOrigin.FileSystem & Double = js.native
    
    /* 1 */ val Inline: typingsJapgolly.angularCompilerCli.srcNgtscSourcemapsSrcContentOriginMod.ContentOrigin.Inline & Double = js.native
    
    /* 0 */ val Provided: typingsJapgolly.angularCompilerCli.srcNgtscSourcemapsSrcContentOriginMod.ContentOrigin.Provided & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/sourcemaps", "SourceFile")
  @js.native
  open class SourceFile protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscSourcemapsSrcSourceFileMod.SourceFile {
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
  
  @JSImport("@angular/compiler-cli/src/ngtsc/sourcemaps", "SourceFileLoader")
  @js.native
  open class SourceFileLoader protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscSourcemapsSrcSourceFileLoaderMod.SourceFileLoader {
    def this(
      fs: ReadonlyFileSystem,
      logger: Logger,
      /** A map of URL schemes to base paths. The scheme name should be lowercase. */
    schemeMap: Record[String, AbsoluteFsPath]
    ) = this()
  }
}
