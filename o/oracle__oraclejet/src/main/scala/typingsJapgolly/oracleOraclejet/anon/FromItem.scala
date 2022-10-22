package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromItem
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var fromItem: org.scalajs.dom.Element
  
  var fromKey: Any
  
  var toItem: org.scalajs.dom.Element
  
  var toKey: Any
}
object FromItem {
  
  inline def apply(fromItem: org.scalajs.dom.Element, fromKey: Any, toItem: org.scalajs.dom.Element, toKey: Any): FromItem = {
    val __obj = js.Dynamic.literal(fromItem = fromItem.asInstanceOf[js.Any], fromKey = fromKey.asInstanceOf[js.Any], toItem = toItem.asInstanceOf[js.Any], toKey = toKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromItem]
  }
  
  extension [Self <: FromItem](x: Self) {
    
    inline def setFromItem(value: org.scalajs.dom.Element): Self = StObject.set(x, "fromItem", value.asInstanceOf[js.Any])
    
    inline def setFromKey(value: Any): Self = StObject.set(x, "fromKey", value.asInstanceOf[js.Any])
    
    inline def setToItem(value: org.scalajs.dom.Element): Self = StObject.set(x, "toItem", value.asInstanceOf[js.Any])
    
    inline def setToKey(value: Any): Self = StObject.set(x, "toKey", value.asInstanceOf[js.Any])
  }
}
