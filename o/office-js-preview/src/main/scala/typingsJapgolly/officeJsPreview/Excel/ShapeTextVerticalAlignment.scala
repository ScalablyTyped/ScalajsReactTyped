package typingsJapgolly.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeTextVerticalAlignment extends StObject
/**
  * Specifies the vertical alignment for the text frame in a shape.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextVerticalAlignment")
@js.native
object ShapeTextVerticalAlignment extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait bottom
    extends StObject
       with ShapeTextVerticalAlignment
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait distributed
    extends StObject
       with ShapeTextVerticalAlignment
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait justified
    extends StObject
       with ShapeTextVerticalAlignment
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait middle
    extends StObject
       with ShapeTextVerticalAlignment
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait top
    extends StObject
       with ShapeTextVerticalAlignment
}
