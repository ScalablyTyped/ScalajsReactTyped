package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.CompilationSettings
import typingsJapgolly.typescriptServices.TypeScript.IPreProcessedFileInfo
import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreServices extends StObject {
  
  def collectGarbage(): Unit
  
  def dumpMemory(): String
  
  def getDefaultCompilationSettings(): CompilationSettings
  
  def getMemoryInfo(): js.Array[Any]
  
  def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo
  
  var host: ICoreServicesHost
}
object CoreServices {
  
  inline def apply(
    collectGarbage: Callback,
    dumpMemory: CallbackTo[String],
    getDefaultCompilationSettings: CallbackTo[CompilationSettings],
    getMemoryInfo: CallbackTo[js.Array[Any]],
    getPreProcessedFileInfo: (String, IScriptSnapshot) => IPreProcessedFileInfo,
    host: ICoreServicesHost
  ): CoreServices = {
    val __obj = js.Dynamic.literal(collectGarbage = collectGarbage.toJsFn, dumpMemory = dumpMemory.toJsFn, getDefaultCompilationSettings = getDefaultCompilationSettings.toJsFn, getMemoryInfo = getMemoryInfo.toJsFn, getPreProcessedFileInfo = js.Any.fromFunction2(getPreProcessedFileInfo), host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreServices]
  }
  
  extension [Self <: CoreServices](x: Self) {
    
    inline def setCollectGarbage(value: Callback): Self = StObject.set(x, "collectGarbage", value.toJsFn)
    
    inline def setDumpMemory(value: CallbackTo[String]): Self = StObject.set(x, "dumpMemory", value.toJsFn)
    
    inline def setGetDefaultCompilationSettings(value: CallbackTo[CompilationSettings]): Self = StObject.set(x, "getDefaultCompilationSettings", value.toJsFn)
    
    inline def setGetMemoryInfo(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getMemoryInfo", value.toJsFn)
    
    inline def setGetPreProcessedFileInfo(value: (String, IScriptSnapshot) => IPreProcessedFileInfo): Self = StObject.set(x, "getPreProcessedFileInfo", js.Any.fromFunction2(value))
    
    inline def setHost(value: ICoreServicesHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
  }
}
