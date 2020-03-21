package typingsJapgolly.phosphorDisposable.mod

import typingsJapgolly.phosphorAlgorithm.iterMod.IterableOrArrayLike
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/disposable", "ObservableDisposableSet")
@js.native
class ObservableDisposableSet ()
  extends DisposableSet
     with IObservableDisposable {
  var _disposed: js.Any = js.native
  /**
    * A signal emitted when the object is disposed.
    */
  /* CompleteClass */
  override val disposed: ISignal[this.type, Unit] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

@JSImport("@phosphor/disposable", "ObservableDisposableSet")
@js.native
object ObservableDisposableSet extends js.Object {
  /**
    * Create an observable disposable set from an iterable of items.
    *
    * @param items - The iterable or array-like object of interest.
    *
    * @returns A new disposable initialized with the given items.
    */
  def from(items: IterableOrArrayLike[IDisposable]): ObservableDisposableSet = js.native
}

