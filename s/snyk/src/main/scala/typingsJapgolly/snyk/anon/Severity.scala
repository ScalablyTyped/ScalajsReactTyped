package typingsJapgolly.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Severity extends StObject {
  
  var severity: js.UndefOr[String] = js.undefined
}
object Severity {
  
  inline def apply(): Severity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Severity]
  }
  
  extension [Self <: Severity](x: Self) {
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
