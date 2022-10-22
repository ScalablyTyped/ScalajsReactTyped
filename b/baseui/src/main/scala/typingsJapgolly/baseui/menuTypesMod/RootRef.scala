package typingsJapgolly.baseui.menuTypesMod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootRef extends StObject {
  
  var current: Null | HTMLElement
}
object RootRef {
  
  inline def apply(): RootRef = {
    val __obj = js.Dynamic.literal(current = null)
    __obj.asInstanceOf[RootRef]
  }
  
  extension [Self <: RootRef](x: Self) {
    
    inline def setCurrent(value: HTMLElement): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentNull: Self = StObject.set(x, "current", null)
  }
}
