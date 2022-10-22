package typingsJapgolly.reachDropdown.anon

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reachPopover.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsExpanded extends StObject {
  
  var isExpanded: Boolean
  
  var portal: Boolean
  
  var position: js.UndefOr[Position] = js.undefined
  
  var targetRef: RefHandle[Null | HTMLElement]
}
object IsExpanded {
  
  inline def apply(isExpanded: Boolean, portal: Boolean, targetRef: RefHandle[Null | HTMLElement]): IsExpanded = {
    val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any], portal = portal.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsExpanded]
  }
  
  extension [Self <: IsExpanded](x: Self) {
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setPortal(value: Boolean): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTargetRef(value: RefHandle[Null | HTMLElement]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
  }
}
