package typingsJapgolly.dexie.mod

import typingsJapgolly.dexie.dexieStrings.creating
import typingsJapgolly.dexie.dexieStrings.deleting
import typingsJapgolly.dexie.dexieStrings.reading
import typingsJapgolly.dexie.dexieStrings.updating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableHooks[T, TKey]
  extends StObject
     with DexieEventSet {
  
  def apply(
    eventName: creating,
    subscriber: js.ThisFunction3[
      /* this */ CreatingHookContext[T, TKey], 
      /* primKey */ TKey, 
      /* obj */ T, 
      /* transaction */ Transaction, 
      Any
    ]
  ): Unit = js.native
  def apply(
    eventName: deleting,
    subscriber: js.ThisFunction3[
      /* this */ DeletingHookContext[T, TKey], 
      /* primKey */ TKey, 
      /* obj */ T, 
      /* transaction */ Transaction, 
      Any
    ]
  ): Unit = js.native
  def apply(eventName: reading, subscriber: js.Function1[/* obj */ T, T | Any]): Unit = js.native
  def apply(
    eventName: updating,
    subscriber: js.ThisFunction4[
      /* this */ UpdatingHookContext[T, TKey], 
      /* modifications */ js.Object, 
      /* primKey */ TKey, 
      /* obj */ T, 
      /* transaction */ Transaction, 
      Any
    ]
  ): Unit = js.native
  
  var creating: DexieEvent = js.native
  
  var deleting: DexieEvent = js.native
  
  var reading: DexieEvent = js.native
  
  var updating: DexieEvent = js.native
}
