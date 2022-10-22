package typingsJapgolly.lambdaPhi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.lambdaPhi.libApiGatewayMod.ApiGateway
import typingsJapgolly.lambdaPhi.libLambdaConfigMod.LambdaConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLambdaManagerMod {
  
  @JSImport("lambda-phi/lib/lambda-manager", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with LambdaManager {
    
    /* private */ /* CompleteClass */
    var _apiGateway: Any = js.native
    
    /* private */ /* CompleteClass */
    var _callback: Any = js.native
    
    /* private */ /* CompleteClass */
    var _context: Any = js.native
    
    /* private */ /* CompleteClass */
    var _event: Any = js.native
    
    /* private */ /* CompleteClass */
    var _lambdaModels: Any = js.native
    
    /* private */ /* CompleteClass */
    var _lambdas: Any = js.native
    
    /* private */ /* CompleteClass */
    var _rawHandler: Any = js.native
    
    /* CompleteClass */
    override def addCallbackProperty(target: Any, property: Any): Unit = js.native
    
    /* CompleteClass */
    override def addContextProperty(target: Any, property: Any): Unit = js.native
    
    /* CompleteClass */
    override def addEventContextProperty(target: Any, property: Any): Unit = js.native
    
    /* CompleteClass */
    override def addEventProperty(target: Any, property: Any): Unit = js.native
    
    /* CompleteClass */
    override def addHandlerMethod(target: Any, method: Any): Unit = js.native
    
    /* CompleteClass */
    override def addPostConstructorMethod(target: Any, method: Any): Unit = js.native
    
    /* CompleteClass */
    override def addPreLambdaCallbackMethod(target: Any, method: String): Unit = js.native
    
    /* CompleteClass */
    override def addPreLambdaTimeoutMethod(target: Any, method: String, miliSecondsBeforeTimeout: Double): Unit = js.native
    
    /* CompleteClass */
    var apiGateway: ApiGateway = js.native
    
    /* CompleteClass */
    var callback: Any = js.native
    
    /* CompleteClass */
    var context: Any = js.native
    
    /* CompleteClass */
    var event: Any = js.native
    
    /* private */ /* CompleteClass */
    override def executeHandler(lambda: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def executePostConstructor(lambda: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def executePreLambdaCallback(lambda: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def getEvent(lambda: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def getEventContext(): Any = js.native
    
    /* CompleteClass */
    override def getLambdaByName(name: String): typingsJapgolly.lambdaPhi.libLambdaModelMod.default = js.native
    
    /* CompleteClass */
    override def processLambdas(): Unit = js.native
    
    /* CompleteClass */
    var rawHandler: Any = js.native
    
    /* CompleteClass */
    override def setLambda(target: Any, lambdaConfig: LambdaConfig): Unit = js.native
    
    /* CompleteClass */
    override def setLambdaPath(target: Any, path: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def setLambdaProperties(lambda: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def setPreLambdaTimeoutMethod(lambda: Any): Any = js.native
    
    /* CompleteClass */
    override def upsertLambdaModel(target: Any): typingsJapgolly.lambdaPhi.libLambdaModelMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("lambda-phi/lib/lambda-manager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("lambda-phi/lib/lambda-manager", "default.instance")
    @js.native
    def instance: LambdaManager = js.native
    inline def instance_=(x: LambdaManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
  }
  
  trait LambdaManager extends StObject {
    
    /* private */ var _apiGateway: Any
    
    /* private */ var _callback: Any
    
    /* private */ var _context: Any
    
    /* private */ var _event: Any
    
    /* private */ var _lambdaModels: Any
    
    /* private */ var _lambdas: Any
    
    /* private */ var _rawHandler: Any
    
    def addCallbackProperty(target: Any, property: Any): Unit
    
    def addContextProperty(target: Any, property: Any): Unit
    
    def addEventContextProperty(target: Any, property: Any): Unit
    
    def addEventProperty(target: Any, property: Any): Unit
    
    def addHandlerMethod(target: Any, method: Any): Unit
    
    def addPostConstructorMethod(target: Any, method: Any): Unit
    
    def addPreLambdaCallbackMethod(target: Any, method: String): Unit
    
    def addPreLambdaTimeoutMethod(target: Any, method: String, miliSecondsBeforeTimeout: Double): Unit
    
    var apiGateway: ApiGateway
    
    var callback: Any
    
    var context: Any
    
    var event: Any
    
    /* private */ def executeHandler(lambda: Any): Any
    
    /* private */ def executePostConstructor(lambda: Any): Any
    
    /* private */ def executePreLambdaCallback(lambda: Any): Any
    
    /* private */ def getEvent(lambda: Any): Any
    
    /* private */ def getEventContext(): Any
    
    def getLambdaByName(name: String): typingsJapgolly.lambdaPhi.libLambdaModelMod.default
    
    def processLambdas(): Unit
    
    var rawHandler: Any
    
    def setLambda(target: Any, lambdaConfig: LambdaConfig): Unit
    
    def setLambdaPath(target: Any, path: Any): Unit
    
    /* private */ def setLambdaProperties(lambda: Any): Any
    
    /* private */ def setPreLambdaTimeoutMethod(lambda: Any): Any
    
    def upsertLambdaModel(target: Any): typingsJapgolly.lambdaPhi.libLambdaModelMod.default
  }
  object LambdaManager {
    
    inline def apply(
      _apiGateway: Any,
      _callback: Any,
      _context: Any,
      _event: Any,
      _lambdaModels: Any,
      _lambdas: Any,
      _rawHandler: Any,
      addCallbackProperty: (Any, Any) => Callback,
      addContextProperty: (Any, Any) => Callback,
      addEventContextProperty: (Any, Any) => Callback,
      addEventProperty: (Any, Any) => Callback,
      addHandlerMethod: (Any, Any) => Callback,
      addPostConstructorMethod: (Any, Any) => Callback,
      addPreLambdaCallbackMethod: (Any, String) => Callback,
      addPreLambdaTimeoutMethod: (Any, String, Double) => Callback,
      apiGateway: ApiGateway,
      callback: Any,
      context: Any,
      event: Any,
      executeHandler: Any => Any,
      executePostConstructor: Any => Any,
      executePreLambdaCallback: Any => Any,
      getEvent: Any => Any,
      getEventContext: CallbackTo[Any],
      getLambdaByName: String => typingsJapgolly.lambdaPhi.libLambdaModelMod.default,
      processLambdas: Callback,
      rawHandler: Any,
      setLambda: (Any, LambdaConfig) => Callback,
      setLambdaPath: (Any, Any) => Callback,
      setLambdaProperties: Any => Any,
      setPreLambdaTimeoutMethod: Any => Any,
      upsertLambdaModel: Any => typingsJapgolly.lambdaPhi.libLambdaModelMod.default
    ): LambdaManager = {
      val __obj = js.Dynamic.literal(_apiGateway = _apiGateway.asInstanceOf[js.Any], _callback = _callback.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _event = _event.asInstanceOf[js.Any], _lambdaModels = _lambdaModels.asInstanceOf[js.Any], _lambdas = _lambdas.asInstanceOf[js.Any], _rawHandler = _rawHandler.asInstanceOf[js.Any], addCallbackProperty = js.Any.fromFunction2((t0: Any, t1: Any) => (addCallbackProperty(t0, t1)).runNow()), addContextProperty = js.Any.fromFunction2((t0: Any, t1: Any) => (addContextProperty(t0, t1)).runNow()), addEventContextProperty = js.Any.fromFunction2((t0: Any, t1: Any) => (addEventContextProperty(t0, t1)).runNow()), addEventProperty = js.Any.fromFunction2((t0: Any, t1: Any) => (addEventProperty(t0, t1)).runNow()), addHandlerMethod = js.Any.fromFunction2((t0: Any, t1: Any) => (addHandlerMethod(t0, t1)).runNow()), addPostConstructorMethod = js.Any.fromFunction2((t0: Any, t1: Any) => (addPostConstructorMethod(t0, t1)).runNow()), addPreLambdaCallbackMethod = js.Any.fromFunction2((t0: Any, t1: String) => (addPreLambdaCallbackMethod(t0, t1)).runNow()), addPreLambdaTimeoutMethod = js.Any.fromFunction3((t0: Any, t1: String, t2: Double) => (addPreLambdaTimeoutMethod(t0, t1, t2)).runNow()), apiGateway = apiGateway.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], executeHandler = js.Any.fromFunction1(executeHandler), executePostConstructor = js.Any.fromFunction1(executePostConstructor), executePreLambdaCallback = js.Any.fromFunction1(executePreLambdaCallback), getEvent = js.Any.fromFunction1(getEvent), getEventContext = getEventContext.toJsFn, getLambdaByName = js.Any.fromFunction1(getLambdaByName), processLambdas = processLambdas.toJsFn, rawHandler = rawHandler.asInstanceOf[js.Any], setLambda = js.Any.fromFunction2((t0: Any, t1: LambdaConfig) => (setLambda(t0, t1)).runNow()), setLambdaPath = js.Any.fromFunction2((t0: Any, t1: Any) => (setLambdaPath(t0, t1)).runNow()), setLambdaProperties = js.Any.fromFunction1(setLambdaProperties), setPreLambdaTimeoutMethod = js.Any.fromFunction1(setPreLambdaTimeoutMethod), upsertLambdaModel = js.Any.fromFunction1(upsertLambdaModel))
      __obj.asInstanceOf[LambdaManager]
    }
    
    extension [Self <: LambdaManager](x: Self) {
      
      inline def setAddCallbackProperty(value: (Any, Any) => Callback): Self = StObject.set(x, "addCallbackProperty", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setAddContextProperty(value: (Any, Any) => Callback): Self = StObject.set(x, "addContextProperty", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setAddEventContextProperty(value: (Any, Any) => Callback): Self = StObject.set(x, "addEventContextProperty", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setAddEventProperty(value: (Any, Any) => Callback): Self = StObject.set(x, "addEventProperty", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setAddHandlerMethod(value: (Any, Any) => Callback): Self = StObject.set(x, "addHandlerMethod", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setAddPostConstructorMethod(value: (Any, Any) => Callback): Self = StObject.set(x, "addPostConstructorMethod", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setAddPreLambdaCallbackMethod(value: (Any, String) => Callback): Self = StObject.set(x, "addPreLambdaCallbackMethod", js.Any.fromFunction2((t0: Any, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setAddPreLambdaTimeoutMethod(value: (Any, String, Double) => Callback): Self = StObject.set(x, "addPreLambdaTimeoutMethod", js.Any.fromFunction3((t0: Any, t1: String, t2: Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setApiGateway(value: ApiGateway): Self = StObject.set(x, "apiGateway", value.asInstanceOf[js.Any])
      
      inline def setCallback(value: Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setExecuteHandler(value: Any => Any): Self = StObject.set(x, "executeHandler", js.Any.fromFunction1(value))
      
      inline def setExecutePostConstructor(value: Any => Any): Self = StObject.set(x, "executePostConstructor", js.Any.fromFunction1(value))
      
      inline def setExecutePreLambdaCallback(value: Any => Any): Self = StObject.set(x, "executePreLambdaCallback", js.Any.fromFunction1(value))
      
      inline def setGetEvent(value: Any => Any): Self = StObject.set(x, "getEvent", js.Any.fromFunction1(value))
      
      inline def setGetEventContext(value: CallbackTo[Any]): Self = StObject.set(x, "getEventContext", value.toJsFn)
      
      inline def setGetLambdaByName(value: String => typingsJapgolly.lambdaPhi.libLambdaModelMod.default): Self = StObject.set(x, "getLambdaByName", js.Any.fromFunction1(value))
      
      inline def setProcessLambdas(value: Callback): Self = StObject.set(x, "processLambdas", value.toJsFn)
      
      inline def setRawHandler(value: Any): Self = StObject.set(x, "rawHandler", value.asInstanceOf[js.Any])
      
      inline def setSetLambda(value: (Any, LambdaConfig) => Callback): Self = StObject.set(x, "setLambda", js.Any.fromFunction2((t0: Any, t1: LambdaConfig) => (value(t0, t1)).runNow()))
      
      inline def setSetLambdaPath(value: (Any, Any) => Callback): Self = StObject.set(x, "setLambdaPath", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setSetLambdaProperties(value: Any => Any): Self = StObject.set(x, "setLambdaProperties", js.Any.fromFunction1(value))
      
      inline def setSetPreLambdaTimeoutMethod(value: Any => Any): Self = StObject.set(x, "setPreLambdaTimeoutMethod", js.Any.fromFunction1(value))
      
      inline def setUpsertLambdaModel(value: Any => typingsJapgolly.lambdaPhi.libLambdaModelMod.default): Self = StObject.set(x, "upsertLambdaModel", js.Any.fromFunction1(value))
      
      inline def set_apiGateway(value: Any): Self = StObject.set(x, "_apiGateway", value.asInstanceOf[js.Any])
      
      inline def set_callback(value: Any): Self = StObject.set(x, "_callback", value.asInstanceOf[js.Any])
      
      inline def set_context(value: Any): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      inline def set_event(value: Any): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
      
      inline def set_lambdaModels(value: Any): Self = StObject.set(x, "_lambdaModels", value.asInstanceOf[js.Any])
      
      inline def set_lambdas(value: Any): Self = StObject.set(x, "_lambdas", value.asInstanceOf[js.Any])
      
      inline def set_rawHandler(value: Any): Self = StObject.set(x, "_rawHandler", value.asInstanceOf[js.Any])
    }
  }
}
