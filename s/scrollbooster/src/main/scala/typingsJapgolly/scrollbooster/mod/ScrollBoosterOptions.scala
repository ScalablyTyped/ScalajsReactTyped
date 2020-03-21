package typingsJapgolly.scrollbooster.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.scrollbooster.scrollboosterStrings.all
import typingsJapgolly.scrollbooster.scrollboosterStrings.horizontal
import typingsJapgolly.scrollbooster.scrollboosterStrings.mouse
import typingsJapgolly.scrollbooster.scrollboosterStrings.native
import typingsJapgolly.scrollbooster.scrollboosterStrings.touch
import typingsJapgolly.scrollbooster.scrollboosterStrings.transform
import typingsJapgolly.scrollbooster.scrollboosterStrings.vertical
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollBoosterOptions extends js.Object {
  var bounce: js.UndefOr[Boolean] = js.undefined
  var bounceForce: js.UndefOr[Double] = js.undefined
  var content: js.UndefOr[HTMLElement | Null] = js.undefined
  var direction: js.UndefOr[horizontal | vertical | all] = js.undefined
  var emulateScroll: js.UndefOr[Boolean] = js.undefined
  var friction: js.UndefOr[Double] = js.undefined
  var inputsFocus: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event_, Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* state */ ScrollingState, Unit]] = js.undefined
  var pointerMode: js.UndefOr[touch | mouse | all] = js.undefined
  var scrollMode: js.UndefOr[transform | native] = js.undefined
  var shouldScroll: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event_, Boolean]] = js.undefined
  var textSelection: js.UndefOr[Boolean] = js.undefined
  var viewport: HTMLElement | Null
}

object ScrollBoosterOptions {
  @scala.inline
  def apply(
    bounce: js.UndefOr[Boolean] = js.undefined,
    bounceForce: Int | Double = null,
    content: HTMLElement = null,
    direction: horizontal | vertical | all = null,
    emulateScroll: js.UndefOr[Boolean] = js.undefined,
    friction: Int | Double = null,
    inputsFocus: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* state */ ScrollingState, /* event */ Event_) => Callback = null,
    onUpdate: /* state */ ScrollingState => Callback = null,
    pointerMode: touch | mouse | all = null,
    scrollMode: transform | native = null,
    shouldScroll: (/* state */ ScrollingState, /* event */ Event_) => CallbackTo[Boolean] = null,
    textSelection: js.UndefOr[Boolean] = js.undefined,
    viewport: HTMLElement = null
  ): ScrollBoosterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bounce)) __obj.updateDynamic("bounce")(bounce.asInstanceOf[js.Any])
    if (bounceForce != null) __obj.updateDynamic("bounceForce")(bounceForce.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(emulateScroll)) __obj.updateDynamic("emulateScroll")(emulateScroll.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (!js.isUndefined(inputsFocus)) __obj.updateDynamic("inputsFocus")(inputsFocus.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* state */ typingsJapgolly.scrollbooster.mod.ScrollingState, t1: /* event */ typingsJapgolly.std.Event_) => onClick(t0, t1).runNow()))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.scrollbooster.mod.ScrollingState) => onUpdate(t0).runNow()))
    if (pointerMode != null) __obj.updateDynamic("pointerMode")(pointerMode.asInstanceOf[js.Any])
    if (scrollMode != null) __obj.updateDynamic("scrollMode")(scrollMode.asInstanceOf[js.Any])
    if (shouldScroll != null) __obj.updateDynamic("shouldScroll")(js.Any.fromFunction2((t0: /* state */ typingsJapgolly.scrollbooster.mod.ScrollingState, t1: /* event */ typingsJapgolly.std.Event_) => shouldScroll(t0, t1).runNow()))
    if (!js.isUndefined(textSelection)) __obj.updateDynamic("textSelection")(textSelection.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollBoosterOptions]
  }
}

