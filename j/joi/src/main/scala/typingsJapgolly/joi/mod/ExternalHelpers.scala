package typingsJapgolly.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalHelpers extends StObject {
  
  var prefs: ValidationOptions
}
object ExternalHelpers {
  
  inline def apply(prefs: ValidationOptions): ExternalHelpers = {
    val __obj = js.Dynamic.literal(prefs = prefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalHelpers]
  }
  
  extension [Self <: ExternalHelpers](x: Self) {
    
    inline def setPrefs(value: ValidationOptions): Self = StObject.set(x, "prefs", value.asInstanceOf[js.Any])
  }
}
