package typingsJapgolly.devextreme.mod.DevExpress

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonComponent
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonFullName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[T] extends js.Object {
  /** A function that is executed before the widget is disposed of. */
  var onDisposing: js.UndefOr[js.Function1[/* e */ AnonComponent[T], _]] = js.undefined
  /** A function used in JavaScript frameworks to save the widget instance. */
  var onInitialized: js.UndefOr[js.Function1[/* e */ AnonElement[T], _]] = js.undefined
  /** A function that is executed after a widget option is changed. */
  var onOptionChanged: js.UndefOr[js.Function1[/* e */ AnonFullName[T], _]] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[T](
    onDisposing: /* e */ AnonComponent[T] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[T] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonFullName[T] => CallbackTo[js.Any] = null
  ): ComponentOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponent[T]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[T]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFullName[T]) => onOptionChanged(t0).runNow()))
    __obj.asInstanceOf[ComponentOptions[T]]
  }
}

