package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasMobilePreferred extends StObject {
  
  def isMobilePreferred(): Boolean
  
  def setMobilePreferred(isMobilePreferred: Boolean): Unit
}
object hasMobilePreferred {
  
  inline def apply(isMobilePreferred: CallbackTo[Boolean], setMobilePreferred: Boolean => Callback): hasMobilePreferred = {
    val __obj = js.Dynamic.literal(isMobilePreferred = isMobilePreferred.toJsFn, setMobilePreferred = js.Any.fromFunction1((t0: Boolean) => setMobilePreferred(t0).runNow()))
    __obj.asInstanceOf[hasMobilePreferred]
  }
  
  extension [Self <: hasMobilePreferred](x: Self) {
    
    inline def setIsMobilePreferred(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMobilePreferred", value.toJsFn)
    
    inline def setSetMobilePreferred(value: Boolean => Callback): Self = StObject.set(x, "setMobilePreferred", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
