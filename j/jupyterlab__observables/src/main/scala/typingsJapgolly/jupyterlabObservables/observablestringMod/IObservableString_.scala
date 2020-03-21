package typingsJapgolly.jupyterlabObservables.observablestringMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jupyterlabObservables.modeldbMod.IObservable
import typingsJapgolly.jupyterlabObservables.observablestringMod.IObservableString.IChangedArgs
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableString_ extends IObservable {
  /**
    * A signal emitted when the string has changed.
    */
  val changed: ISignal[this.type, IChangedArgs]
  /**
    * The value of the string.
    */
  var text: String
  /**
    * The type of the Observable.
    */
  @JSName("type")
  var type_IObservableString_ : typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.String
  /**
    * Set the ObservableString to an empty string.
    */
  def clear(): Unit
  /**
    * Insert a substring.
    *
    * @param index - The starting index.
    *
    * @param text - The substring to insert.
    */
  def insert(index: Double, text: String): Unit
  /**
    * Remove a substring.
    *
    * @param start - The starting index.
    *
    * @param end - The ending index.
    */
  def remove(start: Double, end: Double): Unit
}

object IObservableString_ {
  @scala.inline
  def apply(
    changed: ISignal[IObservableString_, IChangedArgs],
    clear: Callback,
    dispose: Callback,
    insert: (Double, String) => Callback,
    isDisposed: Boolean,
    remove: (Double, Double) => Callback,
    text: String,
    `type`: typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.String
  ): IObservableString_ = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => insert(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => remove(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableString_]
  }
}

