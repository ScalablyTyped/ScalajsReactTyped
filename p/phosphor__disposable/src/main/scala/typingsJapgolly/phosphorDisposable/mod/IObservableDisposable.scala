package typingsJapgolly.phosphorDisposable.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableDisposable extends IDisposable {
  /**
    * A signal emitted when the object is disposed.
    */
  val disposed: ISignal[this.type, Unit]
}

object IObservableDisposable {
  @scala.inline
  def apply(dispose: Callback, disposed: ISignal[IObservableDisposable, Unit], isDisposed: Boolean): IObservableDisposable = {
    val __obj = js.Dynamic.literal(disposed = disposed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[IObservableDisposable]
  }
}

