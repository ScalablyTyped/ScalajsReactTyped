package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.add
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.remove
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameActionElement
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var action: add | remove | update
  
  var element: org.scalajs.dom.Element
}
object DictpropNameActionElement {
  
  inline def apply(action: add | remove | update, element: org.scalajs.dom.Element): DictpropNameActionElement = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameActionElement]
  }
  
  extension [Self <: DictpropNameActionElement](x: Self) {
    
    inline def setAction(value: add | remove | update): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
