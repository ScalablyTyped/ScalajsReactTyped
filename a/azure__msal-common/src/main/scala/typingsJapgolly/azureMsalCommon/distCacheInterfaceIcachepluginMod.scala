package typingsJapgolly.azureMsalCommon

import typingsJapgolly.azureMsalCommon.distCachePersistenceTokenCacheContextMod.TokenCacheContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheInterfaceIcachepluginMod {
  
  trait ICachePlugin extends StObject {
    
    def afterCacheAccess(tokenCacheContext: TokenCacheContext): js.Promise[Unit]
    
    def beforeCacheAccess(tokenCacheContext: TokenCacheContext): js.Promise[Unit]
  }
  object ICachePlugin {
    
    inline def apply(
      afterCacheAccess: TokenCacheContext => js.Promise[Unit],
      beforeCacheAccess: TokenCacheContext => js.Promise[Unit]
    ): ICachePlugin = {
      val __obj = js.Dynamic.literal(afterCacheAccess = js.Any.fromFunction1(afterCacheAccess), beforeCacheAccess = js.Any.fromFunction1(beforeCacheAccess))
      __obj.asInstanceOf[ICachePlugin]
    }
    
    extension [Self <: ICachePlugin](x: Self) {
      
      inline def setAfterCacheAccess(value: TokenCacheContext => js.Promise[Unit]): Self = StObject.set(x, "afterCacheAccess", js.Any.fromFunction1(value))
      
      inline def setBeforeCacheAccess(value: TokenCacheContext => js.Promise[Unit]): Self = StObject.set(x, "beforeCacheAccess", js.Any.fromFunction1(value))
    }
  }
}
