package typingsJapgolly.stremioAddonSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheMaxAge extends StObject {
  
  /**
    * (in seconds) cacheMaxAge means the Cache-Control header being set to max-age=$cacheMaxAge
    */
  var cacheMaxAge: js.UndefOr[Double] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * Static directory to serve.
    */
  var static: js.UndefOr[String] = js.undefined
}
object CacheMaxAge {
  
  inline def apply(): CacheMaxAge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheMaxAge]
  }
  
  extension [Self <: CacheMaxAge](x: Self) {
    
    inline def setCacheMaxAge(value: Double): Self = StObject.set(x, "cacheMaxAge", value.asInstanceOf[js.Any])
    
    inline def setCacheMaxAgeUndefined: Self = StObject.set(x, "cacheMaxAge", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setStatic(value: String): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
  }
}
