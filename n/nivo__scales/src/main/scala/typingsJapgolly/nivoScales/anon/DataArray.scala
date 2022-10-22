package typingsJapgolly.nivoScales.anon

import typingsJapgolly.nivoScales.distTypesComputeMod.SerieDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataArray[D /* <: SerieDatum */] extends StObject {
  
  var data: js.Array[Data[D]]
}
object DataArray {
  
  inline def apply[D /* <: SerieDatum */](data: js.Array[Data[D]]): DataArray[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataArray[D]]
  }
  
  extension [Self <: DataArray[?], D /* <: SerieDatum */](x: Self & DataArray[D]) {
    
    inline def setData(value: js.Array[Data[D]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Data[D]*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
