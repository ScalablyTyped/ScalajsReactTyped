package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selection extends StObject {
  
  val Active: Boolean = js.native
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  def BoldRun(): Unit = js.native
  
  val BookmarkID: Double = js.native
  
  val Bookmarks: typingsJapgolly.activexWord.Word.Bookmarks = js.native
  
  var Borders: typingsJapgolly.activexWord.Word.Borders = js.native
  
  def Calculate(): Double = js.native
  
  val Cells: typingsJapgolly.activexWord.Word.Cells = js.native
  
  val Characters: typingsJapgolly.activexWord.Word.Characters = js.native
  
  val ChildShapeRange: typingsJapgolly.activexWord.Word.ShapeRange = js.native
  
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
  
  var ColumnSelectMode: Boolean = js.native
  
  val Columns: typingsJapgolly.activexWord.Word.Columns = js.native
  
  val Comments: typingsJapgolly.activexWord.Word.Comments = js.native
  
  val ContentControls: typingsJapgolly.activexWord.Word.ContentControls = js.native
  
  def ConvertToTable(
    Separator: js.UndefOr[Any],
    NumRows: js.UndefOr[Any],
    NumColumns: js.UndefOr[Any],
    InitialColumnWidth: js.UndefOr[Any],
    Format: js.UndefOr[Any],
    ApplyBorders: js.UndefOr[Any],
    ApplyShading: js.UndefOr[Any],
    ApplyFont: js.UndefOr[Any],
    ApplyColor: js.UndefOr[Any],
    ApplyHeadingRows: js.UndefOr[Any],
    ApplyLastRow: js.UndefOr[Any],
    ApplyFirstColumn: js.UndefOr[Any],
    ApplyLastColumn: js.UndefOr[Any],
    AutoFit: js.UndefOr[Any],
    AutoFitBehavior: js.UndefOr[Any],
    DefaultTableBehavior: js.UndefOr[Any]
  ): Table = js.native
  
  def ConvertToTableOld(
    Separator: js.UndefOr[Any],
    NumRows: js.UndefOr[Any],
    NumColumns: js.UndefOr[Any],
    InitialColumnWidth: js.UndefOr[Any],
    Format: js.UndefOr[Any],
    ApplyBorders: js.UndefOr[Any],
    ApplyShading: js.UndefOr[Any],
    ApplyFont: js.UndefOr[Any],
    ApplyColor: js.UndefOr[Any],
    ApplyHeadingRows: js.UndefOr[Any],
    ApplyLastRow: js.UndefOr[Any],
    ApplyFirstColumn: js.UndefOr[Any],
    ApplyLastColumn: js.UndefOr[Any],
    AutoFit: js.UndefOr[Any]
  ): Table = js.native
  
  def Copy(): Unit = js.native
  
  def CopyAsPicture(): Unit = js.native
  
  def CopyFormat(): Unit = js.native
  
  def CreateAutoTextEntry(Name: String, StyleName: String): AutoTextEntry = js.native
  
  def CreateTextbox(): Unit = js.native
  
  val Creator: Double = js.native
  
  def Cut(): Unit = js.native
  
  def Delete(): Double = js.native
  def Delete(Unit: Unit, Count: Double): Double = js.native
  def Delete(Unit: WdUnits): Double = js.native
  def Delete(Unit: WdUnits, Count: Double): Double = js.native
  
  def DetectLanguage(): Unit = js.native
  
  val Document: typingsJapgolly.activexWord.Word.Document = js.native
  
  val Editors: typingsJapgolly.activexWord.Word.Editors = js.native
  
  var End: Double = js.native
  
  def EndKey(): Double = js.native
  def EndKey(Unit: Any): Double = js.native
  def EndKey(Unit: Any, Extend: Any): Double = js.native
  def EndKey(Unit: Unit, Extend: Any): Double = js.native
  
  def EndOf(): Double = js.native
  def EndOf(Unit: Any): Double = js.native
  def EndOf(Unit: Any, Extend: Any): Double = js.native
  def EndOf(Unit: Unit, Extend: Any): Double = js.native
  
  val EndnoteOptions: typingsJapgolly.activexWord.Word.EndnoteOptions = js.native
  
  val Endnotes: typingsJapgolly.activexWord.Word.Endnotes = js.native
  
  val EnhMetaFileBits: Any = js.native
  
  def EscapeKey(): Unit = js.native
  
  def Expand(): Double = js.native
  def Expand(Unit: Any): Double = js.native
  
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
    FixedFormatExtClassPtr: js.UndefOr[Any]
  ): Unit = js.native
  
  def Extend(): Unit = js.native
  def Extend(Character: Any): Unit = js.native
  
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
  
  def GoTo(): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: Any, Which: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: Any, Which: Any, Count: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: Any, Which: Any, Count: Any, Name: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: Any, Which: Any, Count: Unit, Name: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: Any, Which: Unit, Count: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: Any, Which: Unit, Count: Any, Name: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: Any, Which: Unit, Count: Unit, Name: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: Unit, Which: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: Unit, Which: Any, Count: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: Unit, Which: Any, Count: Any, Name: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: Unit, Which: Any, Count: Unit, Name: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: Unit, Which: Unit, Count: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: Unit, Which: Unit, Count: Any, Name: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def GoTo(What: Unit, Which: Unit, Count: Unit, Name: Any): typingsJapgolly.activexWord.Word.Range = js.native
  
  def GoToEditableRange(): typingsJapgolly.activexWord.Word.Range = js.native
  def GoToEditableRange(EditorID: Any): typingsJapgolly.activexWord.Word.Range = js.native
  
  def GoToNext(What: WdGoToItem): typingsJapgolly.activexWord.Word.Range = js.native
  
  def GoToPrevious(What: WdGoToItem): typingsJapgolly.activexWord.Word.Range = js.native
  
  val HTMLDivisions: typingsJapgolly.activexWord.Word.HTMLDivisions = js.native
  
  val HasChildShapeRange: Boolean = js.native
  
  val HeaderFooter: typingsJapgolly.activexWord.Word.HeaderFooter = js.native
  
  def HomeKey(): Double = js.native
  def HomeKey(Unit: Any): Double = js.native
  def HomeKey(Unit: Any, Extend: Any): Double = js.native
  def HomeKey(Unit: Unit, Extend: Any): Double = js.native
  
  val Hyperlinks: typingsJapgolly.activexWord.Word.Hyperlinks = js.native
  
  val IPAtEndOfLine: Boolean = js.native
  
  def InRange(Range: typingsJapgolly.activexWord.Word.Range): Boolean = js.native
  
  def InStory(Range: typingsJapgolly.activexWord.Word.Range): Boolean = js.native
  
  def Information(Type: WdInformation): Any = js.native
  
  val InlineShapes: typingsJapgolly.activexWord.Word.InlineShapes = js.native
  
  def InsertAfter(Text: String): Unit = js.native
  
  def InsertBefore(Text: String): Unit = js.native
  
  def InsertBreak(): Unit = js.native
  def InsertBreak(Type: Any): Unit = js.native
  
  def InsertCaption(Label: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any, TitleAutoText: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any, TitleAutoText: Any, Position: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any, TitleAutoText: Any, Position: Any, ExcludeLabel: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any, TitleAutoText: Any, Position: Unit, ExcludeLabel: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any, TitleAutoText: Unit, Position: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any, TitleAutoText: Unit, Position: Any, ExcludeLabel: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Any, TitleAutoText: Unit, Position: Unit, ExcludeLabel: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Unit, TitleAutoText: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Unit, TitleAutoText: Any, Position: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Unit, TitleAutoText: Any, Position: Any, ExcludeLabel: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Unit, TitleAutoText: Any, Position: Unit, ExcludeLabel: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Unit, TitleAutoText: Unit, Position: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Unit, TitleAutoText: Unit, Position: Any, ExcludeLabel: Any): Unit = js.native
  def InsertCaption(Label: Any, Title: Unit, TitleAutoText: Unit, Position: Unit, ExcludeLabel: Any): Unit = js.native
  
  def InsertCaptionXP(Label: Any): Unit = js.native
  def InsertCaptionXP(Label: Any, Title: Any): Unit = js.native
  def InsertCaptionXP(Label: Any, Title: Any, TitleAutoText: Any): Unit = js.native
  def InsertCaptionXP(Label: Any, Title: Any, TitleAutoText: Any, Position: Any): Unit = js.native
  def InsertCaptionXP(Label: Any, Title: Any, TitleAutoText: Unit, Position: Any): Unit = js.native
  def InsertCaptionXP(Label: Any, Title: Unit, TitleAutoText: Any): Unit = js.native
  def InsertCaptionXP(Label: Any, Title: Unit, TitleAutoText: Any, Position: Any): Unit = js.native
  def InsertCaptionXP(Label: Any, Title: Unit, TitleAutoText: Unit, Position: Any): Unit = js.native
  
  def InsertCells(): Unit = js.native
  def InsertCells(ShiftCells: Any): Unit = js.native
  
  def InsertColumns(): Unit = js.native
  
  def InsertColumnsRight(): Unit = js.native
  
  def InsertCrossReference(ReferenceType: Any, ReferenceKind: WdReferenceKind, ReferenceItem: Any): Unit = js.native
  def InsertCrossReference(ReferenceType: Any, ReferenceKind: WdReferenceKind, ReferenceItem: Any, InsertAsHyperlink: Any): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Any,
    SeparateNumbers: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Any,
    SeparateNumbers: Any,
    SeparatorString: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Any,
    SeparateNumbers: Unit,
    SeparatorString: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Unit,
    SeparateNumbers: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Unit,
    SeparateNumbers: Any,
    SeparatorString: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Unit,
    SeparateNumbers: Unit,
    SeparatorString: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Any,
    SeparateNumbers: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Any,
    SeparateNumbers: Any,
    SeparatorString: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Any,
    SeparateNumbers: Unit,
    SeparatorString: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Unit,
    SeparateNumbers: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Unit,
    SeparateNumbers: Any,
    SeparatorString: Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Unit,
    SeparateNumbers: Unit,
    SeparatorString: Any
  ): Unit = js.native
  
  def InsertCrossReference_2002(ReferenceType: Any, ReferenceKind: WdReferenceKind, ReferenceItem: Any): Unit = js.native
  def InsertCrossReference_2002(ReferenceType: Any, ReferenceKind: WdReferenceKind, ReferenceItem: Any, InsertAsHyperlink: Any): Unit = js.native
  def InsertCrossReference_2002(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Any,
    IncludePosition: Any
  ): Unit = js.native
  def InsertCrossReference_2002(
    ReferenceType: Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: Any,
    InsertAsHyperlink: Unit,
    IncludePosition: Any
  ): Unit = js.native
  
  def InsertDateTime(): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any, InsertAsField: Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any, InsertAsField: Any, InsertAsFullWidth: Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any, InsertAsField: Any, InsertAsFullWidth: Any, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Any,
    InsertAsFullWidth: Any,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Any,
    InsertAsFullWidth: Any,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any, InsertAsField: Any, InsertAsFullWidth: Unit, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Any,
    InsertAsFullWidth: Unit,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Any,
    InsertAsFullWidth: Unit,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any, InsertAsField: Unit, InsertAsFullWidth: Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any, InsertAsField: Unit, InsertAsFullWidth: Any, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Unit,
    InsertAsFullWidth: Any,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Unit,
    InsertAsFullWidth: Any,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Any, InsertAsField: Unit, InsertAsFullWidth: Unit, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Unit,
    InsertAsFullWidth: Unit,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Any,
    InsertAsField: Unit,
    InsertAsFullWidth: Unit,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Any, InsertAsFullWidth: Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Any, InsertAsFullWidth: Any, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Any,
    InsertAsFullWidth: Any,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Any,
    InsertAsFullWidth: Any,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Any, InsertAsFullWidth: Unit, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Any,
    InsertAsFullWidth: Unit,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Any,
    InsertAsFullWidth: Unit,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Unit, InsertAsFullWidth: Any): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Unit, InsertAsFullWidth: Any, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Unit,
    InsertAsFullWidth: Any,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Unit,
    InsertAsFullWidth: Any,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: Unit, InsertAsField: Unit, InsertAsFullWidth: Unit, DateLanguage: Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Unit,
    InsertAsFullWidth: Unit,
    DateLanguage: Any,
    CalendarType: Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: Unit,
    InsertAsField: Unit,
    InsertAsFullWidth: Unit,
    DateLanguage: Unit,
    CalendarType: Any
  ): Unit = js.native
  
  def InsertDateTimeOld(): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Any, InsertAsField: Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Any, InsertAsField: Any, InsertAsFullWidth: Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Any, InsertAsField: Unit, InsertAsFullWidth: Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Unit, InsertAsField: Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Unit, InsertAsField: Any, InsertAsFullWidth: Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: Unit, InsertAsField: Unit, InsertAsFullWidth: Any): Unit = js.native
  
  def InsertFile(FileName: String): Unit = js.native
  def InsertFile(FileName: String, Range: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Any, ConfirmConversions: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Any, ConfirmConversions: Any, Link: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Any, ConfirmConversions: Any, Link: Any, Attachment: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Any, ConfirmConversions: Any, Link: Unit, Attachment: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Any, ConfirmConversions: Unit, Link: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Any, ConfirmConversions: Unit, Link: Any, Attachment: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Any, ConfirmConversions: Unit, Link: Unit, Attachment: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Any, Link: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Any, Link: Any, Attachment: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Any, Link: Unit, Attachment: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Unit, Link: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Unit, Link: Any, Attachment: Any): Unit = js.native
  def InsertFile(FileName: String, Range: Unit, ConfirmConversions: Unit, Link: Unit, Attachment: Any): Unit = js.native
  
  def InsertFormula(): Unit = js.native
  def InsertFormula(Formula: Any): Unit = js.native
  def InsertFormula(Formula: Any, NumberFormat: Any): Unit = js.native
  def InsertFormula(Formula: Unit, NumberFormat: Any): Unit = js.native
  
  def InsertNewPage(): Unit = js.native
  
  def InsertParagraph(): Unit = js.native
  
  def InsertParagraphAfter(): Unit = js.native
  
  def InsertParagraphBefore(): Unit = js.native
  
  def InsertRows(): Unit = js.native
  def InsertRows(NumRows: Any): Unit = js.native
  
  def InsertRowsAbove(): Unit = js.native
  def InsertRowsAbove(NumRows: Any): Unit = js.native
  
  def InsertRowsBelow(): Unit = js.native
  def InsertRowsBelow(NumRows: Any): Unit = js.native
  
  def InsertStyleSeparator(): Unit = js.native
  
  def InsertSymbol(CharacterNumber: Double): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Any, Unicode: Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Any, Unicode: Any, Bias: Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Any, Unicode: Unit, Bias: Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Unit, Unicode: Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Unit, Unicode: Any, Bias: Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: Unit, Unicode: Unit, Bias: Any): Unit = js.native
  
  def InsertXML(XML: String): Unit = js.native
  def InsertXML(XML: String, Transform: Any): Unit = js.native
  
  val IsEndOfRowMark: Boolean = js.native
  
  def IsEqual(Range: typingsJapgolly.activexWord.Word.Range): Boolean = js.native
  
  def ItalicRun(): Unit = js.native
  
  var LanguageDetected: Boolean = js.native
  
  var LanguageID: WdLanguageID = js.native
  
  var LanguageIDFarEast: WdLanguageID = js.native
  
  var LanguageIDOther: WdLanguageID = js.native
  
  def LtrPara(): Unit = js.native
  
  def LtrRun(): Unit = js.native
  
  def Move(): Double = js.native
  def Move(Unit: Unit, Count: Double): Double = js.native
  def Move(Unit: WdUnits): Double = js.native
  def Move(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveDown(): Double = js.native
  def MoveDown(Unit: Unit, Count: Double): Double = js.native
  def MoveDown(Unit: WdUnits): Double = js.native
  def MoveDown(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveEnd(): Double = js.native
  def MoveEnd(Unit: Unit, Count: Double): Double = js.native
  def MoveEnd(Unit: WdUnits): Double = js.native
  def MoveEnd(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveEndUntil(Cset: Any): Double = js.native
  def MoveEndUntil(Cset: Any, Count: Any): Double = js.native
  
  def MoveEndWhile(Cset: Any): Double = js.native
  def MoveEndWhile(Cset: Any, Count: Any): Double = js.native
  
  def MoveLeft(): Double = js.native
  def MoveLeft(Unit: Unit, Count: Double): Double = js.native
  def MoveLeft(Unit: WdUnits): Double = js.native
  def MoveLeft(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveRight(): Double = js.native
  def MoveRight(Unit: Unit, Count: Double): Double = js.native
  def MoveRight(Unit: WdUnits): Double = js.native
  def MoveRight(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveStart(): Double = js.native
  def MoveStart(Unit: Unit, Count: Double): Double = js.native
  def MoveStart(Unit: WdUnits): Double = js.native
  def MoveStart(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveStartUntil(Cset: Any): Double = js.native
  def MoveStartUntil(Cset: Any, Count: Any): Double = js.native
  
  def MoveStartWhile(Cset: Any): Double = js.native
  def MoveStartWhile(Cset: Any, Count: Any): Double = js.native
  
  def MoveUntil(Cset: Any): Double = js.native
  def MoveUntil(Cset: Any, Count: Any): Double = js.native
  
  def MoveUp(): Double = js.native
  def MoveUp(Unit: Unit, Count: Double): Double = js.native
  def MoveUp(Unit: WdUnits): Double = js.native
  def MoveUp(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveWhile(Cset: Any): Double = js.native
  def MoveWhile(Cset: Any, Count: Any): Double = js.native
  
  def Next(): typingsJapgolly.activexWord.Word.Range = js.native
  def Next(Unit: Unit, Count: Double): typingsJapgolly.activexWord.Word.Range = js.native
  def Next(Unit: WdUnits): typingsJapgolly.activexWord.Word.Range = js.native
  def Next(Unit: WdUnits, Count: Double): typingsJapgolly.activexWord.Word.Range = js.native
  
  def NextField(): Field = js.native
  
  def NextRevision(): Revision = js.native
  def NextRevision(Wrap: Any): Revision = js.native
  
  def NextSubdocument(): Unit = js.native
  
  var NoProofing: Double = js.native
  
  val OMaths: typingsJapgolly.activexWord.Word.OMaths = js.native
  
  var Orientation: WdTextOrientation = js.native
  
  var PageSetup: typingsJapgolly.activexWord.Word.PageSetup = js.native
  
  var ParagraphFormat: typingsJapgolly.activexWord.Word.ParagraphFormat = js.native
  
  val Paragraphs: typingsJapgolly.activexWord.Word.Paragraphs = js.native
  
  val Parent: Any = js.native
  
  val ParentContentControl: ContentControl = js.native
  
  def Paste(): Unit = js.native
  
  def PasteAndFormat(Type: WdRecoveryType): Unit = js.native
  
  def PasteAppendTable(): Unit = js.native
  
  def PasteAsNestedTable(): Unit = js.native
  
  def PasteExcelTable(LinkedToExcel: Boolean, WordFormatting: Boolean, RTF: Boolean): Unit = js.native
  
  def PasteFormat(): Unit = js.native
  
  def PasteSpecial(
    IconIndex: js.UndefOr[Any],
    Link: js.UndefOr[Any],
    Placement: js.UndefOr[Any],
    DisplayAsIcon: js.UndefOr[Any],
    DataType: js.UndefOr[Any],
    IconFileName: js.UndefOr[Any],
    IconLabel: js.UndefOr[Any]
  ): Unit = js.native
  
  def Previous(): typingsJapgolly.activexWord.Word.Range = js.native
  def Previous(Unit: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def Previous(Unit: Any, Count: Any): typingsJapgolly.activexWord.Word.Range = js.native
  def Previous(Unit: Unit, Count: Any): typingsJapgolly.activexWord.Word.Range = js.native
  
  val PreviousBookmarkID: Double = js.native
  
  def PreviousField(): Field = js.native
  
  def PreviousRevision(): Revision = js.native
  def PreviousRevision(Wrap: Any): Revision = js.native
  
  def PreviousSubdocument(): Unit = js.native
  
  val Range: typingsJapgolly.activexWord.Word.Range = js.native
  
  def ReadingModeGrowFont(): Unit = js.native
  
  def ReadingModeShrinkFont(): Unit = js.native
  
  val Rows: typingsJapgolly.activexWord.Word.Rows = js.native
  
  def RtlPara(): Unit = js.native
  
  def RtlRun(): Unit = js.native
  
  val Sections: typingsJapgolly.activexWord.Word.Sections = js.native
  
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
  
  val Sentences: typingsJapgolly.activexWord.Word.Sentences = js.native
  
  def SetRange(Start: Double, End: Double): Unit = js.native
  
  val Shading: typingsJapgolly.activexWord.Word.Shading = js.native
  
  val ShapeRange: typingsJapgolly.activexWord.Word.ShapeRange = js.native
  
  def Shrink(): Unit = js.native
  
  def ShrinkDiscontiguousSelection(): Unit = js.native
  
  val SmartTags: typingsJapgolly.activexWord.Word.SmartTags = js.native
  
  def Sort(
    ExcludeHeader: js.UndefOr[Any],
    FieldNumber: js.UndefOr[Any],
    SortFieldType: js.UndefOr[Any],
    SortOrder: js.UndefOr[Any],
    FieldNumber2: js.UndefOr[Any],
    SortFieldType2: js.UndefOr[Any],
    SortOrder2: js.UndefOr[Any],
    FieldNumber3: js.UndefOr[Any],
    SortFieldType3: js.UndefOr[Any],
    SortOrder3: js.UndefOr[Any],
    SortColumn: js.UndefOr[Any],
    Separator: js.UndefOr[Any],
    CaseSensitive: js.UndefOr[Any],
    BidiSort: js.UndefOr[Any],
    IgnoreThe: js.UndefOr[Any],
    IgnoreKashida: js.UndefOr[Any],
    IgnoreDiacritics: js.UndefOr[Any],
    IgnoreHe: js.UndefOr[Any],
    LanguageID: js.UndefOr[Any],
    SubFieldNumber: js.UndefOr[Any],
    SubFieldNumber2: js.UndefOr[Any],
    SubFieldNumber3: js.UndefOr[Any]
  ): Unit = js.native
  
  def Sort2000(
    ExcludeHeader: js.UndefOr[Any],
    FieldNumber: js.UndefOr[Any],
    SortFieldType: js.UndefOr[Any],
    SortOrder: js.UndefOr[Any],
    FieldNumber2: js.UndefOr[Any],
    SortFieldType2: js.UndefOr[Any],
    SortOrder2: js.UndefOr[Any],
    FieldNumber3: js.UndefOr[Any],
    SortFieldType3: js.UndefOr[Any],
    SortOrder3: js.UndefOr[Any],
    SortColumn: js.UndefOr[Any],
    Separator: js.UndefOr[Any],
    CaseSensitive: js.UndefOr[Any],
    BidiSort: js.UndefOr[Any],
    IgnoreThe: js.UndefOr[Any],
    IgnoreKashida: js.UndefOr[Any],
    IgnoreDiacritics: js.UndefOr[Any],
    IgnoreHe: js.UndefOr[Any],
    LanguageID: js.UndefOr[Any]
  ): Unit = js.native
  
  def SortAscending(): Unit = js.native
  
  def SortDescending(): Unit = js.native
  
  def SortOld(
    ExcludeHeader: js.UndefOr[Any],
    FieldNumber: js.UndefOr[Any],
    SortFieldType: js.UndefOr[Any],
    SortOrder: js.UndefOr[Any],
    FieldNumber2: js.UndefOr[Any],
    SortFieldType2: js.UndefOr[Any],
    SortOrder2: js.UndefOr[Any],
    FieldNumber3: js.UndefOr[Any],
    SortFieldType3: js.UndefOr[Any],
    SortOrder3: js.UndefOr[Any],
    SortColumn: js.UndefOr[Any],
    Separator: js.UndefOr[Any],
    CaseSensitive: js.UndefOr[Any],
    LanguageID: js.UndefOr[Any]
  ): Unit = js.native
  
  def SplitTable(): Unit = js.native
  
  var Start: Double = js.native
  
  var StartIsActive: Boolean = js.native
  
  def StartOf(): Double = js.native
  def StartOf(Unit: Any): Double = js.native
  def StartOf(Unit: Any, Extend: Any): Double = js.native
  def StartOf(Unit: Unit, Extend: Any): Double = js.native
  
  val StoryLength: Double = js.native
  
  val StoryType: WdStoryType = js.native
  
  var Style: Any = js.native
  
  val Tables: typingsJapgolly.activexWord.Word.Tables = js.native
  
  var Text: String = js.native
  
  def ToggleCharacterCode(): Unit = js.native
  
  val TopLevelTables: typingsJapgolly.activexWord.Word.Tables = js.native
  
  val Type: WdSelectionType = js.native
  
  def TypeBackspace(): Unit = js.native
  
  def TypeParagraph(): Unit = js.native
  
  def TypeText(Text: String): Unit = js.native
  
  def WholeStory(): Unit = js.native
  
  /* private */ @JSName("Word.Selection_typekey")
  var WordDotSelection_typekey: Selection = js.native
  
  val WordOpenXML: String = js.native
  
  val Words: typingsJapgolly.activexWord.Word.Words = js.native
  
  /** @param boolean [DataOnly=false] */
  def XML(): String = js.native
  def XML(DataOnly: Boolean): String = js.native
  
  val XMLNodes: typingsJapgolly.activexWord.Word.XMLNodes = js.native
  
  val XMLParentNode: XMLNode = js.native
}
