package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.FontSlant
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XTolerantMultiPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart.XChartDataArray
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.BreakType
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.CharacterProperties
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.CharacterPropertiesAsian
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.CharacterPropertiesComplex
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.DropCapFormat
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.LineSpacing
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.ParagraphAdjust
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.TabStop
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.BorderLine
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.BorderLine2
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellHoriJustify
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellOrientation
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRange
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.TableBorder
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.TableBorder2
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XAutoFormattable
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCell
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCellRange
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XColumnRowRange
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XTableColumns
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XTableRows
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.CellProtection
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XImportable
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XIndent
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XMergeable
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XReplaceDescriptor
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XReplaceable
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XSearchDescriptor
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XSortable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a rectangular range of cells in a spreadsheet document.
  *
  * This service is an extension of the CellRange service for use in spreadsheet documents.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.activexLibreoffice.com_.sun.star.style.ParagraphProperties because var conflicts: BottomBorder, LeftBorder, RightBorder, TopBorder. Inlined BorderDistance, BottomBorderDistance, BreakType, DropCapCharStyleName, DropCapFormat, DropCapWholeWord, LeftBorderDistance, ListId, NumberingIsNumber, NumberingLevel, NumberingRules, NumberingStartValue, NumberingStyleName, OutlineLevel, PageDescName, PageNumberOffset, PageStyleName, ParaAdjust, ParaBackColor, ParaBackGraphicFilter, ParaBackGraphicLocation, ParaBackGraphicURL, ParaBackTransparent, ParaBottomMargin, ParaContextMargin, ParaExpandSingleWord, ParaFirstLineIndent, ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars, ParaInteropGrabBag, ParaIsAutoFirstLineIndent, ParaIsConnectBorder, ParaIsHyphenation, ParaIsNumberingRestart, ParaKeepTogether, ParaLastLineAdjust, ParaLeftMargin, ParaLineNumberCount, ParaLineNumberStartValue, ParaLineSpacing, ParaOrphans, ParaRegisterModeActive, ParaRightMargin, ParaShadowFormat, ParaSplit, ParaStyleName, ParaTabStops, ParaTopMargin, ParaUserDefinedAttributes, ParaVertAlignment, ParaWidows, RightBorderDistance, TopBorderDistance */ trait SheetCellRange
  extends StObject
     with CellRange
     with CharacterProperties
     with CharacterPropertiesAsian
     with CharacterPropertiesComplex
     with SheetRangesQuery
     with XReplaceable
     with XMergeable
     with XIndent
     with XColumnRowRange
     with XAutoFormattable
     with XSheetCellRange
     with XCellRangeData
     with XCellRangeFormula
     with XCellRangeAddressable
     with XSheetOperation
     with XCellSeries
     with XArrayFormulaRange
     with XMultipleOperation
     with XSortable
     with XImportable
     with XSubTotalCalculatable
     with XSheetFilterableEx
     with XCellFormatRangesSupplier
     with XUniqueCellFormatRangesSupplier
     with XChartDataArray
     with XTolerantMultiPropertySet
     with XModifyBroadcaster {
  
  /** Returns the absolute address of the range as string, e.g. "$Sheet1.$B$2:$D$5". */
  var AbsoluteName: String
  
  /** contains the distance from the border to the object. */
  var BorderDistance: Double
  
  /** contains the distance from the bottom border to the object. */
  var BottomBorderDistance: Double
  
  /**
    * determines the type of break that is applied at the beginning of the table.
    * @see com.sun.star.style.BreakType
    */
  var BreakType: typingsJapgolly.activexLibreoffice.com_.sun.star.style.BreakType
  
  /**
    * contains the conditional formatting settings for this cell.
    *
    * After a conditional format has been changed it has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableConditionalFormat
    */
  var ConditionalFormat: XSheetConditionalEntries
  
  /**
    * contains the conditional formatting settings for this cell, using localized formulas.
    *
    * After a conditional format has been changed it has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableConditionalFormat
    */
  var ConditionalFormatLocal: XSheetConditionalEntries
  
  /** specifies the character style name for drop caps. */
  var DropCapCharStyleName: String
  
  /** specifies whether the first characters of the paragraph are displayed in capital letters and how they are formatted. */
  var DropCapFormat: typingsJapgolly.activexLibreoffice.com_.sun.star.style.DropCapFormat
  
  /** specifies if the property **DropCapFormat** is applied to the whole first word. */
  var DropCapWholeWord: Boolean
  
  /** contains the distance from the left border to the object. */
  var LeftBorderDistance: Double
  
  /** specifies the id of the list to which the paragraph belongs */
  var ListId: String
  
  /**
    * returns `FALSE` if the paragraph is part of a numbering, but has no numbering label.
    *
    * A paragraph is part of a numbering, if a style for a numbering is set - see NumberingStyleName.
    *
    * If the paragraph is not part of a numbering the property is void.
    */
  var NumberingIsNumber: Boolean
  
  /** specifies the numbering level of the paragraph. */
  var NumberingLevel: Double
  
  /** contains the numbering rules applied to this paragraph. */
  var NumberingRules: XIndexReplace
  
  /** specifies the start value for numbering if a new numbering starts at this paragraph. */
  var NumberingStartValue: Double
  
  /**
    * specifies the name of the style for the numbering.
    *
    * The name must be one of the names which are available via {@link XStyleFamiliesSupplier} .
    */
  var NumberingStyleName: String
  
  /**
    * specifies the outline level to which the paragraph belongs
    * @since OOo 3.1  Value 0 indicates that the paragraph belongs to the body text.  Values [1..10] indicates that the paragraph belongs to the corresponding
    */
  var OutlineLevel: Double
  
  /**
    * If this property is set, it creates a page break before the paragraph it belongs to and assigns the value as the name of the new page style sheet to
    * use.
    */
  var PageDescName: String
  
  /** If a page break property is set at a paragraph, this property contains the new value for the page number. */
  var PageNumberOffset: Double
  
  /** contains the name of the current page style. */
  var PageStyleName: String
  
  /** determines the adjustment of a paragraph. */
  var ParaAdjust: ParagraphAdjust
  
  /** contains the paragraph background color. */
  var ParaBackColor: Color
  
  /** contains the name of the graphic filter for the background graphic of a paragraph. */
  var ParaBackGraphicFilter: String
  
  /**
    * contains the value for the position of a background graphic.
    * @see com.sun.star.style.GraphicLocation
    */
  var ParaBackGraphicLocation: GraphicLocation
  
  /** contains the value of a link for the background graphic of a paragraph. */
  var ParaBackGraphicURL: String
  
  /** This value is `TRUE` if the paragraph background color is set to transparent. */
  var ParaBackTransparent: Boolean
  
  /**
    * determines the bottom margin of the paragraph in 100th mm.
    *
    * The distance between two paragraphs is specified by:
    *
    * either the bottom margin of the previous paragraphor the top margin of the following paragraph. The greater one is chosen.
    */
  var ParaBottomMargin: Double
  
  /**
    * determines if contextual spacing is used.
    * @since LibreOffice 3.6  If true, the top and bottom margins of the paragraph should not be applied when the previous and next paragraphs have the same style.
    */
  var ParaContextMargin: Boolean
  
  /**
    * determines if single words are stretched.
    *
    * It is only valid if {@link ParagraphProperties.ParaAdjust} and {@link ParagraphProperties.ParaLastLineAdjust} are also valid.
    */
  var ParaExpandSingleWord: Boolean
  
  /** specifies the indent for the first line. */
  var ParaFirstLineIndent: Double
  
  /** specifies the maximum number of consecutive hyphens. */
  var ParaHyphenationMaxHyphens: Double
  
  /** specifies the maximum number of characters to remain before the hyphen character (when hyphenation is applied). */
  var ParaHyphenationMaxLeadingChars: Double
  
  /** specifies the maximum number of characters to remain after the hyphen character (when hyphenation is applied). */
  var ParaHyphenationMaxTrailingChars: Double
  
  /**
    * Grab bag of paragraph properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var ParaInteropGrabBag: SafeArray[PropertyValue]
  
  /** determines if the first line should be indented automatically. */
  var ParaIsAutoFirstLineIndent: Boolean
  
  /**
    * the property determines if borders set at a paragraph are merged with the next paragraph.
    *
    * Borders are only merged if they are identical.
    */
  var ParaIsConnectBorder: Boolean
  
  /** specifies if automatic hyphenation is applied. */
  var ParaIsHyphenation: Boolean
  
  /** determines if the numbering rules restart, counting at the current paragraph. */
  var ParaIsNumberingRestart: Boolean
  
  /**
    * Setting this property to `TRUE` prevents page or column breaks between this and the following paragraph.
    *
    * This feature is useful for preventing title paragraphs to be the last line on a page or column.
    */
  var ParaKeepTogether: Boolean
  
  /**
    * determines the adjustment of the last line.
    *
    * It is only valid if {@link ParagraphProperties.ParaAdjust} is set to ParagraphAdjust::BLOCK.
    */
  var ParaLastLineAdjust: Double
  
  /** determines the left margin of the paragraph in 100th mm. */
  var ParaLeftMargin: Double
  
  /** determines if the paragraph is included in the line numbering. */
  var ParaLineNumberCount: Boolean
  
  /** contains the start value for the line numbering. */
  var ParaLineNumberStartValue: Double
  
  /** contains the type of the line spacing of a paragraph. */
  var ParaLineSpacing: LineSpacing
  
  /** specifies the minimum number of lines of the paragraph that have to be at bottom of a page if the paragraph is spread over more than one page. */
  var ParaOrphans: Double
  
  /**
    * determines if the register mode is applied to a paragraph.
    *
    * Remark: Register mode is only used if the register mode property of the page style is switched on.
    */
  var ParaRegisterModeActive: Boolean
  
  /** determines the right margin of the paragraph in 100th mm. */
  var ParaRightMargin: Double
  
  /**
    * determines the type, color, and size of the shadow.
    * @see com.sun.star.table.ShadowFormat
    */
  var ParaShadowFormat: ShadowFormat
  
  /** Setting this property to `FALSE` prevents the paragraph from getting split into two pages or columns. */
  var ParaSplit: Boolean
  
  /** contains the name of the current paragraph style. */
  var ParaStyleName: String
  
  /** specifies the positions and kinds of the tab stops within this paragraph. */
  var ParaTabStops: SafeArray[TabStop]
  
  /**
    * determines the top margin of the paragraph in 100th mm.
    *
    * The distance between two paragraphs is specified by:
    *
    * either the bottom margin of the previous paragraph.or the top margin of the following paragraph. The greater one is chosen.
    */
  var ParaTopMargin: Double
  
  /**
    * this property stores xml attributes. They will be saved to and restored from automatic styles inside xml files.
    * @see com.sun.star.xml.AttributeContainer
    */
  var ParaUserDefinedAttributes: XNameContainer
  
  /**
    * specifies the vertical alignment of a paragraph.
    * @see com.sun.star.text.ParagraphVertAlign
    */
  var ParaVertAlignment: Double
  
  /** specifies the minimum number of lines of the paragraph that have to be at top of a page if the paragraph is spread over more than one page. */
  var ParaWidows: Double
  
  /**
    * contains the position of the top left cell of this range in the sheet (in 1/100 mm).
    *
    * This property contains the absolute position in the whole sheet, not the position in the visible area.
    */
  var Position: Point
  
  /** contains the distance from the right border to the object. */
  var RightBorderDistance: Double
  
  /** contains the size of this range (in 1/100 mm). */
  var Size: typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
  
  /** contains the distance from the top border to the object. */
  var TopBorderDistance: Double
  
  /**
    * contains the data validation settings for this cell.
    *
    * After the data validation settings have been changed the validation has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableValidation
    */
  var Validation: XPropertySet
  
  /**
    * contains the data validation settings for this cell, using localized formulas.
    *
    * After the data validation settings have been changed the validation has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableValidation
    */
  var ValidationLocal: XPropertySet
}
object SheetCellRange {
  
  inline def apply(
    AbsoluteName: String,
    ArrayFormula: String,
    AsianVerticalMode: Boolean,
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorder2: BorderLine2,
    BottomBorderDistance: Double,
    BreakType: BreakType,
    CellBackColor: Color,
    CellFormatRanges: XIndexAccess,
    CellInteropGrabBag: SafeArray[PropertyValue],
    CellProtection: CellProtection,
    CellStyle: String,
    CharAutoKerning: Boolean,
    CharBackColor: Color,
    CharBackTransparent: Boolean,
    CharBorderDistance: Double,
    CharBottomBorder: BorderLine2,
    CharBottomBorderDistance: Double,
    CharCaseMap: Double,
    CharColor: Color,
    CharCombineIsOn: Boolean,
    CharCombinePrefix: String,
    CharCombineSuffix: String,
    CharContoured: Boolean,
    CharCrossedOut: Boolean,
    CharEmphasis: Double,
    CharEscapement: Double,
    CharEscapementHeight: Double,
    CharFlash: Boolean,
    CharFontCharSet: Double,
    CharFontCharSetAsian: Double,
    CharFontCharSetComplex: Double,
    CharFontFamily: Double,
    CharFontFamilyAsian: Double,
    CharFontFamilyComplex: Double,
    CharFontName: String,
    CharFontNameAsian: String,
    CharFontNameComplex: String,
    CharFontPitch: Double,
    CharFontPitchAsian: Double,
    CharFontPitchComplex: Double,
    CharFontStyleName: String,
    CharFontStyleNameAsian: String,
    CharFontStyleNameComplex: String,
    CharFontType: Double,
    CharHeight: Double,
    CharHeightAsian: Double,
    CharHeightComplex: Double,
    CharHidden: Boolean,
    CharHighlight: Color,
    CharInteropGrabBag: SafeArray[PropertyValue],
    CharKeepTogether: Boolean,
    CharKerning: Double,
    CharLeftBorder: BorderLine2,
    CharLeftBorderDistance: Double,
    CharLocale: Locale,
    CharLocaleAsian: Locale,
    CharLocaleComplex: Locale,
    CharNoHyphenation: Boolean,
    CharNoLineBreak: Boolean,
    CharPosture: FontSlant,
    CharPostureAsian: FontSlant,
    CharPostureComplex: FontSlant,
    CharRelief: Double,
    CharRightBorder: BorderLine2,
    CharRightBorderDistance: Double,
    CharRotation: Double,
    CharRotationIsFitToLine: Boolean,
    CharScaleWidth: Double,
    CharShadingValue: Double,
    CharShadowFormat: ShadowFormat,
    CharShadowed: Boolean,
    CharStrikeout: Double,
    CharStyleName: String,
    CharStyleNames: SafeArray[String],
    CharTopBorder: BorderLine2,
    CharTopBorderDistance: Double,
    CharUnderline: Double,
    CharUnderlineColor: Color,
    CharUnderlineHasColor: Boolean,
    CharWeight: Double,
    CharWeightAsian: Double,
    CharWeightComplex: Double,
    CharWordMode: Boolean,
    Columns: XTableColumns,
    ConditionalFormat: XSheetConditionalEntries,
    ConditionalFormatLocal: XSheetConditionalEntries,
    DataArray: SafeArray[SafeArray[Any]],
    DiagonalBLTR: BorderLine,
    DiagonalBLTR2: BorderLine2,
    DiagonalTLBR: BorderLine,
    DiagonalTLBR2: BorderLine2,
    DropCapCharStyleName: String,
    DropCapFormat: DropCapFormat,
    DropCapWholeWord: Boolean,
    FormulaArray: SafeArray[SafeArray[String]],
    HoriJustify: CellHoriJustify,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    IsCellBackgroundTransparent: Boolean,
    IsMerged: Boolean,
    IsTextWrapped: Boolean,
    LeftBorder: BorderLine,
    LeftBorder2: BorderLine2,
    LeftBorderDistance: Double,
    ListId: String,
    NumberFormat: Double,
    NumberingIsNumber: Boolean,
    NumberingLevel: Double,
    NumberingRules: XIndexReplace,
    NumberingStartValue: Double,
    NumberingStyleName: String,
    Orientation: CellOrientation,
    OutlineLevel: Double,
    PageDescName: String,
    PageNumberOffset: Double,
    PageStyleName: String,
    ParaAdjust: ParagraphAdjust,
    ParaBackColor: Color,
    ParaBackGraphicFilter: String,
    ParaBackGraphicLocation: GraphicLocation,
    ParaBackGraphicURL: String,
    ParaBackTransparent: Boolean,
    ParaBottomMargin: Double,
    ParaContextMargin: Boolean,
    ParaExpandSingleWord: Boolean,
    ParaFirstLineIndent: Double,
    ParaHyphenationMaxHyphens: Double,
    ParaHyphenationMaxLeadingChars: Double,
    ParaHyphenationMaxTrailingChars: Double,
    ParaIndent: Double,
    ParaInteropGrabBag: SafeArray[PropertyValue],
    ParaIsAutoFirstLineIndent: Boolean,
    ParaIsConnectBorder: Boolean,
    ParaIsHyphenation: Boolean,
    ParaIsNumberingRestart: Boolean,
    ParaKeepTogether: Boolean,
    ParaLastLineAdjust: Double,
    ParaLeftMargin: Double,
    ParaLineNumberCount: Boolean,
    ParaLineNumberStartValue: Double,
    ParaLineSpacing: LineSpacing,
    ParaOrphans: Double,
    ParaRegisterModeActive: Boolean,
    ParaRightMargin: Double,
    ParaShadowFormat: ShadowFormat,
    ParaSplit: Boolean,
    ParaStyleName: String,
    ParaTabStops: SafeArray[TabStop],
    ParaTopMargin: Double,
    ParaUserDefinedAttributes: XNameContainer,
    ParaVertAlignment: Double,
    ParaWidows: Double,
    Position: Point,
    PropertySetInfo: XPropertySetInfo,
    RangeAddress: CellRangeAddress,
    RightBorder: BorderLine,
    RightBorder2: BorderLine2,
    RightBorderDistance: Double,
    RotateAngle: Double,
    RotateReference: Double,
    Rows: XTableRows,
    RubyAdjust: Double,
    RubyCharStyleName: String,
    RubyIsAbove: Boolean,
    RubyText: String,
    ShadowFormat: ShadowFormat,
    ShrinkToFit: Boolean,
    Size: Size,
    Spreadsheet: XSpreadsheet,
    TableBorder: TableBorder,
    TableBorder2: TableBorder2,
    TextUserDefinedAttributes: XNameContainer,
    TopBorder: BorderLine,
    TopBorder2: BorderLine2,
    TopBorderDistance: Double,
    UniqueCellFormatRanges: XIndexAccess,
    UnvisitedCharStyleName: String,
    UserDefinedAttributes: XNameContainer,
    Validation: XPropertySet,
    ValidationLocal: XPropertySet,
    VertJustify: Double,
    VisitedCharStyleName: String,
    XChartDataArray: XChartDataArray,
    XModifyBroadcaster: XModifyBroadcaster,
    XTolerantMultiPropertySet: XTolerantMultiPropertySet,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    applySubTotals: (XSubTotalDescriptor, Boolean) => Callback,
    autoFormat: String => Callback,
    clearContents: Double => Callback,
    computeFunction: GeneralFunction => Double,
    createFilterDescriptor: Boolean => XSheetFilterDescriptor,
    createFilterDescriptorByObject: XSheetFilterable => XSheetFilterDescriptor,
    createImportDescriptor: Boolean => SafeArray[PropertyValue],
    createReplaceDescriptor: CallbackTo[XReplaceDescriptor],
    createSearchDescriptor: CallbackTo[XSearchDescriptor],
    createSortDescriptor: CallbackTo[SafeArray[PropertyValue]],
    createSubTotalDescriptor: Boolean => XSubTotalDescriptor,
    decrementIndent: Callback,
    doImport: SeqEquiv[PropertyValue] => Callback,
    fillAuto: (FillDirection, Double) => Callback,
    fillSeries: (FillDirection, FillMode, FillDateMode, Double, Double) => Callback,
    filter: XSheetFilterDescriptor => Callback,
    findAll: XSearchDescriptor => XIndexAccess,
    findFirst: XSearchDescriptor => XInterface,
    findNext: (XInterface, XSearchDescriptor) => XInterface,
    getArrayFormula: CallbackTo[String],
    getCellByPosition: (Double, Double) => XCell,
    getCellFormatRanges: CallbackTo[XIndexAccess],
    getCellRangeByName: String => XCellRange,
    getCellRangeByPosition: (Double, Double, Double, Double) => XCellRange,
    getColumns: CallbackTo[XTableColumns],
    getDataArray: CallbackTo[SafeArray[SafeArray[Any]]],
    getFormulaArray: CallbackTo[SafeArray[SafeArray[String]]],
    getIsMerged: CallbackTo[Boolean],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getRangeAddress: CallbackTo[CellRangeAddress],
    getRows: CallbackTo[XTableRows],
    getSpreadsheet: CallbackTo[XSpreadsheet],
    getUniqueCellFormatRanges: CallbackTo[XIndexAccess],
    incrementIndent: Callback,
    merge: Boolean => Callback,
    queryColumnDifferences: CellAddress => XSheetCellRanges,
    queryContentCells: Double => XSheetCellRanges,
    queryDependents: Boolean => XSheetCellRanges,
    queryEmptyCells: CallbackTo[XSheetCellRanges],
    queryFormulaCells: Double => XSheetCellRanges,
    queryInterface: `type` => Any,
    queryIntersection: CellRangeAddress => XSheetCellRanges,
    queryPrecedents: Boolean => XSheetCellRanges,
    queryRowDifferences: CellAddress => XSheetCellRanges,
    queryVisibleCells: CallbackTo[XSheetCellRanges],
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeSubTotals: Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    replaceAll: XSearchDescriptor => Double,
    setArrayFormula: String => Callback,
    setDataArray: SeqEquiv[SeqEquiv[Any]] => Callback,
    setFormulaArray: SeqEquiv[SeqEquiv[String]] => Callback,
    setPropertyValue: (String, Any) => Callback,
    setTableOperation: (CellRangeAddress, TableOperationMode, CellAddress, CellAddress) => Callback,
    sort: SeqEquiv[PropertyValue] => Callback
  ): SheetCellRange = {
    val __obj = js.Dynamic.literal(AbsoluteName = AbsoluteName.asInstanceOf[js.Any], ArrayFormula = ArrayFormula.asInstanceOf[js.Any], AsianVerticalMode = AsianVerticalMode.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorder2 = BottomBorder2.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BreakType = BreakType.asInstanceOf[js.Any], CellBackColor = CellBackColor.asInstanceOf[js.Any], CellFormatRanges = CellFormatRanges.asInstanceOf[js.Any], CellInteropGrabBag = CellInteropGrabBag.asInstanceOf[js.Any], CellProtection = CellProtection.asInstanceOf[js.Any], CellStyle = CellStyle.asInstanceOf[js.Any], CharAutoKerning = CharAutoKerning.asInstanceOf[js.Any], CharBackColor = CharBackColor.asInstanceOf[js.Any], CharBackTransparent = CharBackTransparent.asInstanceOf[js.Any], CharBorderDistance = CharBorderDistance.asInstanceOf[js.Any], CharBottomBorder = CharBottomBorder.asInstanceOf[js.Any], CharBottomBorderDistance = CharBottomBorderDistance.asInstanceOf[js.Any], CharCaseMap = CharCaseMap.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharCombineIsOn = CharCombineIsOn.asInstanceOf[js.Any], CharCombinePrefix = CharCombinePrefix.asInstanceOf[js.Any], CharCombineSuffix = CharCombineSuffix.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharCrossedOut = CharCrossedOut.asInstanceOf[js.Any], CharEmphasis = CharEmphasis.asInstanceOf[js.Any], CharEscapement = CharEscapement.asInstanceOf[js.Any], CharEscapementHeight = CharEscapementHeight.asInstanceOf[js.Any], CharFlash = CharFlash.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontCharSetAsian = CharFontCharSetAsian.asInstanceOf[js.Any], CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontFamilyAsian = CharFontFamilyAsian.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontNameAsian = CharFontNameAsian.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontPitchAsian = CharFontPitchAsian.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontStyleNameAsian = CharFontStyleNameAsian.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharFontType = CharFontType.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHeightAsian = CharHeightAsian.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharHidden = CharHidden.asInstanceOf[js.Any], CharHighlight = CharHighlight.asInstanceOf[js.Any], CharInteropGrabBag = CharInteropGrabBag.asInstanceOf[js.Any], CharKeepTogether = CharKeepTogether.asInstanceOf[js.Any], CharKerning = CharKerning.asInstanceOf[js.Any], CharLeftBorder = CharLeftBorder.asInstanceOf[js.Any], CharLeftBorderDistance = CharLeftBorderDistance.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], CharNoHyphenation = CharNoHyphenation.asInstanceOf[js.Any], CharNoLineBreak = CharNoLineBreak.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharPostureAsian = CharPostureAsian.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharRelief = CharRelief.asInstanceOf[js.Any], CharRightBorder = CharRightBorder.asInstanceOf[js.Any], CharRightBorderDistance = CharRightBorderDistance.asInstanceOf[js.Any], CharRotation = CharRotation.asInstanceOf[js.Any], CharRotationIsFitToLine = CharRotationIsFitToLine.asInstanceOf[js.Any], CharScaleWidth = CharScaleWidth.asInstanceOf[js.Any], CharShadingValue = CharShadingValue.asInstanceOf[js.Any], CharShadowFormat = CharShadowFormat.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharStrikeout = CharStrikeout.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], CharStyleNames = CharStyleNames.asInstanceOf[js.Any], CharTopBorder = CharTopBorder.asInstanceOf[js.Any], CharTopBorderDistance = CharTopBorderDistance.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharUnderlineColor = CharUnderlineColor.asInstanceOf[js.Any], CharUnderlineHasColor = CharUnderlineHasColor.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWeightAsian = CharWeightAsian.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any], CharWordMode = CharWordMode.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], ConditionalFormat = ConditionalFormat.asInstanceOf[js.Any], ConditionalFormatLocal = ConditionalFormatLocal.asInstanceOf[js.Any], DataArray = DataArray.asInstanceOf[js.Any], DiagonalBLTR = DiagonalBLTR.asInstanceOf[js.Any], DiagonalBLTR2 = DiagonalBLTR2.asInstanceOf[js.Any], DiagonalTLBR = DiagonalTLBR.asInstanceOf[js.Any], DiagonalTLBR2 = DiagonalTLBR2.asInstanceOf[js.Any], DropCapCharStyleName = DropCapCharStyleName.asInstanceOf[js.Any], DropCapFormat = DropCapFormat.asInstanceOf[js.Any], DropCapWholeWord = DropCapWholeWord.asInstanceOf[js.Any], FormulaArray = FormulaArray.asInstanceOf[js.Any], HoriJustify = HoriJustify.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], IsCellBackgroundTransparent = IsCellBackgroundTransparent.asInstanceOf[js.Any], IsMerged = IsMerged.asInstanceOf[js.Any], IsTextWrapped = IsTextWrapped.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorder2 = LeftBorder2.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], ListId = ListId.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberingIsNumber = NumberingIsNumber.asInstanceOf[js.Any], NumberingLevel = NumberingLevel.asInstanceOf[js.Any], NumberingRules = NumberingRules.asInstanceOf[js.Any], NumberingStartValue = NumberingStartValue.asInstanceOf[js.Any], NumberingStyleName = NumberingStyleName.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], OutlineLevel = OutlineLevel.asInstanceOf[js.Any], PageDescName = PageDescName.asInstanceOf[js.Any], PageNumberOffset = PageNumberOffset.asInstanceOf[js.Any], PageStyleName = PageStyleName.asInstanceOf[js.Any], ParaAdjust = ParaAdjust.asInstanceOf[js.Any], ParaBackColor = ParaBackColor.asInstanceOf[js.Any], ParaBackGraphicFilter = ParaBackGraphicFilter.asInstanceOf[js.Any], ParaBackGraphicLocation = ParaBackGraphicLocation.asInstanceOf[js.Any], ParaBackGraphicURL = ParaBackGraphicURL.asInstanceOf[js.Any], ParaBackTransparent = ParaBackTransparent.asInstanceOf[js.Any], ParaBottomMargin = ParaBottomMargin.asInstanceOf[js.Any], ParaContextMargin = ParaContextMargin.asInstanceOf[js.Any], ParaExpandSingleWord = ParaExpandSingleWord.asInstanceOf[js.Any], ParaFirstLineIndent = ParaFirstLineIndent.asInstanceOf[js.Any], ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens.asInstanceOf[js.Any], ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars.asInstanceOf[js.Any], ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars.asInstanceOf[js.Any], ParaIndent = ParaIndent.asInstanceOf[js.Any], ParaInteropGrabBag = ParaInteropGrabBag.asInstanceOf[js.Any], ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent.asInstanceOf[js.Any], ParaIsConnectBorder = ParaIsConnectBorder.asInstanceOf[js.Any], ParaIsHyphenation = ParaIsHyphenation.asInstanceOf[js.Any], ParaIsNumberingRestart = ParaIsNumberingRestart.asInstanceOf[js.Any], ParaKeepTogether = ParaKeepTogether.asInstanceOf[js.Any], ParaLastLineAdjust = ParaLastLineAdjust.asInstanceOf[js.Any], ParaLeftMargin = ParaLeftMargin.asInstanceOf[js.Any], ParaLineNumberCount = ParaLineNumberCount.asInstanceOf[js.Any], ParaLineNumberStartValue = ParaLineNumberStartValue.asInstanceOf[js.Any], ParaLineSpacing = ParaLineSpacing.asInstanceOf[js.Any], ParaOrphans = ParaOrphans.asInstanceOf[js.Any], ParaRegisterModeActive = ParaRegisterModeActive.asInstanceOf[js.Any], ParaRightMargin = ParaRightMargin.asInstanceOf[js.Any], ParaShadowFormat = ParaShadowFormat.asInstanceOf[js.Any], ParaSplit = ParaSplit.asInstanceOf[js.Any], ParaStyleName = ParaStyleName.asInstanceOf[js.Any], ParaTabStops = ParaTabStops.asInstanceOf[js.Any], ParaTopMargin = ParaTopMargin.asInstanceOf[js.Any], ParaUserDefinedAttributes = ParaUserDefinedAttributes.asInstanceOf[js.Any], ParaVertAlignment = ParaVertAlignment.asInstanceOf[js.Any], ParaWidows = ParaWidows.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RangeAddress = RangeAddress.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorder2 = RightBorder2.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RotateAngle = RotateAngle.asInstanceOf[js.Any], RotateReference = RotateReference.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], RubyAdjust = RubyAdjust.asInstanceOf[js.Any], RubyCharStyleName = RubyCharStyleName.asInstanceOf[js.Any], RubyIsAbove = RubyIsAbove.asInstanceOf[js.Any], RubyText = RubyText.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], ShrinkToFit = ShrinkToFit.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Spreadsheet = Spreadsheet.asInstanceOf[js.Any], TableBorder = TableBorder.asInstanceOf[js.Any], TableBorder2 = TableBorder2.asInstanceOf[js.Any], TextUserDefinedAttributes = TextUserDefinedAttributes.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorder2 = TopBorder2.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], UniqueCellFormatRanges = UniqueCellFormatRanges.asInstanceOf[js.Any], UnvisitedCharStyleName = UnvisitedCharStyleName.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], Validation = Validation.asInstanceOf[js.Any], ValidationLocal = ValidationLocal.asInstanceOf[js.Any], VertJustify = VertJustify.asInstanceOf[js.Any], VisitedCharStyleName = VisitedCharStyleName.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), applySubTotals = js.Any.fromFunction2((t0: XSubTotalDescriptor, t1: Boolean) => (applySubTotals(t0, t1)).runNow()), autoFormat = js.Any.fromFunction1((t0: String) => autoFormat(t0).runNow()), clearContents = js.Any.fromFunction1((t0: Double) => clearContents(t0).runNow()), computeFunction = js.Any.fromFunction1(computeFunction), createFilterDescriptor = js.Any.fromFunction1(createFilterDescriptor), createFilterDescriptorByObject = js.Any.fromFunction1(createFilterDescriptorByObject), createImportDescriptor = js.Any.fromFunction1(createImportDescriptor), createReplaceDescriptor = createReplaceDescriptor.toJsFn, createSearchDescriptor = createSearchDescriptor.toJsFn, createSortDescriptor = createSortDescriptor.toJsFn, createSubTotalDescriptor = js.Any.fromFunction1(createSubTotalDescriptor), decrementIndent = decrementIndent.toJsFn, doImport = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => doImport(t0).runNow()), fillAuto = js.Any.fromFunction2((t0: FillDirection, t1: Double) => (fillAuto(t0, t1)).runNow()), fillSeries = js.Any.fromFunction5((t0: FillDirection, t1: FillMode, t2: FillDateMode, t3: Double, t4: Double) => (fillSeries(t0, t1, t2, t3, t4)).runNow()), filter = js.Any.fromFunction1((t0: XSheetFilterDescriptor) => filter(t0).runNow()), findAll = js.Any.fromFunction1(findAll), findFirst = js.Any.fromFunction1(findFirst), findNext = js.Any.fromFunction2(findNext), getArrayFormula = getArrayFormula.toJsFn, getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellFormatRanges = getCellFormatRanges.toJsFn, getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getColumns = getColumns.toJsFn, getDataArray = getDataArray.toJsFn, getFormulaArray = getFormulaArray.toJsFn, getIsMerged = getIsMerged.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRangeAddress = getRangeAddress.toJsFn, getRows = getRows.toJsFn, getSpreadsheet = getSpreadsheet.toJsFn, getUniqueCellFormatRanges = getUniqueCellFormatRanges.toJsFn, incrementIndent = incrementIndent.toJsFn, merge = js.Any.fromFunction1((t0: Boolean) => merge(t0).runNow()), queryColumnDifferences = js.Any.fromFunction1(queryColumnDifferences), queryContentCells = js.Any.fromFunction1(queryContentCells), queryDependents = js.Any.fromFunction1(queryDependents), queryEmptyCells = queryEmptyCells.toJsFn, queryFormulaCells = js.Any.fromFunction1(queryFormulaCells), queryInterface = js.Any.fromFunction1(queryInterface), queryIntersection = js.Any.fromFunction1(queryIntersection), queryPrecedents = js.Any.fromFunction1(queryPrecedents), queryRowDifferences = js.Any.fromFunction1(queryRowDifferences), queryVisibleCells = queryVisibleCells.toJsFn, release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeSubTotals = removeSubTotals.toJsFn, removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), replaceAll = js.Any.fromFunction1(replaceAll), setArrayFormula = js.Any.fromFunction1((t0: String) => setArrayFormula(t0).runNow()), setDataArray = js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[Any]]) => setDataArray(t0).runNow()), setFormulaArray = js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[String]]) => setFormulaArray(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setTableOperation = js.Any.fromFunction4((t0: CellRangeAddress, t1: TableOperationMode, t2: CellAddress, t3: CellAddress) => (setTableOperation(t0, t1, t2, t3)).runNow()), sort = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => sort(t0).runNow()))
    js.Dynamic.global.Object.assign(__obj, XChartDataArray)
    js.Dynamic.global.Object.assign(__obj, XModifyBroadcaster)
    js.Dynamic.global.Object.assign(__obj, XTolerantMultiPropertySet)
    __obj.asInstanceOf[SheetCellRange]
  }
  
  extension [Self <: SheetCellRange](x: Self) {
    
    inline def setAbsoluteName(value: String): Self = StObject.set(x, "AbsoluteName", value.asInstanceOf[js.Any])
    
    inline def setBorderDistance(value: Double): Self = StObject.set(x, "BorderDistance", value.asInstanceOf[js.Any])
    
    inline def setBottomBorderDistance(value: Double): Self = StObject.set(x, "BottomBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setBreakType(value: BreakType): Self = StObject.set(x, "BreakType", value.asInstanceOf[js.Any])
    
    inline def setConditionalFormat(value: XSheetConditionalEntries): Self = StObject.set(x, "ConditionalFormat", value.asInstanceOf[js.Any])
    
    inline def setConditionalFormatLocal(value: XSheetConditionalEntries): Self = StObject.set(x, "ConditionalFormatLocal", value.asInstanceOf[js.Any])
    
    inline def setDropCapCharStyleName(value: String): Self = StObject.set(x, "DropCapCharStyleName", value.asInstanceOf[js.Any])
    
    inline def setDropCapFormat(value: DropCapFormat): Self = StObject.set(x, "DropCapFormat", value.asInstanceOf[js.Any])
    
    inline def setDropCapWholeWord(value: Boolean): Self = StObject.set(x, "DropCapWholeWord", value.asInstanceOf[js.Any])
    
    inline def setLeftBorderDistance(value: Double): Self = StObject.set(x, "LeftBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setListId(value: String): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
    
    inline def setNumberingIsNumber(value: Boolean): Self = StObject.set(x, "NumberingIsNumber", value.asInstanceOf[js.Any])
    
    inline def setNumberingLevel(value: Double): Self = StObject.set(x, "NumberingLevel", value.asInstanceOf[js.Any])
    
    inline def setNumberingRules(value: XIndexReplace): Self = StObject.set(x, "NumberingRules", value.asInstanceOf[js.Any])
    
    inline def setNumberingStartValue(value: Double): Self = StObject.set(x, "NumberingStartValue", value.asInstanceOf[js.Any])
    
    inline def setNumberingStyleName(value: String): Self = StObject.set(x, "NumberingStyleName", value.asInstanceOf[js.Any])
    
    inline def setOutlineLevel(value: Double): Self = StObject.set(x, "OutlineLevel", value.asInstanceOf[js.Any])
    
    inline def setPageDescName(value: String): Self = StObject.set(x, "PageDescName", value.asInstanceOf[js.Any])
    
    inline def setPageNumberOffset(value: Double): Self = StObject.set(x, "PageNumberOffset", value.asInstanceOf[js.Any])
    
    inline def setPageStyleName(value: String): Self = StObject.set(x, "PageStyleName", value.asInstanceOf[js.Any])
    
    inline def setParaAdjust(value: ParagraphAdjust): Self = StObject.set(x, "ParaAdjust", value.asInstanceOf[js.Any])
    
    inline def setParaBackColor(value: Color): Self = StObject.set(x, "ParaBackColor", value.asInstanceOf[js.Any])
    
    inline def setParaBackGraphicFilter(value: String): Self = StObject.set(x, "ParaBackGraphicFilter", value.asInstanceOf[js.Any])
    
    inline def setParaBackGraphicLocation(value: GraphicLocation): Self = StObject.set(x, "ParaBackGraphicLocation", value.asInstanceOf[js.Any])
    
    inline def setParaBackGraphicURL(value: String): Self = StObject.set(x, "ParaBackGraphicURL", value.asInstanceOf[js.Any])
    
    inline def setParaBackTransparent(value: Boolean): Self = StObject.set(x, "ParaBackTransparent", value.asInstanceOf[js.Any])
    
    inline def setParaBottomMargin(value: Double): Self = StObject.set(x, "ParaBottomMargin", value.asInstanceOf[js.Any])
    
    inline def setParaContextMargin(value: Boolean): Self = StObject.set(x, "ParaContextMargin", value.asInstanceOf[js.Any])
    
    inline def setParaExpandSingleWord(value: Boolean): Self = StObject.set(x, "ParaExpandSingleWord", value.asInstanceOf[js.Any])
    
    inline def setParaFirstLineIndent(value: Double): Self = StObject.set(x, "ParaFirstLineIndent", value.asInstanceOf[js.Any])
    
    inline def setParaHyphenationMaxHyphens(value: Double): Self = StObject.set(x, "ParaHyphenationMaxHyphens", value.asInstanceOf[js.Any])
    
    inline def setParaHyphenationMaxLeadingChars(value: Double): Self = StObject.set(x, "ParaHyphenationMaxLeadingChars", value.asInstanceOf[js.Any])
    
    inline def setParaHyphenationMaxTrailingChars(value: Double): Self = StObject.set(x, "ParaHyphenationMaxTrailingChars", value.asInstanceOf[js.Any])
    
    inline def setParaInteropGrabBag(value: SafeArray[PropertyValue]): Self = StObject.set(x, "ParaInteropGrabBag", value.asInstanceOf[js.Any])
    
    inline def setParaIsAutoFirstLineIndent(value: Boolean): Self = StObject.set(x, "ParaIsAutoFirstLineIndent", value.asInstanceOf[js.Any])
    
    inline def setParaIsConnectBorder(value: Boolean): Self = StObject.set(x, "ParaIsConnectBorder", value.asInstanceOf[js.Any])
    
    inline def setParaIsHyphenation(value: Boolean): Self = StObject.set(x, "ParaIsHyphenation", value.asInstanceOf[js.Any])
    
    inline def setParaIsNumberingRestart(value: Boolean): Self = StObject.set(x, "ParaIsNumberingRestart", value.asInstanceOf[js.Any])
    
    inline def setParaKeepTogether(value: Boolean): Self = StObject.set(x, "ParaKeepTogether", value.asInstanceOf[js.Any])
    
    inline def setParaLastLineAdjust(value: Double): Self = StObject.set(x, "ParaLastLineAdjust", value.asInstanceOf[js.Any])
    
    inline def setParaLeftMargin(value: Double): Self = StObject.set(x, "ParaLeftMargin", value.asInstanceOf[js.Any])
    
    inline def setParaLineNumberCount(value: Boolean): Self = StObject.set(x, "ParaLineNumberCount", value.asInstanceOf[js.Any])
    
    inline def setParaLineNumberStartValue(value: Double): Self = StObject.set(x, "ParaLineNumberStartValue", value.asInstanceOf[js.Any])
    
    inline def setParaLineSpacing(value: LineSpacing): Self = StObject.set(x, "ParaLineSpacing", value.asInstanceOf[js.Any])
    
    inline def setParaOrphans(value: Double): Self = StObject.set(x, "ParaOrphans", value.asInstanceOf[js.Any])
    
    inline def setParaRegisterModeActive(value: Boolean): Self = StObject.set(x, "ParaRegisterModeActive", value.asInstanceOf[js.Any])
    
    inline def setParaRightMargin(value: Double): Self = StObject.set(x, "ParaRightMargin", value.asInstanceOf[js.Any])
    
    inline def setParaShadowFormat(value: ShadowFormat): Self = StObject.set(x, "ParaShadowFormat", value.asInstanceOf[js.Any])
    
    inline def setParaSplit(value: Boolean): Self = StObject.set(x, "ParaSplit", value.asInstanceOf[js.Any])
    
    inline def setParaStyleName(value: String): Self = StObject.set(x, "ParaStyleName", value.asInstanceOf[js.Any])
    
    inline def setParaTabStops(value: SafeArray[TabStop]): Self = StObject.set(x, "ParaTabStops", value.asInstanceOf[js.Any])
    
    inline def setParaTopMargin(value: Double): Self = StObject.set(x, "ParaTopMargin", value.asInstanceOf[js.Any])
    
    inline def setParaUserDefinedAttributes(value: XNameContainer): Self = StObject.set(x, "ParaUserDefinedAttributes", value.asInstanceOf[js.Any])
    
    inline def setParaVertAlignment(value: Double): Self = StObject.set(x, "ParaVertAlignment", value.asInstanceOf[js.Any])
    
    inline def setParaWidows(value: Double): Self = StObject.set(x, "ParaWidows", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setRightBorderDistance(value: Double): Self = StObject.set(x, "RightBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setTopBorderDistance(value: Double): Self = StObject.set(x, "TopBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setValidation(value: XPropertySet): Self = StObject.set(x, "Validation", value.asInstanceOf[js.Any])
    
    inline def setValidationLocal(value: XPropertySet): Self = StObject.set(x, "ValidationLocal", value.asInstanceOf[js.Any])
  }
}
