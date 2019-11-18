package typingsJapgolly.atAngularCore.atAngularCoreMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterableChanges[V] extends js.Object {
  /** Iterate over all added items. */
  def forEachAddedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit
  /** Iterate over all items which had their identity (as computed by the `TrackByFunction`)
    * changed. */
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
  @scala.inline
  def apply[V](
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forEachAddedItem")(js.Any.fromFunction1((t0: js.Function1[
  /* record */ typingsJapgolly.atAngularCore.atAngularCoreMod.IterableChangeRecord[V], 
  scala.Unit]) => forEachAddedItem(t0).runNow()))
    __obj.updateDynamic("forEachIdentityChange")(js.Any.fromFunction1((t0: js.Function1[
  /* record */ typingsJapgolly.atAngularCore.atAngularCoreMod.IterableChangeRecord[V], 
  scala.Unit]) => forEachIdentityChange(t0).runNow()))
    __obj.updateDynamic("forEachItem")(js.Any.fromFunction1((t0: js.Function1[
  /* record */ typingsJapgolly.atAngularCore.atAngularCoreMod.IterableChangeRecord[V], 
  scala.Unit]) => forEachItem(t0).runNow()))
    __obj.updateDynamic("forEachMovedItem")(js.Any.fromFunction1((t0: js.Function1[
  /* record */ typingsJapgolly.atAngularCore.atAngularCoreMod.IterableChangeRecord[V], 
  scala.Unit]) => forEachMovedItem(t0).runNow()))
    __obj.updateDynamic("forEachOperation")(js.Any.fromFunction1((t0: js.Function3[
  /* record */ typingsJapgolly.atAngularCore.atAngularCoreMod.IterableChangeRecord[V], 
  /* previousIndex */ scala.Double | scala.Null, 
  /* currentIndex */ scala.Double | scala.Null, 
  scala.Unit]) => forEachOperation(t0).runNow()))
    __obj.updateDynamic("forEachPreviousItem")(js.Any.fromFunction1((t0: js.Function1[
  /* record */ typingsJapgolly.atAngularCore.atAngularCoreMod.IterableChangeRecord[V], 
  scala.Unit]) => forEachPreviousItem(t0).runNow()))
    __obj.updateDynamic("forEachRemovedItem")(js.Any.fromFunction1((t0: js.Function1[
  /* record */ typingsJapgolly.atAngularCore.atAngularCoreMod.IterableChangeRecord[V], 
  scala.Unit]) => forEachRemovedItem(t0).runNow()))
    __obj.asInstanceOf[IterableChanges[V]]
  }
}

