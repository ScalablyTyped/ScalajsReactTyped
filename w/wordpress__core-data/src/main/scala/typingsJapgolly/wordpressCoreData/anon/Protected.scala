package typingsJapgolly.wordpressCoreData.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Protected extends StObject {
  
  var `protected`: Boolean
}
object Protected {
  
  inline def apply(`protected`: Boolean): Protected = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protected]
  }
  
  extension [Self <: Protected](x: Self) {
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
  }
}
