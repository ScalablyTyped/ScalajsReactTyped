package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscPerfMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "ActivePerfRecorder")
  @js.native
  /* private */ open class ActivePerfRecorder ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcRecorderMod.ActivePerfRecorder
  /* static members */
  object ActivePerfRecorder {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/perf", "ActivePerfRecorder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an `ActivePerfRecorder` with its zero point set to the current time.
      */
    inline def zeroedToNow(): typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcRecorderMod.ActivePerfRecorder = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroedToNow")().asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcRecorderMod.ActivePerfRecorder]
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "DelegatingPerfRecorder")
  @js.native
  open class DelegatingPerfRecorder protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcRecorderMod.DelegatingPerfRecorder {
    def this(target: PerfRecorder) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "NOOP_PERF_RECORDER")
  @js.native
  val NOOP_PERF_RECORDER: PerfRecorder = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "PerfCheckpoint")
  @js.native
  object PerfCheckpoint extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint & Double] = js.native
    
    /* 3 */ val Analysis: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.Analysis & Double = js.native
    
    /* 8 */ val Emit: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.Emit & Double = js.native
    
    /* 0 */ val Initial: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.Initial & Double = js.native
    
    /* 9 */ val LAST: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.LAST & Double = js.native
    
    /* 2 */ val PreAnalysis: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.PreAnalysis & Double = js.native
    
    /* 7 */ val PreEmit: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.PreEmit & Double = js.native
    
    /* 4 */ val Resolve: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.Resolve & Double = js.native
    
    /* 5 */ val TtcGeneration: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.TtcGeneration & Double = js.native
    
    /* 6 */ val TtcUpdateProgram: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.TtcUpdateProgram & Double = js.native
    
    /* 1 */ val TypeScriptProgramCreate: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfCheckpoint.TypeScriptProgramCreate & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "PerfEvent")
  @js.native
  object PerfEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent & Double] = js.native
    
    /* 2 */ val AnalyzeComponent: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.AnalyzeComponent & Double = js.native
    
    /* 3 */ val AnalyzeDirective: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.AnalyzeDirective & Double = js.native
    
    /* 4 */ val AnalyzeInjectable: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.AnalyzeInjectable & Double = js.native
    
    /* 5 */ val AnalyzeNgModule: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.AnalyzeNgModule & Double = js.native
    
    /* 6 */ val AnalyzePipe: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.AnalyzePipe & Double = js.native
    
    /* 16 */ val EmitSkipSourceFile: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.EmitSkipSourceFile & Double = js.native
    
    /* 17 */ val EmitSourceFile: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.EmitSourceFile & Double = js.native
    
    /* 12 */ val GenerateTcb: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.GenerateTcb & Double = js.native
    
    /* 0 */ val InputDtsFile: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.InputDtsFile & Double = js.native
    
    /* 1 */ val InputTsFile: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.InputTsFile & Double = js.native
    
    /* 18 */ val LAST: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.LAST & Double = js.native
    
    /* 14 */ val ReuseTypeCheckFile: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.ReuseTypeCheckFile & Double = js.native
    
    /* 13 */ val SkipGenerateTcbNoInline: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.SkipGenerateTcbNoInline & Double = js.native
    
    /* 10 */ val SourceFileLogicalChange: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.SourceFileLogicalChange & Double = js.native
    
    /* 9 */ val SourceFilePhysicalChange: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.SourceFilePhysicalChange & Double = js.native
    
    /* 11 */ val SourceFileReuseAnalysis: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.SourceFileReuseAnalysis & Double = js.native
    
    /* 7 */ val TraitAnalyze: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.TraitAnalyze & Double = js.native
    
    /* 8 */ val TraitReuseAnalysis: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.TraitReuseAnalysis & Double = js.native
    
    /* 15 */ val UpdateTypeCheckProgram: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfEvent.UpdateTypeCheckProgram & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf", "PerfPhase")
  @js.native
  object PerfPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase & Double] = js.native
    
    /* 6 */ val Analysis: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.Analysis & Double = js.native
    
    /* 12 */ val Compile: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.Compile & Double = js.native
    
    /* 8 */ val CycleDetection: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.CycleDetection & Double = js.native
    
    /* 24 */ val LAST: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LAST & Double = js.native
    
    /* 25 */ val LsCodeFixes: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsCodeFixes & Double = js.native
    
    /* 26 */ val LsCodeFixesAll: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsCodeFixesAll & Double = js.native
    
    /* 19 */ val LsCompletions: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsCompletions & Double = js.native
    
    /* 22 */ val LsComponentLocations: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsComponentLocations & Double = js.native
    
    /* 18 */ val LsDefinition: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsDefinition & Double = js.native
    
    /* 21 */ val LsDiagnostics: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsDiagnostics & Double = js.native
    
    /* 17 */ val LsQuickInfo: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsQuickInfo & Double = js.native
    
    /* 16 */ val LsReferencesAndRenames: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsReferencesAndRenames & Double = js.native
    
    /* 23 */ val LsSignatureHelp: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsSignatureHelp & Double = js.native
    
    /* 20 */ val LsTcb: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.LsTcb & Double = js.native
    
    /* 3 */ val Reconciliation: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.Reconciliation & Double = js.native
    
    /* 7 */ val Resolve: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.Resolve & Double = js.native
    
    /* 4 */ val ResourceUpdate: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.ResourceUpdate & Double = js.native
    
    /* 1 */ val Setup: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.Setup & Double = js.native
    
    /* 9 */ val TcbGeneration: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TcbGeneration & Double = js.native
    
    /* 10 */ val TcbUpdateProgram: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TcbUpdateProgram & Double = js.native
    
    /* 13 */ val TtcAutocompletion: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TtcAutocompletion & Double = js.native
    
    /* 14 */ val TtcDiagnostics: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TtcDiagnostics & Double = js.native
    
    /* 15 */ val TtcSymbol: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TtcSymbol & Double = js.native
    
    /* 5 */ val TypeScriptDiagnostics: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TypeScriptDiagnostics & Double = js.native
    
    /* 11 */ val TypeScriptEmit: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TypeScriptEmit & Double = js.native
    
    /* 2 */ val TypeScriptProgramCreate: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.TypeScriptProgramCreate & Double = js.native
    
    /* 0 */ val Unaccounted: typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfPhase.Unaccounted & Double = js.native
  }
}
