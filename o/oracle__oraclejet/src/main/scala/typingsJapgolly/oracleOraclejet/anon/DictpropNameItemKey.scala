package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameItemKey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var item: org.scalajs.dom.Element
  
  var key: Any
}
object DictpropNameItemKey {
  
  inline def apply(item: org.scalajs.dom.Element, key: Any): DictpropNameItemKey = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameItemKey]
  }
  
  extension [Self <: DictpropNameItemKey](x: Self) {
    
    inline def setItem(value: org.scalajs.dom.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
