package typingsJapgolly.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockstrapModalDefaultsFooterTemplate
  extends StObject
     with KnockstrapDefaultsTemplateBase {
  
  var data: KnockstrapModalDefaultsFooterData
}
object KnockstrapModalDefaultsFooterTemplate {
  
  inline def apply(
    data: KnockstrapModalDefaultsFooterData,
    name: String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapModalDefaultsFooterTemplate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapModalDefaultsFooterTemplate]
  }
  
  extension [Self <: KnockstrapModalDefaultsFooterTemplate](x: Self) {
    
    inline def setData(value: KnockstrapModalDefaultsFooterData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
