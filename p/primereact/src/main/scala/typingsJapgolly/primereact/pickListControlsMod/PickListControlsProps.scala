package typingsJapgolly.primereact.pickListControlsMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.primereact.AnonDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickListControlsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var list: js.UndefOr[js.Array[_]] = js.undefined
  var onReorder: js.UndefOr[js.Function1[/* e */ AnonDirection, Unit]] = js.undefined
  var selection: js.UndefOr[js.Array[_]] = js.undefined
}

object PickListControlsProps {
  @scala.inline
  def apply(
    className: String = null,
    list: js.Array[_] = null,
    onReorder: /* e */ AnonDirection => Callback = null,
    selection: js.Array[_] = null
  ): PickListControlsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (onReorder != null) __obj.updateDynamic("onReorder")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonDirection) => onReorder(t0).runNow()))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickListControlsProps]
  }
}

