package typingsJapgolly.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CloseBehavior extends StObject
/**
  * Specifies the close behavior for `Workbook.close`.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.CloseBehavior")
@js.native
object CloseBehavior extends StObject {
  
  /**
    * Save the possible changes before closing the workbook.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait save
    extends StObject
       with CloseBehavior
  
  /**
    * Discard the possible changes when closing the workbook.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait skipSave
    extends StObject
       with CloseBehavior
}
