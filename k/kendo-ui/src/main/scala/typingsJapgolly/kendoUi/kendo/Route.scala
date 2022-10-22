package typingsJapgolly.kendoUi.kendo

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route
  extends StObject
     with Class {
  
  def callback(url: String): Unit
  
  var route: js.RegExp
  
  def worksWith(url: String): Unit
}
object Route {
  
  inline def apply(callback: String => Callback, route: js.RegExp, worksWith: String => Callback): Route = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1((t0: String) => callback(t0).runNow()), route = route.asInstanceOf[js.Any], worksWith = js.Any.fromFunction1((t0: String) => worksWith(t0).runNow()))
    __obj.asInstanceOf[Route]
  }
  
  extension [Self <: Route](x: Self) {
    
    inline def setCallback(value: String => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRoute(value: js.RegExp): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setWorksWith(value: String => Callback): Self = StObject.set(x, "worksWith", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
