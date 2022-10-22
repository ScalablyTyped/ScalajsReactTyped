package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.typescript.mod.BuilderProgram
import typingsJapgolly.typescript.mod.CreateProgram_
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.DiagnosticReporter
import typingsJapgolly.typescript.mod.ParsedCommandLine
import typingsJapgolly.typescript.mod.SolutionBuilderWithWatchHost
import typingsJapgolly.typescript.mod.WatchStatusReporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWorkerLibHostWatchSolutionBuilderHostMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/worker/lib/host/watch-solution-builder-host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWatchSolutionBuilderHost[TProgram /* <: BuilderProgram */](
    parsedConfig: ParsedCommandLine,
    createProgram: js.UndefOr[CreateProgram_[TProgram]],
    reportDiagnostic: js.UndefOr[DiagnosticReporter],
    reportWatchStatus: js.UndefOr[WatchStatusReporter],
    reportSolutionBuilderStatus: js.UndefOr[js.Function1[/* diagnostic */ Diagnostic, Unit]],
    afterProgramCreate: js.UndefOr[js.Function1[/* program */ TProgram, Unit]],
    afterProgramEmitAndDiagnostics: js.UndefOr[js.Function1[/* program */ TProgram, Unit]]
  ): SolutionBuilderWithWatchHost[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchSolutionBuilderHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], afterProgramEmitAndDiagnostics.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[TProgram]]
}
