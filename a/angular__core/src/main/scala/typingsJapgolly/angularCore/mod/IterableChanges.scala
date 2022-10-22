package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IterableChanges[V] extends StObject {
  
  /** Iterate over all added items. */
  def forEachAddedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit
  
  /**
    * Iterate over all items which had their identity (as computed by the `TrackByFunction`)
    * changed.
    */
  def forEachIdentityChange(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit
  
  /**
    * Iterate over all changes. `IterableChangeRecord` will contain information about changes
    * to each item.
    */
  def forEachItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit
  
  /** Iterate over all moved items. */
  def forEachMovedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit
  
  /**
    * Iterate over a set of operations which when applied to the original `Iterable` will produce the
    * new `Iterable`.
    *
    * NOTE: These are not necessarily the actual operations which were applied to the original
    * `Iterable`, rather these are a set of computed operations which may not be the same as the
    * ones applied.
    *
    * @param record A change which needs to be applied
    * @param previousIndex The `IterableChangeRecord#previousIndex` of the `record` refers to the
    *        original `Iterable` location, where as `previousIndex` refers to the transient location
    *        of the item, after applying the operations up to this point.
    * @param currentIndex The `IterableChangeRecord#currentIndex` of the `record` refers to the
    *        original `Iterable` location, where as `currentIndex` refers to the transient location
    *        of the item, after applying the operations up to this point.
    */
  def forEachOperation(
    fn: js.Function3[
      /* record */ IterableChangeRecord[V], 
      /* previousIndex */ Double | Null, 
      /* currentIndex */ Double | Null, 
      Unit
    ]
  ): Unit
  
  /**
    * Iterate over changes in the order of original `Iterable` showing where the original items
    * have moved.
    */
  def forEachPreviousItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit
  
  /** Iterate over all removed items. */
  def forEachRemovedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit
}
object IterableChanges {
  
  inline def apply[V](
    forEachAddedItem: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Callback,
    forEachIdentityChange: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Callback,
    forEachItem: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Callback,
    forEachMovedItem: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Callback,
    forEachOperation: js.Function3[
      /* record */ IterableChangeRecord[V], 
      /* previousIndex */ Double | Null, 
      /* currentIndex */ Double | Null, 
      Unit
    ] => Callback,
    forEachPreviousItem: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Callback,
    forEachRemovedItem: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Callback
  ): IterableChanges[V] = {
    val __obj = js.Dynamic.literal(forEachAddedItem = js.Any.fromFunction1((t0: js.Function1[/* record */ IterableChangeRecord[V], Unit]) => forEachAddedItem(t0).runNow()), forEachIdentityChange = js.Any.fromFunction1((t0: js.Function1[/* record */ IterableChangeRecord[V], Unit]) => forEachIdentityChange(t0).runNow()), forEachItem = js.Any.fromFunction1((t0: js.Function1[/* record */ IterableChangeRecord[V], Unit]) => forEachItem(t0).runNow()), forEachMovedItem = js.Any.fromFunction1((t0: js.Function1[/* record */ IterableChangeRecord[V], Unit]) => forEachMovedItem(t0).runNow()), forEachOperation = js.Any.fromFunction1((t0: js.Function3[
      /* record */ IterableChangeRecord[V], 
      /* previousIndex */ Double | Null, 
      /* currentIndex */ Double | Null, 
      Unit
    ]) => forEachOperation(t0).runNow()), forEachPreviousItem = js.Any.fromFunction1((t0: js.Function1[/* record */ IterableChangeRecord[V], Unit]) => forEachPreviousItem(t0).runNow()), forEachRemovedItem = js.Any.fromFunction1((t0: js.Function1[/* record */ IterableChangeRecord[V], Unit]) => forEachRemovedItem(t0).runNow()))
    __obj.asInstanceOf[IterableChanges[V]]
  }
  
  extension [Self <: IterableChanges[?], V](x: Self & IterableChanges[V]) {
    
    inline def setForEachAddedItem(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Callback): Self = StObject.set(x, "forEachAddedItem", js.Any.fromFunction1((t0: js.Function1[/* record */ IterableChangeRecord[V], Unit]) => value(t0).runNow()))
    
    inline def setForEachIdentityChange(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Callback): Self = StObject.set(x, "forEachIdentityChange", js.Any.fromFunction1((t0: js.Function1[/* record */ IterableChangeRecord[V], Unit]) => value(t0).runNow()))
    
    inline def setForEachItem(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Callback): Self = StObject.set(x, "forEachItem", js.Any.fromFunction1((t0: js.Function1[/* record */ IterableChangeRecord[V], Unit]) => value(t0).runNow()))
    
    inline def setForEachMovedItem(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Callback): Self = StObject.set(x, "forEachMovedItem", js.Any.fromFunction1((t0: js.Function1[/* record */ IterableChangeRecord[V], Unit]) => value(t0).runNow()))
    
    inline def setForEachOperation(
      value: js.Function3[
          /* record */ IterableChangeRecord[V], 
          /* previousIndex */ Double | Null, 
          /* currentIndex */ Double | Null, 
          Unit
        ] => Callback
    ): Self = StObject.set(x, "forEachOperation", js.Any.fromFunction1((t0: js.Function3[
          /* record */ IterableChangeRecord[V], 
          /* previousIndex */ Double | Null, 
          /* currentIndex */ Double | Null, 
          Unit
        ]) => value(t0).runNow()))
    
    inline def setForEachPreviousItem(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Callback): Self = StObject.set(x, "forEachPreviousItem", js.Any.fromFunction1((t0: js.Function1[/* record */ IterableChangeRecord[V], Unit]) => value(t0).runNow()))
    
    inline def setForEachRemovedItem(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Callback): Self = StObject.set(x, "forEachRemovedItem", js.Any.fromFunction1((t0: js.Function1[/* record */ IterableChangeRecord[V], Unit]) => value(t0).runNow()))
  }
}
