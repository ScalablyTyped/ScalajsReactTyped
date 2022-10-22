package typingsJapgolly.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTrigger extends StObject {
  
  var element: js.UndefOr[org.scalajs.dom.Element] = js.undefined
}
object EventTrigger {
  
  inline def apply(): EventTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTrigger]
  }
  
  extension [Self <: EventTrigger](x: Self) {
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
  }
}
