package typingsJapgolly.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CNY extends StObject {
  
  var CNY: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object CNY {
  
  inline def apply(CNY: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): CNY = {
    val __obj = js.Dynamic.literal(CNY = CNY.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[CNY]
  }
  
  extension [Self <: CNY](x: Self) {
    
    inline def setCNY(value: js.Array[String]): Self = StObject.set(x, "CNY", value.asInstanceOf[js.Any])
    
    inline def setCNYVarargs(value: String*): Self = StObject.set(x, "CNY", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
