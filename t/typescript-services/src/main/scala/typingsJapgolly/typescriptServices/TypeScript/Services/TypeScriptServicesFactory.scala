package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeScriptServicesFactory
  extends StObject
     with IShimFactory {
  
  /* private */ var _shims: Any
  
  def close(): Unit
  
  def createClassifier(host: IClassifierHost): Classifier
  
  def createClassifierShim(host: IClassifierHost): ClassifierShim
  
  def createCoreServices(host: ICoreServicesHost): CoreServices
  
  def createCoreServicesShim(host: ICoreServicesHost): CoreServicesShim
  
  def createLanguageServiceShim(host: ILanguageServiceShimHost): ILanguageServiceShim
  
  def createPullLanguageService(host: ILanguageServiceHost): ILanguageService
}
object TypeScriptServicesFactory {
  
  inline def apply(
    _shims: Any,
    close: Callback,
    createClassifier: IClassifierHost => Classifier,
    createClassifierShim: IClassifierHost => ClassifierShim,
    createCoreServices: ICoreServicesHost => CoreServices,
    createCoreServicesShim: ICoreServicesHost => CoreServicesShim,
    createLanguageServiceShim: ILanguageServiceShimHost => ILanguageServiceShim,
    createPullLanguageService: ILanguageServiceHost => ILanguageService,
    registerShim: IShim => Callback,
    unregisterShim: IShim => Callback
  ): TypeScriptServicesFactory = {
    val __obj = js.Dynamic.literal(_shims = _shims.asInstanceOf[js.Any], close = close.toJsFn, createClassifier = js.Any.fromFunction1(createClassifier), createClassifierShim = js.Any.fromFunction1(createClassifierShim), createCoreServices = js.Any.fromFunction1(createCoreServices), createCoreServicesShim = js.Any.fromFunction1(createCoreServicesShim), createLanguageServiceShim = js.Any.fromFunction1(createLanguageServiceShim), createPullLanguageService = js.Any.fromFunction1(createPullLanguageService), registerShim = js.Any.fromFunction1((t0: IShim) => registerShim(t0).runNow()), unregisterShim = js.Any.fromFunction1((t0: IShim) => unregisterShim(t0).runNow()))
    __obj.asInstanceOf[TypeScriptServicesFactory]
  }
  
  extension [Self <: TypeScriptServicesFactory](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCreateClassifier(value: IClassifierHost => Classifier): Self = StObject.set(x, "createClassifier", js.Any.fromFunction1(value))
    
    inline def setCreateClassifierShim(value: IClassifierHost => ClassifierShim): Self = StObject.set(x, "createClassifierShim", js.Any.fromFunction1(value))
    
    inline def setCreateCoreServices(value: ICoreServicesHost => CoreServices): Self = StObject.set(x, "createCoreServices", js.Any.fromFunction1(value))
    
    inline def setCreateCoreServicesShim(value: ICoreServicesHost => CoreServicesShim): Self = StObject.set(x, "createCoreServicesShim", js.Any.fromFunction1(value))
    
    inline def setCreateLanguageServiceShim(value: ILanguageServiceShimHost => ILanguageServiceShim): Self = StObject.set(x, "createLanguageServiceShim", js.Any.fromFunction1(value))
    
    inline def setCreatePullLanguageService(value: ILanguageServiceHost => ILanguageService): Self = StObject.set(x, "createPullLanguageService", js.Any.fromFunction1(value))
    
    inline def set_shims(value: Any): Self = StObject.set(x, "_shims", value.asInstanceOf[js.Any])
  }
}
