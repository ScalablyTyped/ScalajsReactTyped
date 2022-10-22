package typingsJapgolly.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CalculationMode extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.CalculationMode")
@js.native
object CalculationMode extends StObject {
  
  /**
    * The default recalculation behavior where Excel calculates new formula results every time the relevant data is changed.
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait automatic
    extends StObject
       with CalculationMode
  
  /**
    * Calculates new formula results every time the relevant data is changed, unless the formula is in a data table.
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait automaticExceptTables
    extends StObject
       with CalculationMode
  
  /**
    * Calculations only occur when the user or add-in requests them.
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait manual
    extends StObject
       with CalculationMode
}
