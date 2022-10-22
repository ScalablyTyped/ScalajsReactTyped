package typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  def addPlan(plan: Plan): Unit
  
  var container: Container
  
  var currentRequest: Request
  
  var id: Double
  
  var plan: Plan
  
  def setCurrentRequest(request: Request): Unit
}
object Context {
  
  inline def apply(
    addPlan: Plan => Callback,
    container: Container,
    currentRequest: Request,
    id: Double,
    plan: Plan,
    setCurrentRequest: Request => Callback
  ): Context = {
    val __obj = js.Dynamic.literal(addPlan = js.Any.fromFunction1((t0: Plan) => addPlan(t0).runNow()), container = container.asInstanceOf[js.Any], currentRequest = currentRequest.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], setCurrentRequest = js.Any.fromFunction1((t0: Request) => setCurrentRequest(t0).runNow()))
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setAddPlan(value: Plan => Callback): Self = StObject.set(x, "addPlan", js.Any.fromFunction1((t0: Plan) => value(t0).runNow()))
    
    inline def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setCurrentRequest(value: Request): Self = StObject.set(x, "currentRequest", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPlan(value: Plan): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setSetCurrentRequest(value: Request => Callback): Self = StObject.set(x, "setCurrentRequest", js.Any.fromFunction1((t0: Request) => value(t0).runNow()))
  }
}
