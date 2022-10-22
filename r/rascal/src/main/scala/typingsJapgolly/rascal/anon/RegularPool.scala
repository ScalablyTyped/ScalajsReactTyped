package typingsJapgolly.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegularPool extends StObject {
  
  var confirmPool: Autostart
  
  var regularPool: Autostart
}
object RegularPool {
  
  inline def apply(confirmPool: Autostart, regularPool: Autostart): RegularPool = {
    val __obj = js.Dynamic.literal(confirmPool = confirmPool.asInstanceOf[js.Any], regularPool = regularPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegularPool]
  }
  
  extension [Self <: RegularPool](x: Self) {
    
    inline def setConfirmPool(value: Autostart): Self = StObject.set(x, "confirmPool", value.asInstanceOf[js.Any])
    
    inline def setRegularPool(value: Autostart): Self = StObject.set(x, "regularPool", value.asInstanceOf[js.Any])
  }
}
