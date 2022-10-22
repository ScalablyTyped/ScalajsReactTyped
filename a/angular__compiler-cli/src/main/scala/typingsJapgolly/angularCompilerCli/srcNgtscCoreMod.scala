package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscCoreApiSrcAdapterMod.NgCompilerAdapter
import typingsJapgolly.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.ExtendedTsCompilerHost
import typingsJapgolly.angularCompilerCli.srcNgtscCoreApiSrcOptionsMod.NgCompilerOptions
import typingsJapgolly.angularCompilerCli.srcNgtscCoreSrcCompilerMod.CompilationTicket
import typingsJapgolly.angularCompilerCli.srcNgtscCoreSrcCompilerMod.IncrementalResourceCompilationTicket
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalState
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcStrategyMod.IncrementalBuildStrategy
import typingsJapgolly.angularCompilerCli.srcNgtscPerfMod.ActivePerfRecorder
import typingsJapgolly.angularCompilerCli.srcNgtscProgramDriverSrcApiMod.ProgramDriver
import typingsJapgolly.angularCompilerCli.srcNgtscShimsApiMod.FactoryTracker
import typingsJapgolly.angularCompilerCli.srcNgtscShimsMod.ShimAdapter
import typingsJapgolly.angularCompilerCli.srcNgtscShimsMod.ShimReferenceTagger
import typingsJapgolly.std.Set
import typingsJapgolly.typescript.mod.CompilerHost
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscCoreMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/core", "CompilationTicketKind")
  @js.native
  object CompilationTicketKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.angularCompilerCli.srcNgtscCoreSrcCompilerMod.CompilationTicketKind & Double
      ] = js.native
    
    /* 0 */ val Fresh: typingsJapgolly.angularCompilerCli.srcNgtscCoreSrcCompilerMod.CompilationTicketKind.Fresh & Double = js.native
    
    /* 2 */ val IncrementalResource: typingsJapgolly.angularCompilerCli.srcNgtscCoreSrcCompilerMod.CompilationTicketKind.IncrementalResource & Double = js.native
    
    /* 1 */ val IncrementalTypeScript: typingsJapgolly.angularCompilerCli.srcNgtscCoreSrcCompilerMod.CompilationTicketKind.IncrementalTypeScript & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/core", "NgCompiler")
  @js.native
  /* private */ open class NgCompiler ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscCoreSrcCompilerMod.NgCompiler
  /* static members */
  object NgCompiler {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/core", "NgCompiler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert a `CompilationTicket` into an `NgCompiler` instance for the requested compilation.
      *
      * Depending on the nature of the compilation request, the `NgCompiler` instance may be reused
      * from a previous compilation and updated with any changes, it may be a new instance which
      * incrementally reuses state from a previous compilation, or it may represent a fresh
      * compilation entirely.
      */
    inline def fromTicket(ticket: CompilationTicket, adapter: NgCompilerAdapter): typingsJapgolly.angularCompilerCli.srcNgtscCoreSrcCompilerMod.NgCompiler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTicket")(ticket.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscCoreSrcCompilerMod.NgCompiler]
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/core", "NgCompilerHost")
  @js.native
  open class NgCompilerHost protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscCoreSrcHostMod.NgCompilerHost {
    def this(
      delegate: ExtendedTsCompilerHost,
      inputFiles: js.Array[String],
      rootDirs: js.Array[AbsoluteFsPath],
      shimAdapter: ShimAdapter,
      shimTagger: ShimReferenceTagger,
      entryPoint: Null,
      factoryTracker: Null,
      diagnostics: js.Array[Diagnostic]
    ) = this()
    def this(
      delegate: ExtendedTsCompilerHost,
      inputFiles: js.Array[String],
      rootDirs: js.Array[AbsoluteFsPath],
      shimAdapter: ShimAdapter,
      shimTagger: ShimReferenceTagger,
      entryPoint: Null,
      factoryTracker: FactoryTracker,
      diagnostics: js.Array[Diagnostic]
    ) = this()
    def this(
      delegate: ExtendedTsCompilerHost,
      inputFiles: js.Array[String],
      rootDirs: js.Array[AbsoluteFsPath],
      shimAdapter: ShimAdapter,
      shimTagger: ShimReferenceTagger,
      entryPoint: AbsoluteFsPath,
      factoryTracker: Null,
      diagnostics: js.Array[Diagnostic]
    ) = this()
    def this(
      delegate: ExtendedTsCompilerHost,
      inputFiles: js.Array[String],
      rootDirs: js.Array[AbsoluteFsPath],
      shimAdapter: ShimAdapter,
      shimTagger: ShimReferenceTagger,
      entryPoint: AbsoluteFsPath,
      factoryTracker: FactoryTracker,
      diagnostics: js.Array[Diagnostic]
    ) = this()
  }
  /* static members */
  object NgCompilerHost {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/core", "NgCompilerHost")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an `NgCompilerHost` from a delegate host, an array of input filenames, and the full set
      * of TypeScript and Angular compiler options.
      */
    inline def wrap(delegate: CompilerHost, inputFiles: js.Array[String], options: NgCompilerOptions): typingsJapgolly.angularCompilerCli.anon.NgCompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(delegate.asInstanceOf[js.Any], inputFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.anon.NgCompilerHost]
    inline def wrap(
      delegate: CompilerHost,
      inputFiles: js.Array[String],
      options: NgCompilerOptions,
      oldProgram: Program
    ): typingsJapgolly.angularCompilerCli.anon.NgCompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(delegate.asInstanceOf[js.Any], inputFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.anon.NgCompilerHost]
  }
  
  inline def freshCompilationTicket(
    tsProgram: Program,
    options: NgCompilerOptions,
    incrementalBuildStrategy: IncrementalBuildStrategy,
    programDriver: ProgramDriver,
    perfRecorder: Null,
    enableTemplateTypeChecker: Boolean,
    usePoisonedData: Boolean
  ): CompilationTicket = (^.asInstanceOf[js.Dynamic].applyDynamic("freshCompilationTicket")(tsProgram.asInstanceOf[js.Any], options.asInstanceOf[js.Any], incrementalBuildStrategy.asInstanceOf[js.Any], programDriver.asInstanceOf[js.Any], perfRecorder.asInstanceOf[js.Any], enableTemplateTypeChecker.asInstanceOf[js.Any], usePoisonedData.asInstanceOf[js.Any])).asInstanceOf[CompilationTicket]
  inline def freshCompilationTicket(
    tsProgram: Program,
    options: NgCompilerOptions,
    incrementalBuildStrategy: IncrementalBuildStrategy,
    programDriver: ProgramDriver,
    perfRecorder: ActivePerfRecorder,
    enableTemplateTypeChecker: Boolean,
    usePoisonedData: Boolean
  ): CompilationTicket = (^.asInstanceOf[js.Dynamic].applyDynamic("freshCompilationTicket")(tsProgram.asInstanceOf[js.Any], options.asInstanceOf[js.Any], incrementalBuildStrategy.asInstanceOf[js.Any], programDriver.asInstanceOf[js.Any], perfRecorder.asInstanceOf[js.Any], enableTemplateTypeChecker.asInstanceOf[js.Any], usePoisonedData.asInstanceOf[js.Any])).asInstanceOf[CompilationTicket]
  
  inline def incrementalFromCompilerTicket(
    oldCompiler: typingsJapgolly.angularCompilerCli.srcNgtscCoreSrcCompilerMod.NgCompiler,
    newProgram: Program,
    incrementalBuildStrategy: IncrementalBuildStrategy,
    programDriver: ProgramDriver,
    modifiedResourceFiles: Set[AbsoluteFsPath]
  ): CompilationTicket = (^.asInstanceOf[js.Dynamic].applyDynamic("incrementalFromCompilerTicket")(oldCompiler.asInstanceOf[js.Any], newProgram.asInstanceOf[js.Any], incrementalBuildStrategy.asInstanceOf[js.Any], programDriver.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any])).asInstanceOf[CompilationTicket]
  inline def incrementalFromCompilerTicket(
    oldCompiler: typingsJapgolly.angularCompilerCli.srcNgtscCoreSrcCompilerMod.NgCompiler,
    newProgram: Program,
    incrementalBuildStrategy: IncrementalBuildStrategy,
    programDriver: ProgramDriver,
    modifiedResourceFiles: Set[AbsoluteFsPath],
    perfRecorder: ActivePerfRecorder
  ): CompilationTicket = (^.asInstanceOf[js.Dynamic].applyDynamic("incrementalFromCompilerTicket")(oldCompiler.asInstanceOf[js.Any], newProgram.asInstanceOf[js.Any], incrementalBuildStrategy.asInstanceOf[js.Any], programDriver.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perfRecorder.asInstanceOf[js.Any])).asInstanceOf[CompilationTicket]
  
  inline def incrementalFromStateTicket(
    oldProgram: Program,
    oldState: IncrementalState,
    newProgram: Program,
    options: NgCompilerOptions,
    incrementalBuildStrategy: IncrementalBuildStrategy,
    programDriver: ProgramDriver,
    modifiedResourceFiles: Set[AbsoluteFsPath],
    perfRecorder: Null,
    enableTemplateTypeChecker: Boolean,
    usePoisonedData: Boolean
  ): CompilationTicket = (^.asInstanceOf[js.Dynamic].applyDynamic("incrementalFromStateTicket")(oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], newProgram.asInstanceOf[js.Any], options.asInstanceOf[js.Any], incrementalBuildStrategy.asInstanceOf[js.Any], programDriver.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perfRecorder.asInstanceOf[js.Any], enableTemplateTypeChecker.asInstanceOf[js.Any], usePoisonedData.asInstanceOf[js.Any])).asInstanceOf[CompilationTicket]
  inline def incrementalFromStateTicket(
    oldProgram: Program,
    oldState: IncrementalState,
    newProgram: Program,
    options: NgCompilerOptions,
    incrementalBuildStrategy: IncrementalBuildStrategy,
    programDriver: ProgramDriver,
    modifiedResourceFiles: Set[AbsoluteFsPath],
    perfRecorder: ActivePerfRecorder,
    enableTemplateTypeChecker: Boolean,
    usePoisonedData: Boolean
  ): CompilationTicket = (^.asInstanceOf[js.Dynamic].applyDynamic("incrementalFromStateTicket")(oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], newProgram.asInstanceOf[js.Any], options.asInstanceOf[js.Any], incrementalBuildStrategy.asInstanceOf[js.Any], programDriver.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perfRecorder.asInstanceOf[js.Any], enableTemplateTypeChecker.asInstanceOf[js.Any], usePoisonedData.asInstanceOf[js.Any])).asInstanceOf[CompilationTicket]
  
  inline def isAngularCorePackage(program: Program): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAngularCorePackage")(program.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resourceChangeTicket(
    compiler: typingsJapgolly.angularCompilerCli.srcNgtscCoreSrcCompilerMod.NgCompiler,
    modifiedResourceFiles: Set[String]
  ): IncrementalResourceCompilationTicket = (^.asInstanceOf[js.Dynamic].applyDynamic("resourceChangeTicket")(compiler.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any])).asInstanceOf[IncrementalResourceCompilationTicket]
}
