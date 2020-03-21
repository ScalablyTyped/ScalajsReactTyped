package typingsJapgolly.recharts.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreemapProps
  extends EventAttributes
     with Animatable {
  var aspectRatio: js.UndefOr[Double] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var children: js.UndefOr[js.Array[Node] | Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[Element | ContentRenderer[_]] = js.undefined
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var dataKey: js.UndefOr[DataKey] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var nameKey: js.UndefOr[String | Double | RechartsFunction] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object TreemapProps {
  @scala.inline
  def apply(
    animationBegin: Int | Double = null,
    animationDuration: Int | Double = null,
    animationEasing: AnimationEasingType = null,
    animationId: Int | Double = null,
    aspectRatio: Int | Double = null,
    children: js.Array[Node] | Node = null,
    className: String = null,
    content: Element | ContentRenderer[_] = null,
    data: js.Array[_] = null,
    dataKey: DataKey = null,
    fill: String = null,
    height: Int | Double = null,
    isAnimationActive: js.UndefOr[Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[Boolean] = js.undefined,
    nameKey: String | Double | RechartsFunction = null,
    onAnimationEnd: /* repeated */ js.Any => Callback = null,
    onAnimationStart: /* repeated */ js.Any => Callback = null,
    onClick: /* repeated */ js.Any => Callback = null,
    onMouseDown: /* repeated */ js.Any => Callback = null,
    onMouseEnter: /* repeated */ js.Any => Callback = null,
    onMouseLeave: /* repeated */ js.Any => Callback = null,
    onMouseMove: /* repeated */ js.Any => Callback = null,
    onMouseOut: /* repeated */ js.Any => Callback = null,
    onMouseOver: /* repeated */ js.Any => Callback = null,
    onMouseUp: /* repeated */ js.Any => Callback = null,
    onTouchCancel: /* repeated */ js.Any => Callback = null,
    onTouchEnd: /* repeated */ js.Any => Callback = null,
    onTouchMove: /* repeated */ js.Any => Callback = null,
    onTouchStart: /* repeated */ js.Any => Callback = null,
    stroke: String = null,
    style: js.Object = null,
    width: Int | Double = null
  ): TreemapProps = {
    val __obj = js.Dynamic.literal()
    if (animationBegin != null) __obj.updateDynamic("animationBegin")(animationBegin.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationId != null) __obj.updateDynamic("animationId")(animationId.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive.asInstanceOf[js.Any])
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive.asInstanceOf[js.Any])
    if (nameKey != null) __obj.updateDynamic("nameKey")(nameKey.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onAnimationEnd(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onAnimationStart(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClick(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseUp(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onTouchStart(t0).runNow()))
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapProps]
  }
}

