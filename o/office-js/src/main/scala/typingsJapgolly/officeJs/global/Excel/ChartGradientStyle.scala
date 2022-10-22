package typingsJapgolly.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the gradient style of a chart series. This is only applicable for region map charts.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartGradientStyle")
@js.native
object ChartGradientStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.ChartGradientStyle & String] = js.native
  
  /* "ThreePhaseColor" */ val threePhaseColor: typingsJapgolly.officeJs.Excel.ChartGradientStyle.threePhaseColor & String = js.native
  
  /* "TwoPhaseColor" */ val twoPhaseColor: typingsJapgolly.officeJs.Excel.ChartGradientStyle.twoPhaseColor & String = js.native
}
