package typingsJapgolly.reactNavigation.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationEventSubscription extends StObject {
  
  def remove(): Unit
}
object NavigationEventSubscription {
  
  inline def apply(remove: Callback): NavigationEventSubscription = {
    val __obj = js.Dynamic.literal(remove = remove.toJsFn)
    __obj.asInstanceOf[NavigationEventSubscription]
  }
  
  extension [Self <: NavigationEventSubscription](x: Self) {
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
