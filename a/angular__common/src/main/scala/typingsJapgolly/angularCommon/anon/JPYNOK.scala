package typingsJapgolly.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JPYNOK extends StObject {
  
  var DKK: js.Array[String]
  
  var JPY: js.Array[String]
  
  var NOK: js.Array[String]
  
  var SEK: js.Array[String]
  
  var THB: js.Array[String]
  
  var USD: js.Array[String]
}
object JPYNOK {
  
  inline def apply(
    DKK: js.Array[String],
    JPY: js.Array[String],
    NOK: js.Array[String],
    SEK: js.Array[String],
    THB: js.Array[String],
    USD: js.Array[String]
  ): JPYNOK = {
    val __obj = js.Dynamic.literal(DKK = DKK.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], NOK = NOK.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYNOK]
  }
  
  extension [Self <: JPYNOK](x: Self) {
    
    inline def setDKK(value: js.Array[String]): Self = StObject.set(x, "DKK", value.asInstanceOf[js.Any])
    
    inline def setDKKVarargs(value: String*): Self = StObject.set(x, "DKK", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setNOK(value: js.Array[String]): Self = StObject.set(x, "NOK", value.asInstanceOf[js.Any])
    
    inline def setNOKVarargs(value: String*): Self = StObject.set(x, "NOK", js.Array(value*))
    
    inline def setSEK(value: js.Array[String]): Self = StObject.set(x, "SEK", value.asInstanceOf[js.Any])
    
    inline def setSEKVarargs(value: String*): Self = StObject.set(x, "SEK", js.Array(value*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
