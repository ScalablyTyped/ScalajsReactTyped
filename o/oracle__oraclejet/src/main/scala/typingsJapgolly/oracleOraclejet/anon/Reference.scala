package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reference
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var items: js.Array[org.scalajs.dom.Element]
  
  var position: String
  
  var reference: org.scalajs.dom.Element
}
object Reference {
  
  inline def apply(items: js.Array[org.scalajs.dom.Element], position: String, reference: org.scalajs.dom.Element): Reference = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  
  extension [Self <: Reference](x: Self) {
    
    inline def setItems(value: js.Array[org.scalajs.dom.Element]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: org.scalajs.dom.Element*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setReference(value: org.scalajs.dom.Element): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
