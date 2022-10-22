package typingsJapgolly.openui5.anon

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemTargetRef extends StObject {
  
  /**
    * The previewed suggestion item.
    */
  var item: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * The DOM ref of the suggestion item.
    */
  var targetRef: js.UndefOr[HTMLElement] = js.undefined
}
object ItemTargetRef {
  
  inline def apply(): ItemTargetRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemTargetRef]
  }
  
  extension [Self <: ItemTargetRef](x: Self) {
    
    inline def setItem(value: HTMLElement): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
    
    inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
  }
}
