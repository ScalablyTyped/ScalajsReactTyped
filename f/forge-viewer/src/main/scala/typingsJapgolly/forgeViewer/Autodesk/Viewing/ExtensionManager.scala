package typingsJapgolly.forgeViewer.Autodesk.Viewing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.forgeViewer.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionManager extends StObject {
  
  var extensions: StringDictionary[Extension]
  
  var extensionsAsync: StringDictionary[Extension]
  
  def getExtension(extensionId: String): Extension | Null
  
  def getExternalPath(extensionId: String): String | Null
  
  def getRegisteredExtensions(): js.Array[Id]
  
  def popuplateOptions(options: Any): Unit
  
  def registerExtension(extensionId: String, `extension`: js.Object): Boolean
  
  def registerExternalExtension(extensionId: String, urlPath: String): Boolean
  
  def unregisterExtension(extensionId: String): Boolean
  
  def unregisterExternalExtension(extensionId: String): Boolean
}
object ExtensionManager {
  
  inline def apply(
    extensions: StringDictionary[Extension],
    extensionsAsync: StringDictionary[Extension],
    getExtension: String => Extension | Null,
    getExternalPath: String => String | Null,
    getRegisteredExtensions: CallbackTo[js.Array[Id]],
    popuplateOptions: Any => Callback,
    registerExtension: (String, js.Object) => Boolean,
    registerExternalExtension: (String, String) => Boolean,
    unregisterExtension: String => Boolean,
    unregisterExternalExtension: String => Boolean
  ): ExtensionManager = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], extensionsAsync = extensionsAsync.asInstanceOf[js.Any], getExtension = js.Any.fromFunction1(getExtension), getExternalPath = js.Any.fromFunction1(getExternalPath), getRegisteredExtensions = getRegisteredExtensions.toJsFn, popuplateOptions = js.Any.fromFunction1((t0: Any) => popuplateOptions(t0).runNow()), registerExtension = js.Any.fromFunction2(registerExtension), registerExternalExtension = js.Any.fromFunction2(registerExternalExtension), unregisterExtension = js.Any.fromFunction1(unregisterExtension), unregisterExternalExtension = js.Any.fromFunction1(unregisterExternalExtension))
    __obj.asInstanceOf[ExtensionManager]
  }
  
  extension [Self <: ExtensionManager](x: Self) {
    
    inline def setExtensions(value: StringDictionary[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsAsync(value: StringDictionary[Extension]): Self = StObject.set(x, "extensionsAsync", value.asInstanceOf[js.Any])
    
    inline def setGetExtension(value: String => Extension | Null): Self = StObject.set(x, "getExtension", js.Any.fromFunction1(value))
    
    inline def setGetExternalPath(value: String => String | Null): Self = StObject.set(x, "getExternalPath", js.Any.fromFunction1(value))
    
    inline def setGetRegisteredExtensions(value: CallbackTo[js.Array[Id]]): Self = StObject.set(x, "getRegisteredExtensions", value.toJsFn)
    
    inline def setPopuplateOptions(value: Any => Callback): Self = StObject.set(x, "popuplateOptions", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRegisterExtension(value: (String, js.Object) => Boolean): Self = StObject.set(x, "registerExtension", js.Any.fromFunction2(value))
    
    inline def setRegisterExternalExtension(value: (String, String) => Boolean): Self = StObject.set(x, "registerExternalExtension", js.Any.fromFunction2(value))
    
    inline def setUnregisterExtension(value: String => Boolean): Self = StObject.set(x, "unregisterExtension", js.Any.fromFunction1(value))
    
    inline def setUnregisterExternalExtension(value: String => Boolean): Self = StObject.set(x, "unregisterExternalExtension", js.Any.fromFunction1(value))
  }
}
