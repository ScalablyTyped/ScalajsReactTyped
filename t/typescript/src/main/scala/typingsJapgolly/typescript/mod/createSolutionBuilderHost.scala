package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createSolutionBuilderHost")
@js.native
object createSolutionBuilderHost extends js.Object {
  def apply[T /* <: BuilderProgram */](): SolutionBuilderHost[T] = js.native
  def apply[T /* <: BuilderProgram */](system: System): SolutionBuilderHost[T] = js.native
  def apply[T /* <: BuilderProgram */](system: System, createProgram: CreateProgram_[T]): SolutionBuilderHost[T] = js.native
  def apply[T /* <: BuilderProgram */](system: System, createProgram: CreateProgram_[T], reportDiagnostic: DiagnosticReporter): SolutionBuilderHost[T] = js.native
  def apply[T /* <: BuilderProgram */](
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: DiagnosticReporter,
    reportSolutionBuilderStatus: DiagnosticReporter
  ): SolutionBuilderHost[T] = js.native
  def apply[T /* <: BuilderProgram */](
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: DiagnosticReporter,
    reportSolutionBuilderStatus: DiagnosticReporter,
    reportErrorSummary: ReportEmitErrorSummary
  ): SolutionBuilderHost[T] = js.native
}

