package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.BeginsWith
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Between
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Contains
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EndsWith
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Equals
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.GreaterThan
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.GreaterThanOrEqualTo
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LessThan
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LessThanOrEqualTo
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configurable template for a label filter to apply to a PivotField.
  The `condition` defines what criteria need to be set in order for the filter to operate.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
trait PivotLabelFilter extends StObject {
  
  /**
    * The comparator is the static value to which other values are compared. The type of comparison is defined by the condition.
    Note: A numeric string is treated as a number when being compared against other numeric strings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var comparator: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the condition for the filter, which defines the necessary filtering criteria.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var condition: LabelFilterCondition | Unknown_ | Equals | BeginsWith | EndsWith | Contains | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between
  
  /**
    * If `true`, filter *excludes* items that meet criteria. The default is `false` (filter to include items that meet criteria).
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The lower-bound of the range for the `between` filter condition.
    Note: A numeric string is treated as a number when being compared against other numeric strings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var lowerBound: js.UndefOr[String] = js.undefined
  
  /**
    * The substring used for `beginsWith`, `endsWith`, and `contains` filter conditions.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var substring: js.UndefOr[String] = js.undefined
  
  /**
    * The upper-bound of the range for the `between` filter condition.
    Note: A numeric string is treated as a number when being compared against other numeric strings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var upperBound: js.UndefOr[String] = js.undefined
}
object PivotLabelFilter {
  
  inline def apply(
    condition: LabelFilterCondition | Unknown_ | Equals | BeginsWith | EndsWith | Contains | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between
  ): PivotLabelFilter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotLabelFilter]
  }
  
  extension [Self <: PivotLabelFilter](x: Self) {
    
    inline def setComparator(value: String): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setCondition(
      value: LabelFilterCondition | Unknown_ | Equals | BeginsWith | EndsWith | Contains | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between
    ): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    inline def setLowerBound(value: String): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
    
    inline def setLowerBoundUndefined: Self = StObject.set(x, "lowerBound", js.undefined)
    
    inline def setSubstring(value: String): Self = StObject.set(x, "substring", value.asInstanceOf[js.Any])
    
    inline def setSubstringUndefined: Self = StObject.set(x, "substring", js.undefined)
    
    inline def setUpperBound(value: String): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundUndefined: Self = StObject.set(x, "upperBound", js.undefined)
  }
}
