package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expanded extends StObject {
  
  var expanded: js.Array[typingsJapgolly.react.mod.Key]
}
object Expanded {
  
  inline def apply(expanded: js.Array[typingsJapgolly.react.mod.Key]): Expanded = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expanded]
  }
  
  extension [Self <: Expanded](x: Self) {
    
    inline def setExpanded(value: js.Array[typingsJapgolly.react.mod.Key]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedVarargs(value: typingsJapgolly.react.mod.Key*): Self = StObject.set(x, "expanded", js.Array(value*))
  }
}
