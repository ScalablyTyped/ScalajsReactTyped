package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.CommandBar
import typingsJapgolly.activexOffice.Office.CommandBars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Global")
@js.native
class Global protected () extends js.Object {
  val ActivePresentation: Presentation = js.native
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  val ActiveWindow: DocumentWindow = js.native
  val AddIns: typingsJapgolly.activexPowerpoint.PowerPoint.AddIns = js.native
  val AnswerWizard: typingsJapgolly.activexOffice.Office.AnswerWizard = js.native
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  val Assistant: typingsJapgolly.activexOffice.Office.Assistant = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  val Dialogs: js.Any = js.native
  val FileConverters: typingsJapgolly.activexPowerpoint.PowerPoint.FileConverters = js.native
  val IsSandboxed: Boolean = js.native
  @JSName("PowerPoint.Global_typekey")
  var PowerPointDotGlobal_typekey: Global = js.native
  val Presentations: typingsJapgolly.activexPowerpoint.PowerPoint.Presentations = js.native
  val ProtectedViewWindows: typingsJapgolly.activexPowerpoint.PowerPoint.ProtectedViewWindows = js.native
  val SlideShowWindows: typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowWindows = js.native
  val Windows: DocumentWindows = js.native
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
}

