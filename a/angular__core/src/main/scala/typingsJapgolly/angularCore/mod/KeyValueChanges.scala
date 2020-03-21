package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValueChanges[K, V] extends js.Object {
  /**
    * Iterate over all added items.
    */
  def forEachAddedItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit]): Unit
  /**
    * Iterate over all keys for which values have changed.
    */
  def forEachChangedItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit]): Unit
  /**
    * Iterate over all changes. `KeyValueChangeRecord` will contain information about changes
    * to each item.
    */
  def forEachItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit]): Unit
  /**
    * Iterate over changes in the order of original Map showing where the original items
    * have moved.
    */
  def forEachPreviousItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit]): Unit
  /**
    * Iterate over all removed items.
    */
  def forEachRemovedItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit]): Unit
}

object KeyValueChanges {
  @scala.inline
  def apply[K, V](
    forEachAddedItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Callback,
    forEachChangedItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Callback,
    forEachItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Callback,
    forEachPreviousItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Callback,
    forEachRemovedItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Callback
  ): KeyValueChanges[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forEachAddedItem")(js.Any.fromFunction1((t0: js.Function1[/* r */ typingsJapgolly.angularCore.mod.KeyValueChangeRecord[K, V], scala.Unit]) => forEachAddedItem(t0).runNow()))
    __obj.updateDynamic("forEachChangedItem")(js.Any.fromFunction1((t0: js.Function1[/* r */ typingsJapgolly.angularCore.mod.KeyValueChangeRecord[K, V], scala.Unit]) => forEachChangedItem(t0).runNow()))
    __obj.updateDynamic("forEachItem")(js.Any.fromFunction1((t0: js.Function1[/* r */ typingsJapgolly.angularCore.mod.KeyValueChangeRecord[K, V], scala.Unit]) => forEachItem(t0).runNow()))
    __obj.updateDynamic("forEachPreviousItem")(js.Any.fromFunction1((t0: js.Function1[/* r */ typingsJapgolly.angularCore.mod.KeyValueChangeRecord[K, V], scala.Unit]) => forEachPreviousItem(t0).runNow()))
    __obj.updateDynamic("forEachRemovedItem")(js.Any.fromFunction1((t0: js.Function1[/* r */ typingsJapgolly.angularCore.mod.KeyValueChangeRecord[K, V], scala.Unit]) => forEachRemovedItem(t0).runNow()))
    __obj.asInstanceOf[KeyValueChanges[K, V]]
  }
}

