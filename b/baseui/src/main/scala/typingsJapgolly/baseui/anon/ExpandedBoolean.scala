package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandedBoolean extends StObject {
  
  var expanded: Boolean
}
object ExpandedBoolean {
  
  inline def apply(expanded: Boolean): ExpandedBoolean = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedBoolean]
  }
  
  extension [Self <: ExpandedBoolean](x: Self) {
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
  }
}
