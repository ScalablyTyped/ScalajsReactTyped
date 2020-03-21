package typingsJapgolly.primereact.pickListSubListMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.primereact.AnonEventValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickListSubListProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
  var list: js.UndefOr[js.Array[_]] = js.undefined
  var listClassName: js.UndefOr[String] = js.undefined
  var metaKeySelection: js.UndefOr[Boolean] = js.undefined
  var onItemClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ AnonEventValue, Unit]] = js.undefined
  var selection: js.UndefOr[js.Array[_]] = js.undefined
  var showControls: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object PickListSubListProps {
  @scala.inline
  def apply(
    className: String = null,
    header: String = null,
    itemTemplate: /* item */ js.Any => CallbackTo[js.UndefOr[Element]] = null,
    list: js.Array[_] = null,
    listClassName: String = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    onItemClick: js.UndefOr[Callback] = js.undefined,
    onSelectionChange: /* e */ AnonEventValue => Callback = null,
    selection: js.Array[_] = null,
    showControls: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null
  ): PickListSubListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1((t0: /* item */ js.Any) => itemTemplate(t0).runNow()))
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.asInstanceOf[js.Any])
    onItemClick.foreach(p => __obj.updateDynamic("onItemClick")(p.toJsFn))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonEventValue) => onSelectionChange(t0).runNow()))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (!js.isUndefined(showControls)) __obj.updateDynamic("showControls")(showControls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickListSubListProps]
  }
}

