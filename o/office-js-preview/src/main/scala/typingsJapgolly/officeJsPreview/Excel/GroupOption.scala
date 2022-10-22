package typingsJapgolly.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupOption extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.GroupOption")
@js.native
object GroupOption extends StObject {
  
  /**
    * Group by columns.
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  @js.native
  sealed trait byColumns
    extends StObject
       with GroupOption
  
  /**
    * Group by rows.
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  @js.native
  sealed trait byRows
    extends StObject
       with GroupOption
}
