package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.SheetVisibility
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Hidden
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.VeryHidden
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `worksheet.toJSON()`. */
trait WorksheetData extends StObject {
  
  /**
    * Represents the `AutoFilter` object of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var autoFilter: js.UndefOr[AutoFilterData] = js.undefined
  
  /**
    * Returns a collection of charts that are part of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var charts: js.UndefOr[js.Array[ChartData]] = js.undefined
  
  /**
    * Returns a collection of all the Comments objects on the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var comments: js.UndefOr[js.Array[CommentData]] = js.undefined
  
  /**
    * Gets a collection of worksheet-level custom properties.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var customProperties: js.UndefOr[js.Array[WorksheetCustomPropertyData]] = js.undefined
  
  /**
    * Determines if Excel should recalculate the worksheet when necessary.
    True if Excel recalculates the worksheet when necessary. False if Excel doesn't recalculate the sheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var enableCalculation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the horizontal page break collection for the worksheet. This collection only contains manual page breaks.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var horizontalPageBreaks: js.UndefOr[js.Array[PageBreakData]] = js.undefined
  
  /**
    * Returns a value that uniquely identifies the worksheet in a given workbook. The value of the identifier remains the same even when the worksheet is renamed or moved.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The display name of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Collection of names scoped to the current worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  var names: js.UndefOr[js.Array[NamedItemData]] = js.undefined
  
  /**
    * Gets the `PageLayout` object of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var pageLayout: js.UndefOr[PageLayoutData] = js.undefined
  
  /**
    * Collection of PivotTables that are part of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var pivotTables: js.UndefOr[js.Array[PivotTableData]] = js.undefined
  
  /**
    * The zero-based position of the worksheet within the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[Double] = js.undefined
  
  /**
    * Returns the sheet protection object for a worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var protection: js.UndefOr[WorksheetProtectionData] = js.undefined
  
  /**
    * Returns the collection of all the Shape objects on the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var shapes: js.UndefOr[js.Array[ShapeData]] = js.undefined
  
  /**
    * Specifies if gridlines are visible to the user.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showGridlines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if headings are visible to the user.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showHeadings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns a collection of slicers that are part of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var slicers: js.UndefOr[js.Array[SlicerData]] = js.undefined
  
  /**
    * Returns the standard (default) height of all the rows in the worksheet, in points.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var standardHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the standard (default) width of all the columns in the worksheet.
    One unit of column width is equal to the width of one character in the Normal style. For proportional fonts, the width of the character 0 (zero) is used.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var standardWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * The tab color of the worksheet.
    When retrieving the tab color, if the worksheet is invisible, the value will be `null`. If the worksheet is visible but the tab color is set to auto, an empty string will be returned. Otherwise, the property will be set to a color, in the form #RRGGBB (e.g., "FFA500").
    When setting the color, use an empty-string to set an "auto" color, or a real color otherwise.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var tabColor: js.UndefOr[String] = js.undefined
  
  /**
    * Returns a value representing this worksheet that can be read by Open Office XML. This is an integer value, which is different from `worksheet.id` (which returns a globally unique identifier) and `worksheet.name` (which returns a value such as "Sheet1").
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var tabId: js.UndefOr[Double] = js.undefined
  
  /**
    * Collection of tables that are part of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.undefined
  
  /**
    * Gets the vertical page break collection for the worksheet. This collection only contains manual page breaks.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var verticalPageBreaks: js.UndefOr[js.Array[PageBreakData]] = js.undefined
  
  /**
    * The visibility of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
    */
  var visibility: js.UndefOr[SheetVisibility | Visible | Hidden | VeryHidden] = js.undefined
}
object WorksheetData {
  
  inline def apply(): WorksheetData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetData]
  }
  
  extension [Self <: WorksheetData](x: Self) {
    
    inline def setAutoFilter(value: AutoFilterData): Self = StObject.set(x, "autoFilter", value.asInstanceOf[js.Any])
    
    inline def setAutoFilterUndefined: Self = StObject.set(x, "autoFilter", js.undefined)
    
    inline def setCharts(value: js.Array[ChartData]): Self = StObject.set(x, "charts", value.asInstanceOf[js.Any])
    
    inline def setChartsUndefined: Self = StObject.set(x, "charts", js.undefined)
    
    inline def setChartsVarargs(value: ChartData*): Self = StObject.set(x, "charts", js.Array(value*))
    
    inline def setComments(value: js.Array[CommentData]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentData*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setCustomProperties(value: js.Array[WorksheetCustomPropertyData]): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
    
    inline def setCustomPropertiesUndefined: Self = StObject.set(x, "customProperties", js.undefined)
    
    inline def setCustomPropertiesVarargs(value: WorksheetCustomPropertyData*): Self = StObject.set(x, "customProperties", js.Array(value*))
    
    inline def setEnableCalculation(value: Boolean): Self = StObject.set(x, "enableCalculation", value.asInstanceOf[js.Any])
    
    inline def setEnableCalculationUndefined: Self = StObject.set(x, "enableCalculation", js.undefined)
    
    inline def setHorizontalPageBreaks(value: js.Array[PageBreakData]): Self = StObject.set(x, "horizontalPageBreaks", value.asInstanceOf[js.Any])
    
    inline def setHorizontalPageBreaksUndefined: Self = StObject.set(x, "horizontalPageBreaks", js.undefined)
    
    inline def setHorizontalPageBreaksVarargs(value: PageBreakData*): Self = StObject.set(x, "horizontalPageBreaks", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNames(value: js.Array[NamedItemData]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: NamedItemData*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setPageLayout(value: PageLayoutData): Self = StObject.set(x, "pageLayout", value.asInstanceOf[js.Any])
    
    inline def setPageLayoutUndefined: Self = StObject.set(x, "pageLayout", js.undefined)
    
    inline def setPivotTables(value: js.Array[PivotTableData]): Self = StObject.set(x, "pivotTables", value.asInstanceOf[js.Any])
    
    inline def setPivotTablesUndefined: Self = StObject.set(x, "pivotTables", js.undefined)
    
    inline def setPivotTablesVarargs(value: PivotTableData*): Self = StObject.set(x, "pivotTables", js.Array(value*))
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setProtection(value: WorksheetProtectionData): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    inline def setShapes(value: js.Array[ShapeData]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    inline def setShapesVarargs(value: ShapeData*): Self = StObject.set(x, "shapes", js.Array(value*))
    
    inline def setShowGridlines(value: Boolean): Self = StObject.set(x, "showGridlines", value.asInstanceOf[js.Any])
    
    inline def setShowGridlinesUndefined: Self = StObject.set(x, "showGridlines", js.undefined)
    
    inline def setShowHeadings(value: Boolean): Self = StObject.set(x, "showHeadings", value.asInstanceOf[js.Any])
    
    inline def setShowHeadingsUndefined: Self = StObject.set(x, "showHeadings", js.undefined)
    
    inline def setSlicers(value: js.Array[SlicerData]): Self = StObject.set(x, "slicers", value.asInstanceOf[js.Any])
    
    inline def setSlicersUndefined: Self = StObject.set(x, "slicers", js.undefined)
    
    inline def setSlicersVarargs(value: SlicerData*): Self = StObject.set(x, "slicers", js.Array(value*))
    
    inline def setStandardHeight(value: Double): Self = StObject.set(x, "standardHeight", value.asInstanceOf[js.Any])
    
    inline def setStandardHeightUndefined: Self = StObject.set(x, "standardHeight", js.undefined)
    
    inline def setStandardWidth(value: Double): Self = StObject.set(x, "standardWidth", value.asInstanceOf[js.Any])
    
    inline def setStandardWidthUndefined: Self = StObject.set(x, "standardWidth", js.undefined)
    
    inline def setTabColor(value: String): Self = StObject.set(x, "tabColor", value.asInstanceOf[js.Any])
    
    inline def setTabColorUndefined: Self = StObject.set(x, "tabColor", js.undefined)
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    inline def setTables(value: js.Array[TableData]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: TableData*): Self = StObject.set(x, "tables", js.Array(value*))
    
    inline def setVerticalPageBreaks(value: js.Array[PageBreakData]): Self = StObject.set(x, "verticalPageBreaks", value.asInstanceOf[js.Any])
    
    inline def setVerticalPageBreaksUndefined: Self = StObject.set(x, "verticalPageBreaks", js.undefined)
    
    inline def setVerticalPageBreaksVarargs(value: PageBreakData*): Self = StObject.set(x, "verticalPageBreaks", js.Array(value*))
    
    inline def setVisibility(value: SheetVisibility | Visible | Hidden | VeryHidden): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
