package typingsJapgolly.domNavigationPreload

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://w3c.github.io/ServiceWorker/#navigationpreloadmanager */
trait NavigationPreloadManager extends StObject {
  
  def disable(): js.Promise[Unit]
  
  def enable(): js.Promise[Unit]
  
  def getState(): js.Promise[NavigationPreloadState]
  
  def setHeaderValue(value: String): js.Promise[Unit]
}
object NavigationPreloadManager {
  
  inline def apply(
    disable: CallbackTo[js.Promise[Unit]],
    enable: CallbackTo[js.Promise[Unit]],
    getState: CallbackTo[js.Promise[NavigationPreloadState]],
    setHeaderValue: String => js.Promise[Unit]
  ): NavigationPreloadManager = {
    val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn, getState = getState.toJsFn, setHeaderValue = js.Any.fromFunction1(setHeaderValue))
    __obj.asInstanceOf[NavigationPreloadManager]
  }
  
  extension [Self <: NavigationPreloadManager](x: Self) {
    
    inline def setDisable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setEnable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setGetState(value: CallbackTo[js.Promise[NavigationPreloadState]]): Self = StObject.set(x, "getState", value.toJsFn)
    
    inline def setSetHeaderValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "setHeaderValue", js.Any.fromFunction1(value))
  }
}
