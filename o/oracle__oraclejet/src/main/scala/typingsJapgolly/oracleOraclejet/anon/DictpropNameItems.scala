package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameItems
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var items: js.Array[org.scalajs.dom.Element]
}
object DictpropNameItems {
  
  inline def apply(items: js.Array[org.scalajs.dom.Element]): DictpropNameItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameItems]
  }
  
  extension [Self <: DictpropNameItems](x: Self) {
    
    inline def setItems(value: js.Array[org.scalajs.dom.Element]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: org.scalajs.dom.Element*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
