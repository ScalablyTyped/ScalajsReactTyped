package typingsJapgolly.angularForms.anon

import typingsJapgolly.angularForms.angularFormsStrings.pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern extends StObject {
  
  var pattern: typingsJapgolly.angularForms.angularFormsStrings.pattern
}
object Pattern {
  
  inline def apply(): Pattern = {
    val __obj = js.Dynamic.literal(pattern = "pattern")
    __obj.asInstanceOf[Pattern]
  }
  
  extension [Self <: Pattern](x: Self) {
    
    inline def setPattern(value: pattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
