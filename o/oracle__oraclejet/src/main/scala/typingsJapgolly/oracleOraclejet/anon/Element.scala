package typingsJapgolly.oracleOraclejet.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var action: String
  
  var element: org.scalajs.dom.Element
  
  def endCallback(): Unit
}
object Element {
  
  inline def apply(action: String, element: org.scalajs.dom.Element, endCallback: Callback): Element = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endCallback = endCallback.toJsFn)
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: Callback): Self = StObject.set(x, "endCallback", value.toJsFn)
  }
}
