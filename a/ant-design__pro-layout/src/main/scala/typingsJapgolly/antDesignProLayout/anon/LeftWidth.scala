package typingsJapgolly.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftWidth extends StObject {
  
  var leftWidth: js.UndefOr[String] = js.undefined
}
object LeftWidth {
  
  inline def apply(): LeftWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeftWidth]
  }
  
  extension [Self <: LeftWidth](x: Self) {
    
    inline def setLeftWidth(value: String): Self = StObject.set(x, "leftWidth", value.asInstanceOf[js.Any])
    
    inline def setLeftWidthUndefined: Self = StObject.set(x, "leftWidth", js.undefined)
  }
}
