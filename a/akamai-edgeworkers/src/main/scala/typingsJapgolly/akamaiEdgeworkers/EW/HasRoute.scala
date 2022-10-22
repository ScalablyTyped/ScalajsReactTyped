package typingsJapgolly.akamaiEdgeworkers.EW

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasRoute extends StObject {
  
  /**
    * If called, indicates that the request should be routed to a pre-specified origin
    * server,or have the path or query string modified.
    *
    * @param destination Object holding properties that will control route
    */
  def route(destination: Destination): Unit
}
object HasRoute {
  
  inline def apply(route: Destination => Callback): HasRoute = {
    val __obj = js.Dynamic.literal(route = js.Any.fromFunction1((t0: Destination) => route(t0).runNow()))
    __obj.asInstanceOf[HasRoute]
  }
  
  extension [Self <: HasRoute](x: Self) {
    
    inline def setRoute(value: Destination => Callback): Self = StObject.set(x, "route", js.Any.fromFunction1((t0: Destination) => value(t0).runNow()))
  }
}
