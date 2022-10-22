package typingsJapgolly.angularCompilerCli.anon

import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.CreateSourceFileOptions
import typingsJapgolly.typescript.mod.FileReference
import typingsJapgolly.typescript.mod.ModuleKind.CommonJS
import typingsJapgolly.typescript.mod.ModuleKind.ESNext
import typingsJapgolly.typescript.mod.ModuleResolutionCache
import typingsJapgolly.typescript.mod.ParsedCommandLine
import typingsJapgolly.typescript.mod.Path
import typingsJapgolly.typescript.mod.ResolvedModule
import typingsJapgolly.typescript.mod.ResolvedProjectReference
import typingsJapgolly.typescript.mod.ResolvedTypeReferenceDirective
import typingsJapgolly.typescript.mod.ScriptTarget
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.WriteFileCallback
import typingsJapgolly.typescript.mod.WriteFileCallbackData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typescript.typescript.CompilerHost & std.Partial<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/core/api.UnifiedModulesHost> */
@js.native
trait CompilerHostPartialUnifie extends StObject {
  
  var createHash: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
  
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ String, Boolean]] = js.native
  
  def fileExists(fileName: String): Boolean = js.native
  
  var fileNameToModuleName: js.UndefOr[
    js.Function2[/* importedFilePath */ String, /* containingFilePath */ String, String]
  ] = js.native
  
  var getCancellationToken: js.UndefOr[js.Function0[typingsJapgolly.typescript.mod.CancellationToken]] = js.native
  
  def getCanonicalFileName(fileName: String): String = js.native
  
  def getCurrentDirectory(): String = js.native
  @JSName("getCurrentDirectory")
  var getCurrentDirectory_FCompilerHostPartialUnifie: js.UndefOr[js.Function0[String]] = js.native
  
  def getDefaultLibFileName(options: CompilerOptions): String = js.native
  
  var getDefaultLibLocation: js.UndefOr[js.Function0[String]] = js.native
  
  var getDirectories: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.native
  
  var getEnvironmentVariable: js.UndefOr[js.Function1[/* name */ String, js.UndefOr[String]]] = js.native
  
  /**
    * Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it
    */
  var getModuleResolutionCache: js.UndefOr[js.Function0[js.UndefOr[ModuleResolutionCache]]] = js.native
  
  def getNewLine(): String = js.native
  
  var getParsedCommandLine: js.UndefOr[js.Function1[/* fileName */ String, js.UndefOr[ParsedCommandLine]]] = js.native
  
  def getSourceFile(fileName: String, languageVersionOrOptions: CreateSourceFileOptions): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: String,
    languageVersionOrOptions: CreateSourceFileOptions,
    onError: js.Function1[/* message */ String, Unit]
  ): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: String,
    languageVersionOrOptions: CreateSourceFileOptions,
    onError: js.Function1[/* message */ String, Unit],
    shouldCreateNewSourceFile: Boolean
  ): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: String,
    languageVersionOrOptions: CreateSourceFileOptions,
    onError: Unit,
    shouldCreateNewSourceFile: Boolean
  ): js.UndefOr[SourceFile] = js.native
  def getSourceFile(fileName: String, languageVersionOrOptions: ScriptTarget): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: String,
    languageVersionOrOptions: ScriptTarget,
    onError: js.Function1[/* message */ String, Unit]
  ): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: String,
    languageVersionOrOptions: ScriptTarget,
    onError: js.Function1[/* message */ String, Unit],
    shouldCreateNewSourceFile: Boolean
  ): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: String,
    languageVersionOrOptions: ScriptTarget,
    onError: Unit,
    shouldCreateNewSourceFile: Boolean
  ): js.UndefOr[SourceFile] = js.native
  
  var getSourceFileByPath: js.UndefOr[
    js.Function5[
      /* fileName */ String, 
      /* path */ Path, 
      /* languageVersionOrOptions */ ScriptTarget | CreateSourceFileOptions, 
      /* onError */ js.UndefOr[js.Function1[/* message */ String, Unit]], 
      /* shouldCreateNewSourceFile */ js.UndefOr[Boolean], 
      js.UndefOr[SourceFile]
    ]
  ] = js.native
  
  var readDirectory: js.UndefOr[
    js.Function5[
      /* rootDir */ String, 
      /* extensions */ js.Array[String], 
      /* excludes */ js.UndefOr[js.Array[String]], 
      /* includes */ js.Array[String], 
      /* depth */ js.UndefOr[Double], 
      js.Array[String]
    ]
  ] = js.native
  
  def readFile(fileName: String): js.UndefOr[String] = js.native
  
  /**
    * Resolve a symbolic link.
    * @see https://nodejs.org/api/fs.html#fs_fs_realpathsync_path_options
    */
  var realpath: js.UndefOr[js.Function1[/* path */ String, String]] = js.native
  
  var resolveModuleNames: js.UndefOr[
    js.Function6[
      /* moduleNames */ js.Array[String], 
      /* containingFile */ String, 
      /* reusedNames */ js.UndefOr[js.Array[String]], 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      /* containingSourceFile */ js.UndefOr[SourceFile], 
      js.Array[js.UndefOr[ResolvedModule]]
    ]
  ] = js.native
  
  /**
    * This method is a companion for 'resolveModuleNames' and is used to resolve 'types' references to actual type declaration files
    */
  var resolveTypeReferenceDirectives: js.UndefOr[
    js.Function5[
      /* typeReferenceDirectiveNames */ js.Array[FileReference | String], 
      /* containingFile */ String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      /* containingFileMode */ js.UndefOr[ESNext | CommonJS], 
      js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ]
  ] = js.native
  
  var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.native
  
  def useCaseSensitiveFileNames(): Boolean = js.native
  @JSName("useCaseSensitiveFileNames")
  var useCaseSensitiveFileNames_FCompilerHostPartialUnifie: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  
  def writeFile(fileName: String, text: String, writeByteOrderMark: Boolean): Unit = js.native
  def writeFile(
    fileName: String,
    text: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit]
  ): Unit = js.native
  def writeFile(
    fileName: String,
    text: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit],
    sourceFiles: js.Array[SourceFile]
  ): Unit = js.native
  def writeFile(
    fileName: String,
    text: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit],
    sourceFiles: js.Array[SourceFile],
    data: WriteFileCallbackData
  ): Unit = js.native
  def writeFile(
    fileName: String,
    text: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit],
    sourceFiles: Unit,
    data: WriteFileCallbackData
  ): Unit = js.native
  def writeFile(
    fileName: String,
    text: String,
    writeByteOrderMark: Boolean,
    onError: Unit,
    sourceFiles: js.Array[SourceFile]
  ): Unit = js.native
  def writeFile(
    fileName: String,
    text: String,
    writeByteOrderMark: Boolean,
    onError: Unit,
    sourceFiles: js.Array[SourceFile],
    data: WriteFileCallbackData
  ): Unit = js.native
  def writeFile(
    fileName: String,
    text: String,
    writeByteOrderMark: Boolean,
    onError: Unit,
    sourceFiles: Unit,
    data: WriteFileCallbackData
  ): Unit = js.native
  @JSName("writeFile")
  var writeFile_Original: WriteFileCallback = js.native
}
