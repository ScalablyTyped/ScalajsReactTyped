package typingsJapgolly.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectsResponse[DataType] extends StObject {
  
  var data: DataType
  
  var status: Double
}
object ObjectsResponse {
  
  inline def apply[DataType](data: DataType, status: Double): ObjectsResponse[DataType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsResponse[DataType]]
  }
  
  extension [Self <: ObjectsResponse[?], DataType](x: Self & ObjectsResponse[DataType]) {
    
    inline def setData(value: DataType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
