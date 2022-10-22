package typingsJapgolly.reactShare.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCount extends StObject {
  
  def updateCount(index: String, count: String): Unit
}
object UpdateCount {
  
  inline def apply(updateCount: (String, String) => Callback): UpdateCount = {
    val __obj = js.Dynamic.literal(updateCount = js.Any.fromFunction2((t0: String, t1: String) => (updateCount(t0, t1)).runNow()))
    __obj.asInstanceOf[UpdateCount]
  }
  
  extension [Self <: UpdateCount](x: Self) {
    
    inline def setUpdateCount(value: (String, String) => Callback): Self = StObject.set(x, "updateCount", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
