package typingsJapgolly.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataValidationAlertStyle extends StObject
/**
  * Represents the data validation error alert style. The default is `Stop`.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationAlertStyle")
@js.native
object DataValidationAlertStyle extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait information
    extends StObject
       with DataValidationAlertStyle
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait stop
    extends StObject
       with DataValidationAlertStyle
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait warning
    extends StObject
       with DataValidationAlertStyle
}
