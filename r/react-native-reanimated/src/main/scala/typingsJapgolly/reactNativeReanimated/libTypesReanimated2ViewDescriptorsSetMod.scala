package typingsJapgolly.reactNativeReanimated

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.SharedValue
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.Descriptor
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2ViewDescriptorsSetMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/ViewDescriptorsSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeViewDescriptorsSet(): ViewDescriptorsSet = ^.asInstanceOf[js.Dynamic].applyDynamic("makeViewDescriptorsSet")().asInstanceOf[ViewDescriptorsSet]
  
  inline def makeViewsRefSet[T](): ViewRefSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeViewsRefSet")().asInstanceOf[ViewRefSet[T]]
  
  trait ViewDescriptorsSet extends StObject {
    
    def add(item: Descriptor): Unit
    
    var batchToRemove: Set[Double]
    
    var items: js.Array[Descriptor]
    
    def rebuildsharableViewDescriptors(sharableViewDescriptor: SharedValue[js.Array[Descriptor]]): Unit
    
    def remove(viewTag: Double): Unit
    
    var sharableViewDescriptors: SharedValue[js.Array[Descriptor]]
    
    var tags: Set[Double]
    
    var waitForInsertSync: Boolean
    
    var waitForRemoveSync: Boolean
  }
  object ViewDescriptorsSet {
    
    inline def apply(
      add: Descriptor => Callback,
      batchToRemove: Set[Double],
      items: js.Array[Descriptor],
      rebuildsharableViewDescriptors: SharedValue[js.Array[Descriptor]] => Callback,
      remove: Double => Callback,
      sharableViewDescriptors: SharedValue[js.Array[Descriptor]],
      tags: Set[Double],
      waitForInsertSync: Boolean,
      waitForRemoveSync: Boolean
    ): ViewDescriptorsSet = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: Descriptor) => add(t0).runNow()), batchToRemove = batchToRemove.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], rebuildsharableViewDescriptors = js.Any.fromFunction1((t0: SharedValue[js.Array[Descriptor]]) => rebuildsharableViewDescriptors(t0).runNow()), remove = js.Any.fromFunction1((t0: Double) => remove(t0).runNow()), sharableViewDescriptors = sharableViewDescriptors.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], waitForInsertSync = waitForInsertSync.asInstanceOf[js.Any], waitForRemoveSync = waitForRemoveSync.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewDescriptorsSet]
    }
    
    extension [Self <: ViewDescriptorsSet](x: Self) {
      
      inline def setAdd(value: Descriptor => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: Descriptor) => value(t0).runNow()))
      
      inline def setBatchToRemove(value: Set[Double]): Self = StObject.set(x, "batchToRemove", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[Descriptor]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Descriptor*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setRebuildsharableViewDescriptors(value: SharedValue[js.Array[Descriptor]] => Callback): Self = StObject.set(x, "rebuildsharableViewDescriptors", js.Any.fromFunction1((t0: SharedValue[js.Array[Descriptor]]) => value(t0).runNow()))
      
      inline def setRemove(value: Double => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSharableViewDescriptors(value: SharedValue[js.Array[Descriptor]]): Self = StObject.set(x, "sharableViewDescriptors", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Set[Double]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setWaitForInsertSync(value: Boolean): Self = StObject.set(x, "waitForInsertSync", value.asInstanceOf[js.Any])
      
      inline def setWaitForRemoveSync(value: Boolean): Self = StObject.set(x, "waitForRemoveSync", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViewRefSet[T] extends StObject {
    
    def add(item: T): Unit
    
    var items: Set[T]
    
    def remove(item: T): Unit
  }
  object ViewRefSet {
    
    inline def apply[T](add: T => Callback, items: Set[T], remove: T => Callback): ViewRefSet[T] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: T) => add(t0).runNow()), items = items.asInstanceOf[js.Any], remove = js.Any.fromFunction1((t0: T) => remove(t0).runNow()))
      __obj.asInstanceOf[ViewRefSet[T]]
    }
    
    extension [Self <: ViewRefSet[?], T](x: Self & ViewRefSet[T]) {
      
      inline def setAdd(value: T => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
      
      inline def setItems(value: Set[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: T => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    }
  }
}
