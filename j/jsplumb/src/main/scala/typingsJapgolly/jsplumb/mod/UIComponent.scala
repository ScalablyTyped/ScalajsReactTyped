package typingsJapgolly.jsplumb.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIComponent extends StObject {
  
  def getParameter(name: String): Any
  
  def getParameters(): Record[String, Any]
  
  def setParameter(name: String, value: Any): Unit
  
  def setParameters(parameters: Record[String, Any]): Unit
}
object UIComponent {
  
  inline def apply(
    getParameter: String => Any,
    getParameters: CallbackTo[Record[String, Any]],
    setParameter: (String, Any) => Callback,
    setParameters: Record[String, Any] => Callback
  ): UIComponent = {
    val __obj = js.Dynamic.literal(getParameter = js.Any.fromFunction1(getParameter), getParameters = getParameters.toJsFn, setParameter = js.Any.fromFunction2((t0: String, t1: Any) => (setParameter(t0, t1)).runNow()), setParameters = js.Any.fromFunction1((t0: Record[String, Any]) => setParameters(t0).runNow()))
    __obj.asInstanceOf[UIComponent]
  }
  
  extension [Self <: UIComponent](x: Self) {
    
    inline def setGetParameter(value: String => Any): Self = StObject.set(x, "getParameter", js.Any.fromFunction1(value))
    
    inline def setGetParameters(value: CallbackTo[Record[String, Any]]): Self = StObject.set(x, "getParameters", value.toJsFn)
    
    inline def setSetParameter(value: (String, Any) => Callback): Self = StObject.set(x, "setParameter", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSetParameters(value: Record[String, Any] => Callback): Self = StObject.set(x, "setParameters", js.Any.fromFunction1((t0: Record[String, Any]) => value(t0).runNow()))
  }
}
