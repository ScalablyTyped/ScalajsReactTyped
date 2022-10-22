package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexExcel.activexExcelBooleans.`true`
import typingsJapgolly.activexOffice.Office.MsoEnvelope
import typingsJapgolly.activexOffice.Office.MsoLanguageID
import typingsJapgolly.activexOffice.Office.Script
import typingsJapgolly.activexOffice.Office.Scripts
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Worksheet
  extends StObject
     with Sheet {
  
  def Activate(): Unit = js.native
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  def Arcs(): Any = js.native
  def Arcs(Index: Any): Any = js.native
  
  val AutoFilter: typingsJapgolly.activexExcel.Excel.AutoFilter = js.native
  
  var AutoFilterMode: Boolean = js.native
  
  def Buttons(): Any = js.native
  def Buttons(Index: Any): Any = js.native
  
  def Calculate(): Unit = js.native
  
  def Cells(Address: String): Range = js.native
  def Cells(RowIndex: Double): Range = js.native
  def Cells(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Cells")
  val Cells_Original: Range = js.native
  
  def ChartObjects(): typingsJapgolly.activexExcel.Excel.ChartObjects = js.native
  def ChartObjects(Index: String): ChartObject = js.native
  def ChartObjects(Index: Double): ChartObject = js.native
  def ChartObjects(Index: SafeArray[String | Double]): typingsJapgolly.activexExcel.Excel.ChartObjects = js.native
  
  def CheckBoxes(): Any = js.native
  def CheckBoxes(Index: Any): Any = js.native
  
  def CheckSpelling(): Unit = js.native
  def CheckSpelling(CustomDictionary: String): Unit = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Boolean): Unit = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Boolean, AlwaysSuggest: Boolean): Unit = js.native
  def CheckSpelling(
    CustomDictionary: String,
    IgnoreUppercase: Boolean,
    AlwaysSuggest: Boolean,
    SpellLang: MsoLanguageID
  ): Unit = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Boolean, AlwaysSuggest: Unit, SpellLang: MsoLanguageID): Unit = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Unit, AlwaysSuggest: Boolean): Unit = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Unit, AlwaysSuggest: Boolean, SpellLang: MsoLanguageID): Unit = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Unit, AlwaysSuggest: Unit, SpellLang: MsoLanguageID): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Boolean): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Boolean, AlwaysSuggest: Boolean): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Boolean, AlwaysSuggest: Boolean, SpellLang: MsoLanguageID): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Boolean, AlwaysSuggest: Unit, SpellLang: MsoLanguageID): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Unit, AlwaysSuggest: Boolean): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Unit, AlwaysSuggest: Boolean, SpellLang: MsoLanguageID): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Unit, AlwaysSuggest: Unit, SpellLang: MsoLanguageID): Unit = js.native
  
  def CircleInvalid(): Unit = js.native
  
  def CircularReference(Address: String): Range = js.native
  def CircularReference(RowIndex: Double): Range = js.native
  def CircularReference(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("CircularReference")
  val CircularReference_Original: Range = js.native
  
  def ClearArrows(): Unit = js.native
  
  def ClearCircles(): Unit = js.native
  
  val CodeName: String = js.native
  
  def Columns(Address: String): Range = js.native
  def Columns(RowIndex: Double): Range = js.native
  def Columns(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Columns")
  val Columns_Original: Range = js.native
  
  def Comments(Index: Double): Comment = js.native
  @JSName("Comments")
  val Comments_Original: Comments = js.native
  
  val ConsolidationFunction: XlConsolidationFunction = js.native
  
  val ConsolidationOptions: SafeArray[Boolean] = js.native
  
  val ConsolidationSources: js.UndefOr[SafeArray[String]] = js.native
  
  def Copy(): Unit = js.native
  def Copy(Before: Unit, After: Sheet): Unit = js.native
  def Copy(Before: Sheet): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  def CustomProperties(Index: String): CustomProperty = js.native
  def CustomProperties(Index: Double): CustomProperty = js.native
  @JSName("CustomProperties")
  val CustomProperties_Original: CustomProperties = js.native
  
  def Delete(): Unit = js.native
  
  var DisplayAutomaticPageBreaks: Boolean = js.native
  
  var DisplayPageBreaks: Boolean = js.native
  
  var DisplayRightToLeft: Boolean = js.native
  
  def DrawingObjects(): Any = js.native
  def DrawingObjects(Index: Any): Any = js.native
  
  def Drawings(): Any = js.native
  def Drawings(Index: Any): Any = js.native
  
  def DropDowns(): Any = js.native
  def DropDowns(Index: Any): Any = js.native
  
  var EnableAutoFilter: Boolean = js.native
  
  var EnableCalculation: Boolean = js.native
  
  var EnableFormatConditionsCalculation: Boolean = js.native
  
  var EnableOutlining: Boolean = js.native
  
  var EnablePivotTable: Boolean = js.native
  
  var EnableSelection: XlEnableSelection = js.native
  
  def Evaluate(Name: String): Any = js.native
  
  /* private */ @JSName("Excel.Worksheet_typekey")
  var ExcelDotWorksheet_typekey: Worksheet = js.native
  
  def ExportAsFixedFormat(
    Type: XlFixedFormatType,
    Filename: js.UndefOr[String],
    Quality: js.UndefOr[XlFixedFormatQuality],
    IncludeDocProperties: js.UndefOr[Boolean],
    IgnorePrintAreas: js.UndefOr[Boolean],
    From: js.UndefOr[Double],
    To: js.UndefOr[Double],
    OpenAfterPublish: js.UndefOr[Boolean],
    FixedFormatExtClassPtr: js.UndefOr[Any]
  ): Unit = js.native
  
  val FilterMode: Boolean = js.native
  
  def GroupBoxes(): Any = js.native
  def GroupBoxes(Index: Any): Any = js.native
  
  def GroupObjects(): Any = js.native
  def GroupObjects(Index: Any): Any = js.native
  
  def HPageBreaks(Index: Double): HPageBreak = js.native
  @JSName("HPageBreaks")
  val HPageBreaks_Original: HPageBreaks = js.native
  
  def Hyperlinks(Index: String): Hyperlink = js.native
  def Hyperlinks(Index: Double): Hyperlink = js.native
  @JSName("Hyperlinks")
  val Hyperlinks_Original: Hyperlinks = js.native
  
  val Index: Double = js.native
  
  def Labels(): Any = js.native
  def Labels(Index: Any): Any = js.native
  
  def Lines(): Any = js.native
  def Lines(Index: Any): Any = js.native
  
  def ListBoxes(): Any = js.native
  def ListBoxes(Index: Any): Any = js.native
  
  def ListObjects(Index: String): ListObject = js.native
  def ListObjects(Index: Double): ListObject = js.native
  @JSName("ListObjects")
  val ListObjects_Original: ListObjects = js.native
  
  val MailEnvelope: MsoEnvelope = js.native
  
  def Move(): Unit = js.native
  def Move(Before: Unit, After: Sheet): Unit = js.native
  def Move(Before: Sheet): Unit = js.native
  def Move(Before: Sheet, After: Sheet): Unit = js.native
  
  var Name: String = js.native
  
  def Names(Index: String): Name = js.native
  def Names(Index: Double): Name = js.native
  def Names(Index: Unit, IndexLocal: String): Name = js.native
  def Names(Index: Unit, IndexLocal: Unit, RefersTo: String): Name = js.native
  @JSName("Names")
  val Names_Original: Names = js.native
  
  val Next: Worksheet = js.native
  
  def OLEObjects(): typingsJapgolly.activexExcel.Excel.OLEObjects = js.native
  def OLEObjects(Index: String): OLEObject = js.native
  def OLEObjects(Index: Double): OLEObject = js.native
  
  var OnCalculate: String = js.native
  
  var OnData: String = js.native
  
  var OnDoubleClick: String = js.native
  
  var OnEntry: String = js.native
  
  var OnSheetActivate: String = js.native
  
  var OnSheetDeactivate: String = js.native
  
  def OptionButtons(): Any = js.native
  def OptionButtons(Index: Any): Any = js.native
  
  val Outline: typingsJapgolly.activexExcel.Excel.Outline = js.native
  
  def Ovals(): Any = js.native
  def Ovals(Index: Any): Any = js.native
  
  val PageSetup: typingsJapgolly.activexExcel.Excel.PageSetup = js.native
  
  val Parent: Any = js.native
  
  def Paste(): Unit = js.native
  def Paste(Destination: Unit, Link: Boolean): Unit = js.native
  def Paste(Destination: Range): Unit = js.native
  def Paste(Destination: Range, Link: Boolean): Unit = js.native
  
  def PasteSpecial(): Unit = js.native
  def PasteSpecial(Format: String): Unit = js.native
  def PasteSpecial(Format: String, Link: Boolean): Unit = js.native
  def PasteSpecial(Format: String, Link: Boolean, DisplayAsIcon: Boolean): Unit = js.native
  def PasteSpecial(
    Format: String,
    Link: Boolean,
    DisplayAsIcon: Boolean,
    IconFileName: Unit,
    IconIndex: Unit,
    IconLabel: Unit,
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  def PasteSpecial(
    Format: String,
    Link: Boolean,
    DisplayAsIcon: Unit,
    IconFileName: Unit,
    IconIndex: Unit,
    IconLabel: Unit,
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  def PasteSpecial(Format: String, Link: Unit, DisplayAsIcon: Boolean): Unit = js.native
  def PasteSpecial(
    Format: String,
    Link: Unit,
    DisplayAsIcon: Boolean,
    IconFileName: Unit,
    IconIndex: Unit,
    IconLabel: Unit,
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  def PasteSpecial(
    Format: String,
    Link: Unit,
    DisplayAsIcon: Unit,
    IconFileName: Unit,
    IconIndex: Unit,
    IconLabel: Unit,
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  def PasteSpecial(Format: Unit, Link: Boolean): Unit = js.native
  def PasteSpecial(Format: Unit, Link: Boolean, DisplayAsIcon: Boolean): Unit = js.native
  def PasteSpecial(
    Format: Unit,
    Link: Boolean,
    DisplayAsIcon: Boolean,
    IconFileName: Unit,
    IconIndex: Unit,
    IconLabel: Unit,
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  def PasteSpecial(
    Format: Unit,
    Link: Boolean,
    DisplayAsIcon: Unit,
    IconFileName: Unit,
    IconIndex: Unit,
    IconLabel: Unit,
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  def PasteSpecial(Format: Unit, Link: Unit, DisplayAsIcon: Boolean): Unit = js.native
  def PasteSpecial(
    Format: Unit,
    Link: Unit,
    DisplayAsIcon: Boolean,
    IconFileName: Unit,
    IconIndex: Unit,
    IconLabel: Unit,
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  def PasteSpecial(
    Format: Unit,
    Link: Unit,
    DisplayAsIcon: Unit,
    IconFileName: Unit,
    IconIndex: Unit,
    IconLabel: Unit,
    NoHTMLFormatting: Boolean
  ): Unit = js.native
  @JSName("PasteSpecial")
  def PasteSpecial_true(
    Format: js.UndefOr[String],
    Link: js.UndefOr[Boolean],
    DisplayAsIcon: `true`,
    IconFileName: js.UndefOr[String],
    IconIndex: js.UndefOr[Double],
    IconLabel: js.UndefOr[String],
    NoHTMLFormatting: js.UndefOr[Boolean]
  ): Unit = js.native
  
  def Pictures(): Any = js.native
  def Pictures(Index: Any): Any = js.native
  
  def PivotTableWizard(): Unit = js.native
  def PivotTableWizard[TSourceType](
    SourceType: TSourceType,
    SourceData: PivotTableWizardSourceData[TSourceType],
    TableDestination: js.UndefOr[Range],
    TableName: js.UndefOr[String],
    RowGrand: js.UndefOr[Boolean],
    ColumnGrand: js.UndefOr[Boolean],
    SaveData: js.UndefOr[Boolean],
    HasAutoFormat: js.UndefOr[Boolean],
    AutoPage: js.UndefOr[PivotTableWizardAutoPage[TSourceType]],
    Reserved: Unit,
    BackgroundQuery: js.UndefOr[Boolean],
    OptimizeCache: js.UndefOr[Boolean],
    PageFieldOrder: js.UndefOr[XlOrder],
    PageFieldWrapCount: js.UndefOr[Double],
    ReadData: js.UndefOr[Boolean],
    Connection: js.UndefOr[String]
  ): Unit = js.native
  
  def PivotTables(): Any = js.native
  def PivotTables(Index: Any): Any = js.native
  
  val Previous: Worksheet = js.native
  
  def PrintOut[T /* <: js.UndefOr[Boolean] */](
    From: js.UndefOr[Double],
    To: js.UndefOr[Double],
    Copies: js.UndefOr[Double],
    Preview: js.UndefOr[Boolean],
    ActivePrinter: js.UndefOr[String],
    PrintToFile: js.UndefOr[T],
    Collate: js.UndefOr[Boolean],
    PrToFileName: js.UndefOr[PrintToFileName[T]],
    IgnorePrintAreas: js.UndefOr[Boolean]
  ): Unit = js.native
  
  def PrintPreview(): Unit = js.native
  def PrintPreview(EnableChanges: Boolean): Unit = js.native
  
  val PrintedCommentPages: Double = js.native
  
  def Protect(
    Password: js.UndefOr[String],
    DrawingObjects: js.UndefOr[Boolean],
    Contents: js.UndefOr[Boolean],
    Scenarios: js.UndefOr[Boolean],
    UserInterfaceOnly: js.UndefOr[Boolean],
    AllowFormattingCells: js.UndefOr[Boolean],
    AllowFormattingColumns: js.UndefOr[Boolean],
    AllowFormattingRows: js.UndefOr[Boolean],
    AllowInsertingColumns: js.UndefOr[Boolean],
    AllowInsertingRows: js.UndefOr[Boolean],
    AllowInsertingHyperlinks: js.UndefOr[Boolean],
    AllowDeletingColumns: js.UndefOr[Boolean],
    AllowDeletingRows: js.UndefOr[Boolean],
    AllowSorting: js.UndefOr[Boolean],
    AllowFiltering: js.UndefOr[Boolean],
    AllowUsingPivotTables: js.UndefOr[Boolean]
  ): Unit = js.native
  
  val ProtectContents: Boolean = js.native
  
  val ProtectDrawingObjects: Boolean = js.native
  
  val ProtectScenarios: Boolean = js.native
  
  val Protection: typingsJapgolly.activexExcel.Excel.Protection = js.native
  
  val ProtectionMode: Boolean = js.native
  
  def QueryTables(Index: String): QueryTable = js.native
  def QueryTables(Index: Double): QueryTable = js.native
  @JSName("QueryTables")
  val QueryTables_Original: QueryTables = js.native
  
  def Range(Cell1: String): typingsJapgolly.activexExcel.Excel.Range = js.native
  def Range(Cell1: String, Cell2: String): typingsJapgolly.activexExcel.Excel.Range = js.native
  def Range(Cell1: String, Cell2: typingsJapgolly.activexExcel.Excel.Range): typingsJapgolly.activexExcel.Excel.Range = js.native
  def Range(Cell1: typingsJapgolly.activexExcel.Excel.Range): typingsJapgolly.activexExcel.Excel.Range = js.native
  def Range(Cell1: typingsJapgolly.activexExcel.Excel.Range, Cell2: String): typingsJapgolly.activexExcel.Excel.Range = js.native
  def Range(Cell1: typingsJapgolly.activexExcel.Excel.Range, Cell2: typingsJapgolly.activexExcel.Excel.Range): typingsJapgolly.activexExcel.Excel.Range = js.native
  
  def Rectangles(): Any = js.native
  def Rectangles(Index: Any): Any = js.native
  
  def ResetAllPageBreaks(): Unit = js.native
  
  def Rows(Address: String): Range = js.native
  def Rows(RowIndex: Double): Range = js.native
  def Rows(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Rows")
  val Rows_Original: Range = js.native
  
  def SaveAs(
    Filename: String,
    FileFormat: js.UndefOr[XlFileFormat],
    Password: js.UndefOr[String],
    WriteResPassword: js.UndefOr[String],
    ReadOnlyRecommended: js.UndefOr[Boolean],
    CreateBackup: js.UndefOr[Boolean],
    AddToMru: js.UndefOr[Boolean],
    TextCodepage: js.UndefOr[Any],
    TextVisualLayout: js.UndefOr[Any],
    Local: js.UndefOr[Boolean]
  ): Unit = js.native
  
  def Scenarios(): typingsJapgolly.activexExcel.Excel.Scenarios = js.native
  def Scenarios(Index: String): Scenario = js.native
  def Scenarios(Index: Double): Scenario = js.native
  def Scenarios(Index: SafeArray[Double | String]): typingsJapgolly.activexExcel.Excel.Scenarios = js.native
  
  def Scripts(Index: Any): Script = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  
  var ScrollArea: String = js.native
  
  def ScrollBars(): Any = js.native
  def ScrollBars(Index: Any): Any = js.native
  
  def Select(): Unit = js.native
  def Select(Replace: Boolean): Unit = js.native
  
  def SetBackgroundPicture(Filename: String): Unit = js.native
  
  def Shapes(Index: String): Shape = js.native
  def Shapes(Index: Double): Shape = js.native
  @JSName("Shapes")
  val Shapes_Original: Shapes = js.native
  
  def ShowAllData(): Unit = js.native
  
  def ShowDataForm(): Unit = js.native
  
  def SmartTags(Index: Any): SmartTag = js.native
  @JSName("SmartTags")
  val SmartTags_Original: SmartTags = js.native
  
  val Sort: typingsJapgolly.activexExcel.Excel.Sort = js.native
  
  def Spinners(): Any = js.native
  def Spinners(Index: Any): Any = js.native
  
  val StandardHeight: Double = js.native
  
  var StandardWidth: Double = js.native
  
  val Tab: typingsJapgolly.activexExcel.Excel.Tab = js.native
  
  def TextBoxes(): Any = js.native
  def TextBoxes(Index: Any): Any = js.native
  
  var TransitionExpEval: Boolean = js.native
  
  var TransitionFormEntry: Boolean = js.native
  
  val Type: XlSheetType = js.native
  
  def Unprotect(): Unit = js.native
  def Unprotect(Password: String): Unit = js.native
  
  def UsedRange(Address: String): Range = js.native
  def UsedRange(RowIndex: Double): Range = js.native
  def UsedRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("UsedRange")
  val UsedRange_Original: Range = js.native
  
  def VPageBreaks(Index: Double): VPageBreak = js.native
  @JSName("VPageBreaks")
  val VPageBreaks_Original: VPageBreaks = js.native
  
  var Visible: XlSheetVisibility = js.native
  
  def XmlDataQuery(XPath: String): Range | Null = js.native
  def XmlDataQuery(XPath: String, SelectionNamespaces: String): Range | Null = js.native
  def XmlDataQuery(XPath: String, SelectionNamespaces: String, Map: XmlMap): Range | Null = js.native
  def XmlDataQuery(XPath: String, SelectionNamespaces: Unit, Map: XmlMap): Range | Null = js.native
  
  def XmlMapQuery(XPath: String): Range = js.native
  def XmlMapQuery(XPath: String, SelectionNamespaces: String): Range = js.native
  def XmlMapQuery(XPath: String, SelectionNamespaces: String, Map: XmlMap): Range = js.native
  def XmlMapQuery(XPath: String, SelectionNamespaces: Unit, Map: XmlMap): Range = js.native
  
  def _CheckSpelling(
    CustomDictionary: js.UndefOr[Any],
    IgnoreUppercase: js.UndefOr[Any],
    AlwaysSuggest: js.UndefOr[Any],
    SpellLang: js.UndefOr[Any],
    IgnoreFinalYaa: js.UndefOr[Any],
    SpellScript: js.UndefOr[Any]
  ): Unit = js.native
  
  var _CodeName: String = js.native
  
  var _DisplayRightToLeft: Double = js.native
  
  def _Evaluate(Name: Any): Any = js.native
  
  def _PasteSpecial(
    Format: js.UndefOr[Any],
    Link: js.UndefOr[Any],
    DisplayAsIcon: js.UndefOr[Any],
    IconFileName: js.UndefOr[Any],
    IconIndex: js.UndefOr[Any],
    IconLabel: js.UndefOr[Any]
  ): Unit = js.native
  
  def _PrintOut(
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Preview: js.UndefOr[Any],
    ActivePrinter: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any],
    PrToFileName: js.UndefOr[Any]
  ): Unit = js.native
  
  def _Protect(): Unit = js.native
  def _Protect(Password: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Any, Scenarios: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Unit, Scenarios: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Any, Scenarios: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Unit, Scenarios: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Any, Scenarios: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Unit, Scenarios: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Any, Scenarios: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Unit, Scenarios: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  
  def _SaveAs(
    Filename: String,
    FileFormat: js.UndefOr[Any],
    Password: js.UndefOr[Any],
    WriteResPassword: js.UndefOr[Any],
    ReadOnlyRecommended: js.UndefOr[Any],
    CreateBackup: js.UndefOr[Any],
    AddToMru: js.UndefOr[Any],
    TextCodepage: js.UndefOr[Any],
    TextVisualLayout: js.UndefOr[Any]
  ): Unit = js.native
  
  def __PrintOut(
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Preview: js.UndefOr[Any],
    ActivePrinter: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any]
  ): Unit = js.native
}
