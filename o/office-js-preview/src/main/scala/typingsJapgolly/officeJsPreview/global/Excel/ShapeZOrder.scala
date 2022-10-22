package typingsJapgolly.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies where in the z-order a shape should be moved relative to other shapes.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeZOrder")
@js.native
object ShapeZOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Excel.ShapeZOrder & String] = js.native
  
  /* "BringForward" */ val bringForward: typingsJapgolly.officeJsPreview.Excel.ShapeZOrder.bringForward & String = js.native
  
  /* "BringToFront" */ val bringToFront: typingsJapgolly.officeJsPreview.Excel.ShapeZOrder.bringToFront & String = js.native
  
  /* "SendBackward" */ val sendBackward: typingsJapgolly.officeJsPreview.Excel.ShapeZOrder.sendBackward & String = js.native
  
  /* "SendToBack" */ val sendToBack: typingsJapgolly.officeJsPreview.Excel.ShapeZOrder.sendToBack & String = js.native
}
