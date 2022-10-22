package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait NavigationPreloadManager extends StObject {
  
  /* standard dom */
  def disable(): js.Promise[Unit]
  
  /* standard dom */
  def enable(): js.Promise[Unit]
  
  /* standard dom */
  def getState(): js.Promise[NavigationPreloadState]
  
  /* standard dom */
  def setHeaderValue(value: java.lang.String): js.Promise[Unit]
}
object NavigationPreloadManager {
  
  inline def apply(
    disable: CallbackTo[js.Promise[Unit]],
    enable: CallbackTo[js.Promise[Unit]],
    getState: CallbackTo[js.Promise[NavigationPreloadState]],
    setHeaderValue: java.lang.String => js.Promise[Unit]
  ): NavigationPreloadManager = {
    val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn, getState = getState.toJsFn, setHeaderValue = js.Any.fromFunction1(setHeaderValue))
    __obj.asInstanceOf[NavigationPreloadManager]
  }
  
  extension [Self <: NavigationPreloadManager](x: Self) {
    
    inline def setDisable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setEnable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setGetState(value: CallbackTo[js.Promise[NavigationPreloadState]]): Self = StObject.set(x, "getState", value.toJsFn)
    
    inline def setSetHeaderValue(value: java.lang.String => js.Promise[Unit]): Self = StObject.set(x, "setHeaderValue", js.Any.fromFunction1(value))
  }
}
