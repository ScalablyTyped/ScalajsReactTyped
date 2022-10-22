package typingsJapgolly.knockstrap

import typingsJapgolly.knockstrap.anon.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutStatic extends StObject {
  
  var stringTemplateEngine: Instance
}
object KnockoutStatic {
  
  inline def apply(stringTemplateEngine: Instance): KnockoutStatic = {
    val __obj = js.Dynamic.literal(stringTemplateEngine = stringTemplateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  extension [Self <: KnockoutStatic](x: Self) {
    
    inline def setStringTemplateEngine(value: Instance): Self = StObject.set(x, "stringTemplateEngine", value.asInstanceOf[js.Any])
  }
}
