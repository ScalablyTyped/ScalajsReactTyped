package typingsJapgolly.rdfLoadersRegistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LoaderRegistry extends StObject {
    
    var loaderRegistry: typingsJapgolly.rdfLoadersRegistry.mod.LoaderRegistry
  }
  object LoaderRegistry {
    
    inline def apply(loaderRegistry: typingsJapgolly.rdfLoadersRegistry.mod.LoaderRegistry): LoaderRegistry = {
      val __obj = js.Dynamic.literal(loaderRegistry = loaderRegistry.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoaderRegistry]
    }
    
    extension [Self <: LoaderRegistry](x: Self) {
      
      inline def setLoaderRegistry(value: typingsJapgolly.rdfLoadersRegistry.mod.LoaderRegistry): Self = StObject.set(x, "loaderRegistry", value.asInstanceOf[js.Any])
    }
  }
}
