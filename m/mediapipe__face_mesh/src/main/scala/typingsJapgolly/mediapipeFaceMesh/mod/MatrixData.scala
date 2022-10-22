package typingsJapgolly.mediapipeFaceMesh.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatrixData extends StObject {
  
  def getCols(): Double
  
  def getLayout(): Layout
  
  def getPackedDataList(): js.Array[Double]
  
  def getRows(): Double
}
object MatrixData {
  
  inline def apply(
    getCols: CallbackTo[Double],
    getLayout: CallbackTo[Layout],
    getPackedDataList: CallbackTo[js.Array[Double]],
    getRows: CallbackTo[Double]
  ): MatrixData = {
    val __obj = js.Dynamic.literal(getCols = getCols.toJsFn, getLayout = getLayout.toJsFn, getPackedDataList = getPackedDataList.toJsFn, getRows = getRows.toJsFn)
    __obj.asInstanceOf[MatrixData]
  }
  
  extension [Self <: MatrixData](x: Self) {
    
    inline def setGetCols(value: CallbackTo[Double]): Self = StObject.set(x, "getCols", value.toJsFn)
    
    inline def setGetLayout(value: CallbackTo[Layout]): Self = StObject.set(x, "getLayout", value.toJsFn)
    
    inline def setGetPackedDataList(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getPackedDataList", value.toJsFn)
    
    inline def setGetRows(value: CallbackTo[Double]): Self = StObject.set(x, "getRows", value.toJsFn)
  }
}
