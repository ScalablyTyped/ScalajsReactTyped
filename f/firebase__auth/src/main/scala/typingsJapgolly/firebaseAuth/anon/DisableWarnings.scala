package typingsJapgolly.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableWarnings extends StObject {
  
  var disableWarnings: Boolean
}
object DisableWarnings {
  
  inline def apply(disableWarnings: Boolean): DisableWarnings = {
    val __obj = js.Dynamic.literal(disableWarnings = disableWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableWarnings]
  }
  
  extension [Self <: DisableWarnings](x: Self) {
    
    inline def setDisableWarnings(value: Boolean): Self = StObject.set(x, "disableWarnings", value.asInstanceOf[js.Any])
  }
}
