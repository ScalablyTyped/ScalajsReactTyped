package typingsJapgolly.cypress.Chai

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertionPrototype extends StObject {
  
  var _obj: Any
  
  def assert(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AssertionArgs is not an array type */ args: AssertionArgs
  ): Unit
}
object AssertionPrototype {
  
  inline def apply(_obj: Any, assert: AssertionArgs => Callback): AssertionPrototype = {
    val __obj = js.Dynamic.literal(_obj = _obj.asInstanceOf[js.Any], assert = js.Any.fromFunction1((t0: AssertionArgs) => assert(t0).runNow()))
    __obj.asInstanceOf[AssertionPrototype]
  }
  
  extension [Self <: AssertionPrototype](x: Self) {
    
    inline def setAssert(value: AssertionArgs => Callback): Self = StObject.set(x, "assert", js.Any.fromFunction1((t0: AssertionArgs) => value(t0).runNow()))
    
    inline def set_obj(value: Any): Self = StObject.set(x, "_obj", value.asInstanceOf[js.Any])
  }
}
