package typingsJapgolly.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extra extends StObject {
  
  var extra: Boolean
}
object Extra {
  
  inline def apply(extra: Boolean): Extra = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extra]
  }
  
  extension [Self <: Extra](x: Self) {
    
    inline def setExtra(value: Boolean): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
  }
}
