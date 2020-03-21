package typingsJapgolly.jupyterlabCoreutils.interfacesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IRestorable.IOptions
import typingsJapgolly.phosphorDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRestorer_[T /* <: IRestorable[U, _] */, U /* <: IObservableDisposable */, V] extends js.Object {
  /**
    * A promise that settles when the collection has been restored.
    */
  val restored: js.Promise[V]
  /**
    * Restore the objects in a given restorable collection.
    *
    * @param restorable - The restorable collection being restored.
    *
    * @param options - The configuration options that describe restoration.
    *
    * @returns A promise that settles when restored with `any` results.
    *
    */
  def restore(restorable: T, options: IOptions[U]): js.Promise[V]
}

object IRestorer_ {
  @scala.inline
  def apply[T /* <: IRestorable[U, _] */, U /* <: IObservableDisposable */, V](restore: (T, IOptions[U]) => CallbackTo[js.Promise[V]], restored: js.Promise[V]): IRestorer_[T, U, V] = {
    val __obj = js.Dynamic.literal(restored = restored.asInstanceOf[js.Any])
    __obj.updateDynamic("restore")(js.Any.fromFunction2((t0: T, t1: typingsJapgolly.jupyterlabCoreutils.interfacesMod.IRestorable.IOptions[U]) => restore(t0, t1).runNow()))
    __obj.asInstanceOf[IRestorer_[T, U, V]]
  }
}

