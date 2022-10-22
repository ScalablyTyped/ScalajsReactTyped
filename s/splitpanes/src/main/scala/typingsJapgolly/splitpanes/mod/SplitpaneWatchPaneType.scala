package typingsJapgolly.splitpanes.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitpaneWatchPaneType extends StObject {
  
  var deep: Boolean
  
  def handler(): Unit
  
  var immediate: Boolean
}
object SplitpaneWatchPaneType {
  
  inline def apply(deep: Boolean, handler: Callback, immediate: Boolean): SplitpaneWatchPaneType = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any], handler = handler.toJsFn, immediate = immediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitpaneWatchPaneType]
  }
  
  extension [Self <: SplitpaneWatchPaneType](x: Self) {
    
    inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setHandler(value: Callback): Self = StObject.set(x, "handler", value.toJsFn)
    
    inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
  }
}
