package typingsJapgolly.jupyterlabApputils.vdomMod.VDomRenderer

import japgolly.scalajs.react.Callback
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a model to be used with vdom rendering.
  */
trait IModel extends IDisposable {
  /**
    * A signal emitted when any model state changes.
    */
  val stateChanged: ISignal[this.type, Unit]
}

object IModel {
  @scala.inline
  def apply(dispose: Callback, isDisposed: Boolean, stateChanged: ISignal[IModel, Unit]): IModel = {
    val __obj = js.Dynamic.literal(isDisposed = isDisposed.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[IModel]
  }
}

