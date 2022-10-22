package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Ui
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.File
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and create Google Sheets files. This class is the parent class for the Spreadsheet service.
  */
@js.native
trait SpreadsheetApp extends StObject {
  
  var AutoFillSeries: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoFillSeries */ Any = js.native
  
  var BandingTheme: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BandingTheme */ Any = js.native
  
  var BooleanCriteria: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BooleanCriteria */ Any = js.native
  
  var BorderStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BorderStyle */ Any = js.native
  
  var ColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.ColorType */ Any = js.native
  
  var CopyPasteType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CopyPasteType */ Any = js.native
  
  var DataExecutionErrorCode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataExecutionErrorCode */ Any = js.native
  
  var DataExecutionState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataExecutionState */ Any = js.native
  
  var DataSourceParameterType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataSourceParameterType */ Any = js.native
  
  var DataSourceType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataSourceType */ Any = js.native
  
  var DataValidationCriteria: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataValidationCriteria */ Any = js.native
  
  var DeveloperMetadataLocationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DeveloperMetadataLocationType */ Any = js.native
  
  var DeveloperMetadataVisibility: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DeveloperMetadataVisibility */ Any = js.native
  
  var Dimension: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Dimension */ Any = js.native
  
  var Direction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Direction */ Any = js.native
  
  var GroupControlTogglePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GroupControlTogglePosition */ Any = js.native
  
  var InterpolationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InterpolationType */ Any = js.native
  
  var PivotTableSummarizeFunction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PivotTableSummarizeFunction */ Any = js.native
  
  var PivotValueDisplayType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PivotValueDisplayType */ Any = js.native
  
  var ProtectionType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ProtectionType */ Any = js.native
  
  var RecalculationInterval: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RecalculationInterval */ Any = js.native
  
  var RelativeDate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RelativeDate */ Any = js.native
  
  var SheetType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SheetType */ Any = js.native
  
  var TextDirection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ Any = js.native
  
  var TextToColumnsDelimiter: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextToColumnsDelimiter */ Any = js.native
  
  var ThemeColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ Any = js.native
  
  var WrapStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrapStrategy */ Any = js.native
  
  def create(name: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def create(name: String, rows: Integer, columns: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  
  def enableAllDataSourcesExecution(): Unit = js.native
  
  def enableBigQueryExecution(): Unit = js.native
  
  def flush(): Unit = js.native
  
  def getActive(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  
  def getActiveRange(): Range = js.native
  
  def getActiveRangeList(): RangeList = js.native
  
  def getActiveSheet(): Sheet = js.native
  
  def getActiveSpreadsheet(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  
  def getCurrentCell(): Range = js.native
  
  def getSelection(): Selection = js.native
  
  def getUi(): Ui = js.native
  
  def newColor(): ColorBuilder = js.native
  
  def newConditionalFormatRule(): ConditionalFormatRuleBuilder = js.native
  
  def newDataSourceSpec(): DataSourceSpecBuilder = js.native
  
  def newDataValidation(): DataValidationBuilder = js.native
  
  def newFilterCriteria(): FilterCriteriaBuilder = js.native
  
  def newRichTextValue(): RichTextValueBuilder = js.native
  
  def newTextStyle(): TextStyleBuilder = js.native
  
  def open(file: File): typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  
  def openById(id: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  
  def openByUrl(url: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  
  def setActiveRange(range: Range): Range = js.native
  
  def setActiveRangeList(rangeList: RangeList): RangeList = js.native
  
  def setActiveSheet(sheet: Sheet): Sheet = js.native
  def setActiveSheet(sheet: Sheet, restoreSelection: Boolean): Sheet = js.native
  
  def setActiveSpreadsheet(newActiveSpreadsheet: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet): Unit = js.native
  
  def setCurrentCell(cell: Range): Range = js.native
}
