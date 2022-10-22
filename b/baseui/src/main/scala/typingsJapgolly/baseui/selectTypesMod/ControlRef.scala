package typingsJapgolly.baseui.selectTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlRef extends StObject {
  
  var current: ImperativeMethods | Null
}
object ControlRef {
  
  inline def apply(): ControlRef = {
    val __obj = js.Dynamic.literal(current = null)
    __obj.asInstanceOf[ControlRef]
  }
  
  extension [Self <: ControlRef](x: Self) {
    
    inline def setCurrent(value: ImperativeMethods): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentNull: Self = StObject.set(x, "current", null)
  }
}
