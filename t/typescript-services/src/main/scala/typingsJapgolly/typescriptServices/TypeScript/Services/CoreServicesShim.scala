package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.ILogger
import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreServicesShim
  extends StObject
     with ShimBase {
  
  def dumpMemory(dummy: Any): String
  
  /* private */ def forwardJSONCall(actionDescription: Any, action: Any): Any
  
  def getDefaultCompilationSettings(): String
  
  def getMemoryInfo(dummy: Any): String
  
  def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): String
  
  var host: ICoreServicesHost
  
  var logger: ILogger
  
  var services: CoreServices
}
object CoreServicesShim {
  
  inline def apply(
    dispose: Any => Callback,
    dumpMemory: Any => String,
    factory: Any,
    forwardJSONCall: (Any, Any) => Any,
    getDefaultCompilationSettings: CallbackTo[String],
    getMemoryInfo: Any => String,
    getPreProcessedFileInfo: (String, IScriptSnapshot) => String,
    host: ICoreServicesHost,
    logger: ILogger,
    services: CoreServices
  ): CoreServicesShim = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction1((t0: Any) => dispose(t0).runNow()), dumpMemory = js.Any.fromFunction1(dumpMemory), factory = factory.asInstanceOf[js.Any], forwardJSONCall = js.Any.fromFunction2(forwardJSONCall), getDefaultCompilationSettings = getDefaultCompilationSettings.toJsFn, getMemoryInfo = js.Any.fromFunction1(getMemoryInfo), getPreProcessedFileInfo = js.Any.fromFunction2(getPreProcessedFileInfo), host = host.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreServicesShim]
  }
  
  extension [Self <: CoreServicesShim](x: Self) {
    
    inline def setDumpMemory(value: Any => String): Self = StObject.set(x, "dumpMemory", js.Any.fromFunction1(value))
    
    inline def setForwardJSONCall(value: (Any, Any) => Any): Self = StObject.set(x, "forwardJSONCall", js.Any.fromFunction2(value))
    
    inline def setGetDefaultCompilationSettings(value: CallbackTo[String]): Self = StObject.set(x, "getDefaultCompilationSettings", value.toJsFn)
    
    inline def setGetMemoryInfo(value: Any => String): Self = StObject.set(x, "getMemoryInfo", js.Any.fromFunction1(value))
    
    inline def setGetPreProcessedFileInfo(value: (String, IScriptSnapshot) => String): Self = StObject.set(x, "getPreProcessedFileInfo", js.Any.fromFunction2(value))
    
    inline def setHost(value: ICoreServicesHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: ILogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setServices(value: CoreServices): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
  }
}
