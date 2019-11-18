package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolutionBuilderHostBase[T /* <: BuilderProgram */] extends ProgramHost[T] {
  var afterProgramEmitAndDiagnostics: js.UndefOr[js.Function1[/* program */ T, Unit]] = js.native
  var createDirectory: js.UndefOr[js.Function1[/* path */ String, Unit]] = js.native
  var getParsedCommandLine: js.UndefOr[js.Function1[/* fileName */ String, js.UndefOr[ParsedCommandLine]]] = js.native
  @JSName("reportDiagnostic")
  var reportDiagnostic_Original: DiagnosticReporter = js.native
  @JSName("reportSolutionBuilderStatus")
  var reportSolutionBuilderStatus_Original: DiagnosticReporter = js.native
  /**
    * Should provide create directory and writeFile if done of invalidatedProjects is not invoked with
    * writeFileCallback
    */
  var writeFile: js.UndefOr[
    js.Function3[
      /* path */ String, 
      /* data */ String, 
      /* writeByteOrderMark */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  def deleteFile(fileName: String): Unit = js.native
  def getModifiedTime(fileName: String): js.UndefOr[js.Date] = js.native
  def reportDiagnostic(diagnostic: Diagnostic): Unit = js.native
  def reportSolutionBuilderStatus(diagnostic: Diagnostic): Unit = js.native
  def setModifiedTime(fileName: String, date: js.Date): Unit = js.native
}

