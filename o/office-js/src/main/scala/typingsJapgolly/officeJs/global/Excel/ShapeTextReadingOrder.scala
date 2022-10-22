package typingsJapgolly.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the reading order for the text frame in a shape.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextReadingOrder")
@js.native
object ShapeTextReadingOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.ShapeTextReadingOrder & String] = js.native
  
  /* "LeftToRight" */ val leftToRight: typingsJapgolly.officeJs.Excel.ShapeTextReadingOrder.leftToRight & String = js.native
  
  /* "RightToLeft" */ val rightToLeft: typingsJapgolly.officeJs.Excel.ShapeTextReadingOrder.rightToLeft & String = js.native
}
