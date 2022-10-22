package typingsJapgolly.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataErrorObject extends StObject {
  
  var dataHeight: Double
  
  var dataWidth: Double
  
  var errorMessage: String
}
object GetDataErrorObject {
  
  inline def apply(dataHeight: Double, dataWidth: Double, errorMessage: String): GetDataErrorObject = {
    val __obj = js.Dynamic.literal(dataHeight = dataHeight.asInstanceOf[js.Any], dataWidth = dataWidth.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataErrorObject]
  }
  
  extension [Self <: GetDataErrorObject](x: Self) {
    
    inline def setDataHeight(value: Double): Self = StObject.set(x, "dataHeight", value.asInstanceOf[js.Any])
    
    inline def setDataWidth(value: Double): Self = StObject.set(x, "dataWidth", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}
