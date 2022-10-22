package typingsJapgolly.interactjsTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.interactjsTypes.coreScopeMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List extends StObject {
  
  var list: js.Array[Plugin]
  
  var map: StringDictionary[Plugin]
}
object List {
  
  inline def apply(list: js.Array[Plugin], map: StringDictionary[Plugin]): typingsJapgolly.interactjsTypes.anon.List = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.interactjsTypes.anon.List]
  }
  
  extension [Self <: typingsJapgolly.interactjsTypes.anon.List](x: Self) {
    
    inline def setList(value: js.Array[Plugin]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListVarargs(value: Plugin*): Self = StObject.set(x, "list", js.Array(value*))
    
    inline def setMap(value: StringDictionary[Plugin]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
