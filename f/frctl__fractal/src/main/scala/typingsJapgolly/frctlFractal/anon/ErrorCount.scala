package typingsJapgolly.frctlFractal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorCount extends StObject {
  
  var errorCount: Double
}
object ErrorCount {
  
  inline def apply(errorCount: Double): ErrorCount = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCount]
  }
  
  extension [Self <: ErrorCount](x: Self) {
    
    inline def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
  }
}
