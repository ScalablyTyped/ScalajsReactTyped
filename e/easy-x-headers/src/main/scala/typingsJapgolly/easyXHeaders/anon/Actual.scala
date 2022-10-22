package typingsJapgolly.easyXHeaders.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actual extends StObject {
  
  var actual: js.UndefOr[Any] = js.undefined
  
  var expected: js.UndefOr[Any] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var operator: js.UndefOr[String] = js.undefined
  
  var stackStartFunction: js.UndefOr[js.Function] = js.undefined
}
object Actual {
  
  inline def apply(): Actual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actual]
  }
  
  extension [Self <: Actual](x: Self) {
    
    inline def setActual(value: Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
    
    inline def setExpected(value: Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    inline def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setStackStartFunction(value: js.Function): Self = StObject.set(x, "stackStartFunction", value.asInstanceOf[js.Any])
    
    inline def setStackStartFunctionUndefined: Self = StObject.set(x, "stackStartFunction", js.undefined)
  }
}
