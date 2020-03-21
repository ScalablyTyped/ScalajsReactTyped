package typingsJapgolly.jupyterlabCoreutils.interfacesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IRestorable.IOptions
import typingsJapgolly.phosphorDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRestorable_[T /* <: IObservableDisposable */, U] extends js.Object {
  /**
    * A promise that settles when the collection has been restored.
    */
  val restored: js.Promise[U]
  /**
    * Restore the objects in this restorable collection.
    *
    * @param options - The configuration options that describe restoration.
    *
    * @returns A promise that settles when restored with `any` results.
    *
    */
  def restore(options: IOptions[T]): js.Promise[U]
}

object IRestorable_ {
  @scala.inline
  def apply[T /* <: IObservableDisposable */, U](restore: IOptions[T] => CallbackTo[js.Promise[U]], restored: js.Promise[U]): IRestorable_[T, U] = {
    val __obj = js.Dynamic.literal(restored = restored.asInstanceOf[js.Any])
    __obj.updateDynamic("restore")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabCoreutils.interfacesMod.IRestorable.IOptions[T]) => restore(t0).runNow()))
    __obj.asInstanceOf[IRestorable_[T, U]]
  }
}

