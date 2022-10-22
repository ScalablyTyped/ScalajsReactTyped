package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModuleOptions extends StObject {
  
  /** 
    * @deprecated
    * A callback function that is fired after the module has loaded.
    * It is recommended that the Bing Maps key be set as a URL parameter of the Bing Maps script reference.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** A Bing Maps key that is used with the module when the module is loaded without a map. */
  var credentials: js.UndefOr[String] = js.undefined
  
  /** A function that is called if there is an error loading the module. */
  var errorCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IModuleOptions {
  
  inline def apply(): IModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModuleOptions]
  }
  
  extension [Self <: IModuleOptions](x: Self) {
    
    inline def setCallback(value: Callback): Self = StObject.set(x, "callback", value.toJsFn)
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setErrorCallback(value: Callback): Self = StObject.set(x, "errorCallback", value.toJsFn)
    
    inline def setErrorCallbackUndefined: Self = StObject.set(x, "errorCallback", js.undefined)
  }
}
