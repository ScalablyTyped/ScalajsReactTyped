package typingsJapgolly.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the state of calculation across the entire Excel application.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.CalculationState")
@js.native
object CalculationState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.CalculationState & String] = js.native
  
  /* "Calculating" */ val calculating: typingsJapgolly.officeJs.Excel.CalculationState.calculating & String = js.native
  
  /* "Done" */ val done: typingsJapgolly.officeJs.Excel.CalculationState.done & String = js.native
  
  /* "Pending" */ val pending: typingsJapgolly.officeJs.Excel.CalculationState.pending & String = js.native
}
