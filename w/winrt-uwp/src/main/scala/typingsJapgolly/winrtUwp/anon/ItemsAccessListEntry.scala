package typingsJapgolly.winrtUwp.anon

import typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.AccessListEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsAccessListEntry extends StObject {
  
  /** The items in the collection that start at startIndex. */ var items: AccessListEntry
  
  /** The number of items retrieved. */ var returnValue: Double
}
object ItemsAccessListEntry {
  
  inline def apply(items: AccessListEntry, returnValue: Double): ItemsAccessListEntry = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsAccessListEntry]
  }
  
  extension [Self <: ItemsAccessListEntry](x: Self) {
    
    inline def setItems(value: AccessListEntry): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
