package typingsJapgolly.tinySliderReact.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinySliderProps extends js.Object {
  var onClick: js.UndefOr[
    js.Function3[/* slideClicked */ Double, /* info */ String, /* event */ Event_, Unit]
  ] = js.undefined
  var onIndexChanged: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
  var onTouchMove: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
  var settings: js.UndefOr[TinySliderSettings] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
}

object TinySliderProps {
  @scala.inline
  def apply(
    onClick: (/* slideClicked */ Double, /* info */ String, /* event */ Event_) => Callback = null,
    onIndexChanged: /* info */ TinySliderInfo => Callback = null,
    onTouchEnd: /* info */ TinySliderInfo => Callback = null,
    onTouchMove: /* info */ TinySliderInfo => Callback = null,
    onTouchStart: /* info */ TinySliderInfo => Callback = null,
    onTransitionEnd: /* info */ TinySliderInfo => Callback = null,
    onTransitionStart: /* info */ TinySliderInfo => Callback = null,
    settings: TinySliderSettings = null,
    startIndex: Int | Double = null
  ): TinySliderProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3((t0: /* slideClicked */ scala.Double, t1: /* info */ java.lang.String, t2: /* event */ typingsJapgolly.std.Event_) => onClick(t0, t1, t2).runNow()))
    if (onIndexChanged != null) __obj.updateDynamic("onIndexChanged")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.tinySliderReact.mod.TinySliderInfo) => onIndexChanged(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.tinySliderReact.mod.TinySliderInfo) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.tinySliderReact.mod.TinySliderInfo) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.tinySliderReact.mod.TinySliderInfo) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.tinySliderReact.mod.TinySliderInfo) => onTransitionEnd(t0).runNow()))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.tinySliderReact.mod.TinySliderInfo) => onTransitionStart(t0).runNow()))
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinySliderProps]
  }
}

