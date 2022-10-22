package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameItem[K]
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var item: org.scalajs.dom.Element
  
  var key: K
}
object DictpropNameItem {
  
  inline def apply[K](item: org.scalajs.dom.Element, key: K): DictpropNameItem[K] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameItem[K]]
  }
  
  extension [Self <: DictpropNameItem[?], K](x: Self & DictpropNameItem[K]) {
    
    inline def setItem(value: org.scalajs.dom.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
