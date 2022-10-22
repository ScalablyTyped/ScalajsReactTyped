package typingsJapgolly.babylonjs.anon

import org.scalajs.dom.FocusEvent
import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandlerName extends StObject {
  
  var handler: Nullable[js.Function1[/* e */ FocusEvent, Any]]
  
  var name: String
}
object HandlerName {
  
  inline def apply(name: String): HandlerName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], handler = null)
    __obj.asInstanceOf[HandlerName]
  }
  
  extension [Self <: HandlerName](x: Self) {
    
    inline def setHandler(value: /* e */ FocusEvent => Any): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    
    inline def setHandlerNull: Self = StObject.set(x, "handler", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
