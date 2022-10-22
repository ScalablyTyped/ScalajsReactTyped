package typingsJapgolly.oracleOraclejet.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.add
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.remove
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementEndCallback
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var action: add | remove | update
  
  var element: org.scalajs.dom.Element
  
  def endCallback(): Unit
}
object ElementEndCallback {
  
  inline def apply(action: add | remove | update, element: org.scalajs.dom.Element, endCallback: Callback): ElementEndCallback = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endCallback = endCallback.toJsFn)
    __obj.asInstanceOf[ElementEndCallback]
  }
  
  extension [Self <: ElementEndCallback](x: Self) {
    
    inline def setAction(value: add | remove | update): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: Callback): Self = StObject.set(x, "endCallback", value.toJsFn)
  }
}
