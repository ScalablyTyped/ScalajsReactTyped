package typingsJapgolly.jupyterlabObservables.modeldbMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservable extends IDisposable {
  /**
    * The type of this object.
    */
  val `type`: ObservableType
}

object IObservable {
  @scala.inline
  def apply(dispose: Callback, isDisposed: Boolean, `type`: ObservableType): IObservable = {
    val __obj = js.Dynamic.literal(isDisposed = isDisposed.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservable]
  }
}

