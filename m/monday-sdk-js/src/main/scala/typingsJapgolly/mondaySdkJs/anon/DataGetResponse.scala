package typingsJapgolly.mondaySdkJs.anon

import typingsJapgolly.mondaySdkJs.mod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataGetResponse extends StObject {
  
  var data: GetResponse
}
object DataGetResponse {
  
  inline def apply(data: GetResponse): DataGetResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGetResponse]
  }
  
  extension [Self <: DataGetResponse](x: Self) {
    
    inline def setData(value: GetResponse): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
