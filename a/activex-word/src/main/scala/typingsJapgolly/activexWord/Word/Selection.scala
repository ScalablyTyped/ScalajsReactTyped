package typingsJapgolly.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Selection")
@js.native
class Selection protected () extends js.Object {
  val Active: Boolean = js.native
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  val BookmarkID: Double = js.native
  val Bookmarks: typingsJapgolly.activexWord.Word.Bookmarks = js.native
  var Borders: typingsJapgolly.activexWord.Word.Borders = js.native
  val Cells: typingsJapgolly.activexWord.Word.Cells = js.native
  val Characters: typingsJapgolly.activexWord.Word.Characters = js.native
  val ChildShapeRange: typingsJapgolly.activexWord.Word.ShapeRange = js.native
  var ColumnSelectMode: Boolean = js.native
  val Columns: typingsJapgolly.activexWord.Word.Columns = js.native
  val Comments: typingsJapgolly.activexWord.Word.Comments = js.native
  val ContentControls: typingsJapgolly.activexWord.Word.ContentControls = js.native
  val Creator: Double = js.native
  val Document: typingsJapgolly.activexWord.Word.Document = js.native
  val Editors: typingsJapgolly.activexWord.Word.Editors = js.native
  var End: Double = js.native
  val EndnoteOptions: typingsJapgolly.activexWord.Word.EndnoteOptions = js.native
  val Endnotes: typingsJapgolly.activexWord.Word.Endnotes = js.native
  val EnhMetaFileBits: js.Any = js.native
  var ExtendMode: Boolean = js.native
  val Fields: typingsJapgolly.activexWord.Word.Fields = js.native
  val Find: typingsJapgolly.activexWord.Word.Find[Selection] = js.native
  var FitTextWidth: Double = js.native
  var Flags: WdSelectionFlags = js.native
  var Font: typingsJapgolly.activexWord.Word.Font = js.native
  val FootnoteOptions: typingsJapgolly.activexWord.Word.FootnoteOptions = js.native
  val Footnotes: typingsJapgolly.activexWord.Word.Footnotes = js.native
  val FormFields: typingsJapgolly.activexWord.Word.FormFields = js.native
  var FormattedText: typingsJapgolly.activexWord.Word.Range = js.native
  val Frames: typingsJapgolly.activexWord.Word.Frames = js.native
  val HTMLDivisions: typingsJapgolly.activexWord.Word.HTMLDivisions = js.native
  val HasChildShapeRange: Boolean = js.native
  val HeaderFooter: typingsJapgolly.activexWord.Word.HeaderFooter = js.native
  val Hyperlinks: typingsJapgolly.activexWord.Word.Hyperlinks = js.native
  val IPAtEndOfLine: Boolean = js.native
  val InlineShapes: typingsJapgolly.activexWord.Word.InlineShapes = js.native
  val IsEndOfRowMark: Boolean = js.native
  var LanguageDetected: Boolean = js.native
  var LanguageID: WdLanguageID = js.native
  var LanguageIDFarEast: WdLanguageID = js.native
  var LanguageIDOther: WdLanguageID = js.native
  var NoProofing: Double = js.native
  val OMaths: typingsJapgolly.activexWord.Word.OMaths = js.native
  var Orientation: WdTextOrientation = js.native
  var PageSetup: typingsJapgolly.activexWord.Word.PageSetup = js.native
  var ParagraphFormat: typingsJapgolly.activexWord.Word.ParagraphFormat = js.native
  val Paragraphs: typingsJapgolly.activexWord.Word.Paragraphs = js.native
  val Parent: js.Any = js.native
  val ParentContentControl: ContentControl = js.native
  val PreviousBookmarkID: Double = js.native
  val Range: typingsJapgolly.activexWord.Word.Range = js.native
  val Rows: typingsJapgolly.activexWord.Word.Rows = js.native
  val Sections: typingsJapgolly.activexWord.Word.Sections = js.native
  val Sentences: typingsJapgolly.activexWord.Word.Sentences = js.native
  val Shading: typingsJapgolly.activexWord.Word.Shading = js.native
  val ShapeRange: typingsJapgolly.activexWord.Word.ShapeRange = js.native
  val SmartTags: typingsJapgolly.activexWord.Word.SmartTags = js.native
  var Start: Double = js.native
  var StartIsActive: Boolean = js.native
  val StoryLength: Double = js.native
  val StoryType: WdStoryType = js.native
  var Style: js.Any = js.native
  val Tables: typingsJapgolly.activexWord.Word.Tables = js.native
  var Text: String = js.native
  val TopLevelTables: typingsJapgolly.activexWord.Word.Tables = js.native
  val Type: WdSelectionType = js.native
  @JSName("Word.Selection_typekey")
  var WordDotSelection_typekey: Selection = js.native
  val WordOpenXML: String = js.native
  val Words: typingsJapgolly.activexWord.Word.Words = js.native
  val XMLNodes: typingsJapgolly.activexWord.Word.XMLNodes = js.native
  val XMLParentNode: XMLNode = js.native
  def BoldRun(): Unit = js.native
  def Calculate(): Double = js.native
  def ClearCharacterAllFormatting(): Unit = js.native
  def ClearCharacterDirectFormatting(): Unit = js.native
  def ClearCharacterStyle(): Unit = js.native
  def ClearFormatting(): Unit = js.native
  def ClearParagraphAllFormatting(): Unit = js.native
  def ClearParagraphDirectFormatting(): Unit = js.native
  def ClearParagraphStyle(): Unit = js.native
  /** @param WdCollapseDirection [Direction=wdCollapseStart] */
  def Collapse(): Unit = js.native
  def Collapse(Direction: WdCollapseDirection): Unit = js.native
  def ConvertToTable(
    Separator: js.UndefOr[js.Any],
    NumRows: js.UndefOr[js.Any],
    NumColumns: js.UndefOr[js.Any],
    InitialColumnWidth: js.UndefOr[js.Any],
    Format: js.UndefOr[js.Any],
    ApplyBorders: js.UndefOr[js.Any],
    ApplyShading: js.UndefOr[js.Any],
    ApplyFont: js.UndefOr[js.Any],
    ApplyColor: js.UndefOr[js.Any],
    ApplyHeadingRows: js.UndefOr[js.Any],
    ApplyLastRow: js.UndefOr[js.Any],
    ApplyFirstColumn: js.UndefOr[js.Any],
    ApplyLastColumn: js.UndefOr[js.Any],
    AutoFit: js.UndefOr[js.Any],
    AutoFitBehavior: js.UndefOr[js.Any],
    DefaultTableBehavior: js.UndefOr[js.Any]
  ): Table = js.native
  def ConvertToTableOld(
    Separator: js.UndefOr[js.Any],
    NumRows: js.UndefOr[js.Any],
    NumColumns: js.UndefOr[js.Any],
    InitialColumnWidth: js.UndefOr[js.Any],
    Format: js.UndefOr[js.Any],
    ApplyBorders: js.UndefOr[js.Any],
    ApplyShading: js.UndefOr[js.Any],
    ApplyFont: js.UndefOr[js.Any],
    ApplyColor: js.UndefOr[js.Any],
    ApplyHeadingRows: js.UndefOr[js.Any],
    ApplyLastRow: js.UndefOr[js.Any],
    ApplyFirstColumn: js.UndefOr[js.Any],
    ApplyLastColumn: js.UndefOr[js.Any],
    AutoFit: js.UndefOr[js.Any]
  ): Table = js.native
  def Copy(): Unit = js.native
  def CopyAsPicture(): Unit = js.native
  def CopyFormat(): Unit = js.native
  def CreateAutoTextEntry(Name: String, StyleName: String): AutoTextEntry = js.native
  def CreateTextbox(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Double = js.native
  def Delete(Unit: WdUnits): Double = js.native
  def Delete(Unit: WdUnits, Count: Double): Double = js.native
  def DetectLanguage(): Unit = js.native
  def EndKey(): Double = js.native
  def EndKey(Unit: js.Any): Double = js.native
  def EndKey(Unit: js.Any, Extend: js.Any): Double = js.native
  def EndOf(): Double = js.native
  def EndOf(Unit: js.Any): Double = js.native
  def EndOf(Unit: js.Any, Extend: js.Any): Double = js.native
  def EscapeKey(): Unit = js.native
  def Expand(): Double = js.native
  def Expand(Unit: js.Any): Double = js.native
  /**
    * @param boolean [OpenAfterExport=false]
    * @param Word.WdExportOptimizeFor [OptimizeFor=0]
    * @param boolean [ExportCurrentPage=false]
    * @param Word.WdExportItem [Item=0]
    * @param boolean [IncludeDocProps=false]
    * @param boolean [KeepIRM=true]
    * @param Word.WdExportCreateBookmarks [CreateBookmarks=0]
    * @param boolean [DocStructureTags=true]
    * @param boolean [BitmapMissingFonts=true]
    * @param boolean [UseISO19005_1=false]
    */
  def ExportAsFixedFormat(
    OutputFileName: String,
    ExportFormat: WdExportFormat,
    OpenAfterExport: js.UndefOr[Boolean],
    OptimizeFor: js.UndefOr[WdExportOptimizeFor],
    ExportCurrentPage: js.UndefOr[Boolean],
    Item: js.UndefOr[WdExportItem],
    IncludeDocProps: js.UndefOr[Boolean],
    KeepIRM: js.UndefOr[Boolean],
    CreateBookmarks: js.UndefOr[WdExportCreateBookmarks],
    DocStructureTags: js.UndefOr[Boolean],
    BitmapMissingFonts: js.UndefOr[Boolean],
    UseISO19005_1: js.UndefOr[Boolean],
    FixedFormatExtClassPtr: js.UndefOr[js.Any]
  ): Unit = js.native
  def Extend(): Unit = js.native
  def Extend(Character: js.Any): Unit = js.native
  def GoTo(): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: js.Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: js.Any, Which: js.Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: js.Any, Which: js.Any, Count: js.Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: js.Any, Which: js.Any, Count: js.Any, Name: js.Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoToEditableRange(): typingsJapgolly.activexWord.Word.Range = js.native
  def GoToEditableRange(EditorID: js.Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoToNext(What: WdGoToItem): typingsJapgolly.activexWord.Word.Range = js.native
  def GoToPrevious(What: WdGoToItem): typingsJapgolly.activexWord.Word.Range = js.native
  def HomeKey(): Double = js.native
  def HomeKey(Unit: js.Any): Double = js.native
  def HomeKey(Unit: js.Any, Extend: js.Any): Double = js.native
  def InRange(Range: typingsJapgolly.activexWord.Word.Range): Boolean = js.native
  def InStory(Range: typingsJapgolly.activexWord.Word.Range): Boolean = js.native
  def Information(Type: WdInformation): js.Any = js.native
  def InsertAfter(Text: String): Unit = js.native
  def InsertBefore(Text: String): Unit = js.native
  def InsertBreak(): Unit = js.native
  def InsertBreak(Type: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: js.Any, Position: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: js.Any, Position: js.Any, ExcludeLabel: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.Any, TitleAutoText: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.Any, TitleAutoText: js.Any, Position: js.Any): Unit = js.native
  def InsertCells(): Unit = js.native
  def InsertCells(ShiftCells: js.Any): Unit = js.native
  def InsertColumns(): Unit = js.native
  def InsertColumnsRight(): Unit = js.native
  def InsertCrossReference(ReferenceType: js.Any, ReferenceKind: WdReferenceKind, ReferenceItem: js.Any): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any,
    SeparateNumbers: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any,
    SeparateNumbers: js.Any,
    SeparatorString: js.Any
  ): Unit = js.native
  def InsertCrossReference_2002(ReferenceType: js.Any, ReferenceKind: WdReferenceKind, ReferenceItem: js.Any): Unit = js.native
  def InsertCrossReference_2002(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any
  ): Unit = js.native
  def InsertCrossReference_2002(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any
  ): Unit = js.native
  def InsertDateTime(): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: js.Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: js.Any, InsertAsFullWidth: js.Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: js.Any, InsertAsFullWidth: js.Any, DateLanguage: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.Any,
    InsertAsFullWidth: js.Any,
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTimeOld(): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.Any, InsertAsField: js.Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.Any, InsertAsField: js.Any, InsertAsFullWidth: js.Any): Unit = js.native
  def InsertFile(FileName: String): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any, ConfirmConversions: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any, ConfirmConversions: js.Any, Link: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any, ConfirmConversions: js.Any, Link: js.Any, Attachment: js.Any): Unit = js.native
  def InsertFormula(): Unit = js.native
  def InsertFormula(Formula: js.Any): Unit = js.native
  def InsertFormula(Formula: js.Any, NumberFormat: js.Any): Unit = js.native
  def InsertNewPage(): Unit = js.native
  def InsertParagraph(): Unit = js.native
  def InsertParagraphAfter(): Unit = js.native
  def InsertParagraphBefore(): Unit = js.native
  def InsertRows(): Unit = js.native
  def InsertRows(NumRows: js.Any): Unit = js.native
  def InsertRowsAbove(): Unit = js.native
  def InsertRowsAbove(NumRows: js.Any): Unit = js.native
  def InsertRowsBelow(): Unit = js.native
  def InsertRowsBelow(NumRows: js.Any): Unit = js.native
  def InsertStyleSeparator(): Unit = js.native
  def InsertSymbol(CharacterNumber: Double): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: js.Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: js.Any, Unicode: js.Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: js.Any, Unicode: js.Any, Bias: js.Any): Unit = js.native
  def InsertXML(XML: String): Unit = js.native
  def InsertXML(XML: String, Transform: js.Any): Unit = js.native
  def IsEqual(Range: typingsJapgolly.activexWord.Word.Range): Boolean = js.native
  def ItalicRun(): Unit = js.native
  def LtrPara(): Unit = js.native
  def LtrRun(): Unit = js.native
  def Move(): Double = js.native
  def Move(Unit: WdUnits): Double = js.native
  def Move(Unit: WdUnits, Count: Double): Double = js.native
  def MoveDown(): Double = js.native
  def MoveDown(Unit: WdUnits): Double = js.native
  def MoveDown(Unit: WdUnits, Count: Double): Double = js.native
  def MoveEnd(): Double = js.native
  def MoveEnd(Unit: WdUnits): Double = js.native
  def MoveEnd(Unit: WdUnits, Count: Double): Double = js.native
  def MoveEndUntil(Cset: js.Any): Double = js.native
  def MoveEndUntil(Cset: js.Any, Count: js.Any): Double = js.native
  def MoveEndWhile(Cset: js.Any): Double = js.native
  def MoveEndWhile(Cset: js.Any, Count: js.Any): Double = js.native
  def MoveLeft(): Double = js.native
  def MoveLeft(Unit: WdUnits): Double = js.native
  def MoveLeft(Unit: WdUnits, Count: Double): Double = js.native
  def MoveRight(): Double = js.native
  def MoveRight(Unit: WdUnits): Double = js.native
  def MoveRight(Unit: WdUnits, Count: Double): Double = js.native
  def MoveStart(): Double = js.native
  def MoveStart(Unit: WdUnits): Double = js.native
  def MoveStart(Unit: WdUnits, Count: Double): Double = js.native
  def MoveStartUntil(Cset: js.Any): Double = js.native
  def MoveStartUntil(Cset: js.Any, Count: js.Any): Double = js.native
  def MoveStartWhile(Cset: js.Any): Double = js.native
  def MoveStartWhile(Cset: js.Any, Count: js.Any): Double = js.native
  def MoveUntil(Cset: js.Any): Double = js.native
  def MoveUntil(Cset: js.Any, Count: js.Any): Double = js.native
  def MoveUp(): Double = js.native
  def MoveUp(Unit: WdUnits): Double = js.native
  def MoveUp(Unit: WdUnits, Count: Double): Double = js.native
  def MoveWhile(Cset: js.Any): Double = js.native
  def MoveWhile(Cset: js.Any, Count: js.Any): Double = js.native
  def Next(): typingsJapgolly.activexWord.Word.Range = js.native
  def Next(Unit: WdUnits): typingsJapgolly.activexWord.Word.Range = js.native
  def Next(Unit: WdUnits, Count: Double): typingsJapgolly.activexWord.Word.Range = js.native
  def NextField(): Field = js.native
  def NextRevision(): Revision = js.native
  def NextRevision(Wrap: js.Any): Revision = js.native
  def NextSubdocument(): Unit = js.native
  def Paste(): Unit = js.native
  def PasteAndFormat(Type: WdRecoveryType): Unit = js.native
  def PasteAppendTable(): Unit = js.native
  def PasteAsNestedTable(): Unit = js.native
  def PasteExcelTable(LinkedToExcel: Boolean, WordFormatting: Boolean, RTF: Boolean): Unit = js.native
  def PasteFormat(): Unit = js.native
  def PasteSpecial(
    IconIndex: js.UndefOr[js.Any],
    Link: js.UndefOr[js.Any],
    Placement: js.UndefOr[js.Any],
    DisplayAsIcon: js.UndefOr[js.Any],
    DataType: js.UndefOr[js.Any],
    IconFileName: js.UndefOr[js.Any],
    IconLabel: js.UndefOr[js.Any]
  ): Unit = js.native
  def Previous(): typingsJapgolly.activexWord.Word.Range = js.native
  def Previous(Unit: js.Any): typingsJapgolly.activexWord.Word.Range = js.native
  def Previous(Unit: js.Any, Count: js.Any): typingsJapgolly.activexWord.Word.Range = js.native
  def PreviousField(): Field = js.native
  def PreviousRevision(): Revision = js.native
  def PreviousRevision(Wrap: js.Any): Revision = js.native
  def PreviousSubdocument(): Unit = js.native
  def ReadingModeGrowFont(): Unit = js.native
  def ReadingModeShrinkFont(): Unit = js.native
  def RtlPara(): Unit = js.native
  def RtlRun(): Unit = js.native
  def Select(): Unit = js.native
  def SelectCell(): Unit = js.native
  def SelectColumn(): Unit = js.native
  def SelectCurrentAlignment(): Unit = js.native
  def SelectCurrentColor(): Unit = js.native
  def SelectCurrentFont(): Unit = js.native
  def SelectCurrentIndent(): Unit = js.native
  def SelectCurrentSpacing(): Unit = js.native
  def SelectCurrentTabs(): Unit = js.native
  def SelectRow(): Unit = js.native
  def SetRange(Start: Double, End: Double): Unit = js.native
  def Shrink(): Unit = js.native
  def ShrinkDiscontiguousSelection(): Unit = js.native
  def Sort(
    ExcludeHeader: js.UndefOr[js.Any],
    FieldNumber: js.UndefOr[js.Any],
    SortFieldType: js.UndefOr[js.Any],
    SortOrder: js.UndefOr[js.Any],
    FieldNumber2: js.UndefOr[js.Any],
    SortFieldType2: js.UndefOr[js.Any],
    SortOrder2: js.UndefOr[js.Any],
    FieldNumber3: js.UndefOr[js.Any],
    SortFieldType3: js.UndefOr[js.Any],
    SortOrder3: js.UndefOr[js.Any],
    SortColumn: js.UndefOr[js.Any],
    Separator: js.UndefOr[js.Any],
    CaseSensitive: js.UndefOr[js.Any],
    BidiSort: js.UndefOr[js.Any],
    IgnoreThe: js.UndefOr[js.Any],
    IgnoreKashida: js.UndefOr[js.Any],
    IgnoreDiacritics: js.UndefOr[js.Any],
    IgnoreHe: js.UndefOr[js.Any],
    LanguageID: js.UndefOr[js.Any],
    SubFieldNumber: js.UndefOr[js.Any],
    SubFieldNumber2: js.UndefOr[js.Any],
    SubFieldNumber3: js.UndefOr[js.Any]
  ): Unit = js.native
  def Sort2000(
    ExcludeHeader: js.UndefOr[js.Any],
    FieldNumber: js.UndefOr[js.Any],
    SortFieldType: js.UndefOr[js.Any],
    SortOrder: js.UndefOr[js.Any],
    FieldNumber2: js.UndefOr[js.Any],
    SortFieldType2: js.UndefOr[js.Any],
    SortOrder2: js.UndefOr[js.Any],
    FieldNumber3: js.UndefOr[js.Any],
    SortFieldType3: js.UndefOr[js.Any],
    SortOrder3: js.UndefOr[js.Any],
    SortColumn: js.UndefOr[js.Any],
    Separator: js.UndefOr[js.Any],
    CaseSensitive: js.UndefOr[js.Any],
    BidiSort: js.UndefOr[js.Any],
    IgnoreThe: js.UndefOr[js.Any],
    IgnoreKashida: js.UndefOr[js.Any],
    IgnoreDiacritics: js.UndefOr[js.Any],
    IgnoreHe: js.UndefOr[js.Any],
    LanguageID: js.UndefOr[js.Any]
  ): Unit = js.native
  def SortAscending(): Unit = js.native
  def SortDescending(): Unit = js.native
  def SortOld(
    ExcludeHeader: js.UndefOr[js.Any],
    FieldNumber: js.UndefOr[js.Any],
    SortFieldType: js.UndefOr[js.Any],
    SortOrder: js.UndefOr[js.Any],
    FieldNumber2: js.UndefOr[js.Any],
    SortFieldType2: js.UndefOr[js.Any],
    SortOrder2: js.UndefOr[js.Any],
    FieldNumber3: js.UndefOr[js.Any],
    SortFieldType3: js.UndefOr[js.Any],
    SortOrder3: js.UndefOr[js.Any],
    SortColumn: js.UndefOr[js.Any],
    Separator: js.UndefOr[js.Any],
    CaseSensitive: js.UndefOr[js.Any],
    LanguageID: js.UndefOr[js.Any]
  ): Unit = js.native
  def SplitTable(): Unit = js.native
  def StartOf(): Double = js.native
  def StartOf(Unit: js.Any): Double = js.native
  def StartOf(Unit: js.Any, Extend: js.Any): Double = js.native
  def ToggleCharacterCode(): Unit = js.native
  def TypeBackspace(): Unit = js.native
  def TypeParagraph(): Unit = js.native
  def TypeText(Text: String): Unit = js.native
  def WholeStory(): Unit = js.native
  /** @param boolean [DataOnly=false] */
  def XML(): String = js.native
  def XML(DataOnly: Boolean): String = js.native
}

