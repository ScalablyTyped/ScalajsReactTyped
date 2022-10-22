package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousKey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var item: org.scalajs.dom.Element
  
  var key: Any
  
  var previousItem: org.scalajs.dom.Element
  
  var previousKey: Any
}
object PreviousKey {
  
  inline def apply(item: org.scalajs.dom.Element, key: Any, previousItem: org.scalajs.dom.Element, previousKey: Any): PreviousKey = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], previousItem = previousItem.asInstanceOf[js.Any], previousKey = previousKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousKey]
  }
  
  extension [Self <: PreviousKey](x: Self) {
    
    inline def setItem(value: org.scalajs.dom.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPreviousItem(value: org.scalajs.dom.Element): Self = StObject.set(x, "previousItem", value.asInstanceOf[js.Any])
    
    inline def setPreviousKey(value: Any): Self = StObject.set(x, "previousKey", value.asInstanceOf[js.Any])
  }
}
