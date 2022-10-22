package typingsJapgolly.restify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterOptions extends StObject {
  
  var ignoreTrailingSlash: js.UndefOr[Boolean] = js.undefined
  
  var log: js.UndefOr[typingsJapgolly.bunyan.mod.^] = js.undefined
  
  var onceNext: js.UndefOr[Boolean] = js.undefined
  
  var registry: js.UndefOr[RouterRegistryRadix] = js.undefined
  
  var strictNext: js.UndefOr[Boolean] = js.undefined
}
object RouterOptions {
  
  inline def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  
  extension [Self <: RouterOptions](x: Self) {
    
    inline def setIgnoreTrailingSlash(value: Boolean): Self = StObject.set(x, "ignoreTrailingSlash", value.asInstanceOf[js.Any])
    
    inline def setIgnoreTrailingSlashUndefined: Self = StObject.set(x, "ignoreTrailingSlash", js.undefined)
    
    inline def setLog(value: typingsJapgolly.bunyan.mod.^): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setOnceNext(value: Boolean): Self = StObject.set(x, "onceNext", value.asInstanceOf[js.Any])
    
    inline def setOnceNextUndefined: Self = StObject.set(x, "onceNext", js.undefined)
    
    inline def setRegistry(value: RouterRegistryRadix): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    
    inline def setStrictNext(value: Boolean): Self = StObject.set(x, "strictNext", value.asInstanceOf[js.Any])
    
    inline def setStrictNextUndefined: Self = StObject.set(x, "strictNext", js.undefined)
  }
}
