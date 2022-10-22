package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.ConditionalFormatType
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.CellValue
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ColorScale
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ContainsText
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Custom
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DataBar
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.IconSet
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.PresetCriteria
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.TopBottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `conditionalFormat.toJSON()`. */
trait ConditionalFormatData extends StObject {
  
  /**
    * Returns the cell value conditional format properties if the current conditional format is a `CellValue` type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var cellValue: js.UndefOr[CellValueConditionalFormatData] = js.undefined
  
  /**
    * Returns the cell value conditional format properties if the current conditional format is a `CellValue` type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var cellValueOrNullObject: js.UndefOr[CellValueConditionalFormatData] = js.undefined
  
  /**
    * Returns the color scale conditional format properties if the current conditional format is a `ColorScale` type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var colorScale: js.UndefOr[ColorScaleConditionalFormatData] = js.undefined
  
  /**
    * Returns the color scale conditional format properties if the current conditional format is a `ColorScale` type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var colorScaleOrNullObject: js.UndefOr[ColorScaleConditionalFormatData] = js.undefined
  
  /**
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var custom: js.UndefOr[CustomConditionalFormatData] = js.undefined
  
  /**
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var customOrNullObject: js.UndefOr[CustomConditionalFormatData] = js.undefined
  
  /**
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var dataBar: js.UndefOr[DataBarConditionalFormatData] = js.undefined
  
  /**
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var dataBarOrNullObject: js.UndefOr[DataBarConditionalFormatData] = js.undefined
  
  /**
    * Returns the icon set conditional format properties if the current conditional format is an `IconSet` type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var iconSet: js.UndefOr[IconSetConditionalFormatData] = js.undefined
  
  /**
    * Returns the icon set conditional format properties if the current conditional format is an `IconSet` type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var iconSetOrNullObject: js.UndefOr[IconSetConditionalFormatData] = js.undefined
  
  /**
    * The priority of the conditional format in the current `ConditionalFormatCollection`.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Returns the preset criteria conditional format. See `Excel.PresetCriteriaConditionalFormat` for more details.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var preset: js.UndefOr[PresetCriteriaConditionalFormatData] = js.undefined
  
  /**
    * Returns the preset criteria conditional format. See `Excel.PresetCriteriaConditionalFormat` for more details.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var presetOrNullObject: js.UndefOr[PresetCriteriaConditionalFormatData] = js.undefined
  
  /**
    * The priority (or index) within the conditional format collection that this conditional format currently exists in. Changing this also
    changes other conditional formats' priorities, to allow for a contiguous priority order.
    Use a negative priority to begin from the back.
    Priorities greater than the bounds will get and set to the maximum (or minimum if negative) priority.
    Also note that if you change the priority, you have to re-fetch a new copy of the object at that new priority location if you want to make further changes to it.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * If the conditions of this conditional format are met, no lower-priority formats shall take effect on that cell.
    Value is `null` on data bars, icon sets, and color scales as there's no concept of `StopIfTrue` for these.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var stopIfTrue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the specific text conditional format properties if the current conditional format is a text type.
    For example, to format cells matching the word "Text".
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var textComparison: js.UndefOr[TextConditionalFormatData] = js.undefined
  
  /**
    * Returns the specific text conditional format properties if the current conditional format is a text type.
    For example, to format cells matching the word "Text".
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var textComparisonOrNullObject: js.UndefOr[TextConditionalFormatData] = js.undefined
  
  /**
    * Returns the top/bottom conditional format properties if the current conditional format is a `TopBottom` type.
    For example, to format the top 10% or bottom 10 items.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var topBottom: js.UndefOr[TopBottomConditionalFormatData] = js.undefined
  
  /**
    * Returns the top/bottom conditional format properties if the current conditional format is a `TopBottom` type.
    For example, to format the top 10% or bottom 10 items.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var topBottomOrNullObject: js.UndefOr[TopBottomConditionalFormatData] = js.undefined
  
  /**
    * A type of conditional format. Only one can be set at a time.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var `type`: js.UndefOr[
    ConditionalFormatType | Custom | DataBar | ColorScale | IconSet | TopBottom | PresetCriteria | ContainsText | CellValue
  ] = js.undefined
}
object ConditionalFormatData {
  
  inline def apply(): ConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatData]
  }
  
  extension [Self <: ConditionalFormatData](x: Self) {
    
    inline def setCellValue(value: CellValueConditionalFormatData): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
    
    inline def setCellValueOrNullObject(value: CellValueConditionalFormatData): Self = StObject.set(x, "cellValueOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setCellValueOrNullObjectUndefined: Self = StObject.set(x, "cellValueOrNullObject", js.undefined)
    
    inline def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
    
    inline def setColorScale(value: ColorScaleConditionalFormatData): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    inline def setColorScaleOrNullObject(value: ColorScaleConditionalFormatData): Self = StObject.set(x, "colorScaleOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setColorScaleOrNullObjectUndefined: Self = StObject.set(x, "colorScaleOrNullObject", js.undefined)
    
    inline def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
    
    inline def setCustom(value: CustomConditionalFormatData): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomOrNullObject(value: CustomConditionalFormatData): Self = StObject.set(x, "customOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setCustomOrNullObjectUndefined: Self = StObject.set(x, "customOrNullObject", js.undefined)
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDataBar(value: DataBarConditionalFormatData): Self = StObject.set(x, "dataBar", value.asInstanceOf[js.Any])
    
    inline def setDataBarOrNullObject(value: DataBarConditionalFormatData): Self = StObject.set(x, "dataBarOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setDataBarOrNullObjectUndefined: Self = StObject.set(x, "dataBarOrNullObject", js.undefined)
    
    inline def setDataBarUndefined: Self = StObject.set(x, "dataBar", js.undefined)
    
    inline def setIconSet(value: IconSetConditionalFormatData): Self = StObject.set(x, "iconSet", value.asInstanceOf[js.Any])
    
    inline def setIconSetOrNullObject(value: IconSetConditionalFormatData): Self = StObject.set(x, "iconSetOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setIconSetOrNullObjectUndefined: Self = StObject.set(x, "iconSetOrNullObject", js.undefined)
    
    inline def setIconSetUndefined: Self = StObject.set(x, "iconSet", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPreset(value: PresetCriteriaConditionalFormatData): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetOrNullObject(value: PresetCriteriaConditionalFormatData): Self = StObject.set(x, "presetOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setPresetOrNullObjectUndefined: Self = StObject.set(x, "presetOrNullObject", js.undefined)
    
    inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setStopIfTrue(value: Boolean): Self = StObject.set(x, "stopIfTrue", value.asInstanceOf[js.Any])
    
    inline def setStopIfTrueUndefined: Self = StObject.set(x, "stopIfTrue", js.undefined)
    
    inline def setTextComparison(value: TextConditionalFormatData): Self = StObject.set(x, "textComparison", value.asInstanceOf[js.Any])
    
    inline def setTextComparisonOrNullObject(value: TextConditionalFormatData): Self = StObject.set(x, "textComparisonOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setTextComparisonOrNullObjectUndefined: Self = StObject.set(x, "textComparisonOrNullObject", js.undefined)
    
    inline def setTextComparisonUndefined: Self = StObject.set(x, "textComparison", js.undefined)
    
    inline def setTopBottom(value: TopBottomConditionalFormatData): Self = StObject.set(x, "topBottom", value.asInstanceOf[js.Any])
    
    inline def setTopBottomOrNullObject(value: TopBottomConditionalFormatData): Self = StObject.set(x, "topBottomOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setTopBottomOrNullObjectUndefined: Self = StObject.set(x, "topBottomOrNullObject", js.undefined)
    
    inline def setTopBottomUndefined: Self = StObject.set(x, "topBottom", js.undefined)
    
    inline def setType(
      value: ConditionalFormatType | Custom | DataBar | ColorScale | IconSet | TopBottom | PresetCriteria | ContainsText | CellValue
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
