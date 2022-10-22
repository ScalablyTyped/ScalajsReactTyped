package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicComponentGetViewStrategy extends StObject {
  
  /**
  	* Implement this hook if you want to provide custom view strategy when this component is used with the compose element or the router.
  	*/
  def getViewStrategy(): String | ViewStrategy_
}
object DynamicComponentGetViewStrategy {
  
  inline def apply(getViewStrategy: CallbackTo[String | ViewStrategy_]): DynamicComponentGetViewStrategy = {
    val __obj = js.Dynamic.literal(getViewStrategy = getViewStrategy.toJsFn)
    __obj.asInstanceOf[DynamicComponentGetViewStrategy]
  }
  
  extension [Self <: DynamicComponentGetViewStrategy](x: Self) {
    
    inline def setGetViewStrategy(value: CallbackTo[String | ViewStrategy_]): Self = StObject.set(x, "getViewStrategy", value.toJsFn)
  }
}
