package typingsJapgolly.aureliaBinding.mod

import typingsJapgolly.aureliaBinding.aureliaBindingStrings.add
import typingsJapgolly.aureliaBinding.aureliaBindingStrings.clear
import typingsJapgolly.aureliaBinding.aureliaBindingStrings.delete
import typingsJapgolly.aureliaBinding.aureliaBindingStrings.update
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICollectionObserverSplice[T, K] extends StObject {
  
  /* ArrayObserverSplice */
  /**
    * Number of items added to the collection.
    */
  var addedCount: Double
  
  /**
    * The position at which the items were added.
    */
  var index: Double
  
  /**
    * The key of the Map item that was changed.
    */
  var key: K
  
  /* End ArrayObserverSplice */
  /**
    * The observed Set or Map after the change.
    */
  var `object`: Set[T] | (Map[K, T])
  
  /**
    * The value of the Map item prior to the change.
    */
  var oldValue: T
  
  /**
    * A collection of items that were removed from the collection.
    */
  var removed: js.Array[T]
  
  /**
    * The type of change that has taken place. Valid options are "add", "delete", "update", and  "clear".
    * 
    * *Note:* "update" is invalid for Set.
    * 
    * *Note:* "clear" is only valid for Map and Set.
    */
  var `type`: add | delete | update | clear
  
  /**
    * The Set value that was either added or removed.
    */
  var value: T
}
object ICollectionObserverSplice {
  
  inline def apply[T, K](
    addedCount: Double,
    index: Double,
    key: K,
    `object`: Set[T] | (Map[K, T]),
    oldValue: T,
    removed: js.Array[T],
    `type`: add | delete | update | clear,
    value: T
  ): ICollectionObserverSplice[T, K] = {
    val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollectionObserverSplice[T, K]]
  }
  
  extension [Self <: ICollectionObserverSplice[?, ?], T, K](x: Self & (ICollectionObserverSplice[T, K])) {
    
    inline def setAddedCount(value: Double): Self = StObject.set(x, "addedCount", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Set[T] | (Map[K, T])): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setRemoved(value: js.Array[T]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedVarargs(value: T*): Self = StObject.set(x, "removed", js.Array(value*))
    
    inline def setType(value: add | delete | update | clear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
