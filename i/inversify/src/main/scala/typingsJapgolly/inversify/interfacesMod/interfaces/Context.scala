package typingsJapgolly.inversify.interfacesMod.interfaces

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var container: Container
  var currentRequest: Request
  var id: Double
  var plan: Plan
  def addPlan(plan: Plan): Unit
  def setCurrentRequest(request: Request): Unit
}

object Context {
  @scala.inline
  def apply(
    addPlan: Plan => Callback,
    container: Container,
    currentRequest: Request,
    id: Double,
    plan: Plan,
    setCurrentRequest: Request => Callback
  ): Context = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], currentRequest = currentRequest.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any])
    __obj.updateDynamic("addPlan")(js.Any.fromFunction1((t0: typingsJapgolly.inversify.interfacesMod.interfaces.Plan) => addPlan(t0).runNow()))
    __obj.updateDynamic("setCurrentRequest")(js.Any.fromFunction1((t0: typingsJapgolly.inversify.interfacesMod.interfaces.Request) => setCurrentRequest(t0).runNow()))
    __obj.asInstanceOf[Context]
  }
}

