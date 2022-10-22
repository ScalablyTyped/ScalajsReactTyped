package typingsJapgolly.winrt.anon

import typingsJapgolly.winrt.Windows.Storage.AccessCache.AccessListEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var items: js.Array[AccessListEntry]
  
  var returnValue: Double
}
object `10` {
  
  inline def apply(items: js.Array[AccessListEntry], returnValue: Double): `10` = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setItems(value: js.Array[AccessListEntry]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: AccessListEntry*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
