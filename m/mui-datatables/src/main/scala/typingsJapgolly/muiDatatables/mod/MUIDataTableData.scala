package typingsJapgolly.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableData extends StObject {
  
  var data: js.Array[js.Object | (js.Array[Double | String])]
  
  var index: Double
}
object MUIDataTableData {
  
  inline def apply(data: js.Array[js.Object | (js.Array[Double | String])], index: Double): MUIDataTableData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableData]
  }
  
  extension [Self <: MUIDataTableData](x: Self) {
    
    inline def setData(value: js.Array[js.Object | (js.Array[Double | String])]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (js.Object | (js.Array[Double | String]))*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
