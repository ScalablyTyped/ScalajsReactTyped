package typingsJapgolly.firefox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  def checkForUpdate(): DOMRequest[Any]
  
  var installOrigin: String
  
  var installTime: Double
  
  def launch(): Unit
  
  var manifest: Any
  
  var manifestURL: String
  
  var origin: String
  
  var receipts: js.Array[Any]
}
object App {
  
  inline def apply(
    checkForUpdate: CallbackTo[DOMRequest[Any]],
    installOrigin: String,
    installTime: Double,
    launch: Callback,
    manifest: Any,
    manifestURL: String,
    origin: String,
    receipts: js.Array[Any]
  ): App = {
    val __obj = js.Dynamic.literal(checkForUpdate = checkForUpdate.toJsFn, installOrigin = installOrigin.asInstanceOf[js.Any], installTime = installTime.asInstanceOf[js.Any], launch = launch.toJsFn, manifest = manifest.asInstanceOf[js.Any], manifestURL = manifestURL.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], receipts = receipts.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setCheckForUpdate(value: CallbackTo[DOMRequest[Any]]): Self = StObject.set(x, "checkForUpdate", value.toJsFn)
    
    inline def setInstallOrigin(value: String): Self = StObject.set(x, "installOrigin", value.asInstanceOf[js.Any])
    
    inline def setInstallTime(value: Double): Self = StObject.set(x, "installTime", value.asInstanceOf[js.Any])
    
    inline def setLaunch(value: Callback): Self = StObject.set(x, "launch", value.toJsFn)
    
    inline def setManifest(value: Any): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestURL(value: String): Self = StObject.set(x, "manifestURL", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setReceipts(value: js.Array[Any]): Self = StObject.set(x, "receipts", value.asInstanceOf[js.Any])
    
    inline def setReceiptsVarargs(value: Any*): Self = StObject.set(x, "receipts", js.Array(value*))
  }
}
