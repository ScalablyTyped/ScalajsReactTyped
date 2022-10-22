package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexOffice.Office.CommandBar
import typingsJapgolly.activexOffice.Office.CommandBars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Global extends StObject {
  
  val ActiveDocument: Document = js.native
  
  var ActivePrinter: String = js.native
  
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  
  val ActiveWindow: Window = js.native
  
  val AddIns: typingsJapgolly.activexWord.Word.AddIns = js.native
  
  val AnswerWizard: typingsJapgolly.activexOffice.Office.AnswerWizard = js.native
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  val Assistant: typingsJapgolly.activexOffice.Office.Assistant = js.native
  
  val AutoCaptions: typingsJapgolly.activexWord.Word.AutoCaptions = js.native
  
  val AutoCorrect: typingsJapgolly.activexWord.Word.AutoCorrect = js.native
  
  val AutoCorrectEmail: typingsJapgolly.activexWord.Word.AutoCorrect = js.native
  
  def BuildKeyCode(Arg1: WdKey): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: Any, Arg3: Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: Any, Arg3: Any, Arg4: Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: Any, Arg3: Unit, Arg4: Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: Unit, Arg3: Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: Unit, Arg3: Any, Arg4: Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: Unit, Arg3: Unit, Arg4: Any): Double = js.native
  
  val CaptionLabels: typingsJapgolly.activexWord.Word.CaptionLabels = js.native
  
  def CentimetersToPoints(Centimeters: Double): Double = js.native
  
  def ChangeFileOpenDirectory(Path: String): Unit = js.native
  
  def CheckSpelling(
    Word: String,
    CustomDictionary: js.UndefOr[Any],
    IgnoreUppercase: js.UndefOr[Any],
    MainDictionary: js.UndefOr[Any],
    CustomDictionary2: js.UndefOr[Any],
    CustomDictionary3: js.UndefOr[Any],
    CustomDictionary4: js.UndefOr[Any],
    CustomDictionary5: js.UndefOr[Any],
    CustomDictionary6: js.UndefOr[Any],
    CustomDictionary7: js.UndefOr[Any],
    CustomDictionary8: js.UndefOr[Any],
    CustomDictionary9: js.UndefOr[Any],
    CustomDictionary10: js.UndefOr[Any]
  ): Boolean = js.native
  
  def CleanString(String: String): String = js.native
  
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  
  val Creator: Double = js.native
  
  val CustomDictionaries: Dictionaries = js.native
  
  var CustomizationContext: Any = js.native
  
  def DDEExecute(Channel: Double, Command: String): Unit = js.native
  
  def DDEInitiate(App: String, Topic: String): Double = js.native
  
  def DDEPoke(Channel: Double, Item: String, Data: String): Unit = js.native
  
  def DDERequest(Channel: Double, Item: String): String = js.native
  
  def DDETerminate(Channel: Double): Unit = js.native
  
  def DDETerminateAll(): Unit = js.native
  
  val Dialogs: typingsJapgolly.activexWord.Word.Dialogs = js.native
  
  val Documents: typingsJapgolly.activexWord.Word.Documents = js.native
  
  val FileConverters: typingsJapgolly.activexWord.Word.FileConverters = js.native
  
  def FindKey(KeyCode: Double): KeyBinding = js.native
  def FindKey(KeyCode: Double, KeyCode2: Any): KeyBinding = js.native
  
  val FontNames: typingsJapgolly.activexWord.Word.FontNames = js.native
  
  def GetSpellingSuggestions(
    Word: String,
    CustomDictionary: js.UndefOr[Any],
    IgnoreUppercase: js.UndefOr[Any],
    MainDictionary: js.UndefOr[Any],
    SuggestionMode: js.UndefOr[Any],
    CustomDictionary2: js.UndefOr[Any],
    CustomDictionary3: js.UndefOr[Any],
    CustomDictionary4: js.UndefOr[Any],
    CustomDictionary5: js.UndefOr[Any],
    CustomDictionary6: js.UndefOr[Any],
    CustomDictionary7: js.UndefOr[Any],
    CustomDictionary8: js.UndefOr[Any],
    CustomDictionary9: js.UndefOr[Any],
    CustomDictionary10: js.UndefOr[Any]
  ): SpellingSuggestions = js.native
  
  val HangulHanjaDictionaries: HangulHanjaConversionDictionaries = js.native
  
  def Help(HelpType: Any): Unit = js.native
  
  def InchesToPoints(Inches: Double): Double = js.native
  
  def IsObjectValid(Object: Any): Boolean = js.native
  
  val IsSandboxed: Boolean = js.native
  
  val KeyBindings: typingsJapgolly.activexWord.Word.KeyBindings = js.native
  
  def KeyString(KeyCode: Double): String = js.native
  def KeyString(KeyCode: Double, KeyCode2: Any): String = js.native
  
  def KeysBoundTo(KeyCategory: WdKeyCategory, Command: String): typingsJapgolly.activexWord.Word.KeysBoundTo = js.native
  def KeysBoundTo(KeyCategory: WdKeyCategory, Command: String, CommandParameter: Any): typingsJapgolly.activexWord.Word.KeysBoundTo = js.native
  
  val LandscapeFontNames: typingsJapgolly.activexWord.Word.FontNames = js.native
  
  val LanguageSettings: typingsJapgolly.activexOffice.Office.LanguageSettings = js.native
  
  val Languages: typingsJapgolly.activexWord.Word.Languages = js.native
  
  def LinesToPoints(Lines: Double): Double = js.native
  
  val ListGalleries: typingsJapgolly.activexWord.Word.ListGalleries = js.native
  
  val MacroContainer: Any = js.native
  
  def MillimetersToPoints(Millimeters: Double): Double = js.native
  
  val Name: String = js.native
  
  def NewWindow(): Window = js.native
  
  val NormalTemplate: Template = js.native
  
  val Options: typingsJapgolly.activexWord.Word.Options = js.native
  
  val Parent: Any = js.native
  
  def PicasToPoints(Picas: Double): Double = js.native
  
  def PixelsToPoints(Pixels: Double): Double = js.native
  def PixelsToPoints(Pixels: Double, fVertical: Any): Double = js.native
  
  def PointsToCentimeters(Points: Double): Double = js.native
  
  def PointsToInches(Points: Double): Double = js.native
  
  def PointsToLines(Points: Double): Double = js.native
  
  def PointsToMillimeters(Points: Double): Double = js.native
  
  def PointsToPicas(Points: Double): Double = js.native
  
  def PointsToPixels(Points: Double): Double = js.native
  def PointsToPixels(Points: Double, fVertical: Any): Double = js.native
  
  val PortraitFontNames: typingsJapgolly.activexWord.Word.FontNames = js.native
  
  var PrintPreview: Boolean = js.native
  
  val ProtectedViewWindows: typingsJapgolly.activexWord.Word.ProtectedViewWindows = js.native
  
  val RecentFiles: typingsJapgolly.activexWord.Word.RecentFiles = js.native
  
  def Repeat(): Boolean = js.native
  def Repeat(Times: Any): Boolean = js.native
  
  val Selection: typingsJapgolly.activexWord.Word.Selection = js.native
  
  var ShowVisualBasicEditor: Boolean = js.native
  
  val StatusBar: String = js.native
  
  def SynonymInfo(Word: String): typingsJapgolly.activexWord.Word.SynonymInfo = js.native
  def SynonymInfo(Word: String, LanguageID: Any): typingsJapgolly.activexWord.Word.SynonymInfo = js.native
  
  val System: typingsJapgolly.activexWord.Word.System = js.native
  
  val Tasks: typingsJapgolly.activexWord.Word.Tasks = js.native
  
  val Templates: typingsJapgolly.activexWord.Word.Templates = js.native
  
  val VBE: typingsJapgolly.activexVbide.VBIDE.VBE = js.native
  
  val Windows: typingsJapgolly.activexWord.Word.Windows = js.native
  
  val WordBasic: Any = js.native
  
  /* private */ @JSName("Word.Global_typekey")
  var WordDotGlobal_typekey: Global = js.native
}
