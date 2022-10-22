package typingsJapgolly.v8CompileCacheLib

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CacheDir extends StObject {
    
    var cacheDir: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object CacheDir {
    
    inline def apply(): CacheDir = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheDir]
    }
    
    extension [Self <: CacheDir](x: Self) {
      
      inline def setCacheDir(value: String): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
      
      inline def setCacheDirUndefined: Self = StObject.set(x, "cacheDir", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  trait Uninstall extends StObject {
    
    def uninstall(): Unit
  }
  object Uninstall {
    
    inline def apply(uninstall: Callback): Uninstall = {
      val __obj = js.Dynamic.literal(uninstall = uninstall.toJsFn)
      __obj.asInstanceOf[Uninstall]
    }
    
    extension [Self <: Uninstall](x: Self) {
      
      inline def setUninstall(value: Callback): Self = StObject.set(x, "uninstall", value.toJsFn)
    }
  }
}
