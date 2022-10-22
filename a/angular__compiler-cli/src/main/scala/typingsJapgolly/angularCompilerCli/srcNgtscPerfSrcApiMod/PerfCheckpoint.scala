package typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PerfCheckpoint extends StObject
@JSImport("@angular/compiler-cli/src/ngtsc/perf/src/api", "PerfCheckpoint")
@js.native
object PerfCheckpoint extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PerfCheckpoint & Double] = js.native
  
  /**
    * The point just after Angular analysis completes.
    */
  @js.native
  sealed trait Analysis
    extends StObject
       with PerfCheckpoint
  /* 3 */ val Analysis: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.Analysis & Double = js.native
  
  /**
    * The point just after the program has been fully emitted.
    */
  @js.native
  sealed trait Emit
    extends StObject
       with PerfCheckpoint
  /* 8 */ val Emit: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.Emit & Double = js.native
  
  /**
    * The point at which the `PerfRecorder` was created, and ideally tracks memory used before any
    * compilation structures are created.
    */
  @js.native
  sealed trait Initial
    extends StObject
       with PerfCheckpoint
  /* 0 */ val Initial: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.Initial & Double = js.native
  
  /**
    * Tracks the number of `PerfCheckpoint`s, and must appear at the end of the list.
    */
  @js.native
  sealed trait LAST
    extends StObject
       with PerfCheckpoint
  /* 9 */ val LAST: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.LAST & Double = js.native
  
  /**
    * The point just before Angular analysis starts.
    *
    * In the main usage pattern for the compiler, TypeScript diagnostics have been calculated at this
    * point, so the `ts.TypeChecker` has fully ingested the current program, all `ts.Type` structures
    * and `ts.Symbol`s have been created.
    */
  @js.native
  sealed trait PreAnalysis
    extends StObject
       with PerfCheckpoint
  /* 2 */ val PreAnalysis: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.PreAnalysis & Double = js.native
  
  /**
    * The point just before emit begins.
    *
    * In the main usage pattern for the compiler, all template type-checking diagnostics have been
    * requested at this point.
    */
  @js.native
  sealed trait PreEmit
    extends StObject
       with PerfCheckpoint
  /* 7 */ val PreEmit: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.PreEmit & Double = js.native
  
  /**
    * The point just after Angular resolution is complete.
    */
  @js.native
  sealed trait Resolve
    extends StObject
       with PerfCheckpoint
  /* 4 */ val Resolve: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.Resolve & Double = js.native
  
  /**
    * The point just after Type Check Blocks (TCBs) have been generated.
    */
  @js.native
  sealed trait TtcGeneration
    extends StObject
       with PerfCheckpoint
  /* 5 */ val TtcGeneration: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.TtcGeneration & Double = js.native
  
  /**
    * The point just after the template type-checking program has been updated with any new TCBs.
    */
  @js.native
  sealed trait TtcUpdateProgram
    extends StObject
       with PerfCheckpoint
  /* 6 */ val TtcUpdateProgram: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.TtcUpdateProgram & Double = js.native
  
  /**
    * The point just after the `ts.Program` has been created.
    */
  @js.native
  sealed trait TypeScriptProgramCreate
    extends StObject
       with PerfCheckpoint
  /* 1 */ val TypeScriptProgramCreate: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.TypeScriptProgramCreate & Double = js.native
}
