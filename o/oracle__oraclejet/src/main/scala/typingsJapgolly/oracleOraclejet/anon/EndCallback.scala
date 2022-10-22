package typingsJapgolly.oracleOraclejet.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.close
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndCallback
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var action: open | close
  
  var element: org.scalajs.dom.Element
  
  def endCallback(): Unit
}
object EndCallback {
  
  inline def apply(action: open | close, element: org.scalajs.dom.Element, endCallback: Callback): EndCallback = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endCallback = endCallback.toJsFn)
    __obj.asInstanceOf[EndCallback]
  }
  
  extension [Self <: EndCallback](x: Self) {
    
    inline def setAction(value: open | close): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: Callback): Self = StObject.set(x, "endCallback", value.toJsFn)
  }
}
