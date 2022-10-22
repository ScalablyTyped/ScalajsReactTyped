package typingsJapgolly.ot.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mark extends StObject {
  
  def clear(): Unit
}
object Mark {
  
  inline def apply(clear: Callback): Mark = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn)
    __obj.asInstanceOf[Mark]
  }
  
  extension [Self <: Mark](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
  }
}
