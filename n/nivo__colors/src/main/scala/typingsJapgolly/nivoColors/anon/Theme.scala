package typingsJapgolly.nivoColors.anon

import typingsJapgolly.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  var theme: Validator[String]
}
object Theme {
  
  inline def apply(theme: Validator[String]): Theme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  extension [Self <: Theme](x: Self) {
    
    inline def setTheme(value: Validator[String]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
