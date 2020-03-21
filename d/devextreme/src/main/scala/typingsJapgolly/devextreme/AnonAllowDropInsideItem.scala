package typingsJapgolly.devextreme

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.devextremeStrings.both
import typingsJapgolly.devextreme.devextremeStrings.horizontal
import typingsJapgolly.devextreme.devextremeStrings.indicate
import typingsJapgolly.devextreme.devextremeStrings.push
import typingsJapgolly.devextreme.devextremeStrings.vertical
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowDropInsideItem extends js.Object {
  var allowDropInsideItem: js.UndefOr[Boolean] = js.undefined
  var allowReordering: js.UndefOr[Boolean] = js.undefined
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  var boundary: js.UndefOr[String | Element | JQuery] = js.undefined
  var container: js.UndefOr[String | Element | JQuery] = js.undefined
  var cursorOffset: js.UndefOr[String | AnonY] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dragDirection: js.UndefOr[both | horizontal | vertical] = js.undefined
  var dragTemplate: js.UndefOr[
    template | (js.Function2[
      /* dragInfo */ AnonItemDataItemElement, 
      /* containerElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  var dropFeedbackMode: js.UndefOr[push | indicate] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
  var onAdd: js.UndefOr[js.Function1[/* e */ AnonDropInsideItem, _]] = js.undefined
  var onDragChange: js.UndefOr[js.Function1[/* e */ AnonFromComponent, _]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* e */ AnonFromComponent, _]] = js.undefined
  var onDragMove: js.UndefOr[js.Function1[/* e */ AnonFromComponent, _]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* e */ AnonFromData, _]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* e */ AnonFromIndex, _]] = js.undefined
  var onReorder: js.UndefOr[js.Function1[/* e */ AnonDropInsideItem, _]] = js.undefined
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  var showDragIcons: js.UndefOr[Boolean] = js.undefined
}

object AnonAllowDropInsideItem {
  @scala.inline
  def apply(
    allowDropInsideItem: js.UndefOr[Boolean] = js.undefined,
    allowReordering: js.UndefOr[Boolean] = js.undefined,
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    boundary: String | Element | JQuery = null,
    container: String | Element | JQuery = null,
    cursorOffset: String | AnonY = null,
    data: js.Any = null,
    dragDirection: both | horizontal | vertical = null,
    dragTemplate: template | (js.Function2[
      /* dragInfo */ AnonItemDataItemElement, 
      /* containerElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    dropFeedbackMode: push | indicate = null,
    filter: String = null,
    group: String = null,
    handle: String = null,
    onAdd: /* e */ AnonDropInsideItem => CallbackTo[js.Any] = null,
    onDragChange: /* e */ AnonFromComponent => CallbackTo[js.Any] = null,
    onDragEnd: /* e */ AnonFromComponent => CallbackTo[js.Any] = null,
    onDragMove: /* e */ AnonFromComponent => CallbackTo[js.Any] = null,
    onDragStart: /* e */ AnonFromData => CallbackTo[js.Any] = null,
    onRemove: /* e */ AnonFromIndex => CallbackTo[js.Any] = null,
    onReorder: /* e */ AnonDropInsideItem => CallbackTo[js.Any] = null,
    scrollSensitivity: Int | Double = null,
    scrollSpeed: Int | Double = null,
    showDragIcons: js.UndefOr[Boolean] = js.undefined
  ): AnonAllowDropInsideItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDropInsideItem)) __obj.updateDynamic("allowDropInsideItem")(allowDropInsideItem.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReordering)) __obj.updateDynamic("allowReordering")(allowReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cursorOffset != null) __obj.updateDynamic("cursorOffset")(cursorOffset.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dragDirection != null) __obj.updateDynamic("dragDirection")(dragDirection.asInstanceOf[js.Any])
    if (dragTemplate != null) __obj.updateDynamic("dragTemplate")(dragTemplate.asInstanceOf[js.Any])
    if (dropFeedbackMode != null) __obj.updateDynamic("dropFeedbackMode")(dropFeedbackMode.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonDropInsideItem) => onAdd(t0).runNow()))
    if (onDragChange != null) __obj.updateDynamic("onDragChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFromComponent) => onDragChange(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFromComponent) => onDragEnd(t0).runNow()))
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFromComponent) => onDragMove(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFromData) => onDragStart(t0).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFromIndex) => onRemove(t0).runNow()))
    if (onReorder != null) __obj.updateDynamic("onReorder")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonDropInsideItem) => onReorder(t0).runNow()))
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(showDragIcons)) __obj.updateDynamic("showDragIcons")(showDragIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowDropInsideItem]
  }
}

