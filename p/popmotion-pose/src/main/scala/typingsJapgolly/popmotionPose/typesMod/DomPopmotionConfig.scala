package typingsJapgolly.popmotionPose.typesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomPopmotionConfig
  extends /* key */ StringDictionary[js.Any] {
  var dragBounds: js.UndefOr[DragBounds | (js.Function1[/* props */ ResolverProps, DragBounds])] = js.undefined
  var draggable: js.UndefOr[Draggable] = js.undefined
  var hoverable: js.UndefOr[Boolean] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.undefined
  var onPressEnd: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.undefined
  var onPressStart: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.undefined
  var props: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object DomPopmotionConfig {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    dragBounds: DragBounds | (js.Function1[/* props */ ResolverProps, DragBounds]) = null,
    draggable: Draggable = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    onDragEnd: /* e */ MouseEvent | TouchEvent => CallbackTo[js.Any] = null,
    onDragStart: /* e */ MouseEvent | TouchEvent => CallbackTo[js.Any] = null,
    onPressEnd: /* e */ MouseEvent | TouchEvent => CallbackTo[js.Any] = null,
    onPressStart: /* e */ MouseEvent | TouchEvent => CallbackTo[js.Any] = null,
    props: StringDictionary[js.Any] = null
  ): DomPopmotionConfig = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dragBounds != null) __obj.updateDynamic("dragBounds")(dragBounds.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent) => onDragEnd(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent) => onDragStart(t0).runNow()))
    if (onPressEnd != null) __obj.updateDynamic("onPressEnd")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent) => onPressEnd(t0).runNow()))
    if (onPressStart != null) __obj.updateDynamic("onPressStart")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent) => onPressStart(t0).runNow()))
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomPopmotionConfig]
  }
}

