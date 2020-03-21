package typingsJapgolly.serverless.serviceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.serverless.AnonCompiledCloudFormationTemplate
import typingsJapgolly.serverless.mod.Event
import typingsJapgolly.serverless.mod.FunctionDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var custom: Custom
  var provider: AnonCompiledCloudFormationTemplate
  def getAllEventsInFunction(functionName: String): js.Array[Event]
  def getAllFunctions(): js.Array[String]
  def getAllFunctionsNames(): js.Array[String]
  def getEventInFunction(eventName: String, functionName: String): Event
  def getFunction(functionName: String): FunctionDefinition
  def getServiceName(): String
  def load(rawOptions: js.Object): js.Promise[_]
  def mergeResourceArrays(): Unit
  def setFunctionNames(rawOptions: js.Object): Unit
  def update(data: js.Object): js.Object
  def validate(): Service
}

object Service {
  @scala.inline
  def apply(
    custom: Custom,
    getAllEventsInFunction: String => CallbackTo[js.Array[Event]],
    getAllFunctions: CallbackTo[js.Array[String]],
    getAllFunctionsNames: CallbackTo[js.Array[String]],
    getEventInFunction: (String, String) => CallbackTo[Event],
    getFunction: String => CallbackTo[FunctionDefinition],
    getServiceName: CallbackTo[String],
    load: js.Object => CallbackTo[js.Promise[js.Any]],
    mergeResourceArrays: Callback,
    provider: AnonCompiledCloudFormationTemplate,
    setFunctionNames: js.Object => Callback,
    update: js.Object => CallbackTo[js.Object],
    validate: CallbackTo[Service]
  ): Service = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.updateDynamic("getAllEventsInFunction")(js.Any.fromFunction1((t0: java.lang.String) => getAllEventsInFunction(t0).runNow()))
    __obj.updateDynamic("getAllFunctions")(getAllFunctions.toJsFn)
    __obj.updateDynamic("getAllFunctionsNames")(getAllFunctionsNames.toJsFn)
    __obj.updateDynamic("getEventInFunction")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => getEventInFunction(t0, t1).runNow()))
    __obj.updateDynamic("getFunction")(js.Any.fromFunction1((t0: java.lang.String) => getFunction(t0).runNow()))
    __obj.updateDynamic("getServiceName")(getServiceName.toJsFn)
    __obj.updateDynamic("load")(js.Any.fromFunction1((t0: js.Object) => load(t0).runNow()))
    __obj.updateDynamic("mergeResourceArrays")(mergeResourceArrays.toJsFn)
    __obj.updateDynamic("setFunctionNames")(js.Any.fromFunction1((t0: js.Object) => setFunctionNames(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: js.Object) => update(t0).runNow()))
    __obj.updateDynamic("validate")(validate.toJsFn)
    __obj.asInstanceOf[Service]
  }
}

