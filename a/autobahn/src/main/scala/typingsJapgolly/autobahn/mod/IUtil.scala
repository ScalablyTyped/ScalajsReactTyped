package typingsJapgolly.autobahn.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUtil extends StObject {
  
  def assert(condition: Boolean, message: String): Unit
}
object IUtil {
  
  inline def apply(assert: (Boolean, String) => Callback): IUtil = {
    val __obj = js.Dynamic.literal(assert = js.Any.fromFunction2((t0: Boolean, t1: String) => (assert(t0, t1)).runNow()))
    __obj.asInstanceOf[IUtil]
  }
  
  extension [Self <: IUtil](x: Self) {
    
    inline def setAssert(value: (Boolean, String) => Callback): Self = StObject.set(x, "assert", js.Any.fromFunction2((t0: Boolean, t1: String) => (value(t0, t1)).runNow()))
  }
}
