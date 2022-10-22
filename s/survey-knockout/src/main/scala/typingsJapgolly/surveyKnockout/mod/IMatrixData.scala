package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMatrixData extends StObject {
  
  def getCorrectedRowValue(value: Any): Any
  
  def onMatrixRowChanged(row: MatrixRowModel): Unit
}
object IMatrixData {
  
  inline def apply(getCorrectedRowValue: Any => Any, onMatrixRowChanged: MatrixRowModel => Callback): IMatrixData = {
    val __obj = js.Dynamic.literal(getCorrectedRowValue = js.Any.fromFunction1(getCorrectedRowValue), onMatrixRowChanged = js.Any.fromFunction1((t0: MatrixRowModel) => onMatrixRowChanged(t0).runNow()))
    __obj.asInstanceOf[IMatrixData]
  }
  
  extension [Self <: IMatrixData](x: Self) {
    
    inline def setGetCorrectedRowValue(value: Any => Any): Self = StObject.set(x, "getCorrectedRowValue", js.Any.fromFunction1(value))
    
    inline def setOnMatrixRowChanged(value: MatrixRowModel => Callback): Self = StObject.set(x, "onMatrixRowChanged", js.Any.fromFunction1((t0: MatrixRowModel) => value(t0).runNow()))
  }
}
