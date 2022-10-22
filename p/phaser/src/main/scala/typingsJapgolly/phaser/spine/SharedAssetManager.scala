package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedAssetManager
  extends StObject
     with Disposable {
  
  /* private */ var clientAssets: Any
  
  /* private */ var errors: Any
  
  def get(clientId: String, path: String): Any
  
  def getErrors(): Map[String]
  
  def hasErrors(): Boolean
  
  def isLoadingComplete(clientId: String): Boolean
  
  def loadJson(clientId: String, path: String): Unit
  
  def loadText(clientId: String, path: String): Unit
  
  def loadTexture(clientId: String, textureLoader: js.Function1[/* image */ HTMLImageElement, Any], path: String): Unit
  
  /* private */ var pathPrefix: Any
  
  /* private */ var queueAsset: Any
  
  /* private */ var queuedAssets: Any
  
  /* private */ var rawAssets: Any
  
  /* private */ var updateClientAssets: Any
}
object SharedAssetManager {
  
  inline def apply(
    clientAssets: Any,
    dispose: Callback,
    errors: Any,
    get: (String, String) => Any,
    getErrors: CallbackTo[Map[String]],
    hasErrors: CallbackTo[Boolean],
    isLoadingComplete: String => Boolean,
    loadJson: (String, String) => Callback,
    loadText: (String, String) => Callback,
    loadTexture: (String, js.Function1[/* image */ HTMLImageElement, Any], String) => Callback,
    pathPrefix: Any,
    queueAsset: Any,
    queuedAssets: Any,
    rawAssets: Any,
    updateClientAssets: Any
  ): SharedAssetManager = {
    val __obj = js.Dynamic.literal(clientAssets = clientAssets.asInstanceOf[js.Any], dispose = dispose.toJsFn, errors = errors.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), getErrors = getErrors.toJsFn, hasErrors = hasErrors.toJsFn, isLoadingComplete = js.Any.fromFunction1(isLoadingComplete), loadJson = js.Any.fromFunction2((t0: String, t1: String) => (loadJson(t0, t1)).runNow()), loadText = js.Any.fromFunction2((t0: String, t1: String) => (loadText(t0, t1)).runNow()), loadTexture = js.Any.fromFunction3((t0: String, t1: js.Function1[/* image */ HTMLImageElement, Any], t2: String) => (loadTexture(t0, t1, t2)).runNow()), pathPrefix = pathPrefix.asInstanceOf[js.Any], queueAsset = queueAsset.asInstanceOf[js.Any], queuedAssets = queuedAssets.asInstanceOf[js.Any], rawAssets = rawAssets.asInstanceOf[js.Any], updateClientAssets = updateClientAssets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedAssetManager]
  }
  
  extension [Self <: SharedAssetManager](x: Self) {
    
    inline def setClientAssets(value: Any): Self = StObject.set(x, "clientAssets", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setGet(value: (String, String) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setGetErrors(value: CallbackTo[Map[String]]): Self = StObject.set(x, "getErrors", value.toJsFn)
    
    inline def setHasErrors(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasErrors", value.toJsFn)
    
    inline def setIsLoadingComplete(value: String => Boolean): Self = StObject.set(x, "isLoadingComplete", js.Any.fromFunction1(value))
    
    inline def setLoadJson(value: (String, String) => Callback): Self = StObject.set(x, "loadJson", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setLoadText(value: (String, String) => Callback): Self = StObject.set(x, "loadText", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setLoadTexture(value: (String, js.Function1[/* image */ HTMLImageElement, Any], String) => Callback): Self = StObject.set(x, "loadTexture", js.Any.fromFunction3((t0: String, t1: js.Function1[/* image */ HTMLImageElement, Any], t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setPathPrefix(value: Any): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
    
    inline def setQueueAsset(value: Any): Self = StObject.set(x, "queueAsset", value.asInstanceOf[js.Any])
    
    inline def setQueuedAssets(value: Any): Self = StObject.set(x, "queuedAssets", value.asInstanceOf[js.Any])
    
    inline def setRawAssets(value: Any): Self = StObject.set(x, "rawAssets", value.asInstanceOf[js.Any])
    
    inline def setUpdateClientAssets(value: Any): Self = StObject.set(x, "updateClientAssets", value.asInstanceOf[js.Any])
  }
}
