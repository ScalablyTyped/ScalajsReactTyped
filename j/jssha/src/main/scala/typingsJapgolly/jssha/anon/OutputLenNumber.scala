package typingsJapgolly.jssha.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputLenNumber extends StObject {
  
  var outputLen: Double
}
object OutputLenNumber {
  
  inline def apply(outputLen: Double): OutputLenNumber = {
    val __obj = js.Dynamic.literal(outputLen = outputLen.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputLenNumber]
  }
  
  extension [Self <: OutputLenNumber](x: Self) {
    
    inline def setOutputLen(value: Double): Self = StObject.set(x, "outputLen", value.asInstanceOf[js.Any])
  }
}
