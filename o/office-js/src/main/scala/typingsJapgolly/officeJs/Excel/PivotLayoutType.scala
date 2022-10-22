package typingsJapgolly.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PivotLayoutType extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.PivotLayoutType")
@js.native
object PivotLayoutType extends StObject {
  
  /**
    * A horizontally compressed form with labels from the next field in the same column.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait compact
    extends StObject
       with PivotLayoutType
  
  /**
    * Inner fields' items are on same row as outer fields' items and subtotals are always on the bottom.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait outline
    extends StObject
       with PivotLayoutType
  
  /**
    * Inner fields' items are always on a new line relative to the outer fields' items.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait tabular
    extends StObject
       with PivotLayoutType
}
