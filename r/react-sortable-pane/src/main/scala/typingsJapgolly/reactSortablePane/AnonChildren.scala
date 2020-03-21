package typingsJapgolly.reactSortablePane

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactMotion.mod.SpringHelperConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.Array[scala.Nothing]
  var className: String
  var direction: String
  var disableEffect: Boolean
  var isSortable: Boolean
  var margin: Double
  var springConfig: SpringHelperConfig
  def onClick(): Null
  def onDragStart(): Null
  def onDragStop(): Null
  def onOrderChange(): Null
  def onResize(): Null
  def onResizeStart(): Null
  def onResizeStop(): Null
  def onTouchStart(): Null
}

object AnonChildren {
  @scala.inline
  def apply(
    children: js.Array[scala.Nothing],
    className: String,
    direction: String,
    disableEffect: Boolean,
    isSortable: Boolean,
    margin: Double,
    onClick: CallbackTo[Null],
    onDragStart: CallbackTo[Null],
    onDragStop: CallbackTo[Null],
    onOrderChange: CallbackTo[Null],
    onResize: CallbackTo[Null],
    onResizeStart: CallbackTo[Null],
    onResizeStop: CallbackTo[Null],
    onTouchStart: CallbackTo[Null],
    springConfig: SpringHelperConfig
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disableEffect = disableEffect.asInstanceOf[js.Any], isSortable = isSortable.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], springConfig = springConfig.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    __obj.updateDynamic("onDragStart")(onDragStart.toJsFn)
    __obj.updateDynamic("onDragStop")(onDragStop.toJsFn)
    __obj.updateDynamic("onOrderChange")(onOrderChange.toJsFn)
    __obj.updateDynamic("onResize")(onResize.toJsFn)
    __obj.updateDynamic("onResizeStart")(onResizeStart.toJsFn)
    __obj.updateDynamic("onResizeStop")(onResizeStop.toJsFn)
    __obj.updateDynamic("onTouchStart")(onTouchStart.toJsFn)
    __obj.asInstanceOf[AnonChildren]
  }
}

