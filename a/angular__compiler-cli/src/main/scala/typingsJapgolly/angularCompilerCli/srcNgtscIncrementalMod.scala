package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalApiMod.IncrementalBuild
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalState
import typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import typingsJapgolly.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIncrementalMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "IncrementalCompilation")
  @js.native
  /* private */ open class IncrementalCompilation ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation
  /* static members */
  object IncrementalCompilation {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "IncrementalCompilation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Begin a fresh `IncrementalCompilation`.
      */
    inline def fresh(program: Program): typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation = ^.asInstanceOf[js.Dynamic].applyDynamic("fresh")(program.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation]
    inline def fresh(program: Program, versions: Map[AbsoluteFsPath, String]): typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("fresh")(program.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation]
    
    inline def incremental(
      program: Program,
      newVersions: Null,
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Null,
      perf: PerfRecorder
    ): typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation]
    inline def incremental(
      program: Program,
      newVersions: Null,
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Set[AbsoluteFsPath],
      perf: PerfRecorder
    ): typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation]
    inline def incremental(
      program: Program,
      newVersions: Map[AbsoluteFsPath, String],
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Null,
      perf: PerfRecorder
    ): typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation]
    inline def incremental(
      program: Program,
      newVersions: Map[AbsoluteFsPath, String],
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Set[AbsoluteFsPath],
      perf: PerfRecorder
    ): typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation]
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "IncrementalStateKind")
  @js.native
  object IncrementalStateKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalStateKind & Double
      ] = js.native
    
    /* 2 */ val Analyzed: typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalStateKind.Analyzed & Double = js.native
    
    /* 1 */ val Delta: typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalStateKind.Delta & Double = js.native
    
    /* 0 */ val Fresh: typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalStateKind.Fresh & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "NOOP_INCREMENTAL_BUILD")
  @js.native
  val NOOP_INCREMENTAL_BUILD: IncrementalBuild[Any, Any] = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "NoopIncrementalBuildStrategy")
  @js.native
  open class NoopIncrementalBuildStrategy ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcStrategyMod.NoopIncrementalBuildStrategy
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "PatchedProgramIncrementalBuildStrategy")
  @js.native
  open class PatchedProgramIncrementalBuildStrategy ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcStrategyMod.PatchedProgramIncrementalBuildStrategy
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "TrackedIncrementalBuildStrategy")
  @js.native
  open class TrackedIncrementalBuildStrategy ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcStrategyMod.TrackedIncrementalBuildStrategy
}
