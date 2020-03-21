package typingsJapgolly.primereact.pickListMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.primereact.AnonSource
import typingsJapgolly.primereact.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickListProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
  var metaKeySelection: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ AnonSource, Unit]] = js.undefined
  var onMoveAllToSource: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var onMoveAllToTarget: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var onMoveToSource: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var onMoveToTarget: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var onSourceSelect: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var onTargetSelect: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var showSourceControls: js.UndefOr[Boolean] = js.undefined
  var showTargetControls: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[js.Array[_]] = js.undefined
  var sourceHeader: js.UndefOr[js.Any] = js.undefined
  var sourceStyle: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[js.Array[_]] = js.undefined
  var targetHeader: js.UndefOr[js.Any] = js.undefined
  var targetStyle: js.UndefOr[js.Object] = js.undefined
}

object PickListProps {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    itemTemplate: /* item */ js.Any => CallbackTo[js.UndefOr[Element]] = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    onChange: /* e */ AnonSource => Callback = null,
    onMoveAllToSource: /* e */ AnonValue => Callback = null,
    onMoveAllToTarget: /* e */ AnonValue => Callback = null,
    onMoveToSource: /* e */ AnonValue => Callback = null,
    onMoveToTarget: /* e */ AnonValue => Callback = null,
    onSourceSelect: /* e */ AnonValue => Callback = null,
    onTargetSelect: /* e */ AnonValue => Callback = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    showSourceControls: js.UndefOr[Boolean] = js.undefined,
    showTargetControls: js.UndefOr[Boolean] = js.undefined,
    source: js.Array[_] = null,
    sourceHeader: js.Any = null,
    sourceStyle: js.Object = null,
    style: js.Object = null,
    tabIndex: String = null,
    target: js.Array[_] = null,
    targetHeader: js.Any = null,
    targetStyle: js.Object = null
  ): PickListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1((t0: /* item */ js.Any) => itemTemplate(t0).runNow()))
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonSource) => onChange(t0).runNow()))
    if (onMoveAllToSource != null) __obj.updateDynamic("onMoveAllToSource")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onMoveAllToSource(t0).runNow()))
    if (onMoveAllToTarget != null) __obj.updateDynamic("onMoveAllToTarget")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onMoveAllToTarget(t0).runNow()))
    if (onMoveToSource != null) __obj.updateDynamic("onMoveToSource")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onMoveToSource(t0).runNow()))
    if (onMoveToTarget != null) __obj.updateDynamic("onMoveToTarget")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onMoveToTarget(t0).runNow()))
    if (onSourceSelect != null) __obj.updateDynamic("onSourceSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onSourceSelect(t0).runNow()))
    if (onTargetSelect != null) __obj.updateDynamic("onTargetSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onTargetSelect(t0).runNow()))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(showSourceControls)) __obj.updateDynamic("showSourceControls")(showSourceControls.asInstanceOf[js.Any])
    if (!js.isUndefined(showTargetControls)) __obj.updateDynamic("showTargetControls")(showTargetControls.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceHeader != null) __obj.updateDynamic("sourceHeader")(sourceHeader.asInstanceOf[js.Any])
    if (sourceStyle != null) __obj.updateDynamic("sourceStyle")(sourceStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetHeader != null) __obj.updateDynamic("targetHeader")(targetHeader.asInstanceOf[js.Any])
    if (targetStyle != null) __obj.updateDynamic("targetStyle")(targetStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickListProps]
  }
}

