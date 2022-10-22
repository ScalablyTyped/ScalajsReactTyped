package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropName
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var fromCollapsible: org.scalajs.dom.Element
  
  var toCollapsible: org.scalajs.dom.Element
}
object DictpropName {
  
  inline def apply(fromCollapsible: org.scalajs.dom.Element, toCollapsible: org.scalajs.dom.Element): DictpropName = {
    val __obj = js.Dynamic.literal(fromCollapsible = fromCollapsible.asInstanceOf[js.Any], toCollapsible = toCollapsible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropName]
  }
  
  extension [Self <: DictpropName](x: Self) {
    
    inline def setFromCollapsible(value: org.scalajs.dom.Element): Self = StObject.set(x, "fromCollapsible", value.asInstanceOf[js.Any])
    
    inline def setToCollapsible(value: org.scalajs.dom.Element): Self = StObject.set(x, "toCollapsible", value.asInstanceOf[js.Any])
  }
}
