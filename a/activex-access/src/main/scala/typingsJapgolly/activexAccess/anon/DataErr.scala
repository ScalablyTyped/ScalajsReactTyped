package typingsJapgolly.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataErr extends StObject {
  
  var DataErr: Double
  
  var Response: Double
}
object DataErr {
  
  inline def apply(DataErr: Double, Response: Double): DataErr = {
    val __obj = js.Dynamic.literal(DataErr = DataErr.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataErr]
  }
  
  extension [Self <: DataErr](x: Self) {
    
    inline def setDataErr(value: Double): Self = StObject.set(x, "DataErr", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Double): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
  }
}
