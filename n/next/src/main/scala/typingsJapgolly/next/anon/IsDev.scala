package typingsJapgolly.next.anon

import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDev extends StObject {
  
  var isDev: js.UndefOr[Boolean] = js.undefined
  
  var nextConfig: Partial[typingsJapgolly.next.distServerConfigSharedMod.NextConfig]
  
  var page: js.UndefOr[String] = js.undefined
  
  var pageFilePath: String
}
object IsDev {
  
  inline def apply(
    nextConfig: Partial[typingsJapgolly.next.distServerConfigSharedMod.NextConfig],
    pageFilePath: String
  ): IsDev = {
    val __obj = js.Dynamic.literal(nextConfig = nextConfig.asInstanceOf[js.Any], pageFilePath = pageFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDev]
  }
  
  extension [Self <: IsDev](x: Self) {
    
    inline def setIsDev(value: Boolean): Self = StObject.set(x, "isDev", value.asInstanceOf[js.Any])
    
    inline def setIsDevUndefined: Self = StObject.set(x, "isDev", js.undefined)
    
    inline def setNextConfig(value: Partial[typingsJapgolly.next.distServerConfigSharedMod.NextConfig]): Self = StObject.set(x, "nextConfig", value.asInstanceOf[js.Any])
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageFilePath(value: String): Self = StObject.set(x, "pageFilePath", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
