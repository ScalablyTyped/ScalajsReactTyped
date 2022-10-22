package typingsJapgolly.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NLG extends StObject {
  
  var JPY: js.Array[String]
  
  var NLG: js.Array[String]
  
  var RUB: js.Array[String]
  
  var USD: js.Array[String]
}
object NLG {
  
  inline def apply(JPY: js.Array[String], NLG: js.Array[String], RUB: js.Array[String], USD: js.Array[String]): NLG = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NLG = NLG.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NLG]
  }
  
  extension [Self <: NLG](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setNLG(value: js.Array[String]): Self = StObject.set(x, "NLG", value.asInstanceOf[js.Any])
    
    inline def setNLGVarargs(value: String*): Self = StObject.set(x, "NLG", js.Array(value*))
    
    inline def setRUB(value: js.Array[String]): Self = StObject.set(x, "RUB", value.asInstanceOf[js.Any])
    
    inline def setRUBVarargs(value: String*): Self = StObject.set(x, "RUB", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
