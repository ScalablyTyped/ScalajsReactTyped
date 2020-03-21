package typingsJapgolly.lambdaPhi.lambdaManagerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.lambdaPhi.apiGatewayMod.ApiGateway
import typingsJapgolly.lambdaPhi.lambdaConfigMod.LambdaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaManager extends js.Object {
  var _apiGateway: js.Any
  var _callback: js.Any
  var _context: js.Any
  var _event: js.Any
  var _lambdaModels: js.Any
  var _lambdas: js.Any
  var _rawHandler: js.Any
  var apiGateway: ApiGateway
  var callback: js.Any
  var context: js.Any
  var event: js.Any
  var rawHandler: js.Any
  def addCallbackProperty(target: js.Any, property: js.Any): Unit
  def addContextProperty(target: js.Any, property: js.Any): Unit
  def addEventContextProperty(target: js.Any, property: js.Any): Unit
  def addEventProperty(target: js.Any, property: js.Any): Unit
  def addHandlerMethod(target: js.Any, method: js.Any): Unit
  def addPostConstructorMethod(target: js.Any, method: js.Any): Unit
  def addPreLambdaCallbackMethod(target: js.Any, method: String): Unit
  def addPreLambdaTimeoutMethod(target: js.Any, method: String, miliSecondsBeforeTimeout: Double): Unit
  /* private */ def executeHandler(lambda: js.Any): js.Any
  /* private */ def executePostConstructor(lambda: js.Any): js.Any
  /* private */ def executePreLambdaCallback(lambda: js.Any): js.Any
  /* private */ def getEvent(lambda: js.Any): js.Any
  /* private */ def getEventContext(): js.Any
  def getLambdaByName(name: String): typingsJapgolly.lambdaPhi.lambdaModelMod.default
  def processLambdas(): Unit
  def setLambda(target: js.Any, lambdaConfig: LambdaConfig): Unit
  def setLambdaPath(target: js.Any, path: js.Any): Unit
  /* private */ def setLambdaProperties(lambda: js.Any): js.Any
  /* private */ def setPreLambdaTimeoutMethod(lambda: js.Any): js.Any
  def upsertLambdaModel(target: js.Any): typingsJapgolly.lambdaPhi.lambdaModelMod.default
}

object LambdaManager {
  @scala.inline
  def apply(
    _apiGateway: js.Any,
    _callback: js.Any,
    _context: js.Any,
    _event: js.Any,
    _lambdaModels: js.Any,
    _lambdas: js.Any,
    _rawHandler: js.Any,
    addCallbackProperty: (js.Any, js.Any) => Callback,
    addContextProperty: (js.Any, js.Any) => Callback,
    addEventContextProperty: (js.Any, js.Any) => Callback,
    addEventProperty: (js.Any, js.Any) => Callback,
    addHandlerMethod: (js.Any, js.Any) => Callback,
    addPostConstructorMethod: (js.Any, js.Any) => Callback,
    addPreLambdaCallbackMethod: (js.Any, String) => Callback,
    addPreLambdaTimeoutMethod: (js.Any, String, Double) => Callback,
    apiGateway: ApiGateway,
    callback: js.Any,
    context: js.Any,
    event: js.Any,
    executeHandler: js.Any => CallbackTo[js.Any],
    executePostConstructor: js.Any => CallbackTo[js.Any],
    executePreLambdaCallback: js.Any => CallbackTo[js.Any],
    getEvent: js.Any => CallbackTo[js.Any],
    getEventContext: CallbackTo[js.Any],
    getLambdaByName: String => CallbackTo[typingsJapgolly.lambdaPhi.lambdaModelMod.default],
    processLambdas: Callback,
    rawHandler: js.Any,
    setLambda: (js.Any, LambdaConfig) => Callback,
    setLambdaPath: (js.Any, js.Any) => Callback,
    setLambdaProperties: js.Any => CallbackTo[js.Any],
    setPreLambdaTimeoutMethod: js.Any => CallbackTo[js.Any],
    upsertLambdaModel: js.Any => CallbackTo[typingsJapgolly.lambdaPhi.lambdaModelMod.default]
  ): LambdaManager = {
    val __obj = js.Dynamic.literal(_apiGateway = _apiGateway.asInstanceOf[js.Any], _callback = _callback.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _event = _event.asInstanceOf[js.Any], _lambdaModels = _lambdaModels.asInstanceOf[js.Any], _lambdas = _lambdas.asInstanceOf[js.Any], _rawHandler = _rawHandler.asInstanceOf[js.Any], apiGateway = apiGateway.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], rawHandler = rawHandler.asInstanceOf[js.Any])
    __obj.updateDynamic("addCallbackProperty")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => addCallbackProperty(t0, t1).runNow()))
    __obj.updateDynamic("addContextProperty")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => addContextProperty(t0, t1).runNow()))
    __obj.updateDynamic("addEventContextProperty")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => addEventContextProperty(t0, t1).runNow()))
    __obj.updateDynamic("addEventProperty")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => addEventProperty(t0, t1).runNow()))
    __obj.updateDynamic("addHandlerMethod")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => addHandlerMethod(t0, t1).runNow()))
    __obj.updateDynamic("addPostConstructorMethod")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => addPostConstructorMethod(t0, t1).runNow()))
    __obj.updateDynamic("addPreLambdaCallbackMethod")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => addPreLambdaCallbackMethod(t0, t1).runNow()))
    __obj.updateDynamic("addPreLambdaTimeoutMethod")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: scala.Double) => addPreLambdaTimeoutMethod(t0, t1, t2).runNow()))
    __obj.updateDynamic("executeHandler")(js.Any.fromFunction1((t0: js.Any) => executeHandler(t0).runNow()))
    __obj.updateDynamic("executePostConstructor")(js.Any.fromFunction1((t0: js.Any) => executePostConstructor(t0).runNow()))
    __obj.updateDynamic("executePreLambdaCallback")(js.Any.fromFunction1((t0: js.Any) => executePreLambdaCallback(t0).runNow()))
    __obj.updateDynamic("getEvent")(js.Any.fromFunction1((t0: js.Any) => getEvent(t0).runNow()))
    __obj.updateDynamic("getEventContext")(getEventContext.toJsFn)
    __obj.updateDynamic("getLambdaByName")(js.Any.fromFunction1((t0: java.lang.String) => getLambdaByName(t0).runNow()))
    __obj.updateDynamic("processLambdas")(processLambdas.toJsFn)
    __obj.updateDynamic("setLambda")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.lambdaPhi.lambdaConfigMod.LambdaConfig) => setLambda(t0, t1).runNow()))
    __obj.updateDynamic("setLambdaPath")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => setLambdaPath(t0, t1).runNow()))
    __obj.updateDynamic("setLambdaProperties")(js.Any.fromFunction1((t0: js.Any) => setLambdaProperties(t0).runNow()))
    __obj.updateDynamic("setPreLambdaTimeoutMethod")(js.Any.fromFunction1((t0: js.Any) => setPreLambdaTimeoutMethod(t0).runNow()))
    __obj.updateDynamic("upsertLambdaModel")(js.Any.fromFunction1((t0: js.Any) => upsertLambdaModel(t0).runNow()))
    __obj.asInstanceOf[LambdaManager]
  }
}

