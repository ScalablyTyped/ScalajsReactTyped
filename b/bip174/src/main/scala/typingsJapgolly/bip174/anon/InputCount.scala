package typingsJapgolly.bip174.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputCount extends StObject {
  
  var inputCount: Double
  
  var outputCount: Double
}
object InputCount {
  
  inline def apply(inputCount: Double, outputCount: Double): InputCount = {
    val __obj = js.Dynamic.literal(inputCount = inputCount.asInstanceOf[js.Any], outputCount = outputCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputCount]
  }
  
  extension [Self <: InputCount](x: Self) {
    
    inline def setInputCount(value: Double): Self = StObject.set(x, "inputCount", value.asInstanceOf[js.Any])
    
    inline def setOutputCount(value: Double): Self = StObject.set(x, "outputCount", value.asInstanceOf[js.Any])
  }
}
