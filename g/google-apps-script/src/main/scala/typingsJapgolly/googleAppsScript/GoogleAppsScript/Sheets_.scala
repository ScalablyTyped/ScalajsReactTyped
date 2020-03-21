package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Collection.SpreadsheetsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddBandingRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddChartRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddConditionalFormatRuleRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddDimensionGroupRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddFilterViewRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddNamedRangeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddProtectedRangeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddSheetRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.AppendCellsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.AppendDimensionRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.AutoFillRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.AutoResizeDimensionsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BandedRange
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BandingProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BasicChartAxis
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BasicChartDomain
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BasicChartSeries
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BasicChartSpec
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BasicFilter
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchClearValuesByDataFilterRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchClearValuesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchGetValuesByDataFilterRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateSpreadsheetRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateValuesByDataFilterRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateValuesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BooleanCondition
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BooleanRule
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.Border
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.Borders
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.BubbleChartSpec
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.CandlestickChartSpec
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.CandlestickData
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.CandlestickDomain
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.CandlestickSeries
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.CellData
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.CellFormat
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.ChartData
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.ChartSourceRange
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.ChartSpec
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.ClearBasicFilterRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.Color
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.ConditionValue
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.ConditionalFormatRule
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.CopyPasteRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.CopySheetToAnotherSpreadsheetRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.CreateDeveloperMetadataRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.CutPasteRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DataFilter
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DataFilterValueRange
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DataValidationRule
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DateTimeRule
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteBandingRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteConditionalFormatRuleRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteDeveloperMetadataRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteDimensionGroupRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteDimensionRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteEmbeddedObjectRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteFilterViewRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteNamedRangeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteProtectedRangeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteRangeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteSheetRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeveloperMetadata
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeveloperMetadataLocation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeveloperMetadataLookup
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DimensionGroup
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DimensionProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DimensionRange
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DuplicateFilterViewRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DuplicateSheetRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.Editors
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.EmbeddedChart
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.EmbeddedObjectPosition
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.ErrorValue
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.ExtendedValue
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.FilterView
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.FindReplaceRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.GetSpreadsheetByDataFilterRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.GradientRule
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.GridCoordinate
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.GridData
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.GridProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.GridRange
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.HistogramChartSpec
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.HistogramRule
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.HistogramSeries
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.InsertDimensionRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.InsertRangeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.InterpolationPoint
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.IterativeCalculationSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.LineStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.ManualRule
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.ManualRuleGroup
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.MergeCellsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.MoveDimensionRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.NamedRange
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.NumberFormat
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.OrgChartSpec
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.OverlayPosition
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.Padding
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.PasteDataRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.PieChartSpec
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.PivotGroup
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.PivotGroupRule
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.PivotGroupSortValueBucket
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.PivotGroupValueMetadata
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.PivotTable
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.PivotValue
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.ProtectedRange
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.RandomizeRangeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.RepeatCellRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.Request
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.RowData
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.SearchDeveloperMetadataRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.SetBasicFilterRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.SetDataValidationRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.Sheet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.SheetProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.SortRangeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.SortSpec
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.SourceAndDestination
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.SpreadsheetProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.TextFormat
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.TextFormatRun
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.TextPosition
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.TextRotation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.TextToColumnsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.TreemapChartColorScale
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.TreemapChartSpec
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.UnmergeCellsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateBandingRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateBordersRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateCellsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateChartSpecRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateConditionalFormatRuleRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateDeveloperMetadataRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateDimensionGroupRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateDimensionPropertiesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateEmbeddedObjectPositionRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateFilterViewRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateNamedRangeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateProtectedRangeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateSheetPropertiesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateSpreadsheetPropertiesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.ValueRange
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.WaterfallChartColumnStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.WaterfallChartCustomSubtotal
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.WaterfallChartDomain
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.WaterfallChartSeries
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.WaterfallChartSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sheets_ extends js.Object {
  var Spreadsheets: js.UndefOr[SpreadsheetsCollection] = js.undefined
  // Create a new instance of AddBandingRequest
  def newAddBandingRequest(): AddBandingRequest
  // Create a new instance of AddChartRequest
  def newAddChartRequest(): AddChartRequest
  // Create a new instance of AddConditionalFormatRuleRequest
  def newAddConditionalFormatRuleRequest(): AddConditionalFormatRuleRequest
  // Create a new instance of AddDimensionGroupRequest
  def newAddDimensionGroupRequest(): AddDimensionGroupRequest
  // Create a new instance of AddFilterViewRequest
  def newAddFilterViewRequest(): AddFilterViewRequest
  // Create a new instance of AddNamedRangeRequest
  def newAddNamedRangeRequest(): AddNamedRangeRequest
  // Create a new instance of AddProtectedRangeRequest
  def newAddProtectedRangeRequest(): AddProtectedRangeRequest
  // Create a new instance of AddSheetRequest
  def newAddSheetRequest(): AddSheetRequest
  // Create a new instance of AppendCellsRequest
  def newAppendCellsRequest(): AppendCellsRequest
  // Create a new instance of AppendDimensionRequest
  def newAppendDimensionRequest(): AppendDimensionRequest
  // Create a new instance of AutoFillRequest
  def newAutoFillRequest(): AutoFillRequest
  // Create a new instance of AutoResizeDimensionsRequest
  def newAutoResizeDimensionsRequest(): AutoResizeDimensionsRequest
  // Create a new instance of BandedRange
  def newBandedRange(): BandedRange
  // Create a new instance of BandingProperties
  def newBandingProperties(): BandingProperties
  // Create a new instance of BasicChartAxis
  def newBasicChartAxis(): BasicChartAxis
  // Create a new instance of BasicChartDomain
  def newBasicChartDomain(): BasicChartDomain
  // Create a new instance of BasicChartSeries
  def newBasicChartSeries(): BasicChartSeries
  // Create a new instance of BasicChartSpec
  def newBasicChartSpec(): BasicChartSpec
  // Create a new instance of BasicFilter
  def newBasicFilter(): BasicFilter
  // Create a new instance of BatchClearValuesByDataFilterRequest
  def newBatchClearValuesByDataFilterRequest(): BatchClearValuesByDataFilterRequest
  // Create a new instance of BatchClearValuesRequest
  def newBatchClearValuesRequest(): BatchClearValuesRequest
  // Create a new instance of BatchGetValuesByDataFilterRequest
  def newBatchGetValuesByDataFilterRequest(): BatchGetValuesByDataFilterRequest
  // Create a new instance of BatchUpdateSpreadsheetRequest
  def newBatchUpdateSpreadsheetRequest(): BatchUpdateSpreadsheetRequest
  // Create a new instance of BatchUpdateValuesByDataFilterRequest
  def newBatchUpdateValuesByDataFilterRequest(): BatchUpdateValuesByDataFilterRequest
  // Create a new instance of BatchUpdateValuesRequest
  def newBatchUpdateValuesRequest(): BatchUpdateValuesRequest
  // Create a new instance of BooleanCondition
  def newBooleanCondition(): BooleanCondition
  // Create a new instance of BooleanRule
  def newBooleanRule(): BooleanRule
  // Create a new instance of Border
  def newBorder(): Border
  // Create a new instance of Borders
  def newBorders(): Borders
  // Create a new instance of BubbleChartSpec
  def newBubbleChartSpec(): BubbleChartSpec
  // Create a new instance of CandlestickChartSpec
  def newCandlestickChartSpec(): CandlestickChartSpec
  // Create a new instance of CandlestickData
  def newCandlestickData(): CandlestickData
  // Create a new instance of CandlestickDomain
  def newCandlestickDomain(): CandlestickDomain
  // Create a new instance of CandlestickSeries
  def newCandlestickSeries(): CandlestickSeries
  // Create a new instance of CellData
  def newCellData(): CellData
  // Create a new instance of CellFormat
  def newCellFormat(): CellFormat
  // Create a new instance of ChartData
  def newChartData(): ChartData
  // Create a new instance of ChartSourceRange
  def newChartSourceRange(): ChartSourceRange
  // Create a new instance of ChartSpec
  def newChartSpec(): ChartSpec
  // Create a new instance of ClearBasicFilterRequest
  def newClearBasicFilterRequest(): ClearBasicFilterRequest
  // Create a new instance of ClearValuesRequest
  def newClearValuesRequest(): js.Any
   // Schema.ClearValuesRequest;
  // Create a new instance of Color
  def newColor(): Color
  // Create a new instance of ConditionValue
  def newConditionValue(): ConditionValue
  // Create a new instance of ConditionalFormatRule
  def newConditionalFormatRule(): ConditionalFormatRule
  // Create a new instance of CopyPasteRequest
  def newCopyPasteRequest(): CopyPasteRequest
  // Create a new instance of CopySheetToAnotherSpreadsheetRequest
  def newCopySheetToAnotherSpreadsheetRequest(): CopySheetToAnotherSpreadsheetRequest
  // Create a new instance of CreateDeveloperMetadataRequest
  def newCreateDeveloperMetadataRequest(): CreateDeveloperMetadataRequest
  // Create a new instance of CutPasteRequest
  def newCutPasteRequest(): CutPasteRequest
  // Create a new instance of DataFilter
  def newDataFilter(): DataFilter
  // Create a new instance of DataFilterValueRange
  def newDataFilterValueRange(): DataFilterValueRange
  // Create a new instance of DataValidationRule
  def newDataValidationRule(): DataValidationRule
  // Create a new instance of DateTimeRule
  def newDateTimeRule(): DateTimeRule
  // Create a new instance of DeleteBandingRequest
  def newDeleteBandingRequest(): DeleteBandingRequest
  // Create a new instance of DeleteConditionalFormatRuleRequest
  def newDeleteConditionalFormatRuleRequest(): DeleteConditionalFormatRuleRequest
  // Create a new instance of DeleteDeveloperMetadataRequest
  def newDeleteDeveloperMetadataRequest(): DeleteDeveloperMetadataRequest
  // Create a new instance of DeleteDimensionGroupRequest
  def newDeleteDimensionGroupRequest(): DeleteDimensionGroupRequest
  // Create a new instance of DeleteDimensionRequest
  def newDeleteDimensionRequest(): DeleteDimensionRequest
  // Create a new instance of DeleteEmbeddedObjectRequest
  def newDeleteEmbeddedObjectRequest(): DeleteEmbeddedObjectRequest
  // Create a new instance of DeleteFilterViewRequest
  def newDeleteFilterViewRequest(): DeleteFilterViewRequest
  // Create a new instance of DeleteNamedRangeRequest
  def newDeleteNamedRangeRequest(): DeleteNamedRangeRequest
  // Create a new instance of DeleteProtectedRangeRequest
  def newDeleteProtectedRangeRequest(): DeleteProtectedRangeRequest
  // Create a new instance of DeleteRangeRequest
  def newDeleteRangeRequest(): DeleteRangeRequest
  // Create a new instance of DeleteSheetRequest
  def newDeleteSheetRequest(): DeleteSheetRequest
  // Create a new instance of DeveloperMetadata
  def newDeveloperMetadata(): DeveloperMetadata
  // Create a new instance of DeveloperMetadataLocation
  def newDeveloperMetadataLocation(): DeveloperMetadataLocation
  // Create a new instance of DeveloperMetadataLookup
  def newDeveloperMetadataLookup(): DeveloperMetadataLookup
  // Create a new instance of DimensionGroup
  def newDimensionGroup(): DimensionGroup
  // Create a new instance of DimensionProperties
  def newDimensionProperties(): DimensionProperties
  // Create a new instance of DimensionRange
  def newDimensionRange(): DimensionRange
  // Create a new instance of DuplicateFilterViewRequest
  def newDuplicateFilterViewRequest(): DuplicateFilterViewRequest
  // Create a new instance of DuplicateSheetRequest
  def newDuplicateSheetRequest(): DuplicateSheetRequest
  // Create a new instance of Editors
  def newEditors(): Editors
  // Create a new instance of EmbeddedChart
  def newEmbeddedChart(): EmbeddedChart
  // Create a new instance of EmbeddedObjectPosition
  def newEmbeddedObjectPosition(): EmbeddedObjectPosition
  // Create a new instance of ErrorValue
  def newErrorValue(): ErrorValue
  // Create a new instance of ExtendedValue
  def newExtendedValue(): ExtendedValue
  // Create a new instance of FilterView
  def newFilterView(): FilterView
  // Create a new instance of FindReplaceRequest
  def newFindReplaceRequest(): FindReplaceRequest
  // Create a new instance of GetSpreadsheetByDataFilterRequest
  def newGetSpreadsheetByDataFilterRequest(): GetSpreadsheetByDataFilterRequest
  // Create a new instance of GradientRule
  def newGradientRule(): GradientRule
  // Create a new instance of GridCoordinate
  def newGridCoordinate(): GridCoordinate
  // Create a new instance of GridData
  def newGridData(): GridData
  // Create a new instance of GridProperties
  def newGridProperties(): GridProperties
  // Create a new instance of GridRange
  def newGridRange(): GridRange
  // Create a new instance of HistogramChartSpec
  def newHistogramChartSpec(): HistogramChartSpec
  // Create a new instance of HistogramRule
  def newHistogramRule(): HistogramRule
  // Create a new instance of HistogramSeries
  def newHistogramSeries(): HistogramSeries
  // Create a new instance of InsertDimensionRequest
  def newInsertDimensionRequest(): InsertDimensionRequest
  // Create a new instance of InsertRangeRequest
  def newInsertRangeRequest(): InsertRangeRequest
  // Create a new instance of InterpolationPoint
  def newInterpolationPoint(): InterpolationPoint
  // Create a new instance of IterativeCalculationSettings
  def newIterativeCalculationSettings(): IterativeCalculationSettings
  // Create a new instance of LineStyle
  def newLineStyle(): LineStyle
  // Create a new instance of ManualRule
  def newManualRule(): ManualRule
  // Create a new instance of ManualRuleGroup
  def newManualRuleGroup(): ManualRuleGroup
  // Create a new instance of MergeCellsRequest
  def newMergeCellsRequest(): MergeCellsRequest
  // Create a new instance of MoveDimensionRequest
  def newMoveDimensionRequest(): MoveDimensionRequest
  // Create a new instance of NamedRange
  def newNamedRange(): NamedRange
  // Create a new instance of NumberFormat
  def newNumberFormat(): NumberFormat
  // Create a new instance of OrgChartSpec
  def newOrgChartSpec(): OrgChartSpec
  // Create a new instance of OverlayPosition
  def newOverlayPosition(): OverlayPosition
  // Create a new instance of Padding
  def newPadding(): Padding
  // Create a new instance of PasteDataRequest
  def newPasteDataRequest(): PasteDataRequest
  // Create a new instance of PieChartSpec
  def newPieChartSpec(): PieChartSpec
  // Create a new instance of PivotGroup
  def newPivotGroup(): PivotGroup
  // Create a new instance of PivotGroupRule
  def newPivotGroupRule(): PivotGroupRule
  // Create a new instance of PivotGroupSortValueBucket
  def newPivotGroupSortValueBucket(): PivotGroupSortValueBucket
  // Create a new instance of PivotGroupValueMetadata
  def newPivotGroupValueMetadata(): PivotGroupValueMetadata
  // Create a new instance of PivotTable
  def newPivotTable(): PivotTable
  // Create a new instance of PivotValue
  def newPivotValue(): PivotValue
  // Create a new instance of ProtectedRange
  def newProtectedRange(): ProtectedRange
  // Create a new instance of RandomizeRangeRequest
  def newRandomizeRangeRequest(): RandomizeRangeRequest
  // Create a new instance of RepeatCellRequest
  def newRepeatCellRequest(): RepeatCellRequest
  // Create a new instance of Request
  def newRequest(): Request
  // Create a new instance of RowData
  def newRowData(): RowData
  // Create a new instance of SearchDeveloperMetadataRequest
  def newSearchDeveloperMetadataRequest(): SearchDeveloperMetadataRequest
  // Create a new instance of SetBasicFilterRequest
  def newSetBasicFilterRequest(): SetBasicFilterRequest
  // Create a new instance of SetDataValidationRequest
  def newSetDataValidationRequest(): SetDataValidationRequest
  // Create a new instance of Sheet
  def newSheet(): Sheet
  // Create a new instance of SheetProperties
  def newSheetProperties(): SheetProperties
  // Create a new instance of SortRangeRequest
  def newSortRangeRequest(): SortRangeRequest
  // Create a new instance of SortSpec
  def newSortSpec(): SortSpec
  // Create a new instance of SourceAndDestination
  def newSourceAndDestination(): SourceAndDestination
  // Create a new instance of Spreadsheet
  def newSpreadsheet(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet
  // Create a new instance of SpreadsheetProperties
  def newSpreadsheetProperties(): SpreadsheetProperties
  // Create a new instance of TextFormat
  def newTextFormat(): TextFormat
  // Create a new instance of TextFormatRun
  def newTextFormatRun(): TextFormatRun
  // Create a new instance of TextPosition
  def newTextPosition(): TextPosition
  // Create a new instance of TextRotation
  def newTextRotation(): TextRotation
  // Create a new instance of TextToColumnsRequest
  def newTextToColumnsRequest(): TextToColumnsRequest
  // Create a new instance of TreemapChartColorScale
  def newTreemapChartColorScale(): TreemapChartColorScale
  // Create a new instance of TreemapChartSpec
  def newTreemapChartSpec(): TreemapChartSpec
  // Create a new instance of UnmergeCellsRequest
  def newUnmergeCellsRequest(): UnmergeCellsRequest
  // Create a new instance of UpdateBandingRequest
  def newUpdateBandingRequest(): UpdateBandingRequest
  // Create a new instance of UpdateBordersRequest
  def newUpdateBordersRequest(): UpdateBordersRequest
  // Create a new instance of UpdateCellsRequest
  def newUpdateCellsRequest(): UpdateCellsRequest
  // Create a new instance of UpdateChartSpecRequest
  def newUpdateChartSpecRequest(): UpdateChartSpecRequest
  // Create a new instance of UpdateConditionalFormatRuleRequest
  def newUpdateConditionalFormatRuleRequest(): UpdateConditionalFormatRuleRequest
  // Create a new instance of UpdateDeveloperMetadataRequest
  def newUpdateDeveloperMetadataRequest(): UpdateDeveloperMetadataRequest
  // Create a new instance of UpdateDimensionGroupRequest
  def newUpdateDimensionGroupRequest(): UpdateDimensionGroupRequest
  // Create a new instance of UpdateDimensionPropertiesRequest
  def newUpdateDimensionPropertiesRequest(): UpdateDimensionPropertiesRequest
  // Create a new instance of UpdateEmbeddedObjectPositionRequest
  def newUpdateEmbeddedObjectPositionRequest(): UpdateEmbeddedObjectPositionRequest
  // Create a new instance of UpdateFilterViewRequest
  def newUpdateFilterViewRequest(): UpdateFilterViewRequest
  // Create a new instance of UpdateNamedRangeRequest
  def newUpdateNamedRangeRequest(): UpdateNamedRangeRequest
  // Create a new instance of UpdateProtectedRangeRequest
  def newUpdateProtectedRangeRequest(): UpdateProtectedRangeRequest
  // Create a new instance of UpdateSheetPropertiesRequest
  def newUpdateSheetPropertiesRequest(): UpdateSheetPropertiesRequest
  // Create a new instance of UpdateSpreadsheetPropertiesRequest
  def newUpdateSpreadsheetPropertiesRequest(): UpdateSpreadsheetPropertiesRequest
  // Create a new instance of ValueRange
  def newValueRange(): ValueRange
  // Create a new instance of WaterfallChartColumnStyle
  def newWaterfallChartColumnStyle(): WaterfallChartColumnStyle
  // Create a new instance of WaterfallChartCustomSubtotal
  def newWaterfallChartCustomSubtotal(): WaterfallChartCustomSubtotal
  // Create a new instance of WaterfallChartDomain
  def newWaterfallChartDomain(): WaterfallChartDomain
  // Create a new instance of WaterfallChartSeries
  def newWaterfallChartSeries(): WaterfallChartSeries
  // Create a new instance of WaterfallChartSpec
  def newWaterfallChartSpec(): WaterfallChartSpec
}

object Sheets_ {
  @scala.inline
  def apply(
    newAddBandingRequest: CallbackTo[AddBandingRequest],
    newAddChartRequest: CallbackTo[AddChartRequest],
    newAddConditionalFormatRuleRequest: CallbackTo[AddConditionalFormatRuleRequest],
    newAddDimensionGroupRequest: CallbackTo[AddDimensionGroupRequest],
    newAddFilterViewRequest: CallbackTo[AddFilterViewRequest],
    newAddNamedRangeRequest: CallbackTo[AddNamedRangeRequest],
    newAddProtectedRangeRequest: CallbackTo[AddProtectedRangeRequest],
    newAddSheetRequest: CallbackTo[AddSheetRequest],
    newAppendCellsRequest: CallbackTo[AppendCellsRequest],
    newAppendDimensionRequest: CallbackTo[AppendDimensionRequest],
    newAutoFillRequest: CallbackTo[AutoFillRequest],
    newAutoResizeDimensionsRequest: CallbackTo[AutoResizeDimensionsRequest],
    newBandedRange: CallbackTo[BandedRange],
    newBandingProperties: CallbackTo[BandingProperties],
    newBasicChartAxis: CallbackTo[BasicChartAxis],
    newBasicChartDomain: CallbackTo[BasicChartDomain],
    newBasicChartSeries: CallbackTo[BasicChartSeries],
    newBasicChartSpec: CallbackTo[BasicChartSpec],
    newBasicFilter: CallbackTo[BasicFilter],
    newBatchClearValuesByDataFilterRequest: CallbackTo[BatchClearValuesByDataFilterRequest],
    newBatchClearValuesRequest: CallbackTo[BatchClearValuesRequest],
    newBatchGetValuesByDataFilterRequest: CallbackTo[BatchGetValuesByDataFilterRequest],
    newBatchUpdateSpreadsheetRequest: CallbackTo[BatchUpdateSpreadsheetRequest],
    newBatchUpdateValuesByDataFilterRequest: CallbackTo[BatchUpdateValuesByDataFilterRequest],
    newBatchUpdateValuesRequest: CallbackTo[BatchUpdateValuesRequest],
    newBooleanCondition: CallbackTo[BooleanCondition],
    newBooleanRule: CallbackTo[BooleanRule],
    newBorder: CallbackTo[Border],
    newBorders: CallbackTo[Borders],
    newBubbleChartSpec: CallbackTo[BubbleChartSpec],
    newCandlestickChartSpec: CallbackTo[CandlestickChartSpec],
    newCandlestickData: CallbackTo[CandlestickData],
    newCandlestickDomain: CallbackTo[CandlestickDomain],
    newCandlestickSeries: CallbackTo[CandlestickSeries],
    newCellData: CallbackTo[CellData],
    newCellFormat: CallbackTo[CellFormat],
    newChartData: CallbackTo[ChartData],
    newChartSourceRange: CallbackTo[ChartSourceRange],
    newChartSpec: CallbackTo[ChartSpec],
    newClearBasicFilterRequest: CallbackTo[ClearBasicFilterRequest],
    newClearValuesRequest: CallbackTo[js.Any],
    newColor: CallbackTo[Color],
    newConditionValue: CallbackTo[ConditionValue],
    newConditionalFormatRule: CallbackTo[ConditionalFormatRule],
    newCopyPasteRequest: CallbackTo[CopyPasteRequest],
    newCopySheetToAnotherSpreadsheetRequest: CallbackTo[CopySheetToAnotherSpreadsheetRequest],
    newCreateDeveloperMetadataRequest: CallbackTo[CreateDeveloperMetadataRequest],
    newCutPasteRequest: CallbackTo[CutPasteRequest],
    newDataFilter: CallbackTo[DataFilter],
    newDataFilterValueRange: CallbackTo[DataFilterValueRange],
    newDataValidationRule: CallbackTo[DataValidationRule],
    newDateTimeRule: CallbackTo[DateTimeRule],
    newDeleteBandingRequest: CallbackTo[DeleteBandingRequest],
    newDeleteConditionalFormatRuleRequest: CallbackTo[DeleteConditionalFormatRuleRequest],
    newDeleteDeveloperMetadataRequest: CallbackTo[DeleteDeveloperMetadataRequest],
    newDeleteDimensionGroupRequest: CallbackTo[DeleteDimensionGroupRequest],
    newDeleteDimensionRequest: CallbackTo[DeleteDimensionRequest],
    newDeleteEmbeddedObjectRequest: CallbackTo[DeleteEmbeddedObjectRequest],
    newDeleteFilterViewRequest: CallbackTo[DeleteFilterViewRequest],
    newDeleteNamedRangeRequest: CallbackTo[DeleteNamedRangeRequest],
    newDeleteProtectedRangeRequest: CallbackTo[DeleteProtectedRangeRequest],
    newDeleteRangeRequest: CallbackTo[DeleteRangeRequest],
    newDeleteSheetRequest: CallbackTo[DeleteSheetRequest],
    newDeveloperMetadata: CallbackTo[DeveloperMetadata],
    newDeveloperMetadataLocation: CallbackTo[DeveloperMetadataLocation],
    newDeveloperMetadataLookup: CallbackTo[DeveloperMetadataLookup],
    newDimensionGroup: CallbackTo[DimensionGroup],
    newDimensionProperties: CallbackTo[DimensionProperties],
    newDimensionRange: CallbackTo[DimensionRange],
    newDuplicateFilterViewRequest: CallbackTo[DuplicateFilterViewRequest],
    newDuplicateSheetRequest: CallbackTo[DuplicateSheetRequest],
    newEditors: CallbackTo[Editors],
    newEmbeddedChart: CallbackTo[EmbeddedChart],
    newEmbeddedObjectPosition: CallbackTo[EmbeddedObjectPosition],
    newErrorValue: CallbackTo[ErrorValue],
    newExtendedValue: CallbackTo[ExtendedValue],
    newFilterView: CallbackTo[FilterView],
    newFindReplaceRequest: CallbackTo[FindReplaceRequest],
    newGetSpreadsheetByDataFilterRequest: CallbackTo[GetSpreadsheetByDataFilterRequest],
    newGradientRule: CallbackTo[GradientRule],
    newGridCoordinate: CallbackTo[GridCoordinate],
    newGridData: CallbackTo[GridData],
    newGridProperties: CallbackTo[GridProperties],
    newGridRange: CallbackTo[GridRange],
    newHistogramChartSpec: CallbackTo[HistogramChartSpec],
    newHistogramRule: CallbackTo[HistogramRule],
    newHistogramSeries: CallbackTo[HistogramSeries],
    newInsertDimensionRequest: CallbackTo[InsertDimensionRequest],
    newInsertRangeRequest: CallbackTo[InsertRangeRequest],
    newInterpolationPoint: CallbackTo[InterpolationPoint],
    newIterativeCalculationSettings: CallbackTo[IterativeCalculationSettings],
    newLineStyle: CallbackTo[LineStyle],
    newManualRule: CallbackTo[ManualRule],
    newManualRuleGroup: CallbackTo[ManualRuleGroup],
    newMergeCellsRequest: CallbackTo[MergeCellsRequest],
    newMoveDimensionRequest: CallbackTo[MoveDimensionRequest],
    newNamedRange: CallbackTo[NamedRange],
    newNumberFormat: CallbackTo[NumberFormat],
    newOrgChartSpec: CallbackTo[OrgChartSpec],
    newOverlayPosition: CallbackTo[OverlayPosition],
    newPadding: CallbackTo[Padding],
    newPasteDataRequest: CallbackTo[PasteDataRequest],
    newPieChartSpec: CallbackTo[PieChartSpec],
    newPivotGroup: CallbackTo[PivotGroup],
    newPivotGroupRule: CallbackTo[PivotGroupRule],
    newPivotGroupSortValueBucket: CallbackTo[PivotGroupSortValueBucket],
    newPivotGroupValueMetadata: CallbackTo[PivotGroupValueMetadata],
    newPivotTable: CallbackTo[PivotTable],
    newPivotValue: CallbackTo[PivotValue],
    newProtectedRange: CallbackTo[ProtectedRange],
    newRandomizeRangeRequest: CallbackTo[RandomizeRangeRequest],
    newRepeatCellRequest: CallbackTo[RepeatCellRequest],
    newRequest: CallbackTo[Request],
    newRowData: CallbackTo[RowData],
    newSearchDeveloperMetadataRequest: CallbackTo[SearchDeveloperMetadataRequest],
    newSetBasicFilterRequest: CallbackTo[SetBasicFilterRequest],
    newSetDataValidationRequest: CallbackTo[SetDataValidationRequest],
    newSheet: CallbackTo[Sheet],
    newSheetProperties: CallbackTo[SheetProperties],
    newSortRangeRequest: CallbackTo[SortRangeRequest],
    newSortSpec: CallbackTo[SortSpec],
    newSourceAndDestination: CallbackTo[SourceAndDestination],
    newSpreadsheet: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet],
    newSpreadsheetProperties: CallbackTo[SpreadsheetProperties],
    newTextFormat: CallbackTo[TextFormat],
    newTextFormatRun: CallbackTo[TextFormatRun],
    newTextPosition: CallbackTo[TextPosition],
    newTextRotation: CallbackTo[TextRotation],
    newTextToColumnsRequest: CallbackTo[TextToColumnsRequest],
    newTreemapChartColorScale: CallbackTo[TreemapChartColorScale],
    newTreemapChartSpec: CallbackTo[TreemapChartSpec],
    newUnmergeCellsRequest: CallbackTo[UnmergeCellsRequest],
    newUpdateBandingRequest: CallbackTo[UpdateBandingRequest],
    newUpdateBordersRequest: CallbackTo[UpdateBordersRequest],
    newUpdateCellsRequest: CallbackTo[UpdateCellsRequest],
    newUpdateChartSpecRequest: CallbackTo[UpdateChartSpecRequest],
    newUpdateConditionalFormatRuleRequest: CallbackTo[UpdateConditionalFormatRuleRequest],
    newUpdateDeveloperMetadataRequest: CallbackTo[UpdateDeveloperMetadataRequest],
    newUpdateDimensionGroupRequest: CallbackTo[UpdateDimensionGroupRequest],
    newUpdateDimensionPropertiesRequest: CallbackTo[UpdateDimensionPropertiesRequest],
    newUpdateEmbeddedObjectPositionRequest: CallbackTo[UpdateEmbeddedObjectPositionRequest],
    newUpdateFilterViewRequest: CallbackTo[UpdateFilterViewRequest],
    newUpdateNamedRangeRequest: CallbackTo[UpdateNamedRangeRequest],
    newUpdateProtectedRangeRequest: CallbackTo[UpdateProtectedRangeRequest],
    newUpdateSheetPropertiesRequest: CallbackTo[UpdateSheetPropertiesRequest],
    newUpdateSpreadsheetPropertiesRequest: CallbackTo[UpdateSpreadsheetPropertiesRequest],
    newValueRange: CallbackTo[ValueRange],
    newWaterfallChartColumnStyle: CallbackTo[WaterfallChartColumnStyle],
    newWaterfallChartCustomSubtotal: CallbackTo[WaterfallChartCustomSubtotal],
    newWaterfallChartDomain: CallbackTo[WaterfallChartDomain],
    newWaterfallChartSeries: CallbackTo[WaterfallChartSeries],
    newWaterfallChartSpec: CallbackTo[WaterfallChartSpec],
    Spreadsheets: SpreadsheetsCollection = null
  ): Sheets_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAddBandingRequest")(newAddBandingRequest.toJsFn)
    __obj.updateDynamic("newAddChartRequest")(newAddChartRequest.toJsFn)
    __obj.updateDynamic("newAddConditionalFormatRuleRequest")(newAddConditionalFormatRuleRequest.toJsFn)
    __obj.updateDynamic("newAddDimensionGroupRequest")(newAddDimensionGroupRequest.toJsFn)
    __obj.updateDynamic("newAddFilterViewRequest")(newAddFilterViewRequest.toJsFn)
    __obj.updateDynamic("newAddNamedRangeRequest")(newAddNamedRangeRequest.toJsFn)
    __obj.updateDynamic("newAddProtectedRangeRequest")(newAddProtectedRangeRequest.toJsFn)
    __obj.updateDynamic("newAddSheetRequest")(newAddSheetRequest.toJsFn)
    __obj.updateDynamic("newAppendCellsRequest")(newAppendCellsRequest.toJsFn)
    __obj.updateDynamic("newAppendDimensionRequest")(newAppendDimensionRequest.toJsFn)
    __obj.updateDynamic("newAutoFillRequest")(newAutoFillRequest.toJsFn)
    __obj.updateDynamic("newAutoResizeDimensionsRequest")(newAutoResizeDimensionsRequest.toJsFn)
    __obj.updateDynamic("newBandedRange")(newBandedRange.toJsFn)
    __obj.updateDynamic("newBandingProperties")(newBandingProperties.toJsFn)
    __obj.updateDynamic("newBasicChartAxis")(newBasicChartAxis.toJsFn)
    __obj.updateDynamic("newBasicChartDomain")(newBasicChartDomain.toJsFn)
    __obj.updateDynamic("newBasicChartSeries")(newBasicChartSeries.toJsFn)
    __obj.updateDynamic("newBasicChartSpec")(newBasicChartSpec.toJsFn)
    __obj.updateDynamic("newBasicFilter")(newBasicFilter.toJsFn)
    __obj.updateDynamic("newBatchClearValuesByDataFilterRequest")(newBatchClearValuesByDataFilterRequest.toJsFn)
    __obj.updateDynamic("newBatchClearValuesRequest")(newBatchClearValuesRequest.toJsFn)
    __obj.updateDynamic("newBatchGetValuesByDataFilterRequest")(newBatchGetValuesByDataFilterRequest.toJsFn)
    __obj.updateDynamic("newBatchUpdateSpreadsheetRequest")(newBatchUpdateSpreadsheetRequest.toJsFn)
    __obj.updateDynamic("newBatchUpdateValuesByDataFilterRequest")(newBatchUpdateValuesByDataFilterRequest.toJsFn)
    __obj.updateDynamic("newBatchUpdateValuesRequest")(newBatchUpdateValuesRequest.toJsFn)
    __obj.updateDynamic("newBooleanCondition")(newBooleanCondition.toJsFn)
    __obj.updateDynamic("newBooleanRule")(newBooleanRule.toJsFn)
    __obj.updateDynamic("newBorder")(newBorder.toJsFn)
    __obj.updateDynamic("newBorders")(newBorders.toJsFn)
    __obj.updateDynamic("newBubbleChartSpec")(newBubbleChartSpec.toJsFn)
    __obj.updateDynamic("newCandlestickChartSpec")(newCandlestickChartSpec.toJsFn)
    __obj.updateDynamic("newCandlestickData")(newCandlestickData.toJsFn)
    __obj.updateDynamic("newCandlestickDomain")(newCandlestickDomain.toJsFn)
    __obj.updateDynamic("newCandlestickSeries")(newCandlestickSeries.toJsFn)
    __obj.updateDynamic("newCellData")(newCellData.toJsFn)
    __obj.updateDynamic("newCellFormat")(newCellFormat.toJsFn)
    __obj.updateDynamic("newChartData")(newChartData.toJsFn)
    __obj.updateDynamic("newChartSourceRange")(newChartSourceRange.toJsFn)
    __obj.updateDynamic("newChartSpec")(newChartSpec.toJsFn)
    __obj.updateDynamic("newClearBasicFilterRequest")(newClearBasicFilterRequest.toJsFn)
    __obj.updateDynamic("newClearValuesRequest")(newClearValuesRequest.toJsFn)
    __obj.updateDynamic("newColor")(newColor.toJsFn)
    __obj.updateDynamic("newConditionValue")(newConditionValue.toJsFn)
    __obj.updateDynamic("newConditionalFormatRule")(newConditionalFormatRule.toJsFn)
    __obj.updateDynamic("newCopyPasteRequest")(newCopyPasteRequest.toJsFn)
    __obj.updateDynamic("newCopySheetToAnotherSpreadsheetRequest")(newCopySheetToAnotherSpreadsheetRequest.toJsFn)
    __obj.updateDynamic("newCreateDeveloperMetadataRequest")(newCreateDeveloperMetadataRequest.toJsFn)
    __obj.updateDynamic("newCutPasteRequest")(newCutPasteRequest.toJsFn)
    __obj.updateDynamic("newDataFilter")(newDataFilter.toJsFn)
    __obj.updateDynamic("newDataFilterValueRange")(newDataFilterValueRange.toJsFn)
    __obj.updateDynamic("newDataValidationRule")(newDataValidationRule.toJsFn)
    __obj.updateDynamic("newDateTimeRule")(newDateTimeRule.toJsFn)
    __obj.updateDynamic("newDeleteBandingRequest")(newDeleteBandingRequest.toJsFn)
    __obj.updateDynamic("newDeleteConditionalFormatRuleRequest")(newDeleteConditionalFormatRuleRequest.toJsFn)
    __obj.updateDynamic("newDeleteDeveloperMetadataRequest")(newDeleteDeveloperMetadataRequest.toJsFn)
    __obj.updateDynamic("newDeleteDimensionGroupRequest")(newDeleteDimensionGroupRequest.toJsFn)
    __obj.updateDynamic("newDeleteDimensionRequest")(newDeleteDimensionRequest.toJsFn)
    __obj.updateDynamic("newDeleteEmbeddedObjectRequest")(newDeleteEmbeddedObjectRequest.toJsFn)
    __obj.updateDynamic("newDeleteFilterViewRequest")(newDeleteFilterViewRequest.toJsFn)
    __obj.updateDynamic("newDeleteNamedRangeRequest")(newDeleteNamedRangeRequest.toJsFn)
    __obj.updateDynamic("newDeleteProtectedRangeRequest")(newDeleteProtectedRangeRequest.toJsFn)
    __obj.updateDynamic("newDeleteRangeRequest")(newDeleteRangeRequest.toJsFn)
    __obj.updateDynamic("newDeleteSheetRequest")(newDeleteSheetRequest.toJsFn)
    __obj.updateDynamic("newDeveloperMetadata")(newDeveloperMetadata.toJsFn)
    __obj.updateDynamic("newDeveloperMetadataLocation")(newDeveloperMetadataLocation.toJsFn)
    __obj.updateDynamic("newDeveloperMetadataLookup")(newDeveloperMetadataLookup.toJsFn)
    __obj.updateDynamic("newDimensionGroup")(newDimensionGroup.toJsFn)
    __obj.updateDynamic("newDimensionProperties")(newDimensionProperties.toJsFn)
    __obj.updateDynamic("newDimensionRange")(newDimensionRange.toJsFn)
    __obj.updateDynamic("newDuplicateFilterViewRequest")(newDuplicateFilterViewRequest.toJsFn)
    __obj.updateDynamic("newDuplicateSheetRequest")(newDuplicateSheetRequest.toJsFn)
    __obj.updateDynamic("newEditors")(newEditors.toJsFn)
    __obj.updateDynamic("newEmbeddedChart")(newEmbeddedChart.toJsFn)
    __obj.updateDynamic("newEmbeddedObjectPosition")(newEmbeddedObjectPosition.toJsFn)
    __obj.updateDynamic("newErrorValue")(newErrorValue.toJsFn)
    __obj.updateDynamic("newExtendedValue")(newExtendedValue.toJsFn)
    __obj.updateDynamic("newFilterView")(newFilterView.toJsFn)
    __obj.updateDynamic("newFindReplaceRequest")(newFindReplaceRequest.toJsFn)
    __obj.updateDynamic("newGetSpreadsheetByDataFilterRequest")(newGetSpreadsheetByDataFilterRequest.toJsFn)
    __obj.updateDynamic("newGradientRule")(newGradientRule.toJsFn)
    __obj.updateDynamic("newGridCoordinate")(newGridCoordinate.toJsFn)
    __obj.updateDynamic("newGridData")(newGridData.toJsFn)
    __obj.updateDynamic("newGridProperties")(newGridProperties.toJsFn)
    __obj.updateDynamic("newGridRange")(newGridRange.toJsFn)
    __obj.updateDynamic("newHistogramChartSpec")(newHistogramChartSpec.toJsFn)
    __obj.updateDynamic("newHistogramRule")(newHistogramRule.toJsFn)
    __obj.updateDynamic("newHistogramSeries")(newHistogramSeries.toJsFn)
    __obj.updateDynamic("newInsertDimensionRequest")(newInsertDimensionRequest.toJsFn)
    __obj.updateDynamic("newInsertRangeRequest")(newInsertRangeRequest.toJsFn)
    __obj.updateDynamic("newInterpolationPoint")(newInterpolationPoint.toJsFn)
    __obj.updateDynamic("newIterativeCalculationSettings")(newIterativeCalculationSettings.toJsFn)
    __obj.updateDynamic("newLineStyle")(newLineStyle.toJsFn)
    __obj.updateDynamic("newManualRule")(newManualRule.toJsFn)
    __obj.updateDynamic("newManualRuleGroup")(newManualRuleGroup.toJsFn)
    __obj.updateDynamic("newMergeCellsRequest")(newMergeCellsRequest.toJsFn)
    __obj.updateDynamic("newMoveDimensionRequest")(newMoveDimensionRequest.toJsFn)
    __obj.updateDynamic("newNamedRange")(newNamedRange.toJsFn)
    __obj.updateDynamic("newNumberFormat")(newNumberFormat.toJsFn)
    __obj.updateDynamic("newOrgChartSpec")(newOrgChartSpec.toJsFn)
    __obj.updateDynamic("newOverlayPosition")(newOverlayPosition.toJsFn)
    __obj.updateDynamic("newPadding")(newPadding.toJsFn)
    __obj.updateDynamic("newPasteDataRequest")(newPasteDataRequest.toJsFn)
    __obj.updateDynamic("newPieChartSpec")(newPieChartSpec.toJsFn)
    __obj.updateDynamic("newPivotGroup")(newPivotGroup.toJsFn)
    __obj.updateDynamic("newPivotGroupRule")(newPivotGroupRule.toJsFn)
    __obj.updateDynamic("newPivotGroupSortValueBucket")(newPivotGroupSortValueBucket.toJsFn)
    __obj.updateDynamic("newPivotGroupValueMetadata")(newPivotGroupValueMetadata.toJsFn)
    __obj.updateDynamic("newPivotTable")(newPivotTable.toJsFn)
    __obj.updateDynamic("newPivotValue")(newPivotValue.toJsFn)
    __obj.updateDynamic("newProtectedRange")(newProtectedRange.toJsFn)
    __obj.updateDynamic("newRandomizeRangeRequest")(newRandomizeRangeRequest.toJsFn)
    __obj.updateDynamic("newRepeatCellRequest")(newRepeatCellRequest.toJsFn)
    __obj.updateDynamic("newRequest")(newRequest.toJsFn)
    __obj.updateDynamic("newRowData")(newRowData.toJsFn)
    __obj.updateDynamic("newSearchDeveloperMetadataRequest")(newSearchDeveloperMetadataRequest.toJsFn)
    __obj.updateDynamic("newSetBasicFilterRequest")(newSetBasicFilterRequest.toJsFn)
    __obj.updateDynamic("newSetDataValidationRequest")(newSetDataValidationRequest.toJsFn)
    __obj.updateDynamic("newSheet")(newSheet.toJsFn)
    __obj.updateDynamic("newSheetProperties")(newSheetProperties.toJsFn)
    __obj.updateDynamic("newSortRangeRequest")(newSortRangeRequest.toJsFn)
    __obj.updateDynamic("newSortSpec")(newSortSpec.toJsFn)
    __obj.updateDynamic("newSourceAndDestination")(newSourceAndDestination.toJsFn)
    __obj.updateDynamic("newSpreadsheet")(newSpreadsheet.toJsFn)
    __obj.updateDynamic("newSpreadsheetProperties")(newSpreadsheetProperties.toJsFn)
    __obj.updateDynamic("newTextFormat")(newTextFormat.toJsFn)
    __obj.updateDynamic("newTextFormatRun")(newTextFormatRun.toJsFn)
    __obj.updateDynamic("newTextPosition")(newTextPosition.toJsFn)
    __obj.updateDynamic("newTextRotation")(newTextRotation.toJsFn)
    __obj.updateDynamic("newTextToColumnsRequest")(newTextToColumnsRequest.toJsFn)
    __obj.updateDynamic("newTreemapChartColorScale")(newTreemapChartColorScale.toJsFn)
    __obj.updateDynamic("newTreemapChartSpec")(newTreemapChartSpec.toJsFn)
    __obj.updateDynamic("newUnmergeCellsRequest")(newUnmergeCellsRequest.toJsFn)
    __obj.updateDynamic("newUpdateBandingRequest")(newUpdateBandingRequest.toJsFn)
    __obj.updateDynamic("newUpdateBordersRequest")(newUpdateBordersRequest.toJsFn)
    __obj.updateDynamic("newUpdateCellsRequest")(newUpdateCellsRequest.toJsFn)
    __obj.updateDynamic("newUpdateChartSpecRequest")(newUpdateChartSpecRequest.toJsFn)
    __obj.updateDynamic("newUpdateConditionalFormatRuleRequest")(newUpdateConditionalFormatRuleRequest.toJsFn)
    __obj.updateDynamic("newUpdateDeveloperMetadataRequest")(newUpdateDeveloperMetadataRequest.toJsFn)
    __obj.updateDynamic("newUpdateDimensionGroupRequest")(newUpdateDimensionGroupRequest.toJsFn)
    __obj.updateDynamic("newUpdateDimensionPropertiesRequest")(newUpdateDimensionPropertiesRequest.toJsFn)
    __obj.updateDynamic("newUpdateEmbeddedObjectPositionRequest")(newUpdateEmbeddedObjectPositionRequest.toJsFn)
    __obj.updateDynamic("newUpdateFilterViewRequest")(newUpdateFilterViewRequest.toJsFn)
    __obj.updateDynamic("newUpdateNamedRangeRequest")(newUpdateNamedRangeRequest.toJsFn)
    __obj.updateDynamic("newUpdateProtectedRangeRequest")(newUpdateProtectedRangeRequest.toJsFn)
    __obj.updateDynamic("newUpdateSheetPropertiesRequest")(newUpdateSheetPropertiesRequest.toJsFn)
    __obj.updateDynamic("newUpdateSpreadsheetPropertiesRequest")(newUpdateSpreadsheetPropertiesRequest.toJsFn)
    __obj.updateDynamic("newValueRange")(newValueRange.toJsFn)
    __obj.updateDynamic("newWaterfallChartColumnStyle")(newWaterfallChartColumnStyle.toJsFn)
    __obj.updateDynamic("newWaterfallChartCustomSubtotal")(newWaterfallChartCustomSubtotal.toJsFn)
    __obj.updateDynamic("newWaterfallChartDomain")(newWaterfallChartDomain.toJsFn)
    __obj.updateDynamic("newWaterfallChartSeries")(newWaterfallChartSeries.toJsFn)
    __obj.updateDynamic("newWaterfallChartSpec")(newWaterfallChartSpec.toJsFn)
    if (Spreadsheets != null) __obj.updateDynamic("Spreadsheets")(Spreadsheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sheets_]
  }
}

