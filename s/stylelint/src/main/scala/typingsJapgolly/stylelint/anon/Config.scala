package typingsJapgolly.stylelint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: typingsJapgolly.stylelint.mod.Config
  
  var filepath: String
  
  var isEmpty: js.UndefOr[Boolean] = js.undefined
}
object Config {
  
  inline def apply(config: typingsJapgolly.stylelint.mod.Config, filepath: String): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: typingsJapgolly.stylelint.mod.Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
    
    inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    
    inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
  }
}
