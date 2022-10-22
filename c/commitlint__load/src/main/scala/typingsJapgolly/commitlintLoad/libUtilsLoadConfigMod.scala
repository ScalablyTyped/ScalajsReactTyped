package typingsJapgolly.commitlintLoad

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsLoadConfigMod {
  
  @JSImport("@commitlint/load/lib/utils/load-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadConfig(cwd: String): js.Promise[LoadConfigResult | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(cwd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LoadConfigResult | Null]]
  inline def loadConfig(cwd: String, configPath: String): js.Promise[LoadConfigResult | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(cwd.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LoadConfigResult | Null]]
  
  trait LoadConfigResult extends StObject {
    
    var config: Any
    
    var filepath: String
    
    var isEmpty: js.UndefOr[Boolean] = js.undefined
  }
  object LoadConfigResult {
    
    inline def apply(config: Any, filepath: String): LoadConfigResult = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadConfigResult]
    }
    
    extension [Self <: LoadConfigResult](x: Self) {
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
    }
  }
}
