package typingsJapgolly.terminalKit.anon

import typingsJapgolly.terminalKit.terminalKitStrings.button
import typingsJapgolly.terminalKit.terminalKitStrings.drag
import typingsJapgolly.terminalKit.terminalKitStrings.motion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mouse extends StObject {
  
  var mouse: js.UndefOr[button | drag | motion] = js.undefined
  
  var safe: js.UndefOr[Boolean] = js.undefined
}
object Mouse {
  
  inline def apply(): Mouse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mouse]
  }
  
  extension [Self <: Mouse](x: Self) {
    
    inline def setMouse(value: button | drag | motion): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    inline def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
    
    inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
    
    inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
  }
}
