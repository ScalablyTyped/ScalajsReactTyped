package typingsJapgolly.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeDisabled extends StObject {
  
  var includeDisabled: Boolean
}
object IncludeDisabled {
  
  inline def apply(includeDisabled: Boolean): IncludeDisabled = {
    val __obj = js.Dynamic.literal(includeDisabled = includeDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeDisabled]
  }
  
  extension [Self <: IncludeDisabled](x: Self) {
    
    inline def setIncludeDisabled(value: Boolean): Self = StObject.set(x, "includeDisabled", value.asInstanceOf[js.Any])
  }
}
