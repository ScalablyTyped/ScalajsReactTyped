package typingsJapgolly.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeTextHorizontalOverflow extends StObject
/**
  * Specifies the horizontal overflow for the text frame in a shape.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextHorizontalOverflow")
@js.native
object ShapeTextHorizontalOverflow extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait clip
    extends StObject
       with ShapeTextHorizontalOverflow
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait overflow
    extends StObject
       with ShapeTextHorizontalOverflow
}
