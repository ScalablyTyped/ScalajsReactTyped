package typingsJapgolly.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartTextVerticalAlignment extends StObject
/**
  * Represents the vertical alignment for the specified object.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTextVerticalAlignment")
@js.native
object ChartTextVerticalAlignment extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait bottom
    extends StObject
       with ChartTextVerticalAlignment
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait center
    extends StObject
       with ChartTextVerticalAlignment
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait distributed
    extends StObject
       with ChartTextVerticalAlignment
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait justify
    extends StObject
       with ChartTextVerticalAlignment
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait top
    extends StObject
       with ChartTextVerticalAlignment
}
