package typingsJapgolly.ejWebAll.ej.Droppable

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Used to accept the specified draggable items.
    * @Default {null}
    */
  var accept: js.UndefOr[js.Any] = js.undefined
  /** This event is triggered when the mouse up is moved during the dragging.
    */
  var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, Unit]] = js.undefined
  /** This event is triggered when the mouse is moved out.
    */
  var out: js.UndefOr[js.Function1[/* e */ OutEventArgs, Unit]] = js.undefined
  /** This event is triggered when the mouse is moved over.
    */
  var over: js.UndefOr[js.Function1[/* e */ OverEventArgs, Unit]] = js.undefined
  /** Used to group sets of droppable items, in addition to droppable's accept option. A draggable with the same scope value as a droppable will be accepted by the droppable.
    * @Default {'default'}
    */
  var scope: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    accept: js.Any = null,
    drop: /* e */ DropEventArgs => Callback = null,
    out: /* e */ OutEventArgs => Callback = null,
    over: /* e */ OverEventArgs => Callback = null,
    scope: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Droppable.DropEventArgs) => drop(t0).runNow()))
    if (out != null) __obj.updateDynamic("out")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Droppable.OutEventArgs) => out(t0).runNow()))
    if (over != null) __obj.updateDynamic("over")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Droppable.OverEventArgs) => over(t0).runNow()))
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

