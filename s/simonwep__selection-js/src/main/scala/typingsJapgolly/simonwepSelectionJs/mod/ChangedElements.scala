package typingsJapgolly.simonwepSelectionJs.mod

import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangedElements extends StObject {
  
  var added: js.Array[Element]
  
  var removed: js.Array[Element]
}
object ChangedElements {
  
  inline def apply(added: js.Array[Element], removed: js.Array[Element]): ChangedElements = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedElements]
  }
  
  extension [Self <: ChangedElements](x: Self) {
    
    inline def setAdded(value: js.Array[Element]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedVarargs(value: Element*): Self = StObject.set(x, "added", js.Array(value*))
    
    inline def setRemoved(value: js.Array[Element]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedVarargs(value: Element*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}
