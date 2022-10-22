package typingsJapgolly.angular.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the $onDestroy lifecycle hook
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  */
trait IOnDestroy extends StObject {
  
  /**
    * Called on a controller when its containing scope is destroyed. Use this hook for releasing external resources,
    * watches and event handlers.
    */
  @JSName("$onDestroy")
  def $onDestroy(): Unit
}
object IOnDestroy {
  
  inline def apply($onDestroy: Callback): IOnDestroy = {
    val __obj = js.Dynamic.literal($onDestroy = $onDestroy.toJsFn)
    __obj.asInstanceOf[IOnDestroy]
  }
  
  extension [Self <: IOnDestroy](x: Self) {
    
    inline def set$onDestroy(value: Callback): Self = StObject.set(x, "$onDestroy", value.toJsFn)
  }
}
