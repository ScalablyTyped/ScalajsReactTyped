package typingsJapgolly.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KESUGX extends StObject {
  
  var JPY: js.Array[String]
  
  var KES: js.Array[String]
  
  var UGX: js.Array[String]
  
  var USD: js.Array[String]
}
object KESUGX {
  
  inline def apply(JPY: js.Array[String], KES: js.Array[String], UGX: js.Array[String], USD: js.Array[String]): KESUGX = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KES = KES.asInstanceOf[js.Any], UGX = UGX.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[KESUGX]
  }
  
  extension [Self <: KESUGX](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setKES(value: js.Array[String]): Self = StObject.set(x, "KES", value.asInstanceOf[js.Any])
    
    inline def setKESVarargs(value: String*): Self = StObject.set(x, "KES", js.Array(value*))
    
    inline def setUGX(value: js.Array[String]): Self = StObject.set(x, "UGX", value.asInstanceOf[js.Any])
    
    inline def setUGXVarargs(value: String*): Self = StObject.set(x, "UGX", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
