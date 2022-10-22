package typingsJapgolly.cosmiconfig

import typingsJapgolly.cosmiconfig.distTypesMod.CosmiconfigResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ClearCaches extends StObject {
    
    def clearCaches(): Unit = js.native
    
    def clearLoadCache(): Unit = js.native
    
    def clearSearchCache(): Unit = js.native
    
    def load(filepath: String): js.Promise[CosmiconfigResult] = js.native
    
    def search(): js.Promise[CosmiconfigResult] = js.native
    def search(searchFrom: String): js.Promise[CosmiconfigResult] = js.native
  }
  
  @js.native
  trait ClearLoadCache extends StObject {
    
    def clearCaches(): Unit = js.native
    
    def clearLoadCache(): Unit = js.native
    
    def clearSearchCache(): Unit = js.native
    
    def load(filepath: String): CosmiconfigResult = js.native
    
    def search(): CosmiconfigResult = js.native
    def search(searchFrom: String): CosmiconfigResult = js.native
  }
  
  trait Config extends StObject {
    
    var config: typingsJapgolly.cosmiconfig.distTypesMod.Config
    
    var filepath: String
    
    var isEmpty: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply(config: typingsJapgolly.cosmiconfig.distTypesMod.Config, filepath: String): Config = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setConfig(value: typingsJapgolly.cosmiconfig.distTypesMod.Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
    }
  }
}
