package typingsJapgolly.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockstrapDefaultsTemplateBase extends StObject {
  
  var name: String
  
  var templateEngine: KnockstrapStringTemplateEngine
}
object KnockstrapDefaultsTemplateBase {
  
  inline def apply(name: String, templateEngine: KnockstrapStringTemplateEngine): KnockstrapDefaultsTemplateBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapDefaultsTemplateBase]
  }
  
  extension [Self <: KnockstrapDefaultsTemplateBase](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTemplateEngine(value: KnockstrapStringTemplateEngine): Self = StObject.set(x, "templateEngine", value.asInstanceOf[js.Any])
  }
}
