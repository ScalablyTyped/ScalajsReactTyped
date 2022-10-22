package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOM extends StObject {
  
  /**
    * Manually update the dom with the current record set...
    * This can be useful after multiple calls to `domcolumns.add()` with `skipUpdate` set to true.
    * This way we improve performance by generating the DOM only once.
    */
  def update(): Unit
}
object DOM {
  
  inline def apply(update: Callback): DOM = {
    val __obj = js.Dynamic.literal(update = update.toJsFn)
    __obj.asInstanceOf[DOM]
  }
  
  extension [Self <: DOM](x: Self) {
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
  }
}
