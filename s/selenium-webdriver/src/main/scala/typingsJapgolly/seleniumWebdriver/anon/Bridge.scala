package typingsJapgolly.seleniumWebdriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bridge extends StObject {
  
  var bridge: Boolean
}
object Bridge {
  
  inline def apply(bridge: Boolean): Bridge = {
    val __obj = js.Dynamic.literal(bridge = bridge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bridge]
  }
  
  extension [Self <: Bridge](x: Self) {
    
    inline def setBridge(value: Boolean): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
  }
}
