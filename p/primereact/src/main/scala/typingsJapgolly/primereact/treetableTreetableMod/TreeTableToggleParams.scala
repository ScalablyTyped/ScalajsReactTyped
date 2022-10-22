package typingsJapgolly.primereact.treetableTreetableMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTableToggleParams extends StObject {
  
  var originalEvent: ReactEventFrom[Element]
  
  var value: TreeTableExpandedKeysType
}
object TreeTableToggleParams {
  
  inline def apply(originalEvent: ReactEventFrom[Element], value: TreeTableExpandedKeysType): TreeTableToggleParams = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeTableToggleParams]
  }
  
  extension [Self <: TreeTableToggleParams](x: Self) {
    
    inline def setOriginalEvent(value: ReactEventFrom[Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TreeTableExpandedKeysType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
