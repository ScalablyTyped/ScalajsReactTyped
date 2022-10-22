package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.COMAddIn
import typingsJapgolly.activexOffice.Office.COMAddIns
import typingsJapgolly.activexOffice.Office.CommandBar
import typingsJapgolly.activexOffice.Office.CommandBars
import typingsJapgolly.activexOffice.Office.IAssistance
import typingsJapgolly.activexOffice.Office.IFind
import typingsJapgolly.activexOffice.Office.MsoAutomationSecurity
import typingsJapgolly.activexOffice.Office.MsoFeatureInstall
import typingsJapgolly.activexOffice.Office.MsoFileDialogType
import typingsJapgolly.activexOffice.Office.MsoFileValidationMode
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.NewFile
import typingsJapgolly.activexOffice.Office.SmartArtColor
import typingsJapgolly.activexOffice.Office.SmartArtColors
import typingsJapgolly.activexOffice.Office.SmartArtLayout
import typingsJapgolly.activexOffice.Office.SmartArtLayouts
import typingsJapgolly.activexOffice.Office.SmartArtQuickStyle
import typingsJapgolly.activexOffice.Office.SmartArtQuickStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends StObject {
  
  def Activate(): Unit = js.native
  
  val Active: MsoTriState = js.native
  
  val ActiveEncryptionSession: Double = js.native
  
  val ActivePresentation: Presentation = js.native
  
  val ActivePrinter: String = js.native
  
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  
  val ActiveWindow: DocumentWindow = js.native
  
  val AddIns: typingsJapgolly.activexPowerpoint.PowerPoint.AddIns = js.native
  
  val AnswerWizard: typingsJapgolly.activexOffice.Office.AnswerWizard = js.native
  
  val Assistance: IAssistance = js.native
  
  val Assistant: typingsJapgolly.activexOffice.Office.Assistant = js.native
  
  val AutoCorrect: typingsJapgolly.activexPowerpoint.PowerPoint.AutoCorrect = js.native
  
  var AutomationSecurity: MsoAutomationSecurity = js.native
  
  val Build: String = js.native
  
  def COMAddIns(Index: String): COMAddIn = js.native
  def COMAddIns(Index: Double): COMAddIn = js.native
  @JSName("COMAddIns")
  val COMAddIns_Original: COMAddIns = js.native
  
  var Caption: String = js.native
  
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  
  val Creator: Double = js.native
  
  val DefaultWebOptions: typingsJapgolly.activexPowerpoint.PowerPoint.DefaultWebOptions = js.native
  
  val Dialogs: Any = js.native
  
  var DisplayAlerts: PpAlertLevel = js.native
  
  var DisplayDocumentInformationPanel: Boolean = js.native
  
  var DisplayGridLines: MsoTriState = js.native
  
  var FeatureInstall: MsoFeatureInstall = js.native
  
  val FileConverters: typingsJapgolly.activexPowerpoint.PowerPoint.FileConverters = js.native
  
  def FileDialog(Type: MsoFileDialogType): typingsJapgolly.activexOffice.Office.FileDialog = js.native
  
  val FileFind: IFind = js.native
  
  val FileSearch: typingsJapgolly.activexOffice.Office.FileSearch = js.native
  
  var FileValidation: MsoFileValidationMode = js.native
  
  /** @param boolean [Persist=false] */
  def GetOptionFlag(Option: Double): Boolean = js.native
  def GetOptionFlag(Option: Double, Persist: Boolean): Boolean = js.native
  
  var Height: Double = js.native
  
  /**
    * @param string [HelpFile='vbapp10.chm']
    * @param number [ContextID=0]
    */
  def Help(): Unit = js.native
  def Help(HelpFile: String): Unit = js.native
  def Help(HelpFile: String, ContextID: Double): Unit = js.native
  def Help(HelpFile: Unit, ContextID: Double): Unit = js.native
  
  val IsSandboxed: Boolean = js.native
  
  val LanguageSettings: typingsJapgolly.activexOffice.Office.LanguageSettings = js.native
  
  def LaunchPublishSlidesDialog(SlideLibraryUrl: String): Unit = js.native
  
  def LaunchSendToPPTDialog(SlideUrls: Any): Unit = js.native
  
  var Left: Double = js.native
  
  val Marker: Any = js.native
  
  val MsoDebugOptions: typingsJapgolly.activexOffice.Office.MsoDebugOptions = js.native
  
  val Name: String = js.native
  
  val NewPresentation: NewFile = js.native
  
  val OperatingSystem: String = js.native
  
  val Options: typingsJapgolly.activexPowerpoint.PowerPoint.Options = js.native
  
  def PPFileDialog(Type: PpFileDialogType): Any = js.native
  
  val Path: String = js.native
  
  /* private */ @JSName("PowerPoint.Application_typekey")
  var PowerPointDotApplication_typekey: Application = js.native
  
  val Presentations: typingsJapgolly.activexPowerpoint.PowerPoint.Presentations = js.native
  
  val ProductCode: String = js.native
  
  val ProtectedViewWindows: typingsJapgolly.activexPowerpoint.PowerPoint.ProtectedViewWindows = js.native
  
  def Quit(): Unit = js.native
  
  val ResampleMediaTasks: typingsJapgolly.activexPowerpoint.PowerPoint.ResampleMediaTasks = js.native
  
  def Run(MacroName: String, safeArrayOfParams: Any*): Any = js.native
  
  /** @param boolean [Persist=false] */
  def SetOptionFlag(Option: Double, State: Boolean): Unit = js.native
  def SetOptionFlag(Option: Double, State: Boolean, Persist: Boolean): Unit = js.native
  
  def SetPerfMarker(Marker: Double): Unit = js.native
  
  var ShowStartupDialog: MsoTriState = js.native
  
  var ShowWindowsInTaskbar: MsoTriState = js.native
  
  val SlideShowWindows: typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowWindows = js.native
  
  def SmartArtColors(Index: String): SmartArtColor = js.native
  def SmartArtColors(Index: Double): SmartArtColor = js.native
  @JSName("SmartArtColors")
  val SmartArtColors_Original: SmartArtColors = js.native
  
  def SmartArtLayouts(Index: String): SmartArtLayout = js.native
  def SmartArtLayouts(Index: Double): SmartArtLayout = js.native
  @JSName("SmartArtLayouts")
  val SmartArtLayouts_Original: SmartArtLayouts = js.native
  
  def SmartArtQuickStyles(Index: String): SmartArtQuickStyle = js.native
  def SmartArtQuickStyles(Index: Double): SmartArtQuickStyle = js.native
  @JSName("SmartArtQuickStyles")
  val SmartArtQuickStyles_Original: SmartArtQuickStyles = js.native
  
  def StartNewUndoEntry(): Unit = js.native
  
  var Top: Double = js.native
  
  val VBE: typingsJapgolly.activexVbide.VBIDE.VBE = js.native
  
  val Version: String = js.native
  
  var Visible: MsoTriState = js.native
  
  var Width: Double = js.native
  
  var WindowState: PpWindowState = js.native
  
  val Windows: DocumentWindows = js.native
}
