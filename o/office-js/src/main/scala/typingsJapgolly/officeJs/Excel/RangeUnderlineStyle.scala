package typingsJapgolly.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RangeUnderlineStyle extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.RangeUnderlineStyle")
@js.native
object RangeUnderlineStyle extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait double
    extends StObject
       with RangeUnderlineStyle
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait doubleAccountant
    extends StObject
       with RangeUnderlineStyle
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait none
    extends StObject
       with RangeUnderlineStyle
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait single
    extends StObject
       with RangeUnderlineStyle
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait singleAccountant
    extends StObject
       with RangeUnderlineStyle
}
