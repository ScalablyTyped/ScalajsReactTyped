package typingsJapgolly.jupyterlabObservables.modeldbMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.Value
import typingsJapgolly.jupyterlabObservables.modeldbMod.ObservableValue.IChangedArgs
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableValue extends IObservable {
  /**
    * The changed signal.
    */
  val changed: ISignal[IObservableValue, IChangedArgs]
  /**
    * The type of this object.
    */
  @JSName("type")
  val type_IObservableValue: Value
  /**
    * Get the current value, or `undefined` if it has not been set.
    */
  def get(): js.UndefOr[JSONValue]
  /**
    * Set the value.
    */
  def set(value: JSONValue): Unit
}

object IObservableValue {
  @scala.inline
  def apply(
    changed: ISignal[IObservableValue, IChangedArgs],
    dispose: Callback,
    get: CallbackTo[js.UndefOr[JSONValue]],
    isDisposed: Boolean,
    set: JSONValue => Callback,
    `type`: Value
  ): IObservableValue = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue) => set(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableValue]
  }
}

