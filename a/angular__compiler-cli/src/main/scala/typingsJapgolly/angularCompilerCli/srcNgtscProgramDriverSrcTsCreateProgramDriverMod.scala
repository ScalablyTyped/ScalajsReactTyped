package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscProgramDriverSrcApiMod.FileUpdate
import typingsJapgolly.angularCompilerCli.srcNgtscProgramDriverSrcApiMod.ProgramDriver
import typingsJapgolly.angularCompilerCli.srcNgtscProgramDriverSrcApiMod.UpdateMode
import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.CancellationToken
import typingsJapgolly.typescript.mod.CompilerHost
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.CreateSourceFileOptions
import typingsJapgolly.typescript.mod.FileReference
import typingsJapgolly.typescript.mod.ModuleKind.CommonJS
import typingsJapgolly.typescript.mod.ModuleKind.ESNext
import typingsJapgolly.typescript.mod.ModuleResolutionCache
import typingsJapgolly.typescript.mod.ParsedCommandLine
import typingsJapgolly.typescript.mod.Path
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.ResolvedModule
import typingsJapgolly.typescript.mod.ResolvedProjectReference
import typingsJapgolly.typescript.mod.ResolvedTypeReferenceDirective
import typingsJapgolly.typescript.mod.ScriptTarget
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscProgramDriverSrcTsCreateProgramDriverMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof @angular/compiler-cli.anon.RequiredDelegationsCompil, 'getSourceFile' | 'fileExists' | 'writeFile'> ]: @angular/compiler-cli.anon.RequiredDelegationsCompil[P]} */ @JSImport("@angular/compiler-cli/src/ngtsc/program_driver/src/ts_create_program_driver", "DelegatingCompilerHost")
  @js.native
  open class DelegatingCompilerHost protected () extends StObject {
    def this(delegate: CompilerHost) = this()
    
    var createHash: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
    
    /* protected */ var delegate: CompilerHost = js.native
    
    /* private */ var delegateMethod: Any = js.native
    
    var directoryExists: js.UndefOr[js.Function1[/* directoryName */ String, Boolean]] = js.native
    
    var getCancellationToken: js.UndefOr[js.Function0[CancellationToken]] = js.native
    
    def getCanonicalFileName(fileName: String): String = js.native
    
    def getCurrentDirectory(): String = js.native
    
    def getDefaultLibFileName(options: CompilerOptions): String = js.native
    
    var getDefaultLibLocation: js.UndefOr[js.Function0[String]] = js.native
    
    var getDirectories: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.native
    
    var getEnvironmentVariable: js.UndefOr[js.Function1[/* name */ String, js.UndefOr[String]]] = js.native
    
    var getModuleResolutionCache: js.UndefOr[js.Function0[js.UndefOr[ModuleResolutionCache]]] = js.native
    
    def getNewLine(): String = js.native
    
    var getParsedCommandLine: js.UndefOr[js.Function1[/* fileName */ String, js.UndefOr[ParsedCommandLine]]] = js.native
    
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
    
    var resolveTypeReferenceDirectives: js.UndefOr[
        js.Function5[
          /* typeReferenceDirectiveNames */ js.Array[FileReference | String], 
          /* containingFile */ String, 
          /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
          /* options */ CompilerOptions, 
          /* containingFileMode */ js.UndefOr[CommonJS | ESNext], 
          js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
        ]
      ] = js.native
    
    var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.native
    
    def useCaseSensitiveFileNames(): Boolean = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/program_driver/src/ts_create_program_driver", "TsCreateProgramDriver")
  @js.native
  open class TsCreateProgramDriver protected ()
    extends StObject
       with ProgramDriver {
    def this(
      originalProgram: Program,
      originalHost: CompilerHost,
      options: CompilerOptions,
      shimExtensionPrefixes: js.Array[String]
    ) = this()
    
    /**
      * Retrieve the latest version of the program, containing all the updates made thus far.
      */
    /* CompleteClass */
    override def getProgram(): Program = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var originalHost: Any = js.native
    
    /* private */ var originalProgram: Any = js.native
    
    /* private */ var program: Any = js.native
    
    /**
      * A map of source file paths to replacement `ts.SourceFile`s for those paths.
      *
      * Effectively, this tracks the delta between the user's program (represented by the
      * `originalHost`) and the template type-checking program being managed.
      */
    /* private */ var sfMap: Any = js.native
    
    /* private */ var shimExtensionPrefixes: Any = js.native
    
    /**
      * Whether this strategy supports modifying user files (inline modifications) in addition to
      * modifying type-checking shims.
      */
    /* CompleteClass */
    override val supportsInlineOperations: Boolean = js.native
    
    /**
      * Incorporate a set of changes to either augment or completely replace the type-checking code
      * included in the type-checking program.
      */
    /* CompleteClass */
    override def updateFiles(contents: Map[AbsoluteFsPath, FileUpdate], updateMode: UpdateMode): Unit = js.native
  }
}
