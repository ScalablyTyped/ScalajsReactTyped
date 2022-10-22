package typingsJapgolly.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionalFormatColorCriterionType extends StObject
/**
  * Represents the types of color criterion for conditional formatting.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatColorCriterionType")
@js.native
object ConditionalFormatColorCriterionType extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  @js.native
  sealed trait formula
    extends StObject
       with ConditionalFormatColorCriterionType
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  @js.native
  sealed trait highestValue
    extends StObject
       with ConditionalFormatColorCriterionType
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  @js.native
  sealed trait invalid
    extends StObject
       with ConditionalFormatColorCriterionType
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  @js.native
  sealed trait lowestValue
    extends StObject
       with ConditionalFormatColorCriterionType
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  @js.native
  sealed trait number
    extends StObject
       with ConditionalFormatColorCriterionType
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  @js.native
  sealed trait percent
    extends StObject
       with ConditionalFormatColorCriterionType
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  @js.native
  sealed trait percentile
    extends StObject
       with ConditionalFormatColorCriterionType
}
