package typingsJapgolly.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the gradient style type of a chart series. This is only applicable for region map charts.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartGradientStyleType")
@js.native
object ChartGradientStyleType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.ChartGradientStyleType & String] = js.native
  
  /* "ExtremeValue" */ val extremeValue: typingsJapgolly.officeJs.Excel.ChartGradientStyleType.extremeValue & String = js.native
  
  /* "Number" */ val number: typingsJapgolly.officeJs.Excel.ChartGradientStyleType.number & String = js.native
  
  /* "Percent" */ val percent: typingsJapgolly.officeJs.Excel.ChartGradientStyleType.percent & String = js.native
}
