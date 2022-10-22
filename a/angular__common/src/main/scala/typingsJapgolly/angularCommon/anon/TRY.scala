package typingsJapgolly.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TRY extends StObject {
  
  var JPY: js.Array[String]
  
  var TRY: js.Array[String]
  
  var USD: js.Array[String]
}
object TRY {
  
  inline def apply(JPY: js.Array[String], TRY: js.Array[String], USD: js.Array[String]): TRY = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TRY = TRY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[TRY]
  }
  
  extension [Self <: TRY](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setTRY(value: js.Array[String]): Self = StObject.set(x, "TRY", value.asInstanceOf[js.Any])
    
    inline def setTRYVarargs(value: String*): Self = StObject.set(x, "TRY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
