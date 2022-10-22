package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XVbaMethodParameter
  extends StObject
     with XInterface {
  
  /** returns the value of the parameter with the specified name. */
  def getVbaMethodParameter(PropertyName: String): Any
  
  /** sets the value of the parameter with the specified name. */
  def setVbaMethodParameter(PropertyName: String, Value: Any): Unit
}
object XVbaMethodParameter {
  
  inline def apply(
    acquire: Callback,
    getVbaMethodParameter: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    setVbaMethodParameter: (String, Any) => Callback
  ): XVbaMethodParameter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getVbaMethodParameter = js.Any.fromFunction1(getVbaMethodParameter), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setVbaMethodParameter = js.Any.fromFunction2((t0: String, t1: Any) => (setVbaMethodParameter(t0, t1)).runNow()))
    __obj.asInstanceOf[XVbaMethodParameter]
  }
  
  extension [Self <: XVbaMethodParameter](x: Self) {
    
    inline def setGetVbaMethodParameter(value: String => Any): Self = StObject.set(x, "getVbaMethodParameter", js.Any.fromFunction1(value))
    
    inline def setSetVbaMethodParameter(value: (String, Any) => Callback): Self = StObject.set(x, "setVbaMethodParameter", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
